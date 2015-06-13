package br.pet.questionario.controllers;

import static play.data.Form.form;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import br.pet.questionario.models.QuestaoForm;
import br.pet.questionario.views.html.QuestoesEditarForm;
import br.pet.questionario.views.html.QuestoesListar;
import br.pet.questionario.views.html.QuestoesNovoForm;
import br.pet.questionario.views.html.QuestoesVisualizar;

public class Questoes extends Controller {
  
  public Result listar() {
    return ok(QuestoesListar.render());
  }

  public Result novo() {
    Form<QuestaoForm> questaoForm = form(QuestaoForm.class);
    return ok(QuestoesNovoForm.render(questaoForm));
  }

  public Result salvar() {
    flash("success", "Questão foi criada");
    return redirect(routes.Questoes.listar());
  }

  public Result visualizar(Long id) {
    return ok(QuestoesVisualizar.render(id));
  }

  public Result editar(Long id) {
    Form<QuestaoForm> questaoForm = form(QuestaoForm.class);
    return ok(QuestoesEditarForm.render(id, questaoForm));
  }

  public Result atualizar(Long id) {
    flash("success", "Questão foi atualizada");
    return redirect(routes.Questoes.visualizar(id));
  }

  public Result remover(Long id) {
    flash("success", "Questão foi removida");
    return redirect(routes.Questoes.listar());
  }
  
}