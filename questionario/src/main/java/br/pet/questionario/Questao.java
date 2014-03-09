package br.pet.questionario;

import br.com.objectos.way.relational.Insertable;

public interface Questao extends Insertable {

	interface Construtor extends br.com.objectos.comuns.base.Construtor<Questao>{

		Questionario getQuestionario();
		
		String getEnunciado();
		
	}
	
	int getId();
	
	Questionario getQuestionario();
	
	String getEnunciado();

}