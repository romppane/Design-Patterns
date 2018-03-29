
public class ScreenUpCommand implements Command {

	private WhiteScreen ws;
	
	
	public ScreenUpCommand(WhiteScreen ws) {
		this.ws = ws;
	}


	@Override
	public void execute() {
		ws.ScreenUp();
	}

}
