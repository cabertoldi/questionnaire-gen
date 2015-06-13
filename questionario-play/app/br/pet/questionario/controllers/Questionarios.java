package br.pet.questionario.controllers;

import static play.data.Form.form;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import br.pet.questionario.models.QuestionarioForm;
import br.pet.questionario.views.html.QuestionariosEditarForm;
import br.pet.questionario.views.html.QuestionariosListar;
import br.pet.questionario.views.html.QuestionariosNovoForm;
import br.pet.questionario.views.html.QuestionariosVisualizar;

public class Questionarios extends Controller {

  public Result listar() {
    return ok(QuestionariosListar.render());
  }

  public Result novo() {
    Form<QuestionarioForm> questionarioForm = form(QuestionarioForm.class);
    return ok(QuestionariosNovoForm.render(questionarioForm));
  }

  public Result salvar() {
    flash("success", "Questionário foi criado");
    return redirect(routes.Questionarios.listar());
  }

  public Result visualizar(Long id) {
    return ok(QuestionariosVisualizar.render(id));
  }

  public Result editar(Long id) {
    Form<QuestionarioForm> questionarioForm = form(QuestionarioForm.class);
    return ok(QuestionariosEditarForm.render(id, questionarioForm));
  }

  public Result atualizar(Long id) {
    flash("success", "Questionário foi atualizado");
    return redirect(routes.Questionarios.visualizar(id));
  }

  public Result remover(Long id) {
    flash("success", "Questionário foi removido");
    return redirect(routes.Questionarios.listar());
  }

}