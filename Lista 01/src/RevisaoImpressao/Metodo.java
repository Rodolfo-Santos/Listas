package RevisaoImpressao;

import java.util.Scanner;

public class Metodo {
	Scanner leitor = new Scanner(System.in);
	private static int nAluno = 0;
	private static Aluno alunos[] = new Aluno[20];
	
	private static int nProfessor = 0;
	private static Professor professores[] = new Professor[20];

	
	public void printaQuadrado() {
		System.out.println("*******************");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*******************");
	}

	public int[] scanner() {
		int n1, n2;
		String nome;

		System.out.println("Digite o nome do Usuário: ");
		nome = leitor.nextLine();
		System.out.println("Digite o valor de n1: ");
		n1 = leitor.nextInt();
		System.out.println("Digite o valor de n2: ");
		n2 = leitor.nextInt();

		System.out.println("Nome do Usuário: " + nome);
		System.out.println("Valor de n1: " + n1);
		System.out.println("Valor de n1: " + n2);

		int[] valores = new int[] { n1, n2 };
		return valores;

	}

	public void condicaoComparacao() {
		int a, b;
		System.out.println("Digite o valor de n1: ");
		a = leitor.nextInt();

		System.out.println("Digite o valor de n2: ");
		b = leitor.nextInt();

		if (a > b)
			System.out.println(a + " É maior que " + b);
		if (b > a)
			System.out.println(b + " É maior que " + a);
		if (a == b)
			System.out.println(a + " É igual a " + b);

	}

	public void repeticao(int quantidadeDeAsteristico) {
		System.out.println("**********");
		int cont = 0;
		while (quantidadeDeAsteristico > cont) {
			System.out.println("*        *");
			cont++;
		}
		System.out.println("**********");
	}

	public void calculadora() {
		System.out.println("O que você deseja Fazer? Digite o valor a opção que você deseja");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		System.out.println("5 - SAIR");

		System.out.println("Opção: ");
		int opcao = leitor.nextInt();

		if (opcao == 5) {
			System.out.println("Você escolheu Sair");
		}

		System.out.println("Digite o valor de n1");
		int n1 = leitor.nextInt();
		System.out.println("Digite o valor de n2");
		int n2 = leitor.nextInt();

		int resultado = 0;
		if (opcao == 1)
			resultado = n1 + n2;
		if (opcao == 2)
			resultado = n1 - n2;
		if (opcao == 3)
			resultado = n1 * n2;
		if (opcao == 4)
			resultado = n1 / n2;
		System.out.println("Resultado: " + resultado);
	}

	public void operadorLogicos() {
		boolean[] coluna1 = { true, true, false, false };
		boolean[] coluna2 = { true, false, true, false };
		boolean[] resultado = new boolean[4];

		System.out.println("Digite o Operador (and / or / not and / not or) : ");
		String operador = leitor.nextLine();

		String op = null;
		for (int n = 0; n < 4; n++) {
			if (operador.equals("and")) {
				resultado[n] = coluna1[n] && coluna2[n];
				op = " AND ";
			}
			if (operador.equals("or")) {
				resultado[n] = coluna1[n] || coluna2[n];
				op = " OR ";
			}
			if (operador.equals("not and")) {
				resultado[n] = !(coluna1[n] && coluna2[n]);
				op = " NOT AND ";
			}
			if (operador.equals("not or")) {
				resultado[n] = !(coluna1[n] || coluna2[n]);
				op = " NOT OR ";
			}

			System.out.println(coluna1[n] + op + coluna2[n] + " = " + resultado[n]);
		}
	}

	public void criaAluno() {
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = leitor.nextLine();

		System.out.println("Digite o número do Matricula: ");
		int numeroMatricula = leitor.nextInt();

		System.out.println("Digite o Código da Turma: ");
		int codigoTurma = leitor.nextInt();

		Aluno cadastroAluno = new Aluno(nomeAluno, numeroMatricula, codigoTurma);
		System.out.println("Aluno Cadastrado com Sucesso!");
		System.out.println("Nome: " + cadastroAluno.getNome());
		System.out.println("Matrícula: " + cadastroAluno.getMatricula());
		System.out.println("Turma: " + cadastroAluno.getTurma());

		alunos[nAluno] = cadastroAluno;
		nAluno++;
	}

	public void getAluno() {
		System.out.println("Digite o nome código do aluno: ");
		int n = leitor.nextInt();
		System.out.println("Código: " + n);
		System.out.println("Nome: " + alunos[n].getNome());
		System.out.println("Matrícula: " + alunos[n].getMatricula());
		System.out.println("Turma: " + alunos[n].getTurma());
	}

	public void criaProfessor() {
		System.out.println("Digite o nome do Professor: ");
		String nomeProfessor = leitor.nextLine();

		System.out.println("Digite o número do PIS: ");
		int numeroPis = leitor.nextInt();

		Professor cadastroProfessor = new Professor(nomeProfessor, numeroPis);
		System.out.println("Aluno Cadastrado com Sucesso!");
		System.out.println("Nome: " + cadastroProfessor.getNome());
		System.out.println("Pis: " + cadastroProfessor.getPis());
		
		professores[nProfessor] = cadastroProfessor;
		nProfessor++;
	}
	
	public void getProfessor() {
		System.out.println("Digite o código do Professor: ");
		int n = leitor.nextInt();
		System.out.println("Código: " + n);
		System.out.println("Nome: " + professores[n].getNome());
		System.out.println("PIS: " + professores[n].getPis());
	}

	public void executaMetodos(int opcao) {

		if (opcao == 1) {
			Metodo quadrado = new Metodo();
			quadrado.printaQuadrado();
		}
		if (opcao == 2) {
			Metodo scanner = new Metodo();
			scanner.scanner();
		}

		if (opcao == 3) {
			Metodo condicao = new Metodo();
			condicao.condicaoComparacao();
		}
		if (opcao == 4) {
			Metodo repeticao = new Metodo();
			repeticao.repeticao(8);
		}
		if (opcao == 5) {
			Metodo calculadora = new Metodo();
			calculadora.calculadora();
		}

		if (opcao == 6) {
			Metodo operadores = new Metodo();
			operadores.operadorLogicos();
		}

		if (opcao == 7) {
			Metodo criaAluno = new Metodo();
			criaAluno.criaAluno();
		}
		
		if (opcao == 8) {
			Metodo buscaAluno = new Metodo();
			buscaAluno.getAluno();
		}
		
		if (opcao == 9) {
			Metodo criaProfessor = new Metodo();
			criaProfessor.criaProfessor();
		}
		
		if(opcao == 10) {
			Metodo buscaProfessor = new Metodo();
			buscaProfessor.getProfessor();
		}
		
		if (opcao == 11) {
			
		}

	}
}