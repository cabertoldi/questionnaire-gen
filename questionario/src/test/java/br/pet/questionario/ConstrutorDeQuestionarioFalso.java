package br.pet.questionario;

import br.pet.questionario.Questionario.Construtor;

public class ConstrutorDeQuestionarioFalso implements Construtor {
	
	private String titulo;
	
	private Tema tema;

	@Override
	public Questionario novaInstancia() {
		return new QuestionarioJdbc(this);
	}

	public ConstrutorDeQuestionarioFalso titulo(String titulo) {
		this.titulo = titulo;
		return this;
	}

	public ConstrutorDeQuestionarioFalso tema(Tema tema) {
		this.tema = tema;
		return this;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Tema getTema() {
		return tema;
	}

}