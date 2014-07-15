package br.pet.questionario;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Questao {

  interface Construtor extends br.pet.base.Construtor<Questao> {

    Questionario getQuestionario();

    QuestaoTipo getTipo();

    String getEnunciado();

  }

}