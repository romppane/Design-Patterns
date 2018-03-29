
public class PokemonMain {

	public static void main(String[] args) {
		PokemonTrainer ville = new PokemonTrainer();
		System.out.println(ville.getPokemon());
		ville.feedPokemon();
		ville.movePokemon();
		ville.battleEnemy();
		System.out.println(ville.getPokemon());
		ville.feedPokemon();
		ville.movePokemon();
		ville.battleEnemy();
		System.out.println(ville.getPokemon());
		ville.feedPokemon();
		ville.movePokemon();
		ville.battleEnemy();
		System.out.println(ville.getPokemon());
		ville.feedPokemon();
		ville.movePokemon();
		ville.battleEnemy();
	}

}
