import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Scanner leitor2 = new Scanner(System.in);
		int opcao;
		String continuar = "sim";

		while (continuar.equals("sim")) {
			System.out.println("\n\n*******************************");
			System.out.println("***     LISTA 02 - JAVA     ***");
			System.out.println("*******************************\n");
			System.out.println("1 - Calculadora");
			System.out.println("2 - Calculadora em ordem Crescente");
			System.out.println("3 - Cinco n�meros(Maior/Menor)");
			System.out.println("4 - M�ltiplo");
			System.out.println("5 - Limite de Conta Corrente");
			System.out.println("6 - Comiss�o");
			System.out.println("7 - Horas Trabalhadas");
			System.out.println("8 - Criptografia");
			System.out.println("9 - Descriptografia");
			System.out.println("\n");
			System.out.println("Digite a op��o desejada: ");
			opcao = leitor.nextInt();

			Exercicio chamaExercicio = new Exercicio();
			chamaExercicio.ChamaExercicio(opcao);
			
			System.out.println("Deseja escolher outra op��o?(sim/nao): ");
			continuar = leitor2.nextLine();
		}
		
		System.out.println("----------- Fim da Lista 2 ---------------");

		leitor.close();
		leitor2.close();
	}

}
