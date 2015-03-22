package net.orb15.dicebag.dice;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public abstract class Die 
{
	private int size;
	private Random rnd;
	
	protected Die()
	{
		rnd = new Random(new Date().getTime());
		size = 6;
	}
	
	protected Die(int size)
	{
		if(size <= 1)
			throw new IllegalArgumentException(size + " is not a valid die size");

		this.size = size;
		rnd = new Random(new Date().getTime());
	}
	
	public int roll()
	{
		return getSingleRoll(size);
	}
	
	public int roll(int count)
	{
		if(count <= 0)
			throw new IllegalArgumentException(count + " is not a valid number of die rolls to make");
		
		return getSumOfRolls(size, count);
	}
	
	public List<Integer> multiRoll(int count)
	{
		if(count <= 0)
			throw new IllegalArgumentException(count + " is not a valid number of die rolls to make");
		
		ArrayList<Integer> values = new  ArrayList<Integer>(count);
		
		for(int i=1; i <= count; i++)
			values.add(getSingleRoll(size));
		
		return values;
	}
	
	public boolean rollForTargetNumber(int targetNumber)
	{
		if(targetNumber > size)
			throw new IllegalArgumentException("Requested target number: " + targetNumber + " is greater than die size: " + size);
		
		int rolledValue = getSingleRoll(size);
		
		return (rolledValue >= targetNumber) ? true : false;
	}
	
	public int rollForTargetNumber(int targetNumber, int count)
	{
		if(targetNumber > size)
			throw new IllegalArgumentException("Requested target number: " + targetNumber + " is greater than die size: " + size);
		
		if(count <= 0)
			throw new IllegalArgumentException(count + " is not a valid number of die rolls to make");
		
		int hits = 0;
		
		for(int i = 1; i <= count; i++)
		{
			int addThis = rollForTargetNumber(targetNumber) ? 1 : 0;
			hits += addThis;
		}
		
		return hits;
	}
	
	private int getSingleRoll(int size)
	{
		//returns 0 thru limit-1 inclusive
		return rnd.nextInt(size) + 1;
	}
	
	private int getSumOfRolls(int size, int count)
	{
		int sum = 0;
		for(int i=1; i <= count; i++)
			sum += getSingleRoll(size);
		
		return sum;
	}
	
}
