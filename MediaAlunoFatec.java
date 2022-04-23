package listaExerciciosLP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaAlunoFatec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contiLoop = true;
		float prova1 = 0;
		float prova2 = 0;
		float semanaTec = 0;

		do {
			try {

				System.out.print("Nota da P1: ");
				prova1 = sc.nextFloat();
				System.out.println();

				System.out.print("Nota da P2: ");
				prova2 = sc.nextFloat();
				System.out.println();

				System.out.print("Nota da semana de tecnologia:  ");
				semanaTec = sc.nextFloat();
				System.out.println();

				float media = (float) ((0.35 * prova1) + (0.50 * prova2) + (0.15 * semanaTec));

				System.out.printf("Média final: " + "%.2f" + media);
				contiLoop = false;
			} catch (InputMismatchException e) {

				System.out.print("Valor inválido!! \nDigite somente números e a vírgula " + "como separador!! \n\n");
				sc.nextLine();
			}
		} while (contiLoop);

		sc.close();
	}
}
