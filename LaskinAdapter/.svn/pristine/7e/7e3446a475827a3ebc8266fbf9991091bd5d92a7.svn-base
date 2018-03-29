package laskin;

public class Laskin implements Calculator{

    private int tulos;  // Muuttuja tulokselle

    public void nollaa() {
       tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) throws ArithmeticException {
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
    		if (n<=0){
    			throw new ArithmeticException("Laiton luku!");

    		}
    		else{
    			tulos = (int) Math.sqrt(0);
    		}

    }

    public void virtaON() {
    	// Tähän voi laittaa alkutoimet
        tulos = 0;
        System.out.println("Laskin: virtaON())");
    }

    public void virtaOFF() {
        // Tähän voi laittaa lopputoimet
    	System.out.println("Laskin: virtaOFF()");
    }
}
