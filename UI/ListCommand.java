package UI;

public class ListCommand implements Commandable {

	
	
	public ListCommand()
	{
		
	}
	
	
	@Override
	public void doCommand(MyGame g) {
		
	/*	
		String s = o.getSort().toUpperCase();
		
		switch (s) {
		case  "AUTHOR":
			ListByAuthor lba = new ListByAuthor();
			lba.SortForward(o.BkLib.BookInfoList);
			break;
		case "TITLE":
			ListByTitle lbt = new ListByTitle();
			lbt.SortForward(o.BkLib.BookInfoList);
			break;
		case "YEAR":
			ListByYear lby = new ListByYear();
			lby.SortForward(o.BkLib.BookInfoList);
			break;
		default:
			for(BookInformation b:o.BkLib.BookInfoList)
			{
				UserInterface.UserOutput(b.print());
			}
			break;
		}
		*/

		


	}

	@Override
	public boolean matchCommand(String s) {

		return s.toUpperCase().equals("LIST"); //returns true for match and false for no match.
	}




}
