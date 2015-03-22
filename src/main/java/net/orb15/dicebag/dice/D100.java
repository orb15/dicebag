package net.orb15.dicebag.dice;

public class D100 extends Die
{
	private static final int DIE_SIZE = 100;
	
	public D100()
	{
		super(DIE_SIZE);
	}
	
	public boolean percentTest(int percent)
	{
		if(percent < 0 || percent > 100)
			throw new IllegalArgumentException(percent + " is not a valid number to check a percentage roll against");
		
		return checkPercent(percent);
	}
	
	private boolean checkPercent(int percent)
	{
		//get a pseudo random between 1 and 100 inclusive 
		int randomint = roll();
		
		return randomint <= percent ? true : false;
	}
}
