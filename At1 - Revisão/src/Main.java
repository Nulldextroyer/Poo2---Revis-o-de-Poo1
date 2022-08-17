
public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Felipe", "Masculino", 989); 
		System.out.println(p);
		System.out.println("\n");
		
		Aluno a = new Aluno("Renan", "Masculino", 8123, "29/07/2001");
		System.out.println(a);
		System.out.println("\n");
		
		Professor pr = new Professor("Rodrigo", "Masculino", 769, 100000, "Graduado em Ciência da Computação e Mestre em Engenharia Elétrica" );
		System.out.println(pr);
		System.out.println("\n");
		
		Turma t = new Turma("4c", 2021);
		System.out.println(t);
		System.out.println("\n");
		
		Disciplina d = new Disciplina(1, "Poo2", 60);
		System.out.println(d);
		System.out.println("\n");
	}

}
