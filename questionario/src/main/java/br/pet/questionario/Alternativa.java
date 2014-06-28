package br.pet.questionario;

import br.com.objectos.way.relational.IsEntidade;

public interface Alternativa extends IsEntidade {

  interface Construtor extends br.com.objectos.comuns.base.Construtor<Alternativa> {

    Questao getQuestao();

    String getDescricao();

    boolean isCorreta();

  }

  @Override
  AlternativaJdbc toJdbc();

}