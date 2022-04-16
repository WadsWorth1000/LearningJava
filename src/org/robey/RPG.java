package org.robey;
import java.util.Scanner;

public class RPG {
	
	/*
	 * RPG Maze
	 * Find your way out of this labyrinth from HELL!
	 * Choose the right path or perish 
	 */

	public static void main(String[] args) {

		Scanner kbInput = new Scanner(System.in);
		
		double door = 0; 
		
		System.out.println("You slowly open your eyes, awakening to the stale smell of stagnant water and dirty limestone.");
		
		System.out.println();
		
		System.out.println("You manage to get to your feet, only to find yourself in the corner of a dimly lit stone chamber.");
		
		System.out.println();
		
		System.out.println("You can't remember how you got here.");
		
		System.out.println();
		
		System.out.println("You look around the chamber and see nothing but a flickering candle and two doors.");
		
		System.out.println();
		
		System.out.println("One to the left and another in front of you.");
		
		System.out.println();
		
		System.out.println("You have no idea where either door leads ... Guess you're about to find out ...");
		
		System.out.println();
		
		System.out.println("...");
		
		System.out.println("...");
		
		System.out.println();
		
		System.out.print("Which door would you like to go through? Enter (1) or (2) or (3): ");
				
		if(kbInput.hasNextDouble() == true)
			door = kbInput.nextDouble();
		
		else System.out.println("Invalid Entry.");
		
		if(door == 1) {
			
			System.out.println();
		
			System.out.println("You open the door and walk through. Your head gets chopped off. You are definitely dead.");
			
			System.out.println();
			
			System.out.println("GAME OVER.");
		}
		
		if(door == 2) {
		
			System.out.println();
		
			System.out.println("You open the door and walk through, only to find yourself in another empty chamber ...");
			
			System.out.println();
			
			System.out.println("Now you see three doors. One in front of you, one to the left and another to the right.");
			
			System.out.println();
			
			System.out.print("Which door would you like to go through? Enter (1) or (2) or (3): ");
			
			if(kbInput.hasNextDouble() == true)
				door = kbInput.nextDouble();
			
			else System.out.println("Invalid Entry.");
			
			if(door == 2) {
				
				System.out.println();
				
				System.out.println("You open the door and walk through, finding yourself face to face with Jared Kushner.");
				
				System.out.println();
				
				System.out.println("You immediately kill yourself.");
				
				System.out.println();
				
				System.out.println("You are dead ... Thank God ... oh and GAME OVER.");
				
			}
			
			if(door == 3) {
				
				System.out.println();
				
				System.out.println("You open the door and walk through.");
				
				System.out.println();
				
				System.out.println("It is pitch black and you plummet into oblivion.");
				
				System.out.println();
				
				System.out.println("You are most likely dead. GAME OVER.");
			}
			
			if(door == 1) {
				
				System.out.println();
				
				System.out.println("You open the door and walk through ...");
				
				System.out.println();
				
				System.out.println("Another three doors ... ");
				
				System.out.println();
				
				System.out.print("Which door would you like to go through? Enter (1) or (2) or (3): ");
				
				if(kbInput.hasNextDouble() == true)
					door = kbInput.nextDouble();
				
				System.out.println();
				
				if(door == 1) {
					
					System.out.println("You open the door and walk through.");
					
					System.out.println();
					
					System.out.println("A pack of evil wombats smother you.");
					
					System.out.println();
					
					System.out.println("You are dead by wombat. GAME OVER.");
					
				}
				
				if(door == 2 ) {
					
					System.out.println("You open the door and walk through. ");
					
					System.out.println();
					
					System.out.println("You find yourself back at the beginning.");
					
					System.out.println();
					
					System.out.println("GAME OVER.");
					
				}
				
				if(door == 3) {
					
					System.out.println("You open the door and walk through.");
					
					System.out.println();
					
					System.out.println("There is a door on the ground, most likely to the chamber basement");
					
					System.out.println();
					
					System.out.println("and another door on the ceiling with an old wooden ladder propped against the wall below it.");
					
					System.out.println();
					
					System.out.print("Which door would you like to choose? Floor (1) or Ceiling (2) ?: ");
															
					if(kbInput.hasNextDouble() == true)
						door = kbInput.nextDouble();
					
					if(door == 2) {
						
						System.out.println();
						
						System.out.println("You grab the ladder and carefully ascend to the ceiling door.");
						
						System.out.println();
						
						System.out.println("You push the door open and peak out into the dark.");
						
						System.out.println();
						
						System.out.println("The ladder breaks and you fall back to the chamber floor, breaking your neck.");
						
						System.out.println();
						
						System.out.println("You are probably dead now. GAME OVER.");
					
					}
					
					if(door == 1) {
						
						System.out.println();
						
						System.out.println("You open the heavy floor door and cautiously start down the dark stairway.");
						
						System.out.println();
						
						System.out.println("You finally reach the bottom of the stairs and find a lit torch hanging.");
						
						System.out.println();
						
						System.out.println("You grab the torch and suddenly see the walls start to shift.");
						
						System.out.println();
						
						System.out.println("Three new doors appear.");
						
						System.out.println();
						
						System.out.print("Which door would you like to choose? Enter (1) or (2) or (3): ");
						
						if(kbInput.hasNextDouble() == true)
							door = kbInput.nextDouble();
						
						System.out.println();
						
						if(door == 3) {
							
							System.out.println("You open the door and walk through.");
							
							System.out.println();
							
							System.out.println("The door slams behind you and the chamber is set ablaze.");
							
							System.out.println();
							
							System.out.println("You immediately burn to death. GAME OVER.");
						}
						
						if(door == 2) {
							
							System.out.println("You open the door and walk through.");
							
							System.out.println();
							
							System.out.println("The door slams shut behind you and the chamber fills with water.");
							
							System.out.println();
							
							System.out.println("You drown. You are dead. GAME OVER.");
							
						}
						
						if(door == 1) {
							
							System.out.println("You walk through the door and exit the chamber.");
							
							System.out.println();
							
							System.out.println("YOU WIN!");
						
						}
						
						else System.out.println("Invalid Entry."); 	
						
					}
						
					else System.out.println("Invalid Entry."); 		
					
					}
					
				else System.out.println("Invalid Entry."); 	
					
				}
			
			else System.out.println("Invalid Entry.");
				
			}
			
		else System.out.println("Invalid Entry."); 	
			
		}
		
		
		
		
		
				
		
	

}
