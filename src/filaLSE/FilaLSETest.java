package filaLSE;

public class FilaLSETest {

	public static void main(String[] args) {
		FilaLSE fila = new FilaLSE();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.imprimir();
		fila.desenfileirar();
		System.out.println("----------------------");
		fila.imprimir();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		System.out.println("----------------------");
		fila.imprimir();
		fila.desenfileirar();
		System.out.println("----------------------");
		fila.imprimir();

	}

}
