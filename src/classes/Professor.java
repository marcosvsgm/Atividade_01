package classes;

public class Professor extends Pessoa {
	protected double salario;
	protected String disciplina;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public double tirarCopia(int qnt_copias) {
		this.preco_copia = 0.08;
		double total;
		total = qnt_copias * this.preco_copia;
		return total;
		}

}
