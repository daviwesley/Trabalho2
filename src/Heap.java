package HeapMaximo;

public class HeapMax {

	private final int heap[] = new int[20];
	private int tam;

	public void subir(int i) {
		int j = i / 2;
		if (j >= 1) {
			if (this.heap[i] > this.heap[j]) {
				int aux = heap[i];
				this.heap[i] = this.heap[j];
				this.heap[j] = aux;
			}
		}
	}

	public void descer(int i) {
		int j = 2 * i;
		if (j <= this.tam) {
			if (j < this.tam) {
				if (this.heap[j + 1] > this.heap[j]) {
					j = j + 1;
				}
			}
			if (this.heap[i] < this.heap[j]) {
				int aux = heap[i];
				this.heap[i] = this.heap[j];
				this.heap[j] = aux;
				this.descer(j);
			}
		}
	}

	public void add(int chave) {
		if (this.tam < this.heap.length) {
			this.heap[this.tam + 1] = chave;
			this.tam++;
			this.subir(tam + 1);
		}
	}

	public int remover() {
		if (this.tam != 0) {
			int aux = this.heap[1];
			this.heap[1] = this.heap[this.tam];
			this.tam--;
			this.descer(1);
			return aux;
		} else {
			System.out.println("VAZIO");
			return -1;
		}
	}
	
	public void imprimir(){
		for(int i = 1; i < heap.length; i++){
			System.out.print(heap[i] + " ");
		}
	}
	

}
