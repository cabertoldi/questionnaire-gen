package br.pet.questionario;

import java.util.List;

import com.google.inject.Inject;

import br.com.objectos.way.relational.Database;
import br.com.objectos.way.relational.NativeSql;

class BuscarTemaGuice implements BuscarTema {
  
  private Database db;
  
  @Inject
  public BuscarTemaGuice(Database db) {
    this.db = db;
  }

  @Override
  public List<Tema> porTodos() {
    return newSelect()
        .list();
  }

  private NativeSql newSelect() {
    return db.newSql()

        .add("select *")
        .add("from RO_MERCADO.DEBENTURE_CARACTERISTICA")

        .andLoadWith(new TemaLoader());
  }

}