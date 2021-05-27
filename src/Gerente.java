
public class Gerente extends Funcionario {
	
	private String formacao;
	private String cod;
	private Setor set;

	public Gerente(String nome, int idade, String cpf, String formacao, String cod, Setor set) {
		super(nome, idade, cpf);
		
		setFormacao(formacao);
		setCod(cod);
		setSet(set);
		
	}

	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}

	public Setor getSet() {
		return set;
	}
	public void setSet(Setor set) {
		this.set = set;
	}

	
	public String toString() {
		return String.format("\nO nome do gerente � %s, tem %d anos, e seu CPF � %s."
				+ "\nO c�digo do cadastro � %s e ira possui forma��o em %s", getNome(), getIdade(), getCpf(), getCod(), getFormacao());
	}
	
	
	
	
	

}
