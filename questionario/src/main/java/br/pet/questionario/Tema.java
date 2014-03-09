package br.pet.questionario;

import br.com.objectos.way.relational.Insertable;

public interface Tema extends Insertable{
	
	interface Construtor extends br.com.objectos.comuns.base.Construtor<Tema>{
		
		String getDescricao();
		
	}

	int getId();
	
	String getDescricao();
	
}