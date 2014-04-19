package br.pet.questionario;  

import java.util.List;

import com.google.inject.ImplementedBy;
 
@ImplementedBy(BuscarTemaGuice.class)
public interface BuscarTema {

  List<Tema> porTodos();

}