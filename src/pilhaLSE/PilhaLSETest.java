package pilhaLSE;

public class PilhaLSETest {
	public static void main(String[] args) {
		PilhaLSE pilha = new PilhaLSE();
		pilha.push(3);
		pilha.push(2);
		pilha.push(1);
		pilha.imprimir();
		System.out.println("--------------------");
		pilha.pop();
		pilha.imprimir();
		System.out.println("--------------------");
		pilha.push(6);
		pilha.push(5);
		pilha.push(4);
		pilha.imprimir();
		
	}

}
