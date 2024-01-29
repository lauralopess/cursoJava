package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		//Objeto 1
		Administrativo funcionario1 = new Administrativo();
		funcionario1.nome = "Carlos";
		funcionario1.emailCorporativo = "carlos";
		funcionario1.redeDominio = "@sp.senac.br";
		System.out.println("Nome: " + funcionario1.nome);
		funcionario1.acessarSistema();
		
		Administrativo funcionario2 = new Administrativo();
		funcionario2.nome = "Joelma";
		funcionario2.emailCorporativo = "joelma";
		funcionario2.redeDominio = "@sesi.com.br";
		System.out.println("Nome: " + funcionario2.nome);
		funcionario2.acessarSistema();

	}

}
