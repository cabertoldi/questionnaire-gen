package br.pet.questionario;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public class QuestionariosFalso {

  public static final Questionario QUESTIONARIO_1 = novo()
      .descricao("Questionário 1")
      .novaInstancia();

  public static final Questionario QUESTIONARIO_2 = novo()
      .descricao("Questionário 2")
      .novaInstancia();

  public static final Questionario QUESTIONARIO_3 = novo()
      .descricao("Questionário 3")
      .novaInstancia();

  private static ConstrutorDeQuestionarioFalso novo() {
    return new ConstrutorDeQuestionarioFalso();
  }

}