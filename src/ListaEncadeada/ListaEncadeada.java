package ListaEncadeada;

import Fila.No;

/*
 * Lista encadeada com ponteiro no inicio e no fim
 * 
 * 
 * */

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tam;

    public void adicionarInicio(T x) {
        No<T> n = new No<T>();
        n.setConteudo(x);
        if (inicio == null) {
            inicio = n;
            fim = n;
        } else {
            n.setProx(inicio);
            this.inicio = n;
        }
        this.tam++;
    }

    public void adicionarFim(T x) {
        if (this.inicio == null) {
            this.adicionarInicio(x);
        } else {
            No<T> n = new No<T>();
            n.setConteudo(x);
            fim.setProx(n);
            fim = n;
            this.tam++;
        }
    }

    public void adicionarPosicao(int posicao, T x) {
        if (posicao == 0) {
            adicionarInicio(x);
        } else if (posicao - 1 == this.tam) {
            adicionarFim(x);
        } else {
            No<T> n = new No<T>();
            n.setConteudo(x);
            No<T> temp = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                temp = temp.getProx();
            }
            n.setProx(temp.getProx());
            temp.setProx(n);
            this.tam++;

        }

    }

    public T pegar(int i) {
        No<T> atual = this.inicio;
        for (int j = 0; j < i; j++) {
            atual = atual.getProx();
        }
        return atual.getConteudo();
    }

    public void removerInicio() {
        if (inicio == null) {
            throw new IllegalArgumentException("A lista esta vazia");
        }
        No<T> temp = inicio;
        inicio = temp.getProx();
        this.tam--;
    }

    public void removerFinal() {
        if (this.tam == 1) {
            this.removerInicio();
        } else {
            No<T> temp = inicio;
            for (int i = 1; i < this.tam - 1; i++) {
                temp = temp.getProx();
            }
            temp.setProx(null);
            fim = temp;
            this.tam--;
        }
    }

    public void removerPosicao(int posicao) {
        if (posicao == 1) {
            this.removerInicio();
        } else if (posicao == tam) {
            this.removerFinal();
        } else {
            No<T> temp = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                temp = temp.getProx();
            }
            temp.setProx(temp.getProx().getProx());
            this.tam--;
        }
    }

    public void ImprimirRecursivo() {
        this.ImprimirRecursivo(inicio);
    }

    public void ImprimirRecursivo(No temp) {
        if (temp == null) {
            return;
        } else {
            System.out.print(temp.getConteudo() + "\t");
            ImprimirRecursivo(temp.getProx());
        }
    }

    public void ImprimirPosicao(int posicao) {
        No<T> temp = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            temp = temp.getProx();
        }
        System.out.println(temp.getConteudo());
    }
    public int getTam() {
        return tam;
    }
}
