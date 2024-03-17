/**
 * 
 */
package view;

import controller.ThreadVetor;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		int[] vet = new int[1000];
		int tamanho = vet.length;

		for (int i = 0; i < tamanho; i++) {
			vet[i] = (int) (Math.random() * 100) + 1;
		}

		new ThreadVetor(1, vet).start();
		new ThreadVetor(2, vet).start();
	}

}
