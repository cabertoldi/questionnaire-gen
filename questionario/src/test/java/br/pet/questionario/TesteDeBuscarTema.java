package br.pet.questionario;

import static com.google.common.collect.Lists.transform;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.inject.Inject;

@Test
@Guice(modules = {ModuloDeTesteQuestionnarieGen.class})
public class TesteDeBuscarTema {
	
	@Inject
	private BuscarTema buscar;
	
	public void por_todos() {
    List<Tema> contra = TemasFalso.getTodos();
    List<String> prova = transform(contra, TemaToString.INSTANCE);

    List<Tema> list = buscar.porTodos();
    List<String> res = transform(list, TemaToString.INSTANCE);

    assertThat(res.size(), equalTo(3));
    assertThat(prova, equalTo(res));
	}
	
	private static enum TemaToString implements Function<Tema, String> {
	  INSTANCE;

    @Override
    public String apply(Tema input) {
      return Objects.toStringHelper(input)
          .addValue(input.getId())
          .addValue(input.getDescricao())
          .toString();
    }
	}
	
}