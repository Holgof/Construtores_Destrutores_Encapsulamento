package exercicio_2;

public class Disciplina {
	private Professor professor;
	private String nomeDaDisciplina;
	private String ementaDaDisciplina;
	private String horarioDaAula;
	private float nota;
	
	public void setProfessor (Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor (Disciplina disciplina) {
		return this.professor;
	}
	
	public void setHorario (String novoHorario) {
		this.horarioDaAula = novoHorario;
	}
	
	public String getHorario (Disciplina disciplina) {
		return this.horarioDaAula;
	}
	
	public void setNome (String nomeMateria) {
		this.nomeDaDisciplina = nomeMateria;
	}
	
	public String getNome (Disciplina disciplina) {
		return this.nomeDaDisciplina;
	}
	
	public void setEmenta (String ementa) {
		ementaDaDisciplina = ementa;
	}
	
	public String getEmenta (Disciplina disciplina) {
		return this.ementaDaDisciplina;
	}
	
	public void setNota (float notaFinal) {
		this.nota = notaFinal;
	}
	
	public float getNota () {
		return this.nota;
	}
}
