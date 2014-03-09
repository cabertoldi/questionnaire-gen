package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

public class AlternativaJdbc implements Alternativa{
	
	private int id;
	private String descricao;
	private Questao questao;
	private boolean correta;

	public AlternativaJdbc(Construtor construtor) {
		descricao = construtor.getDescricao();
		questao = construtor.getQuestao();
		correta = construtor.isCorreta();
	}

	@Override
	public Insert getInsert() {
		return Insert.into("ALTERNATIVA")
			.value("DESCRICAO", descricao)
			.value("QUESTAO_ID", questao.getId())
			.value("CORRETA", correta)
			.onGeneratedKey(new GeneratedKeyCallback() {
				
				@Override
				public void set(ResultSet rs) throws SQLException {
					id = rs.next() ? rs.getInt(1) : 0;
				}
			});
	}

	void setId(int id){
		this.id = id;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public Questao getQuestao() {
		return questao;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public boolean isCorreta() {
		return correta;
	}

}