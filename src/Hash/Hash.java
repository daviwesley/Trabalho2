package Hash;

import java.math.BigInteger;

public class Hash {
	// Srtting table size to a max of 32, value used to modulus for hash value.
	private final static int TABLE_SIZE = 11;
	private int tam;
	Funcionario[] table;

	Hash() {
		table = new Funcionario[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++)
			table[i] = null;
	}

	/**
	 * @param usuario
	 *            nome do usuario
	 * @return retorna a senha que corresponde ao nome do usuario
	 */
	public int get(String usuario) {
		int cont = 0;
		int hash = new BigInteger(toAscii(usuario)).mod(new BigInteger(((Integer) TABLE_SIZE).toString())).intValue();
		// while (table[hash] != null && table[hash].getNome() != key)
		hash = (hash + 1) % TABLE_SIZE;
		if (table[hash] == null)
			return -1;
		else
			// System.out.println("POSICAO = " + hash);
			return table[hash].getSenha();
	}

	/**
	 * Adiciona um Funcionario na tabela(Advogado e Juiz)
	 * 
	 * @param f
	 *            Funcionario a ser adicionado na tabela
	 */
	public Boolean put(Funcionario f) {
		// cria o hash code usando o nome do usuario
		if (tam == 11) {
			System.out.println("Tabela Cheia");
			return false;
		} else {
			int hash = new BigInteger(toAscii(f.getUsuario())).mod(new BigInteger(((Integer) TABLE_SIZE).toString()))
					.intValue();
			// while (table[hash] != null && table[hash].getNome() !=
			// f.getNome())
			hash = (hash + 1) % TABLE_SIZE;
			if(table[hash] !=null){
				System.out.println("Usuario ja existe");
				return false;
			}else{

			table[hash] = f;
			tam++;
			return true;
			}
		}
	}

	/**
	 * Transforma uma cadeia de caracteres em seus respectivos códigos ASCII
	 * 
	 * @param s
	 *            String desejada
	 * @return retorna o código ASCII
	 */
	private static String toAscii(String s) {
		StringBuilder sb = new StringBuilder();
		long asciiInt;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			asciiInt = (int) c;
			sb.append(asciiInt);
		}
		return String.valueOf(sb);
	}
}