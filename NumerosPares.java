package listaExerciciosLP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contiLoop = true;
		int inicioIntervalo = 0;
		int fimIntervalo = 0;
		int cont = 0;

		do {
			try {
				System.out.print("Informe o inicio do intervalo: ");
				inicioIntervalo = sc.nextInt();
				System.out.print("Informe o fim do intervalo: ");
				fimIntervalo = sc.nextInt();

				System.out.println();

				System.out.print("Números pares no intervalo informado.\n\n");
				for (int i = inicioIntervalo; i <= fimIntervalo; i++) {

					if (i % 2 == 0) {
						System.out.printf(" %d\n", i);
						cont++;
					}
				}
				contiLoop = false;
			} catch (InputMismatchException e) {

				System.out.print("Valor inválido!! \nDigite um número inteiro!!\n\n");
				sc.nextLine();
			}

		} while (contiLoop);

		System.out.printf("\nTotal de números pares entre %d e %d é %d", inicioIntervalo, fimIntervalo, cont);

		sc.close();
	}
}
