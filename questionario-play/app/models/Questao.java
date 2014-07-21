package models;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Questao {

  interface Construtor extends base.Construtor<Questao> {

    Questionario getQuestionario();

    QuestaoTipo getTipo();

    String getEnunciado();

  }

}