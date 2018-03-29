
public class TestWhiteScreen {

	public static void main(String[] args) {
		WhiteScreen screen = new WhiteScreen();
		ScreenDownCommand cmd1 = new ScreenDownCommand(screen);
		ScreenUpCommand cmd2 = new ScreenUpCommand(screen);
		WallButton dwn = new WallButton(cmd1);
		WallButton up = new WallButton(cmd2);
		
		dwn.push();
		up.push();

	}

}
