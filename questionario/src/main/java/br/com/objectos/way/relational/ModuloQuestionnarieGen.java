/*
* Copyright 2014 Objectos, Fábrica de Software LTDA.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/
package br.com.objectos.way.relational;

import br.com.objectos.way.base.sql.Credential;
import br.com.objectos.way.base.sql.Credentials;

import com.google.inject.AbstractModule;

/**
 * @author mario.marques@objectos.com.br (Mario Marques Junior)
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