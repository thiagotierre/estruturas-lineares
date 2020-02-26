package pilhaLSE;

public class PilhaLSE {
	No t;
	
	public void push(Object o) {
		No no = new No(o, null);
		if(estaVazia())
			t = no;
		else
			no.setAnterior(t);
		t = no;
	}
	
	public Object pop() {
		if(estaVazia())
			throw new RuntimeException("Pilha vazia!");
		
		Object object = t.getElemento();
		t = t.getAnterior();
		
		return object;
	}
	
	public boolean estaVazia() {
		return t==null;
	}
	
	public Object top() {
		return t;
	}
	
	public void imprimir() {
		for(No no = t; no !=null; no=no.getAnterior())
			System.out.println(no.getElemento());
	}
	
	

}
