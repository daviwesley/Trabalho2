import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Hash.Hash;
import HeapMax.HeapMax;
import Pessoas.Advogado;
import Pessoas.Funcionario;
import Pessoas.Juiz;
import Pilha.Pilha;
import Processo.Processo;


public class Teste {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Hash h = new Hash();
		HeapMax heap = new HeapMax();
		Pilha pilha = new Pilha();
		Pilha pProcessos = new Pilha();
		Funcionario davi = new Advogado("Davi Wesley", "daviwesley","Dr.", true,1234548);
		Funcionario b = new Advogado("Daniel", "daniel","Dr.", true,123456);
		Funcionario c = new Advogado("Vitor Oliveira", "voliveira","Dr.", true,168641);

		Processo p = new Processo(32,"Joao","Felipe","Carlos","Pensão");
		h.put(davi);
		h.put(b);
		h.put(c);
		//h.verificarUsuario(168641, c, h);

		pProcessos.adicionar(p);

		 InputStreamReader a = new InputStreamReader(System.in);
	        BufferedReader ler = new BufferedReader(a);

	        Scanner input = new Scanner(System.in);
	        int opcao = -1;
	        do {
	            System.out.println("____________________________________");
	            System.out.println("   0 - Sair");
	            System.out.println("   1- Cadastrar processo");
	            System.out.println("   2- Analisar Processo");
	            System.out.println("   3- Julgar Processo");
	            System.out.println("____________________________________");
	            System.out.println("Digite sua opção");
	            opcao = input.nextInt();
	            switch (opcao) {
	                case 0:
	                    System.out.println("Programa Encerrado");
	                    break;
	                case 1:
	                	System.out.println("   Digite o nome da Vitima");
	                    String nomeVitima = ler.readLine();
	                    System.out.println("   Digite o nome do Acusado");
	                    String nomeAcusado = ler.readLine();
	                    System.out.println("   Digite a descricao do Processo");
	                    String descricao = ler.readLine();
	                    Processo processo = new Processo(0, nomeVitima, nomeAcusado, "", descricao);
	                    pilha.adicionar(processo);
	                    break;
	                case 2:
	                   h.verificarUsuario();
	                    break;
	                case 3:
	                   
	                    break;
	                default:
	                    System.out.println("OpÃ§Ã£o Invalida");

	            }

	        } while (opcao != 0);

	    }

}
