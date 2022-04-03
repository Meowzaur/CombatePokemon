package models;

public class Combate {

	private Entrenador entrenador1;
	private Entrenador entrenador2;
	private Pokemon pokemon1;
	private Pokemon pokemon2;

	public Combate(Entrenador entrenador1, Entrenador entrenador2, Pokemon pokemon1, Pokemon pokemon2) {
		super();
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
	}

	public Entrenador getEntrenador1() {
		return entrenador1;
	}

	public void setEntrenador1(Entrenador entrenador1) {
		this.entrenador1 = entrenador1;
	}

	public Entrenador getEntrenador2() {
		return entrenador2;
	}

	public void setEntrenador2(Entrenador entrenador2) {
		this.entrenador2 = entrenador2;
	}

	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

	@Override
	public String toString() {
		return "Combate [entrenador1=" + entrenador1 + ", entrenador2=" + entrenador2 + ", pokemon1=" + pokemon1
				+ ", pokemon2=" + pokemon2 + "]";
	}

}
