
public class Setor  implements Ferias {
	
	private String set;
	private String horaTrabalho;
	private String codSetor;
	private double salario;
	
	public Setor(String set, String horaTrabalho, String codSetor, double salario) {
		
		setSetor(set);
		setHoraTrabalho(horaTrabalho);
		setCodSetor(codSetor);
		setSalario(salario);
		
	}

	public String getSet() {
		return set;
	}
	public void setSetor(String set) {
		this.set = set;
	}

	public String getHoraTrabalho() {
		return horaTrabalho;
	}
	public void setHoraTrabalho(String horaTrabalho) {
		this.horaTrabalho = horaTrabalho;
	}

	public String getCodSetor() {
		return codSetor;
	}
	public void setCodSetor(String codSetor) {
		this.codSetor = codSetor;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getFerias() {
		return (salario + (salario/3));
	}


	public String toString() {
		return String.format("\nSetor: %s.\nQuantidade de horas a ser trabalhadas: %s."
				+ "\nCódigo do Setor: %s.\nO salário é de %.2f."
				+ "\nQuando o funcionário sair de féria ele vai receber %.2f", getSet(), getHoraTrabalho(), getCodSetor(), getSalario(), getFerias());
		
		
	}
	
	
	
	

}
