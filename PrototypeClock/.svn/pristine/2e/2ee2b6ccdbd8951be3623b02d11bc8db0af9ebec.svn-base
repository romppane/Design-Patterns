
public class Kello implements Kloonattava{

	Viisari tunti;
	Viisari minuutti;
	Viisari sekuntti;



	public Kello(Viisari tunti, Viisari minuutti, Viisari sekuntti) {
		this.tunti = tunti;
		this.minuutti = minuutti;
		this.sekuntti = sekuntti;
	}





	public Viisari getTunti() {
		return tunti;
	}






	public Viisari getMinuutti() {
		return minuutti;
	}






	public Viisari getSekuntti() {
		return sekuntti;
	}







	public void setTunti(Viisari tunti) {
		this.tunti = tunti;
	}





	public void setMinuutti(Viisari minuutti) {
		this.minuutti = minuutti;
	}





	public void setSekuntti(Viisari sekuntti) {
		this.sekuntti = sekuntti;
	}






	public Kello clone() {
		return new Kello(tunti.clone(),minuutti.clone(), sekuntti.clone());

	}

	@Override
	public String toString() {
		return"Kello on: "+tunti.getNyt()+":"+minuutti.getNyt()+":"+sekuntti.getNyt();
	}
}
