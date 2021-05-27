
public class Empregado extends Funcionario {
	
	private String codCadastro;
	private String funcao;
	private Setor set;
	private Gerente gerente;

	public Empregado(String nome, int idade, String cpf, String codCadastro, String funcao, Setor set, Gerente gerente) {
		super(nome, idade, cpf);
		
		setCodCadastro(codCadastro);
		setFuncao(funcao);
		setSet(set);
		setGerente(gerente);
		
	}

	public String getCodCadastro() {
		return codCadastro;
	}
	public void setCodCadastro(String codCadastro) {
		this.codCadastro = codCadastro;
	}

	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Setor getSet() {
		return set;
	}
	public void setSet(Setor set) {
		this.set = set;
	}

	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}


	public String toString() {
		return String.format("\nO nome do empregado é %s, tem %d anos, e seu CPF é %s."
				+ "\nO código do cadastro é %s e ira trabalhar na função de %s.\n%s \n%s", getNome(), getIdade(), getCpf(), 
				getCodCadastro(), getFuncao(),getSet(), getGerente());
	}
	
	

}
