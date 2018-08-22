package RevisaoImpressao;

public class Aluno extends Pessoa {
	private int numeroMatricula;
	private int turma;
	public Aluno(String nome, int numeroMatricula, int turma) {
		super(nome);
		this.numeroMatricula = numeroMatricula;
		this.turma = turma;
	}
	
	public int getMatricula() {
		return this.numeroMatricula;
	}
	
	public int getTurma() {
		return this.turma;
	}

}	