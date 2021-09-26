package classes;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String data_nascimento;
	protected Double preco_copia;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public double tirarCopia(int qnt_copias) {
		double total;
		total = qnt_copias * this.preco_copia;
		return total;
	}


}
