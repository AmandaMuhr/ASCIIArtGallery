import java.util.Scanner;

public class ASCIIRunner
	{

		static Scanner userInput = new Scanner(System.in);
		static int choice = 0;
		
		public static void main(String[] args)
			{
				// Goals:
				// 1) Let user choose color they want to see the ASCII art in
				// 2) Have at least 3 categories of pictures for them to look through
				// 3) If time, add a randomized color option

				greetUser();
				chooseExhibit();
				chooseColor();
				endTour();
			}
		
		public static void greetUser()
			{
				//Example of how to color text
				//System.out.println(ConsoleColors.RED + "RED COLORED" + ConsoleColors.RESET);
			
				
				System.out.println("Welcome to the ASCII Art Gallery!");
				System.out.println("We are the only institution in the APCS world that has exhibits made entirely of ASCII art.");
				System.out.println(" ");
			}
		
		public static void chooseColor()
		{
				//Choose color
				System.out.println(" ");
				System.out.println("Before we begin, please choose the color you'd like to view the pictures in:");
				System.out.println("1) " + ConsoleColors.RED + "Red" + ConsoleColors.RESET);
				System.out.println("2) " + ConsoleColors.GREEN + "Green" + ConsoleColors.RESET);
				System.out.println("3) " + ConsoleColors.BLUE + "Blue" + ConsoleColors.RESET);
				System.out.println("4) " + ConsoleColors.PURPLE + "Purple" + ConsoleColors.RESET);
				System.out.println("5) " + ConsoleColors.CYAN + "Cyan" + ConsoleColors.RESET);
				//It doesn't like 'private' for some reason???
				choice = userInput.nextInt();
				
				if(choice == 1)
					{
						viewInRed();
					}
				
				if(choice == 2)
					{
						viewInGreen();
					}
				
				if(choice == 3)
					{
						viewInBlue();
					}
				
				if(choice == 4)
					{
						viewInPurple();
					}
				
				if(choice == 5)
					{
						viewInCyan();
					}
				
			}
		
		public static void chooseExhibit()
			{
				//Just beginning ideas for categories; can change up until ASCII images are uploaded
				System.out.println("Which exhbit would you like to view?");
				System.out.println("1) Nature");
				System.out.println("2) Superheroes");
				System.out.println("3) Patriotism");
				choice = userInput.nextInt();
			}
	
		
		public static void testPlugIn()
			{
				//Confirmed that color plug in works on both machines
				System.out.println("Hello \u001b[1;31mred\u001b[0m world!");
			}
		
		public static void viewInRed()
			{
				System.out.println(ConsoleColors.RED + " ");
				//Run method here
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewInGreen()
			{
				System.out.println(ConsoleColors.GREEN + " ");
				//Run method here
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewInBlue()
			{
				System.out.println(ConsoleColors.BLUE + " ");
				//Run method here
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewInPurple()
			{
				System.out.println(ConsoleColors.PURPLE + " ");
				//Run method here
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewInCyan()
			{
				System.out.println(ConsoleColors.CYAN + " ");
				//Run method here
				System.out.println(ConsoleColors.RESET + " ");
			}
			
		public static void endTour()
			{
				System.out.println("Welcome back! We hope you enjoyed your time at the ASCII Art Gallery!");
				System.out.println(" ");
				System.out.println("Note from Creator: Special thanks go to Chris Moser for his patience & computer wizardry.");
			}
		

	}
