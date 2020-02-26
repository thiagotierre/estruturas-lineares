package filaLSE;

public class FilaLSE {
	No inicio;
	No fim;
	
	public void enfileirar(Object elemento) {
		No no = new No(elemento, null);
		
		if(estaVazia())
			inicio = no;
		else
			fim.setProximo(no);
		
		fim = no;
	}
	
	public Object desenfileirar() {
		if(estaVazia())
			throw new RuntimeException("Fila vazia!");
		Object temp = inicio.getElemento();
		inicio = inicio.getProximo();
		
		return temp;
	}
	
	public boolean estaVazia() {
        return inicio == null;
    }
	
	public Object inicio() {
		return inicio.getElemento();
	}
	
	public void imprimir() {
		for(No n = inicio; n!=null; n=n.getProximo()) {
			System.out.println(n.getElemento());
		}
	}

	@Override
	public String toString() {
		return "FilaLSE [inicio=" + inicio + ", fim=" + fim + "]";
	}
	
	

}
