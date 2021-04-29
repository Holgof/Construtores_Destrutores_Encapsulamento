package exercicio_2;

public class Professor {
	private String nome;
	private Disciplina[] disciplinas;
	private Aluno[] turma;
	
	public void obterHorarioDaAula(Disciplina disciplina) {
		System.out.println(disciplina.getHorario(disciplina));
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno[] getTurma() {
		return turma;
	}

	public void setTurma(Aluno[] turma) {
		this.turma = turma;
	}
	
	
}

