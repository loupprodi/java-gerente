
public class TesteEmpresa {

	public static void main(String[] args) {
		
		Setor setorGerente1 = new Setor ("TI", "44", "1122", 12000.00);
		Setor setorEmpregado1 = new Setor ("TI", "44", "1122", 2000.00);
		Gerente g1 = new Gerente ("Vitor", 50, "111.111.111-11", "Administração", "8000", setorGerente1);	
		Empregado e1 = new Empregado ("Roberto", 22, "222.222.222-22", "2000", "Desenvolvedor front-end", setorEmpregado1, g1);
		
		System.out.println(e1);


	}

}
