package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

public class QuestionarioJdbc implements Questionario {
	
	private int id;
	private String titulo;
	private Tema tema;

	public QuestionarioJdbc(Construtor construtor) {
		titulo = construtor.getTitulo();
		tema = construtor.getTema();
	}

	@Override
	public Insert getInsert() {
		return Insert.into("QUESTIONARIO")
			.value("TITULO", titulo)
			.value("TEMA_ID", tema.getId())
			.onGeneratedKey(new GeneratedKeyCallback() {
				
				@Override
				public void set(ResultSet rs) throws SQLException {
					 id = rs.next() ? rs.getInt(1) : 0;
				}
			});
	}
	
	void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Tema getTema() {
		return tema;
	}

}