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
		Pilha<Processo> pilha = new Pilha<>();
		Pilha pProcessos = new Pilha();
		Funcionario davi = new Advogado("Davi Wesley", "daviwesley", "Dr.", true, 1234548);
		Funcionario b = new Advogado("Daniel", "daniel", "Dr.", true, 123456);
		Funcionario c = new Advogado("Vitor Oliveira", "voliveira", "Dr.", true, 168641);
		h.put(davi);
		h.put(b);
		h.put(c);
		Processo processo;
		HeapMax filaPrioridade = new HeapMax();
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader ler = new BufferedReader(a);

		Scanner input = new Scanner(System.in);
		int opcao = -1;
		do {
			System.out.println("____________________________________");
			System.out.println("   1 - Cadastrar Processo");
			System.out.println("   2-  Analisar Processo");
			System.out.println("   3-  Julgar Processso");
			System.out.println("   4-  Sair");
			System.out.println("____________________________________");
			System.out.println("Digite sua opção");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				int choice = 0;
				Scanner scan = new Scanner(System.in);
				do {
				System.out.println("   Digite o nome da Vitima");
				String nomeVitima = ler.readLine();
				System.out.println("   Digite o nome do Acusado");
				String nomeAcusado = ler.readLine();
				System.out.println("   Digite a descricao do Processo");
				String descricao = ler.readLine();
				processo = new Processo(0, nomeVitima, nomeAcusado, "", descricao);
				pilha.adicionar(processo);
				System.out.println("Digite 1 para continuar e 0 para sair");
		        choice = scan.nextInt();
				 } while (choice != 0);
				break;
			case 2:
				int escolha = 0;
				if(h.verificarUsuario()){
					Scanner scanner = new Scanner(System.in);
				    do {
				    	Processo procAnalisado = pilha.remover();
						System.out.println("Digite o nome do advogado");
						String nomeAdvogado = ler.readLine();
						procAnalisado.setNomeAdvogado(nomeAdvogado);
						System.out.println("Digite um inteiro para representar a prioridade");
						String aux = ler.readLine();
						int prioridade = Integer.parseInt(aux);
						procAnalisado.setPrioridade(prioridade);
						filaPrioridade.adicionar(procAnalisado);
				        System.out.println("Digite 1 para continuar e 0 para sair");
				        escolha = scanner.nextInt();
				    } while (escolha != 0);
					
				}
				break;
			case 3:
				if(h.verificarUsuario()){
					 Processo pJulgado = filaPrioridade.removerHeap();
                     pJulgado.Imprimir();
                     System.out.println("Processo Removido");
				}else{
					System.out.println("Senha Incorreta");
				}
				break;
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("Opção Inválida");

			}

		} while (opcao != 0);

	}

}