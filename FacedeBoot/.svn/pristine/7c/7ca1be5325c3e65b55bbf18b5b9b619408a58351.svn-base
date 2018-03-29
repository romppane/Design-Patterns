
public class CPU {
		
	public void freeze() {
		System.out.println("Freezing processor");
		
	}
	
    public void jump(long position) {
    	System.out.println("Jumping to position: "+position);
    }
    
    public void execute(String exe) {
    	System.out.println("Executing "+exe);
    	char[] ex = exe.toCharArray();
    	String temp = "";
    	for(int i = 0; i<ex.length; i++) {
    		if(ex[i] == '-' || i == (ex.length-1)) {
    			char character = (char) Integer.parseInt(temp);
    			System.out.println(character);
    			temp = "";
    		}
    		else {
    			temp += ex[i];
    		}
    	}
    }
}
