package br.pet.questionario.controllers;

import play.mvc.Controller;
import play.mvc.Result;
import br.pet.questionario.views.html.QuestionariosEditarForm;
import br.pet.questionario.views.html.QuestionariosListar;
import br.pet.questionario.views.html.QuestionariosNovoForm;
import br.pet.questionario.views.html.QuestionariosVisualizar;

public class Questionarios extends Controller {

  public static Result listar() {
    return ok(QuestionariosListar.render());
  }

  public static Result novo() {
    return ok(QuestionariosNovoForm.render());
  }

  public static Result salvar() {
    flash("success", "Questionário foi criado");
    return redirect(routes.Questionarios.listar());
  }

  public static Result visualizar(Long id) {
    return ok(QuestionariosVisualizar.render(id));
  }

  public static Result editar(Long id) {
    return ok(QuestionariosEditarForm.render(id));
  }

  public static Result atualizar(Long id) {
    flash("success", "Questionário foi atualizado");
    return redirect(routes.Questionarios.visualizar(id));
  }

  public static Result remover(Long id) {
    flash("success", "Questionário foi removido");
    return redirect(routes.Questionarios.listar());
  }

}
