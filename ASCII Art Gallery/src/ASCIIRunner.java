
public class ASCIIRunner
	{

		public static void main(String[] args)
			{
				// Goals:
				// 1) Let user choose color they want to see the ASCII art in
				// 2) Have at least 3 categories of pictures for them to look through
				// 3) If time, add a randomized color option

				greetUser();
				endTour();
			}
		
		public static void greetUser()
			{
				//Example of how to color text
				//System.out.println(ConsoleColors.RED + "RED COLORED" + ConsoleColors.RESET);
				System.out.println("Welcome to the ASCII Art Gallery!");
				System.out.println("We are the only institution in the APCS world that has exhibits made entirely of ASCII art.");
				System.out.println(" ");
				
				//Choose color
				System.out.println("Before we begin, please choose the color you'd like to view the pictures in:");
				System.out.println("1) " + ConsoleColors.RED + "Red" + ConsoleColors.RESET);
				System.out.println("2) " + ConsoleColors.GREEN + "Green" + ConsoleColors.RESET);
				System.out.println("3) " + ConsoleColors.BLUE + "Blue" + ConsoleColors.RESET);
				System.out.println("4) " + ConsoleColors.PURPLE + "Purple" + ConsoleColors.RESET);
				System.out.println("5) " + ConsoleColors.CYAN + "Cyan" + ConsoleColors.RESET);
			}
		
		public static void testPlugIn()
			{
				//Confirmed that color plug in works
				//Immediately after adding ConsoleColors class,it's no longer working
				System.out.println("Hello \u001b[1;31mred\u001b[0m world!");
			}
		
		public static void endTour()
			{
				System.out.println(" ");
				System.out.println("Welcome back! We hope you enjoyed your time at the ASCII Art Gallery!");
				System.out.println("Special thanks go to Chris Moser for his patience & computer wizardry.");
			}
		

	}
