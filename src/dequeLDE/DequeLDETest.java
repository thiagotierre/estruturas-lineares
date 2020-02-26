package dequeLDE;

public class DequeLDETest {

	public static void main(String[] args) {
		DequeLDE deque = new DequeLDE();
		deque.inserirNoInicio(1);
		deque.inserirNoInicio(2);
		deque.inserirNoInicio(3);
		deque.imprimir();
		System.out.println("---------------");
		deque.removerNoInicio();
		deque.imprimir();
		System.out.println("---------------");
		deque.inserirNoFim(4);
		deque.imprimir();
		System.out.println("---------------");
		deque.removerNoFim();
		deque.imprimir();
		System.out.println("---------------");
		System.out.println("PRIMEIRO"+deque.primeiro());
		System.out.println("ULTIMO"+deque.ultimo());
	}

}
