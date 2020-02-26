package filaLSE;

public class No {
	Object elemento;
	No proximo;
	
	public No(Object o, No no) {
		elemento = o;
		proximo = no;
	}
	
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
	
}
