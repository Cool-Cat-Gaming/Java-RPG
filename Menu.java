/**
 * @(#)Menu.java
 *
 *
 * @author Evan Jones and Derek Johnson
 * @version 1.00 2014/9/17
 */

import java.util.*;

public class Menu {
	//Hero Stat Variables
	private int heroGold;
	private int heroExperience;
	private int heroLevel;
	private int heroHP;
	private int heroHPMax;
	private int heroSpeed;
	private int heroAttack;
	private int heroDefense;
	private String heroWeaponName;
	private String heroArmourName;
	//private 
		
    public Menu() throws InterruptedException
    	//"throws InterruptedException" needed for user input
    {
    	System.out.println("Welcome to the menu!");
  		System.out.println("Shop = 1");
    	System.out.println("Skills = 2");
    	System.out.println("Inventory = 3");
    	System.out.println("Arena = 4");
    	System.out.println("The Leaky Dragon (Inn) = 5");
    	Scanner menuSelect = new Scanner(System.in);
    	//Creates an input called menuSelect
    	System.out.print("What menu: ");
    	int menuInput = menuSelect.nextInt();
    	//sets a new variable called menuInput to the user input from earlier
    
    	//the following conditionals redirect to methods containing different sub-menus
    	if (menuInput==1) //Shop
		{
    	//	Shop s = new Shop(); //Add gold parameter
    	
		} 
			
    		else if (menuInput==2)
    		{ //Skills
    			//
    			
    			Name h = new Name();
    			System.out.println(h.getName() + "'s STATS");
			} 
				
			else if (menuInput==3)
			{ //Inventory
    	
			} 
    		else if (menuInput==4)
    		{ //Arena
    	
    		}
    		else if (menuInput==5)
    		{ //Inn
    	
    		} 
    		else 
    		{
    			System.out.println("Invalid input");
    
			} 
    	
    	
    }
    public int Shop() throws InterruptedException
    {
    	System.out.println("Welcome to the shop!");
    	System.out.println("What would you like to purchase?");
    	System.out.println("Please enter the number next to the item in order to purchase.");
    	
    }
    
    public void Skills() throws InterruptedException
    {
    	
    }
    
     public int Inn() throws InterruptedException
    {
    	System.out.println("Welcome to The Leaky Dragon");
    	System.out.println("Full heal (10 Coins) = 1");
    	System.out.println("Half heal (5 Coins) = 2");
    	System.out.println("Gossip = 3");
    	System.out.println("Main Menu = 4");
    	Scanner innSelect = new Scanner(System.in);
    	int innInput = innSelect.nextInt();
    	
    	if (innInput==1)
    	{//Full Heal (10 Coins)
    		/*if (playerGold >= 10)
    			heroHP = heroHPMax;
    			heroGold -= 10;
    		*/
    	}
    	else if (innInput==2)
    	{//Half Heal (5 Coins)
    		/*if (playerGold >= 5)
    			heroHP = heroHP + (heroHPMax/2);
    			heroGold -= 5;
    		*/
    	}
    	else if (innInput==3)
    	{//Gossip
    		System.out.println("");
    		System.out.println("");
    	}
    	else if (innInput==4)
    	{//Return to Main Menu
    		return innInput;
    		//missing
    	}
    	else
    	{
    		System.out.println("Invalid input");
    		return innInput;
    		//missing
    	}
    }
    
    public void Inventory() throws InterruptedException
    {
    
    }
}