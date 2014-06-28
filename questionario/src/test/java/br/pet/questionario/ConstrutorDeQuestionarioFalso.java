package br.pet.questionario;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
class ConstrutorDeQuestionarioFalso implements Questionario.Construtor {

  private int id;
  private String descricao;

  @Override
  public Questionario novaInstancia() {
    return new QuestionarioJdbc(this);
  }

  public ConstrutorDeQuestionarioFalso descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  @Override
  public String getDescricao() {
    return descricao;
  }

}