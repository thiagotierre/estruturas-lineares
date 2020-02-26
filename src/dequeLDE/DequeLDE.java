package dequeLDE;

public class DequeLDE {
	No inicio = new No("INICIO", null, null);
	No fim = new No("FIM", null, null);
	
	public void inserirNoInicio(Object o) {
		No no = new No(o, null, null);
		if(estaVazia()) {
			inicio.proximo = no;
			no.anterior = inicio;
			no.proximo = fim;
			fim.anterior = no;
		}else {
			No temp = inicio.proximo;
			inicio.proximo = no;
			no.anterior = inicio;
			temp.anterior = no;
			no.proximo = temp;
		}
		
	}
	
	public Object removerNoInicio() {
		Object temp = inicio.proximo.elemento;
		No no = inicio.proximo;
		no.anterior = inicio;
		inicio.proximo = no.proximo;
		inicio.proximo.anterior = inicio;
		return temp;
	}
	
	public void inserirNoFim(Object o) {
		No no = new No(o, null, fim);
		if(estaVazia()) {
			inicio.proximo = no;
			no.anterior = inicio;
		}else {
			No temp = fim.anterior;
			temp.proximo = no;
			no.anterior = temp;
			fim.anterior = no;
			
		}
	}
	
	public Object removerNoFim() {
		Object temp = fim.anterior.elemento;
		No no = fim.anterior;
		fim.anterior = no.anterior;
		no.anterior.proximo = fim;
		return temp;
	}
	
	public Object primeiro() {
		return inicio.proximo.getElemento();
	}
	
	public Object ultimo() {
		return fim.anterior.getElemento();
	}
	
	public int tamanho() {
		return  0;
	}
	
	public boolean estaVazia() {
		return inicio.proximo==null;
	}
	
	public void imprimir() {
		for(No no = inicio; no!=null;no=no.getProximo()) {
			if(no.getProximo()==null)
				break;
			if(no.getAnterior()!=null)
				System.out.println(no.getAnterior().getElemento());
			
			System.out.println(no.getProximo().getElemento());
		}
	}

}
