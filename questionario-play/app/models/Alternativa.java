package models;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Alternativa {

  interface Construtor extends base.Construtor<Alternativa> {

    Questao getQuestao();

    String getDescricao();

    boolean isCorreta();

  }

}