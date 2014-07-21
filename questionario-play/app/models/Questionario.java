package models;

/**
 * @author carolene.bertoldi@gmail.com (Carolene Bertoldi)
 */
public interface Questionario {

  interface Construtor extends base.Construtor<Questionario> {

    String getDescricao();

  }

}