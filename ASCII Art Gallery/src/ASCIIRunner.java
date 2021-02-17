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
				chooseExhibitAndColor();
				endTour();
			}
		
		public static void testPlugIn()
			{
				//Confirmed that color plug in works on both machines
				System.out.println("Hello \u001b[1;31mred\u001b[0m world!");
			}
		
		public static void greetUser()
			{
				//Example of how to color text
				//System.out.println(ConsoleColors.RED + "RED COLORED" + ConsoleColors.RESET);
				
				System.out.println("Welcome to the ASCII Art Gallery!");
				System.out.println("We are the only institution in the APCS world that has exhibits made entirely of ASCII art.");
				System.out.println(" ");
			}
		
		public static void chooseExhibitAndColor()
			{
				System.out.println("Please choose the exhibit you'd like to view:");
				System.out.println("1) " + ConsoleColors.GREEN + "Green Superheroes" + ConsoleColors.RESET);
				System.out.println("2) " + ConsoleColors.PURPLE + "Purple Superheroes" + ConsoleColors.RESET);
				System.out.println("3) " + ConsoleColors.CYAN + "Cyan Superheroes" + ConsoleColors.RESET);
				System.out.println("4) " + ConsoleColors.GREEN + "Green Nature" + ConsoleColors.RESET);
				System.out.println("5) " + ConsoleColors.PURPLE + "Purple Nature" + ConsoleColors.RESET);
				System.out.println("6) " + ConsoleColors.CYAN + "Cyan Nature" + ConsoleColors.RESET);
				choice = userInput.nextInt();
				
				if(choice == 1)
					{
						viewGreenSuperheroes();
					}
				
				if(choice == 2)
					{
						viewPurpleSuperheroes();
					}
				
				if(choice == 3)
					{
						viewCyanSuperheroes();
					}
				
				if(choice == 4)
					{
						viewGreenNature();
					}
				
				if(choice == 5)
					{
						viewPurpleNature();
					}
				
				if(choice == 6)
					{
						viewCyanNature();
					}
				
				
			}
		
		public static void viewGreenSuperheroes()
			{

				System.out.println(ConsoleColors.GREEN + " ");
				System.out.println("Green superheroes works");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewPurpleSuperheroes()
			{
				System.out.println(ConsoleColors.PURPLE + " ");
				System.out.println("Purple superheroes works");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewCyanSuperheroes()
			{
				System.out.println(ConsoleColors.CYAN + " ");
				System.out.println("Cyan superheroes works");
				System.out.println(ConsoleColors.RESET + " ");
			}
	
		public static void viewGreenNature()
			{
				System.out.println(ConsoleColors.GREEN + " ");
				System.out.println("Green nature works");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewPurpleNature()
			{
				System.out.println(ConsoleColors.PURPLE + " ");
				System.out.println("Purple Nature works");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewCyanNature()
			{
				System.out.println(ConsoleColors.CYAN + " ");
				System.out.println("Cyan nature works");
				System.out.println(ConsoleColors.RESET + " ");
			}
					
		public static void endTour()
			{
				System.out.println("Welcome back! We hope you enjoyed your time at the ASCII Art Gallery!");
				System.out.println(" ");
				System.out.println("Note from Creator: Special thanks go to Chris Moser for his patience & computer wizardry.");
			}
		

	}
