package pilhaLSE;

public class No {
	Object elemento;
	No anterior;
	
	public No(Object o, No no) {
		elemento = o;
		anterior = no;
	}
	
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", anterior=" + anterior + "]";
	}
	
}
