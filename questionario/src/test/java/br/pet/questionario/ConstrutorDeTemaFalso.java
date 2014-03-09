package br.pet.questionario;

public class ConstrutorDeTemaFalso implements Tema.Construtor{

	private String descricao;
	
	@Override
	public Tema novaInstancia() {
		return new TemaJdbc(this);
	}
	
	public ConstrutorDeTemaFalso descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}