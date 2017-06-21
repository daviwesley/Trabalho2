
package Pilha;

import Fila.No;

public class Pilha<T> {

    private int tam;
    private No<T> topo;

    
    

    //a) Adicionar um elemento na pilha;
    public void adicionar(T a) {
        No<T> novo = new No();
        novo.setConteudo(a);
       if (topo == null) {
            topo = novo;
            this.tam++;
        } else {
            novo.setProx(topo);
            topo = novo;
            this.tam++;
        }
    }

    //b) Remover um elemento da pilha;
    public T remover() {
        if (topo == null) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        No<T> atual = topo;
        topo = atual.getProx();
        this.tam--;
        return atual.getConteudo();
    }

    //c) Imprimir os elementos da pilha;
    public void imprimir() {
        System.out.println("**********************");

        No aux = topo;
        System.out.print("Topo pilha \\//:  \n" + aux.getConteudo() + "\n");
        while (aux.getProx() != null) {
            aux = aux.getProx();
            System.out.print(aux.getConteudo() + "\n");
        }
        System.out.println("**********************");
    }

    //d) Retornar quantidade de elementos da pilha;
    public int quantidadeElementos() {
        return this.tam;
    }
    
    

}
