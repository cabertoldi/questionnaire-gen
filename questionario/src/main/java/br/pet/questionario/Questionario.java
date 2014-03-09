package br.pet.questionario;

import br.com.objectos.way.relational.Insertable;

public interface Questionario extends Insertable{
	
	interface Construtor extends br.com.objectos.comuns.base.Construtor<Questionario>{

		String getTitulo();
		
		Tema getTema();
		
	}
	
	int getId();
	
	String getTitulo();
	
	Tema getTema();

}