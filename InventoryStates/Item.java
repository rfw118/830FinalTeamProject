package InventoryStates;
import InventoryStates.ItemStateMachine;

public class Item {

	public Item(String Name, String Description, Integer DPS, Integer UseCount)
	{
		setName(Name);
		setDescription(Description);
		setDamage(DPS);
		setNumberOfUses(UseCount);
		
		
	}
	
	private String sName = "";
	private String sDescription = "";
	private Integer DamagePerSecond = 0;
	private Integer NumberOfUses = -1; //-1 is unlimited
	private ItemStateMachine state = new ItemStateMachine(); 
	
	public String getName()
	{
		return sName;
	}
	public void setName(String Name)
	{
		sName = Name;
	}
	
	public String getDescription()
	{
		state.DescribeItem();
		return sDescription;
	}
	public void setDescription(String Desc)
	{
		sDescription = Desc;
	}
	
	public Integer getDamage()
	{
		return DamagePerSecond;
	}
	public void setDamage(Integer Damage)
	{
		DamagePerSecond = Damage;
	}
	
	public void setUses(Integer NUses)
	{
		NumberOfUses = NUses;
		
	}
	
	public String getState()
	{
		return state.ItemCurrentState();
	}
	
	public void setNumberOfUses(Integer ItemUseCount)
	{
		NumberOfUses = ItemUseCount;
	}
	
	public void UseItem()
	{
		if(NumberOfUses >= 1)
		{
			NumberOfUses--;
		}
		if(NumberOfUses == 0)
		{
			this.state.ConsumeItem();
		}
	}
	
}
