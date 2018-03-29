
public class Arvuuttaja {

	public void liityPeliin(Asiakas asiakas) {
		int vastaus = (int) (Math.random()*100+1);
		asiakas.setObj(new Memento(vastaus));
	}

	public boolean vastaa(Object obj, int arvaus) {
		Memento memento = (Memento) obj;
		return !(memento.getRatkaisu() == arvaus);
	}

	private class Memento {
		private double ratkaisu;

		public Memento(double ratkaisu) {
			this.ratkaisu = ratkaisu;
		}

		public double getRatkaisu() {
			return ratkaisu;
		}

	}

}
