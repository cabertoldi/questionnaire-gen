package br.pet.questionario;

import br.com.objectos.way.relational.IsEntidade;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public interface Questao extends IsEntidade {

  interface Construtor extends br.com.objectos.comuns.base.Construtor<Questao> {

    Questionario getQuestionario();

    QuestaoTipo getTipo();

    String getEnunciado();

  }

  @Override
  Questaojdbc toJdbc();

}