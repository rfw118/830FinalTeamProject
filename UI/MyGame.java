package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BaseGame.Inventory;

public class MyGame {
/*
  This is stubbed out code that allows the basic interface and game to run.

 */
	public HelpCommand HelpMe = new HelpCommand();
	public QuitCommand QuitMe = new QuitCommand();
	public ListCommand ListMe = new ListCommand();
	public SortCommand SortMe = new SortCommand();
	public List<Commandable> UserCommands = new ArrayList<Commandable>();
	public Inventory BeltAndBackPack = new Inventory();
	private Boolean bolQuit = false;
	private String sSortOrder = "";
	private String sUserInput = "";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGame MBL = new MyGame();
		MBL.Run();
		
	}
	

	private void Run()
	{
		this.bolQuit = false;
		Scanner inputScanner = new Scanner(System.in);
		Subscribe(this.HelpMe);
		Subscribe(this.QuitMe);
		Subscribe(this.ListMe);
		Subscribe(this.SortMe);		
		
		UserInterface.UserOutput("Welcome!  This is the book library!");
		ProcessUserInputCommands("HELP");
		UserInterface.UserOutput("How would you like the list to be sorted?  <Author | Title | Year | NoSort>");
		
		while( bolQuit == false)
		{
			sUserInput = inputScanner.next();
			this.ProcessUserInputCommands(sUserInput);
				
		}
		UserInterface.UserOutput("The End!");
		inputScanner.close();

	}
	
	private void ProcessUserInputCommands(String UserInput)
	{
		boolean bolCommandExecuted = false;
		
		for(Commandable c:UserCommands)
		{
			bolCommandExecuted = c.matchCommand(UserInput);
			if(bolCommandExecuted)
			{
				c.doCommand(this);
				break;
			}
		}
		
		if(bolCommandExecuted == false)
			{
				UserInterface.UserOutput("Command not recognized");
			}
		
	}

	protected void QuitProgram()
	{
		this.bolQuit = true;
	}
	
	public void Subscribe(Commandable c)
	{
		UserCommands.add(c);
		
	}
	public void setSort(String s)
	{
		sSortOrder = s;
	}
	public String getSort()
	{
		return sSortOrder;
	}
	public String getUserInput()
	{
		return sUserInput;
	}
}
