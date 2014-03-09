package br.pet.questionario;

import br.com.objectos.way.relational.Insertable;

public interface Alternativa extends Insertable{

	interface Construtor extends br.com.objectos.comuns.base.Construtor<Alternativa>{

		Questao getQuestao();
		
		String getDescricao();
		
		boolean isCorreta();
		
	}
	
	int getId();
	
	Questao getQuestao();
	
	String getDescricao();
	
	boolean isCorreta();

}