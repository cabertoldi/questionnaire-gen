package br.com.objectos.way.relational;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public interface IsEntidade extends Insertable {

  IsEntidade toJdbc();

}