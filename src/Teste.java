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

		System.out.println("Digite as seguintes opções:");
		System.out.println("1 - Criar Processo");
		System.out.println("2 - Remover Processo");
		System.out.println("3 - exit");
		Scanner scanchoice = new Scanner(System.in);
		System.out.println();  
		int choiceentry = scanchoice.nextInt();
		
		while(choiceentry < 1 || choiceentry > 3){

			System.out.println("Digite \"1\", \"2\", \"3\" or \"4\"");
			if(scanchoice.hasNextInt())
				choiceentry = scanchoice.nextInt();

		}
		 InputStreamReader input = new InputStreamReader(System.in);
	     BufferedReader ler = new BufferedReader(input);
		switch(choiceentry){
		case 1:
	     System.out.println("   Digite o nome da Vitima");
             String nomeVitima = ler.readLine();
             System.out.println("   Digite o nome do Acusado");
             String nomeAcusado = ler.readLine();
             System.out.println("   Digite a descricao do Processo");
             String descricao = ler.readLine();
             Processo a = new Processo(0, nomeVitima, nomeAcusado, "", descricao);
             pilha.adicionar(a);
			
			break;
		case 2:
			if(h.verificarUsuario()){
				
			}
			
			//do logic
			break;
		case 3:
			//do logic
			break;
		}

	}
}
