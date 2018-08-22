package RevisaoImpressao;

public class Professor extends Pessoa{
	
	 private int pis;
		
	 public Professor(String nome, int numeroPis) {
		 super(nome);
		 this.pis = numeroPis;
	 }

	 
	 public int getPis() {
		 return this.pis;
	 }
	 
}
