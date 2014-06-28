package br.pet.questionario;

import br.com.objectos.way.relational.ModuloQuestionnarieGen;

import com.google.inject.AbstractModule;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public class ModuloDeTesteQuestionnarieGen extends AbstractModule {

  @Override
  protected void configure() {
    install(new ModuloQuestionnarieGen());
  }

}