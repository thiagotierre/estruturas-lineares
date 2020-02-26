package filaArray;

import java.util.Arrays;

public class Fila {
	int i;
	int f;
	int size;
	Object fila[];
	
	public Fila(int tam) {
		fila = new Object[tam];
	}
	
	public void enfileirar(Object o) {
		if(size==fila.length) {
			 dobrar();
		}
		fila[f] = o;
		f=(f+1)%fila.length;
		size++;
	}
	
	public void dobrar() {
        Object[] novaFila = fila;
        int currentLength = fila.length;
        fila = new Object[2*currentLength];

        for (int j = 0; j < currentLength; j++) {
            fila[j] = novaFila[(j + i) % currentLength];
        }

        i = 0;
        f = currentLength;
    }
	
	public Object desenfileirar() {
		Object temp = null;
		if(estaVazia())
			throw new RuntimeException("Pilha vazia!");
		temp = fila[i];
		fila[i]=null;
		i = (i+1)%fila.length;
		size--;
		return temp;
	}
	
	public int tamanho() {
		return (fila.length - i + f) % fila.length;
	}
	
	public Object inicio() {
		return fila[i];
	}
	
	public boolean estaVazia() {
		return (i==f);
	}

	@Override
	public String toString() {
		return "Fila [i=" + i + ", f=" + f + ", fila=" + Arrays.toString(fila) + "]";
	}

}
