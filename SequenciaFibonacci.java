package listaExerciciosLP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contiLoop = true;
		int n = 0;
		
		do {
			try {
				System.out.print("Sequencia Fibonacci at� a posi��o: ");
				n = sc.nextInt();
				System.out.println();

				System.out.print("N�meros da sequencia at� a posi��o: "+n+"\n\n");
				for (int i = 1; i <= n; i++) {
					System.out.print(fibonacci(i)+", ");
				}
				contiLoop = false;
			} catch (InputMismatchException e) {

				System.out.print("Valor inv�lido!! \nDigite um n�mero inteiro!!\n\n");
				sc.nextLine();
			}

		} while (contiLoop);
		sc.close();
	}

	public static int fibonacci(int n) {

		if (n < 2) {
			return n;
		} else
			
			return (fibonacci(n - 1) + fibonacci(n - 2));
	}
}
