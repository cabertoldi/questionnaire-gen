package br.com.objectos.way.relational;

import br.com.objectos.way.base.sql.Credential;
import br.com.objectos.way.base.sql.Credentials;

import com.google.inject.AbstractModule;

/**
 * @author carolene.bertoldi@objectos.com.br (Carolene Bertoldi)
 */
public class ModuloQuestionnarieGen extends AbstractModule {

  @Override
  protected void configure() {
    Credential credential = Credentials.forMysql()
        .usingDefaultDriver()
        .server("127.0.0.1")
        .port(3306)
        .db("QUESTIONARIO")
        .user("root")
        .password("123")
        .get();

    install(WayRelational.using(credential)

        .poolingWithC3p0()
        .configured()
        .withStandardOptions()
        .done()

        .withCustomOptions()
        .batchSize(5)
        .done()

        .buildModule());
  }

}