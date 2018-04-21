package UI;

public class HelpCommand implements Commandable{

	private String sHelpCommands = "Command Help: 'Quit', 'Help', 'Inventory', 'Sort:<Author|Title|Year|NoSort>'";
	
	public HelpCommand()
	{
		
	}

	@Override
	public void doCommand(MyGame g) {
		
		UserInterface.UserOutput(sHelpCommands); 
	}

	@Override
	public boolean matchCommand(String s) {

		
		return s.toUpperCase().equals("HELP"); //returns true for match and false for no match.
		
		
	}
	
}
