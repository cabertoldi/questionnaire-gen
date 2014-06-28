package br.pet.questionario;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.objectos.way.relational.GeneratedKeyCallback;
import br.com.objectos.way.relational.Insert;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
class AlternativaJdbc implements Alternativa {

  private int id;
  private final Questao questao;
  private final String descricao;
  private final boolean correta;

  public AlternativaJdbc(Construtor construtor) {
    questao = construtor.getQuestao();
    descricao = construtor.getDescricao();
    correta = construtor.isCorreta();
  }

  @Override
  public Insert getInsert() {
    return Insert.into("ALTERNATIVA")
        .onGeneratedKey(new GeneratedKeyCallback() {

          @Override
          public void set(ResultSet rs) throws SQLException {
            id = rs.next() ? rs.getInt(1) : 0;
          }
        });
  }

  @Override
  public AlternativaJdbc toJdbc() {
    return this;
  }

}