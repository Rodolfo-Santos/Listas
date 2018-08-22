
public class Conta_Corrente {
	private Cliente titular;
	private int conta;
	private int agencia;
	private double saldo;
	private double debitos;
	private double creditos;
	private double limite_de_credito;

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDebitos() {
		return debitos;
	}

	public void setDebitos(double debitos) {
		this.debitos = debitos;
	}

	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public double getLimite_de_credito() {
		return limite_de_credito;
	}

	public void setLimite_de_credito(double limite_de_credito) {
		this.limite_de_credito = limite_de_credito;
	}

}
