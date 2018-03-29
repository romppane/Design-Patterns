import laskin.Calculator;
import laskin.Laskin;

public class LaskinAdapteri implements KirjainLaskin{

	private Calculator laskin = new Laskin();
	private char tulos;


	@Override
	public void nollaa() {
		laskin.nollaa();
		tulos = (char)laskin.annaTulos();
	}

	@Override
	public char annaTulos() {
		return (char)tulos;
	}

	@Override
	public void lisaa(char n) {
		laskin.lisaa((int)n);
		tulos = (char)laskin.annaTulos();

	}

	@Override
	public void vahenna(char n) {
		laskin.vahenna((char)n);
		tulos = (char)laskin.annaTulos();

	}

	@Override
	public void kerro(char n) {
		laskin.kerro((char)n);
		tulos = (char)laskin.annaTulos();
	}

	@Override
	public void jaa(char n) {
		laskin.jaa((char)n);
		tulos = (char)laskin.annaTulos();

	}

	@Override
	public void nelio(char n) {
		laskin.nelio((char)n);
		tulos = (char)laskin.annaTulos();

	}

	@Override
	public void neliojuuri(char n) {
		laskin.neliojuuri((char)n);
		tulos = (char)laskin.annaTulos();

	}

	@Override
	public void virtaON() {
		laskin.virtaON();

	}

	@Override
	public void virtaOFF() {
		laskin.virtaOFF();

	}

}
