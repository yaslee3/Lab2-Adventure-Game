import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); //create a new scanner object to allow user to input data
		
		//declare the instance variables 
		String name;
		String choice; 
		
		System.out.println("Welcome! What is your name?(enter your name)"); //prompt user to input data that will be stored in the String variable "name"
		name = scan.nextLine();
		//System.out.println();


		System.out.println("Would you like to play a game? (y/n)"); //prompt user to make a selection that jump into the switch statement
		
		System.out.println("Enter (y/n)" );
		choice = scan.nextLine();
		
		//enter switch statements
				switch (choice) {
				case "y":
					System.out.println("Excellent, "+ name + "! You are walking across a field and you encounter a"
				              + " fire-breathing dragon! What would you do? (enter face the beast or run away )");
					choice = scan.nextLine();
				
					//as the user chooses options that advance the game we continue moving through switch statements
					
					switch (choice) {
					case "face the beast":
						System.out.println("You approach the dragon. You see that it has _ heads. (enter 1 or 2 or 3)");
					choice = scan.nextLine();
					System.out.println();

					switch (choice) {
					case "1":
						System.out.println( "No one has ever face 1-headed dragons before ,"+ name + " Choose your weapon"
									+ " (enter slingshot or sword or bow and arrow): "); 
						//choice = scan.nextLine();
						//System.out.println();
						break; //if the user chooses an option that ends the game we break out of the switch statement entirely and the game is ended. 
					case "2": 
						System.out.println( "No one has ever face  2- headed dragon before ,"+ name + "  Choose your weapon"
									+ " (enter slingshot or sword or bow and arrow): ");  
						break;
					case "3":
							System.out.println( " No one has face a 3-headed dragon before , "+ name + "  Choose your weapon"
									+ " (enter slingshot or sword or bow and arrow): ");
					}
					
					System.out.println("what weapon");
						choice = scan.nextLine();
						
						switch (choice) {
						case "slingshot":
							System.out.println("Armed with slingshot you approach the dragon, " + name + "! You can feel its fiery breath as you get closer!"
							           + " It stares at you with its ___ eyes. (enter red or blue) ");
							break;
							
						case "sword":
							System.out.println(name + "Armed with sword you approach the dragon," + name + "! You can feel its fiery breath as you get closer!"
									               + " It stares at you with its ___ eyes. (enter red or blue) ");
							break;
						case "bow and arrow":
							System.out.println("Armed with your bow and arrow you approach the dragon," + name + "! You feel its fiery breath as you appraoch."
									+ " It stares at you with its ___ eyes. (enter red or blue) ");
						}	
							System.out.println("enter color");
							choice = scan.nextLine();
							
                      switch (choice){
                      
                      case "red":
          				System.out.println("Red-eyed dragons are not normally friendly.  you pet the dragon and become friends."
          						+ " You name the dragon. (enter a name):");
          				
          				choice = scan.nextLine();
          				System.out.println();
          				
          				System.out.println(name + " and " + choice + " lived happily ever after! The end.");
          				break;
          			
          			case "blue" :
          				System.out.println("Blue-eyed dragons are friendly. you prt the dragon and become friends." + "you name the dragon. (enter a name):");
          				
          				choice = scan.nextLine();
          				System.out.println(name + " and " + choice + " lived happily ever after! The end.");
          				break;

                      
					}		
		
					
					break;
					case "run away":
						System.out.println("You most be scare Ha, Ha , " + name + "! I shall seek another worthy player for the adventure!");
						break; //if the user chooses to run away we do not go through the options above, we immediately break out of the switch statement and the game ends.
					}
				}
				System.out.println("GAME OVER!"); //a final prompt to inform the user that the game is over. 
				scan.close();
			}
		}