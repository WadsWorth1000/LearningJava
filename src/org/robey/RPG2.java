package org.robey;
import java.util.Scanner;

public class RPG2 {
	
	/*
	 * RPG Maze
	 * Find your way out of this labyrinth from HELL!
	 * Choose the right path or perish 
	 */

	public static void main(String[] args) {

		Scanner kbInput = new Scanner(System.in);
		
		double door = 0;
		double start = 0;
		
		System.out.println("Welcome to ... ");
		
		System.out.println();
		
		System.out.println("----------------");
		
		System.out.println("----------------");
		
		System.out.println();
		
		System.out.println("RPG GAME");
		
		System.out.println();
		
		System.out.println("----------------");
		
		System.out.println("----------------");
		
		System.out.println();
		
		System.out.print("To start the game, please press 1 and then hit ENTER: ");
		
		if(kbInput.hasNextDouble() == true)
			start = kbInput.nextDouble();
		
		else System.out.println("Invalid Entry");
		
		if(start == 1) {
			
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println();
		
		System.out.println("You slowly open your eyes, awakening to the stale smell of stagnant water and dirty limestone.");
		
		System.out.println();
		
		System.out.println("You manage to get to your feet, only to find yourself in the corner of a dimly lit stone chamber.");
		
		System.out.println();
		
		System.out.println("You can't remember how you got here.");
		
		System.out.println();
		
		System.out.print("If you dare to continue, please press 1 and then hit ENTER: ");
		
		if(kbInput.hasNextDouble() == true)
			start = kbInput.nextDouble();
		
		else System.out.println("Inva1");
		
		if(start == 1 ) {
			
		System.out.println();	
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println("............");
		
		System.out.println();
		
		System.out.println("You look around the chamber and see nothing but a flickering candle and three doors.");
		
		System.out.println();
		
		System.out.println("One to the left, one to the right, and another in front of you.");
		
		System.out.println();
		
		System.out.println("You have no idea where these doors lead to ... Guess you're about to find out ...");
		
		System.out.println();
		
		System.out.println("...");
		
		System.out.println("...");
		
		System.out.println();
		
		System.out.print("Where would you like to go? Left Door(1) | Front Door(2) | Right Door(3): ");
				
		if(kbInput.hasNextDouble() == true)
			door = kbInput.nextDouble();
		
		else System.out.println("Invalid Entry");
		
		if(door == 1) {
			
			System.out.println();
			
			System.out.println("............");
			
			System.out.println("............");
			
			System.out.println();
			
			System.out.println("You open the door and walk through ...");
			
			System.out.println();
			
			System.out.println("A giant orc with a battle axe chops your head off.");
			
			System.out.println();
			
			System.out.println("GAME OVER");
			
		}
		
		else if(door == 2) {
			
			System.out.println();
			
			System.out.println("............");
			
			System.out.println("............");
			
			System.out.println();
			
			System.out.println("You open the door and walk through ...");
			
			System.out.println();
			
			System.out.println("The chamber is pitch black and with your next step you fall into oblivion.");
			
			System.out.println();
			
			System.out.println("GAME OVER");
			
		}
		
		else if(door == 3) {
			
			System.out.println();
			
			System.out.println("............");
			
			System.out.println("............");
			
			System.out.println();
			
			System.out.println("You open the door and cautiously step through ...");
			
			System.out.println();
			
			System.out.println("You find yourself in another empty chamber ...");
			
			System.out.println();
			
			System.out.println("Three more doors ... One in front, one to the left and one to the right.");
			
			System.out.println();
			
			System.out.println("...");
			
			System.out.println("...");
			
			System.out.println();
			
			System.out.print("Where would you like to go? Left Door(1) | Front Door(2) | Right Door(3): ");
			
			if(kbInput.hasNextDouble() == true)
				door = kbInput.nextDouble();
			
			else System.out.println("Invalid Entry");
			
			if(door == 1) {
				
				System.out.println();
				
				System.out.println("............");
				
				System.out.println("............");
				
				System.out.println();
				
				System.out.println("You open the door and walk through ...");
				
				System.out.println();
				
				System.out.println("The door slams shut behind you and the chamber is flooded with water!");
				
				System.out.println("GAME OVER");
				
			}
			
			else if(door == 2) {
				
				System.out.println();
				
				System.out.println("............");
				
				System.out.println("............");
				
				System.out.println();
				
				System.out.println("You open the door and walk through ...");
				
				System.out.println();
				
				System.out.println("The door slams shut behind you and the chamber is set ablaze!");
				
				System.out.println();
				
				System.out.println("GAME OVER");
				
			}
			
			else if(door == 3) {
				
				System.out.println();
				
				System.out.println("............");
				
				System.out.println("............");
				
				System.out.println();
				
				System.out.println("You open the door and walk through ...");
				
				System.out.println();
				
				System.out.println("A third empty chamber ...");
				
				System.out.println();
				
				System.out.println("You see a door in front of you, a door on the floor and a large window ");
				
				System.out.println();
				
				System.out.println("high up on the wall, with a wooden ladder propped below it.");
				
				System.out.println();
				
				System.out.println("...");
				
				System.out.println("...");
				
				System.out.println();
				
				System.out.print("Where would you like to go? Front Door(1) | Floor Door(2) | Window(3): ");
				
				if(kbInput.hasNextDouble() == true)
					door = kbInput.nextDouble();
				
				else System.out.println("Invalid Entry");
				
				if(door == 1) {
					
					System.out.println();
					
					System.out.println("............");
					
					System.out.println("............");
					
					System.out.println();
					
					System.out.println("You open the door and step through ...");
					
					System.out.println();
					
					System.out.println("You walk directly into the gaping mouth of a giant gargoyle!");
					
					System.out.println();
					
					System.out.println("GAME OVER");
									
				}
				
				else if(door == 3) {
					
					System.out.println();
					
					System.out.println("............");
					
					System.out.println("............");
					
					System.out.println();
					
					System.out.println("You ascend the ladder steps to the window ...");
					
					System.out.println();
					
					System.out.println("You open the window and slowly peak out into the midnight dark ...");
					
					System.out.println();
					
					System.out.println("The ladder breaks and you plummet to your death!");
					
					System.out.println();
					
					System.out.println("GAME OVER");
					
				}
				
				if (door == 2) {
					
					System.out.println();
					
					System.out.println("............");
					
					System.out.println("............");
					
					System.out.println();
					
					System.out.println("You pull the heavy floor door open and carefully descend the stairs ...");
					
					System.out.println();
					
					System.out.println("You finally reach the bottom and see a lit torch on the wall next to you.");
					
					System.out.println();
					
					System.out.println("You take the torch, immediately causing the walls to shift, revealing three ");
					
					System.out.println();
					
					System.out.println("new hidden doors. One in front, one to the left and one to the right ...");
					
					System.out.println();
					
					System.out.println("...");
					
					System.out.println("...");
					
					System.out.println();
					
					System.out.print("Where would you like to go? Left Door(1) | Front Door(2) | Right Door(3): ");
					
					if(kbInput.hasNextDouble() == true)
						door = kbInput.nextDouble();
					
					else System.out.println("Invalid Entry");
					
					if(door == 1) {
						
						System.out.println();
						
						System.out.println("............");
						
						System.out.println("............");
						
						System.out.println();
						
						System.out.println("You open the door and walk through ...");
						
						System.out.println();
						
						System.out.println("You find yourself back at the beginning!");
						
						System.out.println();
						
						System.out.println("GAME OVER");
						
					}
					
					if(door == 3) {
						
						System.out.println();
						
						System.out.println("............");
						
						System.out.println("............");
						
						System.out.println();
						
						System.out.println("You open the door and walk through ...");
						
						System.out.println();
						
						System.out.println("You step through and are quickly smothered by a rabid pack of evil wombats!");
						
						System.out.println();
						
						System.out.println("GAME OVER");
						
					}
					
					if(door == 2) {
						
						System.out.println();
						
						System.out.println("............");
						
						System.out.println("............");
						
						System.out.println();
						
						System.out.println("You open the door and walk through ...");
						
						System.out.println();
						
						System.out.println("You step out into the woods and breathe a sigh of relief.");
						
						System.out.println();
						
						System.out.println("You have found your way out of the Labyrinth from HELL!");
						
						System.out.println();
						
						System.out.println("............");
						
						System.out.println("............");
						
						System.out.println();
						
						System.out.println("YOU WIN!");
					
					}
					
					else System.out.println("Invalid Entry");
					
				}
		
				else System.out.println("Invalid Entry");				
				
			}
			
			else System.out.println("Invalid Entry"); 
				
		}
			
		else System.out.println("Invalid Entry");
				
			}
		
		else System.out.println("Invalid Entry");		
		
		}

		else System.out.println("Invalid Entry");
		
	}		
	
}
