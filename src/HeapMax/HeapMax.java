package HeapMax;

import Processo.Processo;

public class HeapMax {

	private final Processo heap[] = new Processo[50];
    private int tam;

    public int getTam() {
        return tam;
    }

    private void subir(int i) {
        int j = i / 2;
        if (j >= 1) {
            if (this.heap[i] != null && this.heap[j] != null && this.heap[i].getPrioridade() > this.heap[j].getPrioridade()) {
                Processo aux = heap[i];
                this.heap[i] = this.heap[j];
                this.heap[j] = aux;
                subir(j);
            }
        }
    }

    private void descer(int i) {
        int j = 2 * i;
        if (j <= this.tam) {
            if (j < this.tam) {
                if (this.heap[j + 1].getPrioridade() > this.heap[j].getPrioridade()) {
                    j = j + 1;
                }
            }
            if (this.heap[i].getPrioridade() < this.heap[j].getPrioridade()) {
                Processo aux = heap[i];
                this.heap[i] = this.heap[j];
                this.heap[j] = aux;
                this.descer(j);
            }
        }
    }

    public void adicionar(Processo chave) {
        if (this.tam < this.heap.length) {
            this.heap[this.tam + 1] = chave;
            this.tam++;
            this.subir(tam);
        }
    }

    public Processo removerHeap() {
        if (this.tam != 0) {
            Processo aux = this.heap[1];
            this.heap[1] = this.heap[this.tam];
            this.tam--;
            this.descer(1);
            return aux;
        } else {
            System.out.println("VAZIO");
            return null;
        }
    }

}
