
public class PokemonTrainer {
	private State pokemon;
	private int exp = 0;


	public PokemonTrainer() {
		this.pokemon = Charmander.getInstance();
	}

	public String getPokemon() {
		return pokemon.getClass().getName();
	}



	public void battleEnemy () {
		exp += pokemon.fight();
		evolve();
	}

	public void feedPokemon() {
		pokemon.eat();
	}

	public void movePokemon() {
		pokemon.move();
	}

	private void evolve() {
		if(exp == 20) {
			this.pokemon = Charmeleon.getInstance();
		}
		else if (exp == 70){
			this.pokemon = Charizard.getInstance();
		}
		else {
			System.out.println("Current exp: "+exp);
		}
	}


}
