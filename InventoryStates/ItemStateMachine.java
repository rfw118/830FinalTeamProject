package InventoryStates;
public class ItemStateMachine implements IitemState {
	IitemState ItemInventory, ItemDescribed, ItemEquipped, ItemUsed, ItemConsumedExit;
	IitemState ItmState = null;
	
	public ItemStateMachine()
	{
		ItemInventory = new  ItemInventoryState(this); // IitemState(this);
		ItemDescribed = new ItemDescribedState(this);
		ItemEquipped = new ItemEquippedState(this);
		ItemUsed = new ItemUseState(this);
		ItemConsumedExit = new ItemConsumedExitState(this);
		
		ItmState = ItemInventory;
	}

	public void setState(IitemState Is)
	{
		this.ItmState = Is;
	}
	
	public String ItemCurrentState() //Return string value of the current state...
	{
		return ItmState.toString();
	}
	
	public void AddToInventory()
	{
		this.setState(ItemInventory);
	}
	
	public void showDescription()
	{
		this.setState(ItemDescribed);
	}

	@Override
	public void InventoryItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DescribeItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EquipedItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UseItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsumeItem() {
		// TODO Auto-generated method stub
		myProgram.UserOutput("Item consumed");
		ItmState = ItemConsumedExit;
		myProgram.UserOutput(ItemCurrentState());
	}


	
		
	
	
	
}
