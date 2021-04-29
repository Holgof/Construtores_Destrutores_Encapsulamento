package exercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String idUFF;
	private float cr;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Disciplina> disciplinasConcluidas = new ArrayList<Disciplina>();
	
	private void geraHistorico (Aluno aluno) {
		int i = 0;
		for(i = 0; i < disciplinasConcluidas.size(); i++) {
			System.out.printf("%n%s: ", this.disciplinasConcluidas.indexOf(i));
			System.out.printf("%f.%n", this.disciplinasConcluidas.indexOf(i));
		}
	}	

	public void calculaCr (Aluno aluno) {
		int i = 0;
		float totalSoma = 0;
		
		for (i = 0; i < this.disciplinas.size(); i++) {
			totalSoma += this.disciplinas.indexOf(i);
		}
		
		this.cr = totalSoma/disciplinas.size();
	}
	
	public String getNome (Aluno aluno) {
		return this.nome;
	}
	
	public void setNome (String nomeAluno) {
		this.nome = nomeAluno;
	}
	
	public String getIdUFF (Aluno aluno) {
		return this.idUFF;
	}
	
	public void setIdUFF (String IdUFFCriado) {
		this.idUFF = IdUFFCriado;
	}
	
	public void inscreverNaDisciplina (Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public void obterHorarioDaAula(Disciplina disciplina) {
		System.out.println(disciplina.getHorario(disciplina));
	}
	
	public Professor obterProfessorDaDisciplina(Disciplina disciplina) {
		return disciplina.getProfessor(disciplina);
	}
	
	public String obterEmenta(Disciplina disciplina) {
		return disciplina.getEmenta(disciplina);
	}
	
	public List<Disciplina> getDisciplinasConcluidas() {
		return disciplinasConcluidas;
	}


	public void setDisciplinasConcluidas(Disciplina disciplinaConcluida) {
		disciplinasConcluidas.add(disciplinaConcluida);
	}
}


