/**
 * 
 */
package controller;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class ThreadVetor extends Thread {
	private int num;
	private int[] vet;

	public ThreadVetor(int num, int[] vet) {
		this.num = num;
		this.vet = vet;
	}

	public void run() {
		double tempoInicial = System.nanoTime();
		double tempoFinal;
		double tempoTotal;

		if (num % 2 == 0) {
			for (int i = 0; i < vet.length; i++) {
				System.out.println(vet[i] + " ");
			}
			tempoFinal = System.nanoTime();
		} else {
			for (int i : vet) {
				System.out.println(i + " ");
			}
			tempoFinal = System.nanoTime();
		}

		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("#" + getId() + "  - num:  " + num + " - tempo: " + tempoTotal + " seg.");
	}

}
