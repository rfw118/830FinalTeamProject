package InventoryStates;
public class ItemConsumedExitState implements IitemState {

	ItemStateMachine ISMachine;
	
	public ItemConsumedExitState(ItemStateMachine ISM)
	{
		ISM = ISMachine;
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
		ISMachine.ConsumeItem();
		
	}

}
