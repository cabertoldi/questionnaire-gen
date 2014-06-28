package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
class QuestionarioJdbc implements Questionario {

  private int id;
  private final String descricao;

  public QuestionarioJdbc(Construtor construtor) {
    descricao = construtor.getDescricao();
  }

  @Override
  public Insert getInsert() {
    return Insert.into("QUESTIONARIO")
        .onGeneratedKey(new GeneratedKeyCallback() {

          @Override
          public void set(ResultSet rs) throws SQLException {
            id = rs.next() ? rs.getInt(1) : 0;
          }
        });
  }

  @Override
  public QuestionarioJdbc toJdbc() {
    return this;
  }

}