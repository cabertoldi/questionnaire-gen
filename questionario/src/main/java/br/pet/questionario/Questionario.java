package br.pet.questionario;

import br.com.objectos.way.relational.IsEntidade;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public interface Questionario extends IsEntidade {

  interface Construtor extends br.com.objectos.comuns.base.Construtor<Questionario> {

    String getDescricao();

  }

  @Override
  QuestionarioJdbc toJdbc();

}