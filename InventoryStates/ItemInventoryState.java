package InventoryStates;
public class ItemInventoryState implements IitemState {
	
	ItemStateMachine ISMachine;
	
	public ItemInventoryState(ItemStateMachine ISM)
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
		
	}

	//ItemInventory, ItemDescribed, ItemEquipped, ItemUsed, ItemConsumedExit
	
}
