package listaExerciciosLP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contiLoop = true;
		int inicioIntervalo = 0;
		int fimIntervalo = 0;

		do {
			try {

				System.out.print("Informe o inicio do intervalo: ");
				inicioIntervalo = sc.nextInt();
				System.out.println();

				System.out.print("Informe o fim do intervalo: ");
				fimIntervalo = sc.nextInt();  
				System.out.println();

				System.out.println("Números primos entre "+inicioIntervalo+" e "+fimIntervalo
						+" são: ");
				System.out.println();
				
				for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
					if (numPrimo(i)) {
						if(i > 1)
							System.out.println(i + " é primo.");
					}
				}
				contiLoop = false;
			} catch (InputMismatchException e) {

				System.out.print("Valor inválido!! \nDigite um número inteiro!!\n\n");
				sc.nextLine();
			}

		} while (contiLoop);

		sc.close();
	}

	private static boolean numPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}
