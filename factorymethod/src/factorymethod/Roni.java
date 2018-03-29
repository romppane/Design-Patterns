package factorymethod;

public class Roni extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Maito();
	}

}
