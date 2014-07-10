package br.pet.questionario;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public interface Questionario {

  interface Construtor extends br.pet.base.Construtor<Questionario> {

    String getDescricao();

  }

}