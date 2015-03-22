package net.orb15.dicebag.dice;

public class D2 extends Die
{
	private static final int DIE_SIZE = 2;
	
	public D2()
	{
		super(DIE_SIZE);
	}
	
	public boolean rollBool()
	{
		int roll = super.roll();
		
		return (roll == 2) ? true : false;
	}
}
