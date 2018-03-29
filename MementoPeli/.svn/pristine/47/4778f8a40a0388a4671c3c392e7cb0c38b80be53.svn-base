
public class Asiakas extends Thread{
	private Object obj;
	private Arvuuttaja arvuuttaja;
	private int arvaukset = 0;
	private String nimi;

	public Asiakas(Arvuuttaja arvuuttaja, String nimi) {
		this.arvuuttaja = arvuuttaja;
		this.nimi = nimi;
	}


	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public void run() {
		arvuuttaja.liityPeliin(this);
		int arvaus = 0;
		boolean running = true;
		while(running) {
			arvaus = (int) (Math.random()*100+1);
			running = arvuuttaja.vastaa(obj, arvaus);
			arvaukset++;
		}
		System.out.println(nimi+": Ratkaisu oli : "+arvaus+"\nArvoituksen ratkaisemiseen kului "+arvaukset+" arvausta");

	}

}
