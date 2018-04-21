package UI;

public class QuitCommand 
implements Commandable
{

	public QuitCommand() {
		
	
	}
	
	@Override
	public void doCommand(MyGame g) {
		g.QuitProgram();
		//UserInterface.UserOutput(CommandMessage());
	}
	
	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals("QUIT");
		
		
	}
	/*
	private String CommandMessage()
	{
		
		return "I ran!";
	}
	*/
}
