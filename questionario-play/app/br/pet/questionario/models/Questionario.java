package br.pet.questionario.models;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Questionario {

  interface Construtor extends br.pet.base.Construtor<Questionario> {

    String getDescricao();

  }

}