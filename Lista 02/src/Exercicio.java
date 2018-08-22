import java.util.Scanner;

public class Exercicio {
	Scanner leitor = new Scanner(System.in);

	public void ChamaExercicio(int opcao) {
		if (opcao == 1) {
			Exercicio calculadora = new Exercicio();
			calculadora.Calculadora();
		}
		if (opcao == 2) {
			Exercicio calculadoraEmOrdem = new Exercicio();
			calculadoraEmOrdem.CalculadoraEmOrdem();
		}
		if (opcao == 3) {
			Exercicio cincoNumeros = new Exercicio();
			cincoNumeros.CincoNumeros();
		}
		if (opcao == 4) {
			Exercicio verificaMultiplo = new Exercicio();
			verificaMultiplo.VerificaMultiplo();
		}
		if (opcao == 5) {
			Exercicio limiteDeContaCorrente = new Exercicio();
			limiteDeContaCorrente.LimiteDeContaCorrente();
		}
		if (opcao == 6) {
			Exercicio comissao = new Exercicio();
			comissao.Comissao();
		}

		if (opcao == 7) {
			Exercicio horasTrabalhadas = new Exercicio();
			horasTrabalhadas.HorasTrabalhadas();
		}
		if(opcao == 8) {
			Exercicio criptografia = new Exercicio();
			criptografia.Criptografia();
		}
		if(opcao == 9) {
			Exercicio descriptografia = new Exercicio();
			descriptografia.Descriptografia();
		}

	}

	public void Calculadora() {
		int n1, n2, resultado;
		System.out.println("Digite o primeiro número: ");
		n1 = leitor.nextInt();

		System.out.println("Digite o segundo número:");
		n2 = leitor.nextInt();

		System.out.println("------------------------");
		resultado = n1 + n2;
		System.out.println("Soma: " + resultado);
		resultado = n1 - n2;
		System.out.println("Subtração: " + resultado);
		resultado = n1 * n2;
		System.out.println("Multiplicação: " + resultado);
		resultado = n1 / n2;
		System.out.println("Divisão: " + resultado);
		resultado = n1 * n2;
		System.out.println("Produto: " + resultado);
	}

	public void CalculadoraEmOrdem() {
		System.out.println("Insira dois inteiros:");
		int n1 = leitor.nextInt();
		int n2 = leitor.nextInt();
		if (n1 > n2) {
			int aux = n1;
			n1 = n2;
			n2 = aux;
		}
		int soma = n1 + n2;
		int media = soma / 2;

		System.out.printf("A soma e a média dos valores %d e %d são %d e %d respectivamente\n", n1, n2, soma, media);
	}

	public void CincoNumeros() {
		int max = 0;
		int min = 9999999;
		int n1;
		for (int i = 0; i < 5; i++) {
			System.out.print("\nDigite o valor " + i + ":");
			n1 = leitor.nextInt();
			if (n1 > max) {
				max = n1;
			}

			if (n1 < min) {
				min = n1;
			}
		}

		System.out.println("Menor valor digitado: " + min);
		System.out.println("Maior valor digitado: " + max);
	}

	public void VerificaMultiplo() {
		System.out.println("Digite o valor n1: ");
		int n1 = leitor.nextInt();
		System.out.println("Digite o valor n2: ");
		int n2 = leitor.nextInt();

		if (n1 % n2 == 0) {
			System.out.println(n1 + " É múltiplo de " + n2);
		} else {
			System.out.println(n1 + " Não é múltimo de " + n2);
		}
	}

	public void LimiteDeContaCorrente() {
		System.out.print("Cadastre um Cliente ------");
		Cliente cadastroCliente = new Cliente();
		System.out.print("\nNome: ");
		cadastroCliente.setNome(leitor.nextLine());
		System.out.print("CPF: ");
		cadastroCliente.setCpf(leitor.nextLine());

		System.out.print("\nCadastro da Conta --------");
		Conta_Corrente cadastroConta = new Conta_Corrente();
		cadastroConta.setTitular(cadastroCliente);

		System.out.print("\nAgencia: ");
		cadastroConta.setAgencia(leitor.nextInt());

		System.out.print("Conta: ");
		cadastroConta.setConta(leitor.nextInt());

		System.out.print("Saldo: ");
		cadastroConta.setSaldo(leitor.nextDouble());

		System.out.print("Creditos: ");
		cadastroConta.setCreditos(leitor.nextDouble());

		System.out.print("Debitos: ");
		cadastroConta.setDebitos(leitor.nextDouble());

		System.out.print("Limite de Crédito da Conta: ");
		cadastroConta.setLimite_de_credito(leitor.nextDouble());

		double saldo_final = cadastroConta.getSaldo() + cadastroConta.getCreditos() - cadastroConta.getDebitos();

		System.out.println("\nCadastro Realizado com Sucesso: \n");
		System.out.println("Saldo Final: " + saldo_final + "\n");
		if (saldo_final > cadastroConta.getLimite_de_credito()) {
			System.out.println("O Saldo Excedeu o Limite de Crédito!\n");
		}
	}

	public void Comissao() {
		System.out.println("Digite a quantidade de itens vendidos: ");
		int i = leitor.nextInt();
		double total = 0, valor, comissao;
		for (int j = 0; j < i; j++) {
			System.out.println("Valor do Item " + j + ": ");
			valor = leitor.nextDouble();
			comissao = valor * 0.09;
			total += comissao;
		}

		double total_a_receber = total + 200;
		System.out.println("Valor a receber na semana: " + total_a_receber);
	}

	public void HorasTrabalhadas() {
		int horas;
		double salario;
		double valor_extra;
		System.out.println("Digite o salário/hora do Funcionário: ");
		salario = leitor.nextDouble();
		System.out.println("Digite a quantidade de horas trbalhadas:");
		horas = leitor.nextInt();
		if (horas > 40)
			horas -= 40;
		valor_extra = (salario * 0.5) * horas;
		System.out.println("\n Valor a receber por horas Extras: " + valor_extra);
	}

	public void Criptografia() {
		System.out.println("Numero do Telefone[4 Digitos]: ");
		int criptografado[] = new int[4];
		int numero = leitor.nextInt();
		int divisor = 1000;
		for(int i = 0; i < 4 ; i++) {
			criptografado[i] = ((numero / divisor) + 7)%10;
			divisor = divisor / 10 ;
		}
		
		int aux;
		aux = criptografado[0];
		criptografado[0] = criptografado[2];
		criptografado[2] = aux;
		aux = criptografado[1];
		criptografado[1] = criptografado[3];
		criptografado[3] = aux;
		
		System.out.println("Numero Criptografado: ");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print(criptografado[i]);
		}
		System.out.println("");
	}
	
	public void Descriptografia() {
		System.out.println("Numero Criptografado[4 Digitos]: ");
		int decriptografado[] = new int[4];
		int numero = leitor.nextInt();
		int divisor = 1000;
		for(int i = 0; i < 4 ; i++) {
			decriptografado[i] = ((numero / divisor) + 7)%10;
			divisor = divisor / 10 ;
		}
		
		int aux;
		aux = decriptografado[2];
		decriptografado[2] = decriptografado[0];
		decriptografado[0] = aux;
		aux = decriptografado[3];
		decriptografado[3] = decriptografado[1];
		decriptografado[1] = aux;
		
		System.out.println("Numero Descriptografado: ");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print(decriptografado[i]);
		}
		System.out.println("");
		
	}
}