package BaseGame;

import UI.Commandable;
import UI.MyGame;

public class InventoryCommand implements Commandable {

	@Override
	public void doCommand(MyGame g) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals("INVENTORY"); //returns true for match and false for no match.
	}

}
