package br.pet.questionario;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import br.com.objectos.way.relational.Database;

@Test
@Guice(modules = {ModuloDeTesteQuestionnarieGen.class})
public class TesteDebuscarTema {
	
	@Inject
	private Database db;
	
	public void teste() {
		Tema tema = new ConstrutorDeTemaFalso()
		.descricao("BD")
		.novaInstancia();
		db.insert(tema);
	}

}