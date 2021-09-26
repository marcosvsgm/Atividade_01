package classes;

public class Aluno extends Pessoa {
	protected String matricula;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
 
	@Override
	public double tirarCopia(int qnt_copias) {
		this.preco_copia = 0.10;
		double total;
		total = qnt_copias * this.preco_copia;
		return total;
		
	}
	
}
