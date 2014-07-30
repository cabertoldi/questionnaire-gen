package br.pet.questionario.controllers;

import static play.data.Form.form;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import br.pet.questionario.models.QuestionarioImpl;
import br.pet.questionario.views.html.QuestionariosEditarForm;
import br.pet.questionario.views.html.QuestionariosListar;
import br.pet.questionario.views.html.QuestionariosNovoForm;
import br.pet.questionario.views.html.QuestionariosVisualizar;

public class Questionarios extends Controller {

  public static Result listar() {
    return ok(QuestionariosListar.render());
  }

  public static Result novo() {
    Form<QuestionarioImpl> questionarioForm = form(QuestionarioImpl.class);
    return ok(QuestionariosNovoForm.render(questionarioForm));
  }

  public static Result salvar() {
    flash("success", "Questionário foi criado");
    return redirect(routes.Questionarios.listar());
  }

  public static Result visualizar(Long id) {
    return ok(QuestionariosVisualizar.render(id));
  }

  public static Result editar(Long id) {
    Form<QuestionarioImpl> questionarioForm = form(QuestionarioImpl.class);
    return ok(QuestionariosEditarForm.render(id, questionarioForm));
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
