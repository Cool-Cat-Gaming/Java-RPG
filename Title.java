/**
 * @(#)Title.java
 *
 *
 * @author Evan Jones and Derek Johnson
 * @version 1.00 2014/9/17
 */

import java.util.*;

public class Title 
{ 
    public Title() throws InterruptedException
    {
    	System.out.println("       _____ _    _____       ____  ____  ______");
    	System.out.println("      / /   | |  / /   |     / __ \\/ __ \\/ ____/");
    	System.out.println(" __  / / /| | | / / /| |    / /_/ / /_/ / / __  ");
    	System.out.println("/ /_/ / ___ | |/ / ___ |   / _, _/ ____/ /_/ /  ");
    	System.out.println("\\____/_/  |_|___/_/  |_|  /_/ |_/_/    \\____/   ");
    	//For "\" you need to enter \\ in order for there to be no errors
    	System.out.println();
    	System.out.println("Hello! Welcome to Java RPG");
    	System.out.println("Developed by Evan Jones & Derek Johnson");
    	System.out.println("What is your name?");
    	System.out.println();
    	Name n = new Name();
    	Scanner nameInput = new Scanner(System.in);
    	System.out.print("");
    	String name = nameInput.nextLine();
    	//INSERT SETNAME THING HERE
    //	System.out.println("");
    //	Narrator talks to player
    	Scanner startInput = new Scanner(System.in);
    	System.out.println("Are you new to this game? 1 = Yes and 2 = No");
    	int startResult = startInput.nextInt();
    	if (startResult == 1)
    	{
    		//Backstory
    		System.out.println("Long ago, a war ravaged these lands...");
    		//Hold time "Thread.sleep(milliseconds);"
    		Thread.sleep(3000);
    		System.out.println("The Holy Knights and the Legion were locked in stalemate.");
    		Thread.sleep(3000);
    		System.out.println("As the war continued, these very lands were on the brink of destruction.");
    		Thread.sleep(3000);
    		System.out.println("Out of desperation, the Legion recruited a man.");
    		Thread.sleep(3000);
    		System.out.println("His name...");
    		Thread.sleep(1000);
    		System.out.println("Lord Ryall");
    		Thread.sleep(3000);
    		System.out.println("The leader of the Legion, King Draper, bargained with Lord Ryall.");
    		Thread.sleep(3000);
    		System.out.println("Lord Ryall agreed to help, with intentions other thn King Draper's.");
    		Thread.sleep(3000);
    		System.out.println("Lord Ryall summoned a dragon and was able to command the Legion to victory.");
    		Thread.sleep(3000);
    		System.out.println("Driven by the power of victory, Lord Ryall assassinated King Draper taking control of the lands.");
    		Thread.sleep(3000);
    		System.out.println("He now resides in his palace in the capital of the mainland.");
    		Thread.sleep(3000);
    		System.out.println("You are a convict given the choice to fight in an arena, or die.");
    		Thread.sleep(3000);
    		System.out.println("You choose to fight hoping for a day that you will be freed.");
    		Thread.sleep(3000);
    		System.out.println("Your story begins now...");
    		Thread.sleep(3000);
    		Menu m = new Menu();
    	}
    	else if (startResult == 2)
    	{ //Redirects to main menu
    		Menu m = new Menu();	
    	}
    	else
    	{
    		System.out.println("Invalid Input");
    	}
    		
    	
    
    	
    }
     
}