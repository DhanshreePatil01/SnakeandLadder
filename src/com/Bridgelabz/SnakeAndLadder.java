package com.Bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
	System.out.println("Starting of Snake and Ladder Problem");
	
	System.out.println("Single player start at position 0");
	
	System.out.println("====================================");
	
	int position=0;
	int condition = 10;
	int dice_count = 0;
	
	
	while (condition > 0)
	{
	int options=(int)(Math.random()*3+1);
	System.out.println("option is: "+options);
	int roll_dice=(int)(Math.random()*6+1);
	System.out.println("Dice Rolled At :"+roll_dice);
	
	if (roll_dice > 0)
	{
		dice_count++;
	}

	switch(options)
	{
	case 1:
		System.out.println("No Play");
		position=position;
		break;
	case 2:
		System.out.println("There is Ladder");
		position=position+roll_dice;
		
		break;
	case 3:
		System.out.println("There is Snake");
		position=position-roll_dice;
		if (position < 0)
		{
			position = 0;
		} 
		else 
		{
			position = position;
		}
		break;
	default:
		System.out.println("Roll dice again");
		break;
		}
	
	System.out.println("Position is : " + position);

	System.out.println("-------------------------");

	int Previous_Step_Count = position;
	 System.out.println("previous:"+Previous_Step_Count);
	
	 if (position > 100) 
	 {
		position = Previous_Step_Count;
	}

	System.out.println("-------------------------");

	
	if (position == 100) 
	{
		System.out.println("Player is winner");
		break;
	} 
	else
	{
		System.out.println("roll a dice again");
	}
  }
	
	System.out.println("The total number of times the dice rolled is:" + dice_count);
 }
}