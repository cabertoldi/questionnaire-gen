package br.pet.questionario;

import br.pet.questionario.Questao.Construtor;

public class ConstrutorDeQuestaoFalso implements Construtor {
	
	private String enunciado;
	private Questionario questionario;

	@Override
	public Questao novaInstancia() {
		return new Questaojdbc(this);
	}

	public ConstrutorDeQuestaoFalso enunciado(String enunciado) {
		this.enunciado = enunciado;
		return this;
	}
	
	public ConstrutorDeQuestaoFalso euestionario(Questionario questionario) {
		this.questionario = questionario;
		return this;
	}

	public String getEnunciado() {
		return enunciado;
	}
	
	public Questionario getQuestionario() {
		return questionario;
	}

}