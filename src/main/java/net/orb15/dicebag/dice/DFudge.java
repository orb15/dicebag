package net.orb15.dicebag.dice;

import java.util.List;

public class DFudge extends D3
{
	public DFudge()
	{
		super();
	}
	
	public int roll()
	{
		int total = 0;
		int thisRoll = 0;
		int thisVal = 0;
		for(int i = 1; i<=4; i++)
		{
			thisRoll = super.roll();
			
			//convert to fudge
			switch(thisRoll)
			{
				case 1:
					thisVal = 0;
					break;
				
				case 2:
					thisVal = 1;
					break;
					
				case 3:
					thisVal = -1;
					break;
			}
			
			total += thisVal;
		}
		
		return total;
	}
	
	public int roll(int count)
	{
		throw new UnsupportedOperationException("Fudge dice do not support this operation");
	}
	
	public List<Integer> multiRoll(int count)
	{
		throw new UnsupportedOperationException("Fudge dice do not support this operation");
	}
	
	public boolean rollForTargetNumber(int targetNumber)
	{
		throw new UnsupportedOperationException("Fudge dice do not support this operation");
	}
	
	public int rollForTargetNumber(int targetNumber, int numberOfDiceToRoll)
	{
		throw new UnsupportedOperationException("Fudge dice do not support this operation");
	}
}
