
public class Viisari implements Kloonattava{
	int nyt;



	public Viisari(int nyt) {
		this.nyt = nyt;
	}





	public int getNyt() {
		return nyt;
	}





	public void setNyt(int nyt) {
		this.nyt = nyt;
	}





	@Override
	public Viisari clone() {
		return new Viisari(nyt);

	}



}
