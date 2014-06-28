package br.com.objectos.way.relational;

public interface IsEntidade extends Insertable {

  IsEntidade toJdbc();

}