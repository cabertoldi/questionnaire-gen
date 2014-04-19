package br.pet.questionario;

import java.util.List;

import com.google.common.collect.ImmutableList;

import br.com.objectos.way.sqlunit.EntitySet;
import br.com.objectos.way.sqlunit.SqlUnit;
import br.com.objectos.way.sqlunit.Truncate;

public class TemasFalso implements EntitySet{
  
  public static final Tema TEMA_1 = novo()
      .descricao("Tema 1")
      .novaInstancia();
  public static final Tema TEMA_2 = novo()
      .descricao("Tema 2")
      .novaInstancia();
  public static final Tema TEMA_3 = novo()
      .descricao("Tema 3")
      .novaInstancia();
  
  private static final List<Tema> todos = ImmutableList.<Tema> builder()
      .add(TEMA_1)
      .add(TEMA_2)
      .add(TEMA_3)
      .build();

  public static List<Tema> getTodos() {
    return todos;
  }
  
	TemasFalso() {
  }

  @Override
	public void load(SqlUnit sqlUnit) {
	  sqlUnit.batchInsert(todos);
	}

  @Override
	public void truncate(Truncate truncate) {
    truncate.table("TEMA");
	}

  private static ConstrutorDeTemaFalso novo() {
    return new ConstrutorDeTemaFalso();
  }
  
}