package br.pet.questionario.controllers;

import static org.fest.assertions.Assertions.assertThat;
import static play.mvc.Http.Status.OK;
import static play.mvc.Http.Status.SEE_OTHER;
import static play.test.Helpers.callAction;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.flash;
import static play.test.Helpers.redirectLocation;
import static play.test.Helpers.running;
import static play.test.Helpers.status;

import org.junit.Test;

import play.mvc.Result;

public class QuestionariosTest {

  @Test
  public void deveListarQuestionariosPrimeiraPagina() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Result result = callAction(routes.ref.Questionarios.listar());

        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("Questionário 1");
        assertThat(contentAsString(result)).contains("Questionário 2");
      }
    });
  }

  @Test
  public void deveCriarNovoQuestionario() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Result result = callAction(routes.ref.Questionarios.salvar());

        assertThat(status(result)).isEqualTo(SEE_OTHER);
        assertThat(redirectLocation(result)).isEqualTo("/questionarios");
        assertThat(flash(result).get("success"))
            .isEqualTo("Questionário foi criado");
      }
    });
  }

  @Test
  public void deveAtualizarQuestionario() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Long id = 1L;
        Result result = callAction(routes.ref.Questionarios.atualizar(id));

        assertThat(status(result)).isEqualTo(SEE_OTHER);
        assertThat(redirectLocation(result)).isEqualTo("/questionarios/" + id);
        assertThat(flash(result).get("success"))
            .isEqualTo("Questionário foi atualizado");
      }
    });
  }

  @Test
  public void deveRemoverQuestionario() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Long id = 1L;
        Result result = callAction(routes.ref.Questionarios.remover(id));

        assertThat(status(result)).isEqualTo(SEE_OTHER);
        assertThat(redirectLocation(result)).isEqualTo("/questionarios");
        assertThat(flash(result).get("success"))
            .isEqualTo("Questionário foi removido");
      }
    });
  }

  @Test
  public void routeNovoForm() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Result result = callAction(routes.ref.Questionarios.novo());

        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("Criar questionário");
      }
    });
  }

  @Test
  public void routeVisualizar() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Long id = 1L;
        Result result = callAction(routes.ref.Questionarios.visualizar(id));

        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("Visualizar questionário");
        assertThat(contentAsString(result)).contains("Questionário " + id);
      }
    });
  }

  @Test
  public void routeEditarForm() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Long id = 1L;
        Result result = callAction(routes.ref.Questionarios.editar(id));

        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("Editar questionário");
      }
    });
  }

}