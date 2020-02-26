package dequeLDE;

public class No {
	Object elemento;
	No proximo;
	No anterior;
	

	public No(Object o, No a, No p) {
		elemento = o;
		anterior = a;
		proximo = p;
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
	public No getAnterior() {
		return anterior;
	}
	
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + ", anterior=" + anterior + "]";
	}

}
