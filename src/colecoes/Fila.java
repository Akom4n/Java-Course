package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!

		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// peek e Element -> obter os próximos elementos da fila (Sem remover)

		// Diferença é o comportamento que ocorre quando a fila está vazia.

		System.out.println(fila.peek()); // Retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element()); // Lança uma exceção

		// Poll e Remove -> obter o proximo elemento da fila e remove!

		// Diferença é o comportamento que ocorre quando a fila está vazia.
		System.out.println(fila.poll()); // Retorna false
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		//fila.contains(...);
	}
}
