package pooTurma;

public class Alunos {

	public static void main(String[] args) {

		//Objeto 1
		
		Turma aluno1 = new Turma();

		aluno1.nome = "Laura";
		aluno1.telefone = "11994608910";
		aluno1.emailPessoal = "lauralopes@gmail.com";
		aluno1.emailEducacional = "laura.lsantos1@sancsp.edu.br";
		aluno1.mencao = "D";
		System.out.println("Nome do aluno: " + aluno1.nome);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("E-mail: " + aluno1.emailPessoal);
		System.out.println("E-mail educacional: " + aluno1.emailEducacional);
		aluno1.ligarPc();
		aluno1.logar();
		aluno1.unidadeCurricular();

		System.out.println();
		// Objeto 2

		Turma aluno2 = new Turma();

		aluno2.nome = "Victoria";
		aluno2.telefone = "11992682158";
		aluno2.emailPessoal = "victoriacardoso@gmail.com";
		aluno2.emailEducacional = "victoriacardoso@senacsp.edu.br";
		aluno2.mencao = "D";
		System.out.println("Nome do aluno:" + aluno2.nome);
		System.out.println("Telefone: " + aluno2.telefone);
		System.out.println("E-mail: " + aluno2.emailPessoal);
		System.out.println("E-mail educacional: " + aluno2.emailEducacional);
		aluno2.ligarPc();
		aluno2.desligarPc();
		aluno2.unidadeCurricular();

	}
	

}
