
public class ASCIIRunner
	{

		public static void main(String[] args)
			{
				// Goals:
				// 1) Let user choose color they want to see the ASCII art in
				// 2) Have at least 3 categories of pictures for them to look through

				greetUser();
			}
		
		public static void greetUser()
			{
				System.out.println("Welcome to the ASCII Art Gallery!");
				System.out.println("We are the only institution in the APCS world that has exhibits made entirely of ASCII art.");
				System.out.println(" ");
				//Choose color
				System.out.println("Before we begin, please choose the color you'd like to view the pictures in:");
			}
		
		public static void testPlugIn()
		{
			//Confirmed that color plug in works
			System.out.println("Hello \u001b[1;31mred\u001b[0m world!");
		}

	}
