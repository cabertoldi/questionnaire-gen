package br.pet.questionario;

import br.pet.questionario.Alternativa.Construtor;

public class ConstrutorDeAlternativaFalso implements Construtor {
	
	private String descricao;
	private Questao questao;
	private boolean correta;

	@Override
	public Alternativa novaInstancia() {
		return new AlternativaJdbc(this);
	}
	
	public ConstrutorDeAlternativaFalso descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ConstrutorDeAlternativaFalso questao(Questao questao) {
		this.questao = questao;
		return this;
	}

	public ConstrutorDeAlternativaFalso correta(boolean correta) {
		this.correta = correta;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public Questao getQuestao() {
		return questao;
	}

	public boolean isCorreta() {
		return correta;
	}

}