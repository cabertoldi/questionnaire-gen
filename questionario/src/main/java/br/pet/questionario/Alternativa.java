package br.pet.questionario;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Alternativa {

  interface Construtor extends br.pet.base.Construtor<Alternativa> {

    Questao getQuestao();

    String getDescricao();

    boolean isCorreta();

  }

}