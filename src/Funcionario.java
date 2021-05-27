
public abstract class  Funcionario 
{
	private String nome;
	private int idade;
	private String cpf;
	
	public Funcionario (String nome, int idade, String cpf) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
