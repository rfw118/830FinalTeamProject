package InventoryStates;
public class ItemEquippedState implements IitemState {

	ItemStateMachine ISMachine;
	
	public ItemEquippedState(ItemStateMachine ISM)
	{
		ISM = ISMachine;
	}
	
	public ItemEquippedState()
	{
		
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
		
	}

}
