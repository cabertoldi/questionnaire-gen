package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

public class TemaJdbc implements Tema{
	
	private int id;
	private String descricao;

	public TemaJdbc(Construtor construtor){
		descricao = construtor.getDescricao();
	}
	
	@Override
	public Insert getInsert() {
		 return Insert.into("TEMA")
			 .value("DESCRICAO", descricao)				 
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
	
	public int getId(){
		return id;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}