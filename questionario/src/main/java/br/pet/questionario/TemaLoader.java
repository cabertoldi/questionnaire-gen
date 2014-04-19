package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.ResultSetLoader;
import br.com.objectos.way.relational.ResultSetWrapper;

class TemaLoader implements ResultSetLoader<Tema> {

  @Override
  public Tema load(ResultSet resultSet) throws SQLException {
    ResultSetWrapper rs = new ResultSetWrapper("TEMA", resultSet);
    return new Loader(rs).novaInstancia();
  }
  
  private class Loader implements Tema.Construtor{
    
    private ResultSetWrapper rs;

    public Loader(ResultSetWrapper rs) {
      this.rs = rs;
    }

    @Override
    public Tema novaInstancia() {
      return new TemaJdbc(this);
    }

    @Override
    public String getDescricao() {
      return rs.getString("DESCRICAO");
    }
    
  }

}