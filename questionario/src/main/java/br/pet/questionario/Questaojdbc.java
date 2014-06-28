package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

class Questaojdbc implements Questao {

  private int id;
  private final Questionario questionario;
  private final String enunciado;

  public Questaojdbc(Construtor construtor) {
    enunciado = construtor.getEnunciado();
    questionario = construtor.getQuestionario();
  }

  @Override
  public Insert getInsert() {
    return Insert.into("QUESTAO")
        .onGeneratedKey(new GeneratedKeyCallback() {

          @Override
          public void set(ResultSet rs) throws SQLException {
            id = rs.next() ? rs.getInt(1) : 0;
          }
        });
  }

  @Override
  public Questaojdbc toJdbc() {
    return this;
  }

}