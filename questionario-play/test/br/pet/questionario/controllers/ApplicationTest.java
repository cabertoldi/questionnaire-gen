package br.pet.questionario.controllers;

import static org.fest.assertions.Assertions.assertThat;
import static play.mvc.Http.Status.SEE_OTHER;
import static play.test.Helpers.callAction;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.redirectLocation;
import static play.test.Helpers.running;
import static play.test.Helpers.status;

import org.junit.Test;

import play.mvc.Result;
import play.twirl.api.Content;
import br.pet.questionario.views.html.index;

public class ApplicationTest {

  @Test
  public void renderTemplate() {
    Content html = index.render("Your new application is ready.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html))
        .contains("Your new application is ready.");
  }

  @Test
  public void redirectHomePage() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        Result result = callAction(routes.ref.Application.index());

        assertThat(status(result)).isEqualTo(SEE_OTHER);
        assertThat(redirectLocation(result)).isEqualTo("/questionarios");
      }
    });
  }

}
