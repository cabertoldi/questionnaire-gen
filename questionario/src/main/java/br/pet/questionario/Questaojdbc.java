package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

public class Questaojdbc implements Questao{
	
	private int id;
	private String enunciado;
	private Questionario questionario;

	public Questaojdbc(Construtor construtor) {
		enunciado = construtor.getEnunciado();
		questionario = construtor.getQuestionario();
	}

	@Override
	public Insert getInsert() {
		return Insert.into("QUESTAO")
			.value("ENUNCIADO", enunciado)
			.value("QUESTIONARIO_ID", questionario.getId())
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

	public String getEnunciado() {
		return enunciado;
	}

	public Questionario getQuestionario() {
		return questionario;
	}

}