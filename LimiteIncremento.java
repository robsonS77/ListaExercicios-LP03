package listaExerciciosLP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LimiteIncremento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contLoop = true;
		int limite = 0;
		int incremento = 0;

		do {

			try {
				System.out.print("Informe o limite superior: ");
				limite = sc.nextInt();
				System.out.println();

				System.out.print("Informe  o valor de incremento: ");
				incremento = sc.nextInt();
				System.out.println();

				for (int i = 0; i <= limite; i += incremento) {

					System.out.println(i);
				}
				contLoop = false;
			}catch (InputMismatchException e) {

				System.out.println("Valor inválido!! Informe um número inteiro!\n\n");
				sc.nextLine();
			}

		} while (contLoop);

		sc.close();
	}
}
