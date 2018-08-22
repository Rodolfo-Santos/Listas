package RevisaoImpressao;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Metodo opcoes = new Metodo();
	
		int opcao;

		Scanner leitor = new Scanner(System.in);
		Scanner leitor2 = new Scanner(System.in);

		String i = "sim";
		while (i.equals("sim")) {
			System.out.println("\n\n*******************************");
			System.out.println("***     LISTA 01 - JAVA     ***");
			System.out.println("*******************************\n");
			System.out.println("1 - Print");
			System.out.println("2 - Scanner");
			System.out.println("3 - Condicao");
			System.out.println("4 - Repetição");
			System.out.println("5 - Calculadora");
			System.out.println("6 - Operadores Lógicos");
			System.out.println("7 - Cadastro de Aluno");
			System.out.println("8 - Buscar Aluno");
			System.out.println("9 - Cadastro de Professor");
			System.out.println("10 - Buscar Professor");
			System.out.println("\n");
			System.out.println("Digite a opção desejada: ");
			
			opcao = leitor.nextInt();
					
			opcoes.executaMetodos(opcao);
			System.out.println("\n\nDeseja escolher outra opção (sim/não)?");
			i = leitor2.nextLine();
		}
		leitor2.close();
		leitor.close();
		
		System.out.println("---------- Fim da Lista 1 --------------");
	}
}
