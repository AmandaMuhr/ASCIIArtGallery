import java.util.Scanner;

public class ASCIIRunner
	{

	//This version is up to date as of Wednesday, February 23, 2021!
	
		static Scanner userInput = new Scanner(System.in);
		static int choice = 0;
		
		public static void main(String[] args)
			{
				// Goals:
				// 1) Let user choose color they want to see the ASCII art in (Completed)
				// 2) Have at least 3 categories of pictures for them to look through (Completed)
				// 3) If time, add a randomized color option
				// 4) Be able to choose multiple exhibits in one session (Completed)

				greetUser();
				chooseExhibitAndColor();
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
				
				System.out.print("Welcome to the ");
				//Next three lines create fancy ASCII ART GALLERY
				System.out.print(ConsoleColors.RED_BOLD + "A" + ConsoleColors.BLUE_BOLD + "S" + ConsoleColors.YELLOW_BOLD + "C" + ConsoleColors.PURPLE_BOLD + "I" + ConsoleColors.GREEN_BOLD + "I");
				System.out.print(" " + ConsoleColors.CYAN_BOLD + "A" + ConsoleColors.RED_BOLD + "R" + ConsoleColors.BLUE_BOLD + "T");
				System.out.println(" " + ConsoleColors.YELLOW_BOLD + "G" + ConsoleColors.PURPLE_BOLD + "A" + ConsoleColors.GREEN_BOLD + "L" + ConsoleColors.CYAN_BOLD + "L" + ConsoleColors.RED_BOLD + "E" + ConsoleColors.BLUE_BOLD + "R" + ConsoleColors.YELLOW_BOLD + "Y" + ConsoleColors.PURPLE_BOLD + "!");
				System.out.println(ConsoleColors.RESET + "We are the only institution in the APCS world that has exhibits made entirely of ASCII art.");
				System.out.println(" ");
			}
		
		public static void chooseExhibitAndColor()
			{
				System.out.println("Please choose the exhibit you'd like to view:");
				System.out.println("1) " + ConsoleColors.GREEN + "Green Superheroes" + ConsoleColors.RESET);
				System.out.println("2) " + ConsoleColors.PURPLE + "Purple Superheroes" + ConsoleColors.RESET);
				System.out.println("3) " + ConsoleColors.CYAN + "Cyan Superheroes" + ConsoleColors.RESET);
				System.out.println("4) " + ConsoleColors.GREEN + "Green Flags" + ConsoleColors.RESET);
				System.out.println("5) " + ConsoleColors.PURPLE + "Purple Flags" + ConsoleColors.RESET);
				System.out.println("6) " + ConsoleColors.CYAN + "Cyan Flags" + ConsoleColors.RESET);
				System.out.println("7) " + ConsoleColors.GREEN + "Green Disney" + ConsoleColors.RESET);
				System.out.println("8) " + ConsoleColors.PURPLE + "Purple Disney" + ConsoleColors.RESET);
				System.out.println("9) " + ConsoleColors.CYAN + "Cyan Disney" + ConsoleColors.RESET);
				choice = userInput.nextInt();
				
				if(choice == 1)
					{
						viewGreenSuperheroes();
						goAgain();
					}
				
				if(choice == 2)
					{
						viewPurpleSuperheroes();
						goAgain();
					}
				
				if(choice == 3)
					{
						viewCyanSuperheroes();
						goAgain();
					}
				
				if(choice == 4)
					{
						viewGreenFlags();
						goAgain();
					}
				
				if(choice == 5)
					{
						viewPurpleFlags();
						goAgain();
					}
				
				if(choice == 6)
					{
						viewCyanFlags();
						goAgain();
					}
				
				if(choice == 7)
					{
						viewGreenDisney();
						goAgain();
					}
				
				if(choice == 8)
					{
						viewPurpleDisney();
						goAgain();
					}
				
				if(choice == 9)
					{
						viewCyanDisney();
						goAgain();
					}
				
				
			}
		
		public static void viewGreenSuperheroes()
			{
				System.out.println("Captain America");
				System.out.println(ConsoleColors.GREEN + " ");
				System.out.println("                                                                              \n" + 
						"                                         `..--:::::::--..`                                          \n" + 
						"                                  `-:+oyhhhddddddddddddddhhyso/:.                                   \n" + 
						"                             `-/oyhhhhddddddddddddddddddddddddddhhy+:.                              \n" + 
						"                          ./oyhhhhhddddddddddddddddddddddddddddddddddhyo:`                          \n" + 
						"                       ./syyhhhhhhhhdddddddddddhhhhddddddddddddddddddddddhs:`                       \n" + 
						"                    `:oyyyyyyyhhhhhhhhyysoo++/////////+++ossyhddddddddddddddho-                     \n" + 
						"                  ./sssyyyyyyyyyyys++//////////////////////////+syhdddddddddddhy/`                  \n" + 
						"                `/osssssssssyso+::-::://///////////////////////////+sydddyhddddhhy/`                \n" + 
						"              `:oooossssssso/-------://///////////////////////////////+syhddddhhhhhs:               \n" + 
						"             .+oooooosooo/-......---::///////++++++++++//////////////////+shhhhyhhhyyo.             \n" + 
						"           `:+oooooooo+/.```......---:/++osyyhhhhddddhhyyyso+//////////////+syyyyyyyyys:            \n" + 
						"          `/oooooooo+/.```````....-:/osyyhhhhhhdddddhhhddddddhyo+/////////////syyyyyssss/`          \n" + 
						"         .+oooooo+++-``````````.-/+sssyyyyhhhhhddhhhhdddddddhhhhdyo////////::-:+sssssssss+`         \n" + 
						"        .+oooooo++/.``````````./+oosssyyyyyhhhhhyhddddddddhhhddddddhs+///:::--..-oooooooss+`        \n" + 
						"       `+ooooo+++/``````````.:++oooosssyyyyyhhhhhhhdddddhhhddddddhhhhhs/:---....`.+oooooooo+`       \n" + 
						"      `+ooo+++++/``````````-/++++oooosssyyhhhhdddo+dddhhhddddhhhyyhhhhyo+-......``./+ooooooo/       \n" + 
						"      :o+++++++/``````  ``:/+++++ooooosyyyyhhhhdy::yddddhhhhhhyyhhhyyssys+......```./++oooooo-      \n" + 
						"     .o++++++++.`````   `:/++++++ooosyyyyyyhhhhh+::/hhhhhhdhhhhhhyyssyysso+-`...````.++o+oooo+`     \n" + 
						"     /++++++++:````` ```:/++++++++osssssyyyyhhhs:/::+hhhhhhhhhhhhyyyyysooos+.`.``````:+++ooooo:     \n" + 
						"    `o++oo++++`````````.//++++++++sssssssyyyyhh:////:yhhhhhhhyyyyyyyssssssso:`````````+++++++++     \n" + 
						"    -ooooo+++:`````````/+++++++++soossssssssyy+://////hhhyyyyyssssyysssssssoo.````````:+++++++o.    \n" + 
						"    /oooo++++.````````.+++++++++oo/-......------/////://::----..-/oysssssssoo:````````.++++++oo:    \n" + 
						"    +ooooo+++`````````:+++++++++ssss+:.```````..-///::-.......:+sssssssssssso/`````````++++oooo/    \n" + 
						"    oooooo+++`````````:+++++++++sssssss+-```````.-:-.```...-/ssssssssssssssso+`````````+ooooooo/    \n" + 
						"    oooooo+++`````````:+++++++++oossssssso/-``..-::-...../ossssssssssssssssss+`````````+ooooooo/    \n" + 
						"    +oooooo++.````````-+++++++++oossssssssy/--:::/::-....syyysssssssyssssssss/`````````oooooooo/    \n" + 
						"    /ooooooo+-````````.+++++++ooossssyyyyys-:::::::/:---.:yyyyyyssssyyyssssss:````````-oooooooo:    \n" + 
						"    -sooooooo/`````````:+++oooooosyyyyyyhh:::::::os+::---.oyyyyyyyyyyyyyyssso.`.``````/ooosssoo.    \n" + 
						"     ossoooooo.````````.+oooosssssyyyhhhho-:::/shhhhyo/----syyyyyyyyyyyyyyss:.......`.oosssssoo     \n" + 
						"     :ssssssso/````````.-oosssssyyyyhhhhy--:oyhhhhhhhhhs+:-/yyyyyhhhhhyyyys/........./ssssssss:     \n" + 
						"     `ossssssss:.........:sssyyyyyyyyhhh/+shhhhhhhhhhhhhhyo/syyhhhhhhhhhyy+.........:sssssssso      \n" + 
						"      -sysyyysss:....----:/syyyyyyyyhhhhyhhhhhhhhhhhhhhhhhhhyhhhhhhhhhhhy/-----....-sssssssss-      \n" + 
						"       +yyyyyyyys:---:::////oyyyyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/:---------syyyyysss/       \n" + 
						"       `oyyyyhhhhy/::://///:-/syyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-::::::---:syyyyyyyy+        \n" + 
						"        `oyhhhhhhhy+////::-----/oyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-----::::--/yyyyyyyyy+`        \n" + 
						"         `oyhhhhhhhhs/:----------:+syhhhhhhhhhhhhhhhhhhhhhhhhhhhyo/----------::oyhhhhyyyy+`         \n" + 
						"          `+yhhhhhhhhy+-------------:+oyyhhhhhhhhhhhhhhhhhhhys+/:------------+yhhhhhhyyy/           \n" + 
						"            :yhhhhhhhhys+:-------------::/+ossyyyyyyyyyso+//:-------------:+shhhhhhhyys-            \n" + 
						"             .oyhhhhhhhhyyo:------------------::::::::::::--::-::-------:+yhhhhhhhhyy+`             \n" + 
						"               -syhhhhhhhhhys+:-------------::::::::::::::::::::::::::+syhhhhhhhhhyo.               \n" + 
						"                `:syhhhhhhhhhhys+/:-----::::::::::::::::::::::::::/oshhhhhhhhhhhyo-                 \n" + 
						"                  `:syyhhhhhhhhhhhyso+/:::::::::::::::::::////+osyhhhhhhhhhhhhyo-                   \n" + 
						"                    `:oyyhhhhhhhhhhhhhhhyyssoo++++++++oossyyhdddddhhhhhhhhhhy+-                     \n" + 
						"                      `-/oyyhhhhhhhhhddddddddddddddddddddddddddddddddhhhhyo:.`                      \n" + 
						"                       ``.-/osyhhhhhdddddddddddddddddmmmmmmmddddddddhhs+:.``                        \n" + 
						"                          ``..:/osyhhdddddmmmmmmmmmmmmmmmmmmmmmddhso/-..```                         \n" + 
						"                         ``````..--:+osyhhdddmmmmmmmmmmmdddhyso+:--...`````````                     \n" + 
						"                          `````````....---:://++++++++//::---....``````````                         \n" + 
						"                                     ```````````````````````````                ");
				
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Wonder Woman" + ConsoleColors.GREEN);
				System.out.println(" ");
				System.out.println("                                                                                                    \n" + 
						"                                        `.:/ossyyyyyyso+/-.                                         \n" + 
						"                                   `:oymNMMMMMMNm+omNMMMMMMNds+-                                    \n" + 
						"                                -odNMMMMMMMMMMMm:  +NMMMMMMMMMMMmy/.                                \n" + 
						"                             -omMMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNh/`                             \n" + 
						"                           :hNMMMMMMMMMMMmhso+/:---::/+sydNMMMMMMMMMMMmo.                           \n" + 
						"                         :hdNdmMMMMMMds/.`               ``-+ymMMMMMMhmmds`                         \n" + 
						"                       .yNM/``omMMdo.`                        `:yNMMh.``dMm/                        \n" + 
						"                      /mMMms/-hNy:`              ``              .ommo-shMMMy`                      \n" + 
						"                  ```-yhhhhhysy:`               .dh`               .oyyyyyyyyo`                     \n" + 
						"  -dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddy:         .dMMd.         .odmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdh.  \n" + 
						"   -dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+       -mMMMMd.       /NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh-   \n" + 
						"    `+hmmmmmmmmmmmmmmmmmmmmmmmmmMMMMMMN/     -mMMMMMMm-     oNMMMMMNNmmmmmmmmmmmmmmmmmmmmmmmmh/`    \n" + 
						"      ``..........````````````..:yMMMMMN/   :mMMMMMMMMm-   oMMMMMNs-...`````````````````....`       \n" + 
						"       +yyyyyyyyyhhhhhhhhyyyyso- `sMMMMMN/ :NMMMMhdMMMMm- sMMMMMN/ `:syyyyyhhhhhhhhyyyyyyyyy-       \n" + 
						"       `yMMMMMMMMMMMMMMMMMMMMMMNo `oMMMMMNsNMMMMs`.yMMMMNyMMMMMN/ .hMMMMMMMMMMMMMMMMMMMMMMN+        \n" + 
						"        `/dNNNMMMMMMMMMMMMMMMMMNNo  oMMMMMMMMMN+   `sMMMMMMMMMN/ `hNNMMMMMMMMMMMMMMMMMNNmy-         \n" + 
						"          `.----------------------   oMMMMMMMm/ `o/  +NMMMMMMN:  `----------------------.           \n" + 
						"             -++++++++++++++++++++/-  +NMMMMd- `yMNo` /NMMMMN: `-/+++++++++++++++++++/`             \n" + 
						"             `sNMMMMMMMMMMMMMMMMMMMNs` +NMMh. .dMMMMs` -dMMm- `yNMMMMMMMMMMMMMMMMMMMN+              \n" + 
						"               /dNMMMMMMMMMMMMMMMMMMMy` /Ns` -mMMMMMMh. .hm- .dMMMMMMMMMMMMMMMMMMMNy-               \n" + 
						"                `:oooooo++:::/+odMMMMMh` -  /NMMMMMMMMm- `. .dMMMMNho//::+ooooooo+-                 \n" + 
						"                  ymmmmmNN/     `oNMMMMd. `oNMMMMmNMMMMN/  -mMMMMN/     `hmmmmmmd-                  \n" + 
						"                  -NMMMMMMN:      /NMMMMd-sMMMMMd-:mMMMMNo:mMMMMm-     `sMMMMMMMy                   \n" + 
						"                   +MMMMMMMN/      :mMMMMNMMMMMh.  .dMMMMMNMMMMd.     `yMMMMMMMd`                   \n" + 
						"                    oMMMMMMMNo`     -mMMMMMMMMs`    `hMMMMMMMMh`     -dMMMMMMMm.                    \n" + 
						"                     +NMMMMNmdd/`    .dMMMMMN+       `yMMMMMMy`    .sNhNMMMMMd.                     \n" + 
						"                      :mMMm:`.smd/`   .dMMMN/          oNMMMs`  `.sNmo`-+NMNs`                      \n" + 
						"                       `sNN//.mMMMms:` `hMm-            /NMs `.+hNMMMy./+Md:                        \n" + 
						"                         -yNMNMMMMMMMmy+:y-             `:s/sdNMMMMMMNNMm+`                         \n" + 
						"                           -yNMMMMMMMMMMMNdhso+//:///+syhmMMMMMMMMMMMMd+`                           \n" + 
						"                             `+dNMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNs:                              \n" + 
						"                                .+yNMMMMMMMMMMMm:  oMMMMMMMMMMMNds:`                                \n" + 
						"                                    -/shNMMMMMMNm/sdNMMMMMNmyo:`                                    \n" + 
						"                                         `-:/+osssssoo+/:.       ");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "The Avengers" + ConsoleColors.GREEN);
				System.out.println("\n" + 
						"                                                       ````````                                      \n" + 
						"                                                     omNNNNNms                                      \n" + 
						"                                                    oNNMMMMMmy                                      \n" + 
						"                                            `-/+ossyNMMMMMMMNy                                      \n" + 
						"                                       `-+ymMNMMMMMMMMMMMMMMNh-                                     \n" + 
						"                               ` ..`-:smNNNNNmNNNNNMMMMMMMMMMNNms-                                  \n" + 
						"                             ````--/shhmmmmmdhyymNNNMMNmMMMMNNMMNNy:                                \n" + 
						"                              ````--.::++o/:-`-+hNNNNNmhMMMMNmmNMNNmy-                              \n" + 
						"                                 ```.``..`` ``-+dNNNNmNhMMMMmy:hmmNNNd+                             \n" + 
						"                               `       ``..-../yhdmmd+dhMMMMNy  :dmNNNms                            \n" + 
						"                              ` `  ``-  ```.-/oyddmho dhNMMMNy   `ymNMMms                           \n" + 
						"                                  `-`   .`.:+oommmhs  dhNMMMNy    `hmNMMm:                          \n" + 
						"                           ` `` ``.` ```.-:+sshdddy   mhNNNNmy     .mNMMNh                          \n" + 
						"                         `  .--`.` .`-`-.syhdhdmdh`   +ddmNNmy      smNNNd.                         \n" + 
						"                           ``.````````.-/oshhhhhy`    yoohdmds      /ddmmh-                         \n" + 
						"                            .`.`...``...-/sssssys+ossshhho+yds      +hhdhy.                         \n" + 
						"                         .     ..-`...--./yhyyhdddmmmmmmmmdso/      hdmmmd`                         \n" + 
						"                                 ::::/+++ohmmmNNNNmNNNNNNNNms:     +mmNNNs                          \n" + 
						"                            ``  ``.:/yhdddmmmysyssyyyydmNdoody    :mNNMMm.                          \n" + 
						"                               ```.-/ymmmmmms         my//mmmy   +mNNMMN:                           \n" + 
						"                               `.-:+ymNNNNNh/         .`-oNNNy :dNNNMMm:                            \n" + 
						"                               `:+ohmmNNNds:`           `-///sdMMMMMNh.                             \n" + 
						"                                ``:hmmNdssh/-```  `.--/o+oydNNMMMMMm/                               \n" + 
						"                              ```./oysdhoyhhhhdhyhhhmNNMMMMMMMMMMh/                                 \n" + 
						"                                 ``.-.:o//omNNNNNNNMMMMMMMMNMNho.                                   \n" + 
						"                                         ``-oydNNNNNMMMNmhs+-                                       \n" + 
						"                                                `.....`                                             \n" + 
						"                                                                ");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewPurpleSuperheroes()
			{
				System.out.println("Captain America");
				System.out.println(ConsoleColors.PURPLE + " ");
				System.out.println("                                                                              \n" + 
						"                                         `..--:::::::--..`                                          \n" + 
						"                                  `-:+oyhhhddddddddddddddhhyso/:.                                   \n" + 
						"                             `-/oyhhhhddddddddddddddddddddddddddhhy+:.                              \n" + 
						"                          ./oyhhhhhddddddddddddddddddddddddddddddddddhyo:`                          \n" + 
						"                       ./syyhhhhhhhhdddddddddddhhhhddddddddddddddddddddddhs:`                       \n" + 
						"                    `:oyyyyyyyhhhhhhhhyysoo++/////////+++ossyhddddddddddddddho-                     \n" + 
						"                  ./sssyyyyyyyyyyys++//////////////////////////+syhdddddddddddhy/`                  \n" + 
						"                `/osssssssssyso+::-::://///////////////////////////+sydddyhddddhhy/`                \n" + 
						"              `:oooossssssso/-------://///////////////////////////////+syhddddhhhhhs:               \n" + 
						"             .+oooooosooo/-......---::///////++++++++++//////////////////+shhhhyhhhyyo.             \n" + 
						"           `:+oooooooo+/.```......---:/++osyyhhhhddddhhyyyso+//////////////+syyyyyyyyys:            \n" + 
						"          `/oooooooo+/.```````....-:/osyyhhhhhhdddddhhhddddddhyo+/////////////syyyyyssss/`          \n" + 
						"         .+oooooo+++-``````````.-/+sssyyyyhhhhhddhhhhdddddddhhhhdyo////////::-:+sssssssss+`         \n" + 
						"        .+oooooo++/.``````````./+oosssyyyyyhhhhhyhddddddddhhhddddddhs+///:::--..-oooooooss+`        \n" + 
						"       `+ooooo+++/``````````.:++oooosssyyyyyhhhhhhhdddddhhhddddddhhhhhs/:---....`.+oooooooo+`       \n" + 
						"      `+ooo+++++/``````````-/++++oooosssyyhhhhdddo+dddhhhddddhhhyyhhhhyo+-......``./+ooooooo/       \n" + 
						"      :o+++++++/``````  ``:/+++++ooooosyyyyhhhhdy::yddddhhhhhhyyhhhyyssys+......```./++oooooo-      \n" + 
						"     .o++++++++.`````   `:/++++++ooosyyyyyyhhhhh+::/hhhhhhdhhhhhhyyssyysso+-`...````.++o+oooo+`     \n" + 
						"     /++++++++:````` ```:/++++++++osssssyyyyhhhs:/::+hhhhhhhhhhhhyyyyysooos+.`.``````:+++ooooo:     \n" + 
						"    `o++oo++++`````````.//++++++++sssssssyyyyhh:////:yhhhhhhhyyyyyyyssssssso:`````````+++++++++     \n" + 
						"    -ooooo+++:`````````/+++++++++soossssssssyy+://////hhhyyyyyssssyysssssssoo.````````:+++++++o.    \n" + 
						"    /oooo++++.````````.+++++++++oo/-......------/////://::----..-/oysssssssoo:````````.++++++oo:    \n" + 
						"    +ooooo+++`````````:+++++++++ssss+:.```````..-///::-.......:+sssssssssssso/`````````++++oooo/    \n" + 
						"    oooooo+++`````````:+++++++++sssssss+-```````.-:-.```...-/ssssssssssssssso+`````````+ooooooo/    \n" + 
						"    oooooo+++`````````:+++++++++oossssssso/-``..-::-...../ossssssssssssssssss+`````````+ooooooo/    \n" + 
						"    +oooooo++.````````-+++++++++oossssssssy/--:::/::-....syyysssssssyssssssss/`````````oooooooo/    \n" + 
						"    /ooooooo+-````````.+++++++ooossssyyyyys-:::::::/:---.:yyyyyyssssyyyssssss:````````-oooooooo:    \n" + 
						"    -sooooooo/`````````:+++oooooosyyyyyyhh:::::::os+::---.oyyyyyyyyyyyyyyssso.`.``````/ooosssoo.    \n" + 
						"     ossoooooo.````````.+oooosssssyyyhhhho-:::/shhhhyo/----syyyyyyyyyyyyyyss:.......`.oosssssoo     \n" + 
						"     :ssssssso/````````.-oosssssyyyyhhhhy--:oyhhhhhhhhhs+:-/yyyyyhhhhhyyyys/........./ssssssss:     \n" + 
						"     `ossssssss:.........:sssyyyyyyyyhhh/+shhhhhhhhhhhhhhyo/syyhhhhhhhhhyy+.........:sssssssso      \n" + 
						"      -sysyyysss:....----:/syyyyyyyyhhhhyhhhhhhhhhhhhhhhhhhhyhhhhhhhhhhhy/-----....-sssssssss-      \n" + 
						"       +yyyyyyyys:---:::////oyyyyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/:---------syyyyysss/       \n" + 
						"       `oyyyyhhhhy/::://///:-/syyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-::::::---:syyyyyyyy+        \n" + 
						"        `oyhhhhhhhy+////::-----/oyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-----::::--/yyyyyyyyy+`        \n" + 
						"         `oyhhhhhhhhs/:----------:+syhhhhhhhhhhhhhhhhhhhhhhhhhhhyo/----------::oyhhhhyyyy+`         \n" + 
						"          `+yhhhhhhhhy+-------------:+oyyhhhhhhhhhhhhhhhhhhhys+/:------------+yhhhhhhyyy/           \n" + 
						"            :yhhhhhhhhys+:-------------::/+ossyyyyyyyyyso+//:-------------:+shhhhhhhyys-            \n" + 
						"             .oyhhhhhhhhyyo:------------------::::::::::::--::-::-------:+yhhhhhhhhyy+`             \n" + 
						"               -syhhhhhhhhhys+:-------------::::::::::::::::::::::::::+syhhhhhhhhhyo.               \n" + 
						"                `:syhhhhhhhhhhys+/:-----::::::::::::::::::::::::::/oshhhhhhhhhhhyo-                 \n" + 
						"                  `:syyhhhhhhhhhhhyso+/:::::::::::::::::::////+osyhhhhhhhhhhhhyo-                   \n" + 
						"                    `:oyyhhhhhhhhhhhhhhhyyssoo++++++++oossyyhdddddhhhhhhhhhhy+-                     \n" + 
						"                      `-/oyyhhhhhhhhhddddddddddddddddddddddddddddddddhhhhyo:.`                      \n" + 
						"                       ``.-/osyhhhhhdddddddddddddddddmmmmmmmddddddddhhs+:.``                        \n" + 
						"                          ``..:/osyhhdddddmmmmmmmmmmmmmmmmmmmmmddhso/-..```                         \n" + 
						"                         ``````..--:+osyhhdddmmmmmmmmmmmdddhyso+:--...`````````                     \n" + 
						"                          `````````....---:://++++++++//::---....``````````                         \n" + 
						"                                     ```````````````````````````                ");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Wonder Woman" + ConsoleColors.PURPLE);
				System.out.println(" ");
				System.out.println("                                                                                                    \n" + 
						"                                        `.:/ossyyyyyyso+/-.                                         \n" + 
						"                                   `:oymNMMMMMMNm+omNMMMMMMNds+-                                    \n" + 
						"                                -odNMMMMMMMMMMMm:  +NMMMMMMMMMMMmy/.                                \n" + 
						"                             -omMMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNh/`                             \n" + 
						"                           :hNMMMMMMMMMMMmhso+/:---::/+sydNMMMMMMMMMMMmo.                           \n" + 
						"                         :hdNdmMMMMMMds/.`               ``-+ymMMMMMMhmmds`                         \n" + 
						"                       .yNM/``omMMdo.`                        `:yNMMh.``dMm/                        \n" + 
						"                      /mMMms/-hNy:`              ``              .ommo-shMMMy`                      \n" + 
						"                  ```-yhhhhhysy:`               .dh`               .oyyyyyyyyo`                     \n" + 
						"  -dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddy:         .dMMd.         .odmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdh.  \n" + 
						"   -dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+       -mMMMMd.       /NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh-   \n" + 
						"    `+hmmmmmmmmmmmmmmmmmmmmmmmmmMMMMMMN/     -mMMMMMMm-     oNMMMMMNNmmmmmmmmmmmmmmmmmmmmmmmmh/`    \n" + 
						"      ``..........````````````..:yMMMMMN/   :mMMMMMMMMm-   oMMMMMNs-...`````````````````....`       \n" + 
						"       +yyyyyyyyyhhhhhhhhyyyyso- `sMMMMMN/ :NMMMMhdMMMMm- sMMMMMN/ `:syyyyyhhhhhhhhyyyyyyyyy-       \n" + 
						"       `yMMMMMMMMMMMMMMMMMMMMMMNo `oMMMMMNsNMMMMs`.yMMMMNyMMMMMN/ .hMMMMMMMMMMMMMMMMMMMMMMN+        \n" + 
						"        `/dNNNMMMMMMMMMMMMMMMMMNNo  oMMMMMMMMMN+   `sMMMMMMMMMN/ `hNNMMMMMMMMMMMMMMMMMNNmy-         \n" + 
						"          `.----------------------   oMMMMMMMm/ `o/  +NMMMMMMN:  `----------------------.           \n" + 
						"             -++++++++++++++++++++/-  +NMMMMd- `yMNo` /NMMMMN: `-/+++++++++++++++++++/`             \n" + 
						"             `sNMMMMMMMMMMMMMMMMMMMNs` +NMMh. .dMMMMs` -dMMm- `yNMMMMMMMMMMMMMMMMMMMN+              \n" + 
						"               /dNMMMMMMMMMMMMMMMMMMMy` /Ns` -mMMMMMMh. .hm- .dMMMMMMMMMMMMMMMMMMMNy-               \n" + 
						"                `:oooooo++:::/+odMMMMMh` -  /NMMMMMMMMm- `. .dMMMMNho//::+ooooooo+-                 \n" + 
						"                  ymmmmmNN/     `oNMMMMd. `oNMMMMmNMMMMN/  -mMMMMN/     `hmmmmmmd-                  \n" + 
						"                  -NMMMMMMN:      /NMMMMd-sMMMMMd-:mMMMMNo:mMMMMm-     `sMMMMMMMy                   \n" + 
						"                   +MMMMMMMN/      :mMMMMNMMMMMh.  .dMMMMMNMMMMd.     `yMMMMMMMd`                   \n" + 
						"                    oMMMMMMMNo`     -mMMMMMMMMs`    `hMMMMMMMMh`     -dMMMMMMMm.                    \n" + 
						"                     +NMMMMNmdd/`    .dMMMMMN+       `yMMMMMMy`    .sNhNMMMMMd.                     \n" + 
						"                      :mMMm:`.smd/`   .dMMMN/          oNMMMs`  `.sNmo`-+NMNs`                      \n" + 
						"                       `sNN//.mMMMms:` `hMm-            /NMs `.+hNMMMy./+Md:                        \n" + 
						"                         -yNMNMMMMMMMmy+:y-             `:s/sdNMMMMMMNNMm+`                         \n" + 
						"                           -yNMMMMMMMMMMMNdhso+//:///+syhmMMMMMMMMMMMMd+`                           \n" + 
						"                             `+dNMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNs:                              \n" + 
						"                                .+yNMMMMMMMMMMMm:  oMMMMMMMMMMMNds:`                                \n" + 
						"                                    -/shNMMMMMMNm/sdNMMMMMNmyo:`                                    \n" + 
						"                                         `-:/+osssssoo+/:.       ");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "The Avengers" + ConsoleColors.PURPLE);
				System.out.println(" ");
				System.out.println("\n" + 
						"                                                       ````````                                      \n" + 
						"                                                     omNNNNNms                                      \n" + 
						"                                                    oNNMMMMMmy                                      \n" + 
						"                                            `-/+ossyNMMMMMMMNy                                      \n" + 
						"                                       `-+ymMNMMMMMMMMMMMMMMNh-                                     \n" + 
						"                               ` ..`-:smNNNNNmNNNNNMMMMMMMMMMNNms-                                  \n" + 
						"                             ````--/shhmmmmmdhyymNNNMMNmMMMMNNMMNNy:                                \n" + 
						"                              ````--.::++o/:-`-+hNNNNNmhMMMMNmmNMNNmy-                              \n" + 
						"                                 ```.``..`` ``-+dNNNNmNhMMMMmy:hmmNNNd+                             \n" + 
						"                               `       ``..-../yhdmmd+dhMMMMNy  :dmNNNms                            \n" + 
						"                              ` `  ``-  ```.-/oyddmho dhNMMMNy   `ymNMMms                           \n" + 
						"                                  `-`   .`.:+oommmhs  dhNMMMNy    `hmNMMm:                          \n" + 
						"                           ` `` ``.` ```.-:+sshdddy   mhNNNNmy     .mNMMNh                          \n" + 
						"                         `  .--`.` .`-`-.syhdhdmdh`   +ddmNNmy      smNNNd.                         \n" + 
						"                           ``.````````.-/oshhhhhy`    yoohdmds      /ddmmh-                         \n" + 
						"                            .`.`...``...-/sssssys+ossshhho+yds      +hhdhy.                         \n" + 
						"                         .     ..-`...--./yhyyhdddmmmmmmmmdso/      hdmmmd`                         \n" + 
						"                                 ::::/+++ohmmmNNNNmNNNNNNNNms:     +mmNNNs                          \n" + 
						"                            ``  ``.:/yhdddmmmysyssyyyydmNdoody    :mNNMMm.                          \n" + 
						"                               ```.-/ymmmmmms         my//mmmy   +mNNMMN:                           \n" + 
						"                               `.-:+ymNNNNNh/         .`-oNNNy :dNNNMMm:                            \n" + 
						"                               `:+ohmmNNNds:`           `-///sdMMMMMNh.                             \n" + 
						"                                ``:hmmNdssh/-```  `.--/o+oydNNMMMMMm/                               \n" + 
						"                              ```./oysdhoyhhhhdhyhhhmNNMMMMMMMMMMh/                                 \n" + 
						"                                 ``.-.:o//omNNNNNNNMMMMMMMMNMNho.                                   \n" + 
						"                                         ``-oydNNNNNMMMNmhs+-                                       \n" + 
						"                                                `.....`                                             \n" + 
						"                                                                ");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewCyanSuperheroes()
			{
				System.out.println("Captain America");
				System.out.println(ConsoleColors.CYAN + " ");
				System.out.println("                                                                              \n" + 
						"                                         `..--:::::::--..`                                          \n" + 
						"                                  `-:+oyhhhddddddddddddddhhyso/:.                                   \n" + 
						"                             `-/oyhhhhddddddddddddddddddddddddddhhy+:.                              \n" + 
						"                          ./oyhhhhhddddddddddddddddddddddddddddddddddhyo:`                          \n" + 
						"                       ./syyhhhhhhhhdddddddddddhhhhddddddddddddddddddddddhs:`                       \n" + 
						"                    `:oyyyyyyyhhhhhhhhyysoo++/////////+++ossyhddddddddddddddho-                     \n" + 
						"                  ./sssyyyyyyyyyyys++//////////////////////////+syhdddddddddddhy/`                  \n" + 
						"                `/osssssssssyso+::-::://///////////////////////////+sydddyhddddhhy/`                \n" + 
						"              `:oooossssssso/-------://///////////////////////////////+syhddddhhhhhs:               \n" + 
						"             .+oooooosooo/-......---::///////++++++++++//////////////////+shhhhyhhhyyo.             \n" + 
						"           `:+oooooooo+/.```......---:/++osyyhhhhddddhhyyyso+//////////////+syyyyyyyyys:            \n" + 
						"          `/oooooooo+/.```````....-:/osyyhhhhhhdddddhhhddddddhyo+/////////////syyyyyssss/`          \n" + 
						"         .+oooooo+++-``````````.-/+sssyyyyhhhhhddhhhhdddddddhhhhdyo////////::-:+sssssssss+`         \n" + 
						"        .+oooooo++/.``````````./+oosssyyyyyhhhhhyhddddddddhhhddddddhs+///:::--..-oooooooss+`        \n" + 
						"       `+ooooo+++/``````````.:++oooosssyyyyyhhhhhhhdddddhhhddddddhhhhhs/:---....`.+oooooooo+`       \n" + 
						"      `+ooo+++++/``````````-/++++oooosssyyhhhhdddo+dddhhhddddhhhyyhhhhyo+-......``./+ooooooo/       \n" + 
						"      :o+++++++/``````  ``:/+++++ooooosyyyyhhhhdy::yddddhhhhhhyyhhhyyssys+......```./++oooooo-      \n" + 
						"     .o++++++++.`````   `:/++++++ooosyyyyyyhhhhh+::/hhhhhhdhhhhhhyyssyysso+-`...````.++o+oooo+`     \n" + 
						"     /++++++++:````` ```:/++++++++osssssyyyyhhhs:/::+hhhhhhhhhhhhyyyyysooos+.`.``````:+++ooooo:     \n" + 
						"    `o++oo++++`````````.//++++++++sssssssyyyyhh:////:yhhhhhhhyyyyyyyssssssso:`````````+++++++++     \n" + 
						"    -ooooo+++:`````````/+++++++++soossssssssyy+://////hhhyyyyyssssyysssssssoo.````````:+++++++o.    \n" + 
						"    /oooo++++.````````.+++++++++oo/-......------/////://::----..-/oysssssssoo:````````.++++++oo:    \n" + 
						"    +ooooo+++`````````:+++++++++ssss+:.```````..-///::-.......:+sssssssssssso/`````````++++oooo/    \n" + 
						"    oooooo+++`````````:+++++++++sssssss+-```````.-:-.```...-/ssssssssssssssso+`````````+ooooooo/    \n" + 
						"    oooooo+++`````````:+++++++++oossssssso/-``..-::-...../ossssssssssssssssss+`````````+ooooooo/    \n" + 
						"    +oooooo++.````````-+++++++++oossssssssy/--:::/::-....syyysssssssyssssssss/`````````oooooooo/    \n" + 
						"    /ooooooo+-````````.+++++++ooossssyyyyys-:::::::/:---.:yyyyyyssssyyyssssss:````````-oooooooo:    \n" + 
						"    -sooooooo/`````````:+++oooooosyyyyyyhh:::::::os+::---.oyyyyyyyyyyyyyyssso.`.``````/ooosssoo.    \n" + 
						"     ossoooooo.````````.+oooosssssyyyhhhho-:::/shhhhyo/----syyyyyyyyyyyyyyss:.......`.oosssssoo     \n" + 
						"     :ssssssso/````````.-oosssssyyyyhhhhy--:oyhhhhhhhhhs+:-/yyyyyhhhhhyyyys/........./ssssssss:     \n" + 
						"     `ossssssss:.........:sssyyyyyyyyhhh/+shhhhhhhhhhhhhhyo/syyhhhhhhhhhyy+.........:sssssssso      \n" + 
						"      -sysyyysss:....----:/syyyyyyyyhhhhyhhhhhhhhhhhhhhhhhhhyhhhhhhhhhhhy/-----....-sssssssss-      \n" + 
						"       +yyyyyyyys:---:::////oyyyyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/:---------syyyyysss/       \n" + 
						"       `oyyyyhhhhy/::://///:-/syyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-::::::---:syyyyyyyy+        \n" + 
						"        `oyhhhhhhhy+////::-----/oyyyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/-----::::--/yyyyyyyyy+`        \n" + 
						"         `oyhhhhhhhhs/:----------:+syhhhhhhhhhhhhhhhhhhhhhhhhhhhyo/----------::oyhhhhyyyy+`         \n" + 
						"          `+yhhhhhhhhy+-------------:+oyyhhhhhhhhhhhhhhhhhhhys+/:------------+yhhhhhhyyy/           \n" + 
						"            :yhhhhhhhhys+:-------------::/+ossyyyyyyyyyso+//:-------------:+shhhhhhhyys-            \n" + 
						"             .oyhhhhhhhhyyo:------------------::::::::::::--::-::-------:+yhhhhhhhhyy+`             \n" + 
						"               -syhhhhhhhhhys+:-------------::::::::::::::::::::::::::+syhhhhhhhhhyo.               \n" + 
						"                `:syhhhhhhhhhhys+/:-----::::::::::::::::::::::::::/oshhhhhhhhhhhyo-                 \n" + 
						"                  `:syyhhhhhhhhhhhyso+/:::::::::::::::::::////+osyhhhhhhhhhhhhyo-                   \n" + 
						"                    `:oyyhhhhhhhhhhhhhhhyyssoo++++++++oossyyhdddddhhhhhhhhhhy+-                     \n" + 
						"                      `-/oyyhhhhhhhhhddddddddddddddddddddddddddddddddhhhhyo:.`                      \n" + 
						"                       ``.-/osyhhhhhdddddddddddddddddmmmmmmmddddddddhhs+:.``                        \n" + 
						"                          ``..:/osyhhdddddmmmmmmmmmmmmmmmmmmmmmddhso/-..```                         \n" + 
						"                         ``````..--:+osyhhdddmmmmmmmmmmmdddhyso+:--...`````````                     \n" + 
						"                          `````````....---:://++++++++//::---....``````````                         \n" + 
						"                                     ```````````````````````````                ");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Wonder Woman" + ConsoleColors.CYAN);
				System.out.println(" ");
				System.out.println("                                                                                                    \n" + 
						"                                        `.:/ossyyyyyyso+/-.                                         \n" + 
						"                                   `:oymNMMMMMMNm+omNMMMMMMNds+-                                    \n" + 
						"                                -odNMMMMMMMMMMMm:  +NMMMMMMMMMMMmy/.                                \n" + 
						"                             -omMMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNh/`                             \n" + 
						"                           :hNMMMMMMMMMMMmhso+/:---::/+sydNMMMMMMMMMMMmo.                           \n" + 
						"                         :hdNdmMMMMMMds/.`               ``-+ymMMMMMMhmmds`                         \n" + 
						"                       .yNM/``omMMdo.`                        `:yNMMh.``dMm/                        \n" + 
						"                      /mMMms/-hNy:`              ``              .ommo-shMMMy`                      \n" + 
						"                  ```-yhhhhhysy:`               .dh`               .oyyyyyyyyo`                     \n" + 
						"  -dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddy:         .dMMd.         .odmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdh.  \n" + 
						"   -dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+       -mMMMMd.       /NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh-   \n" + 
						"    `+hmmmmmmmmmmmmmmmmmmmmmmmmmMMMMMMN/     -mMMMMMMm-     oNMMMMMNNmmmmmmmmmmmmmmmmmmmmmmmmh/`    \n" + 
						"      ``..........````````````..:yMMMMMN/   :mMMMMMMMMm-   oMMMMMNs-...`````````````````....`       \n" + 
						"       +yyyyyyyyyhhhhhhhhyyyyso- `sMMMMMN/ :NMMMMhdMMMMm- sMMMMMN/ `:syyyyyhhhhhhhhyyyyyyyyy-       \n" + 
						"       `yMMMMMMMMMMMMMMMMMMMMMMNo `oMMMMMNsNMMMMs`.yMMMMNyMMMMMN/ .hMMMMMMMMMMMMMMMMMMMMMMN+        \n" + 
						"        `/dNNNMMMMMMMMMMMMMMMMMNNo  oMMMMMMMMMN+   `sMMMMMMMMMN/ `hNNMMMMMMMMMMMMMMMMMNNmy-         \n" + 
						"          `.----------------------   oMMMMMMMm/ `o/  +NMMMMMMN:  `----------------------.           \n" + 
						"             -++++++++++++++++++++/-  +NMMMMd- `yMNo` /NMMMMN: `-/+++++++++++++++++++/`             \n" + 
						"             `sNMMMMMMMMMMMMMMMMMMMNs` +NMMh. .dMMMMs` -dMMm- `yNMMMMMMMMMMMMMMMMMMMN+              \n" + 
						"               /dNMMMMMMMMMMMMMMMMMMMy` /Ns` -mMMMMMMh. .hm- .dMMMMMMMMMMMMMMMMMMMNy-               \n" + 
						"                `:oooooo++:::/+odMMMMMh` -  /NMMMMMMMMm- `. .dMMMMNho//::+ooooooo+-                 \n" + 
						"                  ymmmmmNN/     `oNMMMMd. `oNMMMMmNMMMMN/  -mMMMMN/     `hmmmmmmd-                  \n" + 
						"                  -NMMMMMMN:      /NMMMMd-sMMMMMd-:mMMMMNo:mMMMMm-     `sMMMMMMMy                   \n" + 
						"                   +MMMMMMMN/      :mMMMMNMMMMMh.  .dMMMMMNMMMMd.     `yMMMMMMMd`                   \n" + 
						"                    oMMMMMMMNo`     -mMMMMMMMMs`    `hMMMMMMMMh`     -dMMMMMMMm.                    \n" + 
						"                     +NMMMMNmdd/`    .dMMMMMN+       `yMMMMMMy`    .sNhNMMMMMd.                     \n" + 
						"                      :mMMm:`.smd/`   .dMMMN/          oNMMMs`  `.sNmo`-+NMNs`                      \n" + 
						"                       `sNN//.mMMMms:` `hMm-            /NMs `.+hNMMMy./+Md:                        \n" + 
						"                         -yNMNMMMMMMMmy+:y-             `:s/sdNMMMMMMNNMm+`                         \n" + 
						"                           -yNMMMMMMMMMMMNdhso+//:///+syhmMMMMMMMMMMMMd+`                           \n" + 
						"                             `+dNMMMMMMMMMMMMMMMhdhdMMMMMMMMMMMMMMMNs:                              \n" + 
						"                                .+yNMMMMMMMMMMMm:  oMMMMMMMMMMMNds:`                                \n" + 
						"                                    -/shNMMMMMMNm/sdNMMMMMNmyo:`                                    \n" + 
						"                                         `-:/+osssssoo+/:.       ");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "The Avengers" + ConsoleColors.CYAN);
				System.out.println(" ");
				System.out.println("\n" + 
						"                                                       ````````                                      \n" + 
						"                                                     omNNNNNms                                      \n" + 
						"                                                    oNNMMMMMmy                                      \n" + 
						"                                            `-/+ossyNMMMMMMMNy                                      \n" + 
						"                                       `-+ymMNMMMMMMMMMMMMMMNh-                                     \n" + 
						"                               ` ..`-:smNNNNNmNNNNNMMMMMMMMMMNNms-                                  \n" + 
						"                             ````--/shhmmmmmdhyymNNNMMNmMMMMNNMMNNy:                                \n" + 
						"                              ````--.::++o/:-`-+hNNNNNmhMMMMNmmNMNNmy-                              \n" + 
						"                                 ```.``..`` ``-+dNNNNmNhMMMMmy:hmmNNNd+                             \n" + 
						"                               `       ``..-../yhdmmd+dhMMMMNy  :dmNNNms                            \n" + 
						"                              ` `  ``-  ```.-/oyddmho dhNMMMNy   `ymNMMms                           \n" + 
						"                                  `-`   .`.:+oommmhs  dhNMMMNy    `hmNMMm:                          \n" + 
						"                           ` `` ``.` ```.-:+sshdddy   mhNNNNmy     .mNMMNh                          \n" + 
						"                         `  .--`.` .`-`-.syhdhdmdh`   +ddmNNmy      smNNNd.                         \n" + 
						"                           ``.````````.-/oshhhhhy`    yoohdmds      /ddmmh-                         \n" + 
						"                            .`.`...``...-/sssssys+ossshhho+yds      +hhdhy.                         \n" + 
						"                         .     ..-`...--./yhyyhdddmmmmmmmmdso/      hdmmmd`                         \n" + 
						"                                 ::::/+++ohmmmNNNNmNNNNNNNNms:     +mmNNNs                          \n" + 
						"                            ``  ``.:/yhdddmmmysyssyyyydmNdoody    :mNNMMm.                          \n" + 
						"                               ```.-/ymmmmmms         my//mmmy   +mNNMMN:                           \n" + 
						"                               `.-:+ymNNNNNh/         .`-oNNNy :dNNNMMm:                            \n" + 
						"                               `:+ohmmNNNds:`           `-///sdMMMMMNh.                             \n" + 
						"                                ``:hmmNdssh/-```  `.--/o+oydNNMMMMMm/                               \n" + 
						"                              ```./oysdhoyhhhhdhyhhhmNNMMMMMMMMMMh/                                 \n" + 
						"                                 ``.-.:o//omNNNNNNNMMMMMMMMNMNho.                                   \n" + 
						"                                         ``-oydNNNNNMMMNmhs+-                                       \n" + 
						"                                                `.....`                                             \n" + 
						"                                                                ");
				System.out.println(ConsoleColors.RESET + " ");
			}
	
		public static void viewGreenFlags()
			{
				System.out.println("American Flag");
				System.out.println(ConsoleColors.GREEN + " ");
				System.out.println("\n" + 
						"MMMNMMNNNNNNNNNNNNNmNNNNNNNmmmmmmmmmmmmmmmmdmmmmddddddddddddddddddddddddddddddddddmmmddddddddmmmmmmm\n" + 
						"MMdohNNNNNh/ymNNNmy:ymmmmms:smmmmms:smmmmds-ymmmdhhhddddhhhhhhhhhhhhhhhhhhhdhddddddddddhhddddddmmmmm\n" + 
						"MNmmmNNhNNmmdNNhmmdddmmymmhdhmdsmmhdhmdsddhhhdds/::::::::::::://:://///:://////////////////////+++//\n" + 
						"NNNNNNy/ommmmms/+dmmmmo/ommdddo:odmmmd+:+dddddd+.```````````......``````.................`..........\n" + 
						"NNdohmNmmmh+ymmmmdy/ymmmmdy/yddmmdy/yddddhs/sddo::-------------::-----:::----::--:::::::::::::::::::\n" + 
						"NNdyhNNmmmhsymmdmmyoymmdmmyoymddddyoyddhdds+yddhyyyyyyyyysssyyyyyyyyyhhyyyyyyyyyyyyyyhhhhyyyyhhhhhhh\n" + 
						"NNNNNmy:smmmmmy-odddmds-sdmmmds-oddddho.ohhddddhyyyyyyysyssyyyyysssyyyyyyyyyyyyyyyyyyhhhhhhyyhhhhhhh\n" + 
						"NNmhmmddhmmymmddhmmymmhdhmdymdhhyddsddyyyhhsdhh+........................................--.....---..\n" + 
						"Nmy/ommmmms/+dmmmmo:+ddddd+:+ddddd/-+ddhhh/-+hd/``````````  `````````````````````````````````````.``\n" + 
						"NNmNmmh+ydmmmmy+ymmmddy/sddddds/sdddhhs:shhhhhdo/////::::::::::///:::::::::::::::///////////////////\n" + 
						"mmmmmmhsymmdmmyoymmdddy+sddhdds+sddhdds+shhyhhhysyyyssssssssssssyssssssssssssssysyyyyyyyyyyyyyyyyhhh\n" + 
						"mmy:smmmmds-odmmmds-odddddo-oddddho.oddhhy+.ohhysssssssooooosooosoosssoooooooooosssssssssssssssssyyy\n" + 
						"mmddhmmymmhhhmmymdhhyddsddhhyddsddyyyhdshhsyyhh/`````               ``          ````````````````````\n" + 
						"Nmmmmms:+dmmddo:+ddddh+-/ddddh+-+ddhhh/./hhhhhh/````                ```           ````` ````````````\n" + 
						"mmhoymmmddy/yddmdds/sddddds/shhddhs:shhhhho:shhs++++++//++++++////++++++++//+++++++++++++++++++++ooo\n" + 
						"mmdsymmmddyosdddddy+sddddds+sddddds+sdhhhho+shhyssssssossssssssssssssssssssoosssysssyyyyyyyyyysssyyy\n" + 
						"hhhhyyyssssyyssssssssssssssssssssssssssssooooooo++++++/++++++++//++++++++++/++++o++++o+++++++++++ooo\n" + 
						":----...........`````````````````````````` ```````                    ``       `````````````````````\n" + 
						"-----.............```````````````````````   ```` `                       ``  ``````````````````````.\n" + 
						"dddddhhhhhhhhhhhyyyyyyyyyyysysssssyssssssossssssssoooooooosssoooooooooooosssooosssssssssssssyyssyyyy\n" + 
						"dmdddddddddhhhhhhhhhyyyyyyyyyyyyyyyyyyyyssssssyyysssssssssssssssssssssssssssssssssssyyyyyyyyhhyyyyyh\n" + 
						"ssooooo++oo+++++++++//////+++////////////::////////::::::::///::::::::::://::::::::/:///////+//////+\n" + 
						":---..-............````.......`````..`````````````````   ```````  `` ``    `   ```````````..``````..\n" + 
						":/::::-::::::------------------------.....................................................--.....---\n" + 
						"mmmmdddddddddhddhhhdhhhdddddhhhhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyyysssssyssyyyyyyysyyyyyyyyyyyyyhhhhhhh\n" + 
						"mmmmmddddddddddddddhddhdddddddddddhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyssssyyyyyyyyyyyyyyyyyyyyyyyyhhyyhhh\n" + 
						"ssoo+++++++/++++/////////////////:/://::::---:::::-------::::-------------------::--:::::---:::::::/\n" + 
						"+++//////++/::::::--------------......`````````````````````````````````````````````.....````........\n" + 
						"yysssosssyysssso+ooo++++++++++///////////:::::::::::::::::::::::::::::::://::///:/:::::////////////+\n" + 
						"NNmmmmmmNNNNNNNmmmmmmmmmmddmmmmmmddddddddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdhhhhhhhddddddddddmmm\n" + 
						"NNNNNNNNNNNNNNNNNNNNmmmmmmmmmmmmmmmmmmddmdddddddddhdhhhhdddddddhhhhhhhhhhhhhhhdddddddddddddddyysyyhd");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Canadian Flag" + ConsoleColors.GREEN);
				System.out.println(" ");
				System.out.println("   \n" + 
						"  ```   ``  `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+    `   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                 +`                `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :y+                `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:           /+/-.syy:.:+o           `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:           .yyyyyyyyyyy/           `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"   ``  ```  `` +yyyyyyyyyyyyyy:       ``   oyyyyyyyyyy`   .       `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   .`  -s:` :yyyyyyyyy+  -o+  `.`  `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:   /ysooyys/`syyyyyyyy--oyysosyo   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `syyyyyyyssyyyyyyyysyyyyyyyy-   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy: `/syyyyyyyyyyyyyyyyyyyyyyyyyyyyo- `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `:oyyyyyyyyyyyyyyyyyyyyyyys/.   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"   ``   ``  ```+yyyyyyyyyyyyyy:      `:oyyyyyyyyyyyyyyyyys/.      `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:         +yyyyyyssyyyyyyys.        `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:        .--..`` :. ```..---        `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"``   ``  ```  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ``   \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `://////////////-                                   `/////////////////-");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Irish Flag" + ConsoleColors.GREEN);
				System.out.println(" ");
				System.out.println("\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewPurpleFlags()
			{
				System.out.println("American Flag");
				System.out.println(ConsoleColors.PURPLE + " ");
				System.out.println("\n" + 
						"MMMNMMNNNNNNNNNNNNNmNNNNNNNmmmmmmmmmmmmmmmmdmmmmddddddddddddddddddddddddddddddddddmmmddddddddmmmmmmm\n" + 
						"MMdohNNNNNh/ymNNNmy:ymmmmms:smmmmms:smmmmds-ymmmdhhhddddhhhhhhhhhhhhhhhhhhhdhddddddddddhhddddddmmmmm\n" + 
						"MNmmmNNhNNmmdNNhmmdddmmymmhdhmdsmmhdhmdsddhhhdds/::::::::::::://:://///:://////////////////////+++//\n" + 
						"NNNNNNy/ommmmms/+dmmmmo/ommdddo:odmmmd+:+dddddd+.```````````......``````.................`..........\n" + 
						"NNdohmNmmmh+ymmmmdy/ymmmmdy/yddmmdy/yddddhs/sddo::-------------::-----:::----::--:::::::::::::::::::\n" + 
						"NNdyhNNmmmhsymmdmmyoymmdmmyoymddddyoyddhdds+yddhyyyyyyyyysssyyyyyyyyyhhyyyyyyyyyyyyyyhhhhyyyyhhhhhhh\n" + 
						"NNNNNmy:smmmmmy-odddmds-sdmmmds-oddddho.ohhddddhyyyyyyysyssyyyyysssyyyyyyyyyyyyyyyyyyhhhhhhyyhhhhhhh\n" + 
						"NNmhmmddhmmymmddhmmymmhdhmdymdhhyddsddyyyhhsdhh+........................................--.....---..\n" + 
						"Nmy/ommmmms/+dmmmmo:+ddddd+:+ddddd/-+ddhhh/-+hd/``````````  `````````````````````````````````````.``\n" + 
						"NNmNmmh+ydmmmmy+ymmmddy/sddddds/sdddhhs:shhhhhdo/////::::::::::///:::::::::::::::///////////////////\n" + 
						"mmmmmmhsymmdmmyoymmdddy+sddhdds+sddhdds+shhyhhhysyyyssssssssssssyssssssssssssssysyyyyyyyyyyyyyyyyhhh\n" + 
						"mmy:smmmmds-odmmmds-odddddo-oddddho.oddhhy+.ohhysssssssooooosooosoosssoooooooooosssssssssssssssssyyy\n" + 
						"mmddhmmymmhhhmmymdhhyddsddhhyddsddyyyhdshhsyyhh/`````               ``          ````````````````````\n" + 
						"Nmmmmms:+dmmddo:+ddddh+-/ddddh+-+ddhhh/./hhhhhh/````                ```           ````` ````````````\n" + 
						"mmhoymmmddy/yddmdds/sddddds/shhddhs:shhhhho:shhs++++++//++++++////++++++++//+++++++++++++++++++++ooo\n" + 
						"mmdsymmmddyosdddddy+sddddds+sddddds+sdhhhho+shhyssssssossssssssssssssssssssoosssysssyyyyyyyyyysssyyy\n" + 
						"hhhhyyyssssyyssssssssssssssssssssssssssssooooooo++++++/++++++++//++++++++++/++++o++++o+++++++++++ooo\n" + 
						":----...........`````````````````````````` ```````                    ``       `````````````````````\n" + 
						"-----.............```````````````````````   ```` `                       ``  ``````````````````````.\n" + 
						"dddddhhhhhhhhhhhyyyyyyyyyyysysssssyssssssossssssssoooooooosssoooooooooooosssooosssssssssssssyyssyyyy\n" + 
						"dmdddddddddhhhhhhhhhyyyyyyyyyyyyyyyyyyyyssssssyyysssssssssssssssssssssssssssssssssssyyyyyyyyhhyyyyyh\n" + 
						"ssooooo++oo+++++++++//////+++////////////::////////::::::::///::::::::::://::::::::/:///////+//////+\n" + 
						":---..-............````.......`````..`````````````````   ```````  `` ``    `   ```````````..``````..\n" + 
						":/::::-::::::------------------------.....................................................--.....---\n" + 
						"mmmmdddddddddhddhhhdhhhdddddhhhhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyyysssssyssyyyyyyysyyyyyyyyyyyyyhhhhhhh\n" + 
						"mmmmmddddddddddddddhddhdddddddddddhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyssssyyyyyyyyyyyyyyyyyyyyyyyyhhyyhhh\n" + 
						"ssoo+++++++/++++/////////////////:/://::::---:::::-------::::-------------------::--:::::---:::::::/\n" + 
						"+++//////++/::::::--------------......`````````````````````````````````````````````.....````........\n" + 
						"yysssosssyysssso+ooo++++++++++///////////:::::::::::::::::::::::::::::::://::///:/:::::////////////+\n" + 
						"NNmmmmmmNNNNNNNmmmmmmmmmmddmmmmmmddddddddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdhhhhhhhddddddddddmmm\n" + 
						"NNNNNNNNNNNNNNNNNNNNmmmmmmmmmmmmmmmmmmddmdddddddddhdhhhhdddddddhhhhhhhhhhhhhhhdddddddddddddddyysyyhd");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Canadian Flag" + ConsoleColors.PURPLE);
				System.out.println(" ");
				System.out.println("   \n" + 
						"  ```   ``  `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+    `   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                 +`                `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :y+                `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:           /+/-.syy:.:+o           `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:           .yyyyyyyyyyy/           `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"   ``  ```  `` +yyyyyyyyyyyyyy:       ``   oyyyyyyyyyy`   .       `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   .`  -s:` :yyyyyyyyy+  -o+  `.`  `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:   /ysooyys/`syyyyyyyy--oyysosyo   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `syyyyyyyssyyyyyyyysyyyyyyyy-   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy: `/syyyyyyyyyyyyyyyyyyyyyyyyyyyyo- `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `:oyyyyyyyyyyyyyyyyyyyyyyys/.   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"   ``   ``  ```+yyyyyyyyyyyyyy:      `:oyyyyyyyyyyyyyyyyys/.      `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:         +yyyyyyssyyyyyyys.        `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:        .--..`` :. ```..---        `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"``   ``  ```  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ``   \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `://////////////-                                   `/////////////////-");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Irish Flag" + ConsoleColors.PURPLE);
				System.out.println(" ");
				System.out.println("\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewCyanFlags()
			{
				System.out.println("American Flag");
				System.out.println(ConsoleColors.CYAN + " ");
				System.out.println("\n" + 
						"MMMNMMNNNNNNNNNNNNNmNNNNNNNmmmmmmmmmmmmmmmmdmmmmddddddddddddddddddddddddddddddddddmmmddddddddmmmmmmm\n" + 
						"MMdohNNNNNh/ymNNNmy:ymmmmms:smmmmms:smmmmds-ymmmdhhhddddhhhhhhhhhhhhhhhhhhhdhddddddddddhhddddddmmmmm\n" + 
						"MNmmmNNhNNmmdNNhmmdddmmymmhdhmdsmmhdhmdsddhhhdds/::::::::::::://:://///:://////////////////////+++//\n" + 
						"NNNNNNy/ommmmms/+dmmmmo/ommdddo:odmmmd+:+dddddd+.```````````......``````.................`..........\n" + 
						"NNdohmNmmmh+ymmmmdy/ymmmmdy/yddmmdy/yddddhs/sddo::-------------::-----:::----::--:::::::::::::::::::\n" + 
						"NNdyhNNmmmhsymmdmmyoymmdmmyoymddddyoyddhdds+yddhyyyyyyyyysssyyyyyyyyyhhyyyyyyyyyyyyyyhhhhyyyyhhhhhhh\n" + 
						"NNNNNmy:smmmmmy-odddmds-sdmmmds-oddddho.ohhddddhyyyyyyysyssyyyyysssyyyyyyyyyyyyyyyyyyhhhhhhyyhhhhhhh\n" + 
						"NNmhmmddhmmymmddhmmymmhdhmdymdhhyddsddyyyhhsdhh+........................................--.....---..\n" + 
						"Nmy/ommmmms/+dmmmmo:+ddddd+:+ddddd/-+ddhhh/-+hd/``````````  `````````````````````````````````````.``\n" + 
						"NNmNmmh+ydmmmmy+ymmmddy/sddddds/sdddhhs:shhhhhdo/////::::::::::///:::::::::::::::///////////////////\n" + 
						"mmmmmmhsymmdmmyoymmdddy+sddhdds+sddhdds+shhyhhhysyyyssssssssssssyssssssssssssssysyyyyyyyyyyyyyyyyhhh\n" + 
						"mmy:smmmmds-odmmmds-odddddo-oddddho.oddhhy+.ohhysssssssooooosooosoosssoooooooooosssssssssssssssssyyy\n" + 
						"mmddhmmymmhhhmmymdhhyddsddhhyddsddyyyhdshhsyyhh/`````               ``          ````````````````````\n" + 
						"Nmmmmms:+dmmddo:+ddddh+-/ddddh+-+ddhhh/./hhhhhh/````                ```           ````` ````````````\n" + 
						"mmhoymmmddy/yddmdds/sddddds/shhddhs:shhhhho:shhs++++++//++++++////++++++++//+++++++++++++++++++++ooo\n" + 
						"mmdsymmmddyosdddddy+sddddds+sddddds+sdhhhho+shhyssssssossssssssssssssssssssoosssysssyyyyyyyyyysssyyy\n" + 
						"hhhhyyyssssyyssssssssssssssssssssssssssssooooooo++++++/++++++++//++++++++++/++++o++++o+++++++++++ooo\n" + 
						":----...........`````````````````````````` ```````                    ``       `````````````````````\n" + 
						"-----.............```````````````````````   ```` `                       ``  ``````````````````````.\n" + 
						"dddddhhhhhhhhhhhyyyyyyyyyyysysssssyssssssossssssssoooooooosssoooooooooooosssooosssssssssssssyyssyyyy\n" + 
						"dmdddddddddhhhhhhhhhyyyyyyyyyyyyyyyyyyyyssssssyyysssssssssssssssssssssssssssssssssssyyyyyyyyhhyyyyyh\n" + 
						"ssooooo++oo+++++++++//////+++////////////::////////::::::::///::::::::::://::::::::/:///////+//////+\n" + 
						":---..-............````.......`````..`````````````````   ```````  `` ``    `   ```````````..``````..\n" + 
						":/::::-::::::------------------------.....................................................--.....---\n" + 
						"mmmmdddddddddhddhhhdhhhdddddhhhhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyyysssssyssyyyyyyysyyyyyyyyyyyyyhhhhhhh\n" + 
						"mmmmmddddddddddddddhddhdddddddddddhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyssssyyyyyyyyyyyyyyyyyyyyyyyyhhyyhhh\n" + 
						"ssoo+++++++/++++/////////////////:/://::::---:::::-------::::-------------------::--:::::---:::::::/\n" + 
						"+++//////++/::::::--------------......`````````````````````````````````````````````.....````........\n" + 
						"yysssosssyysssso+ooo++++++++++///////////:::::::::::::::::::::::::::::::://::///:/:::::////////////+\n" + 
						"NNmmmmmmNNNNNNNmmmmmmmmmmddmmmmmmddddddddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdhhhhhhhddddddddddmmm\n" + 
						"NNNNNNNNNNNNNNNNNNNNmmmmmmmmmmmmmmmmmmddmdddddddddhdhhhhdddddddhhhhhhhhhhhhhhhdddddddddddddddyysyyhd");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Canadian Flag" + ConsoleColors.CYAN);
				System.out.println(" ");
				System.out.println("   \n" + 
						"  ```   ``  `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+    `   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                 +`                `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :y+                `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:           /+/-.syy:.:+o           `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:           .yyyyyyyyyyy/           `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"   ``  ```  `` +yyyyyyyyyyyyyy:       ``   oyyyyyyyyyy`   .       `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   .`  -s:` :yyyyyyyyy+  -o+  `.`  `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:   /ysooyys/`syyyyyyyy--oyysosyo   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `syyyyyyyssyyyyyyyysyyyyyyyy-   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy: `/syyyyyyyyyyyyyyyyyyyyyyyyyyyyo- `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:   `:oyyyyyyyyyyyyyyyyyyyyyyys/.   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"   ``   ``  ```+yyyyyyyyyyyyyy:      `:oyyyyyyyyyyyyyyyyys/.      `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:         +yyyyyyssyyyyyyys.        `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:        .--..`` :. ```..---        `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"  ```  ```  `` +yyyyyyyyyyyyyy:                :.                 `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ```  \n" + 
						"``   ``  ```  `+yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+ ``  ```  ``   \n" + 
						"  ```  ``   `` +yyyyyyyyyyyyyy:                                   `yyyyyyyyyyyyyyyyy+`  ``   ``   ``\n" + 
						"``   ``   ``  `://////////////-                                   `/////////////////-");
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE + "Irish Flag" + ConsoleColors.CYAN);
				System.out.println(" ");
				System.out.println("\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:                                -oooooooooooooooooooooooooooooooos\n" + 
						"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy/................................:oooooooooooooooooooooooooooooooos");
				System.out.println(ConsoleColors.RESET + " ");
			}
					
		public static void viewGreenDisney()
			{
				System.out.println("Mickey Mouse");
				System.out.println(ConsoleColors.GREEN + "                                       ```                                                          \n" + 
						"                                  `-/oyhhhyso/-                                                     \n" + 
						"                               `:shhdhddddddddhs:                                                   \n" + 
						"                              :yhhddddddddddddddh/                                                  \n" + 
						"                             :yhdddddddddddddddddd.                                                 \n" + 
						"                             yhhdddddddddddddddddd-                                                 \n" + 
						"                             hhddddddddddddddddddy`                                                 \n" + 
						"                             shddddddddddddmddddy.                                                  \n" + 
						"                             `sdddddddddmdddddmmdhyyso/:.`                                          \n" + 
						"                    `-/osyyso:-:shddddmmmmdddmmdo-...-/oyho-`                                       \n" + 
						"                  `/yhhhhhhdhdhs-.-+dmmmmmmdmmd-        `:sso-                                      \n" + 
						"                 -shhhhhhhhdddddh:.ymmmmmmmmmds         .yy:`y/                                     \n" + 
						"                .yhhhhhhhdddddddddhmmmmmmmmmmdo         /mmd-mm:                                    \n" + 
						"                ohhhhhddddddddddddmmmmmmmmmmmmh`        /mmmhmmh`     `+yys-                        \n" + 
						"                yhhhhdddddddddddmmmmmho/-.--+yd/        :mmmdhmm-.-.``ymmmmh                        \n" + 
						"                shhhdddddddddddddmmy:`       `:y`       .mmmh-ddo+//osmmmmmo                        \n" + 
						"                /hhdddddddddddddmms`     `..`  ./`       +dh:./.`   +mmmmdo`                        \n" + 
						"                `+hdddddddddddddhm/     :+/.`   `:`       .. `     `dmmms-                          \n" + 
						"                 `:yddddddddddy:.d/     ``:o-`    `                 .:+d`                           \n" + 
						"                   `/oyhhhhyo:`  :y.       .yy/.                    `-h/                            \n" + 
						"                      `....`      :s:`      .dmdy+-.`           `.-/os:                             \n" + 
						"                                   .+o:`  `  yyhmmmdhs+/:-::///+++/-.                               \n" + 
						"                                     ./o+:-+`//`-ohsdmmmoommmdy+:.`                                 \n" + 
						"                                       `-ddmh/+/.`.`+mh+/mmmmmNNmdhs/-.`                            \n" + 
						"                                        +mmmmmhs++++o++hmNNmNNNmNNNNNm++/-`                         \n" + 
						"                                        hmmmmmmNmdhhdmNNmNNNNNNNNNNNmo` .:o.                        \n" + 
						"                                       `mmmmmhhmNmNNNNNNmNNNNNNNNNNd/.oyy+-s.                       \n" + 
						"                                       -mmmmm+`:dmNNNNNNNNNmmNNNNdo. sNNNNo-y                       \n" + 
						"                                       +mmmmm. :h:+syhdddmmddhyo//:-.hNNNNm`y.                      \n" + 
						"                                       smmmmd `d-    ``...-..` -hNNNdhNNNNm`s/                      \n" + 
						"                                       dmmmmd :y               hNNNNNmommd/ y/:.`                   \n" + 
						"                                      `mmmmmmosy              `mNNNNNm`.-. `h`.y`                   \n" + 
						"                                       dmmmmmmmm.              sNNNNNo    `o:.s.                    \n" + 
						"                                       :hmmmmmmms`             `/hdh+`  `:o--o.                     \n" + 
						"                                        `:/+ooosso.               `   `.:/./+`                      \n" + 
						"                           ``                 `+:oy:..`            `.:o/.:+-                        \n" + 
						"                      `.:/++++/-`             `d+--/mdhs/-`.....-:+os+/sd/                          \n" + 
						"                    `:syo:`` `.:o/`            .+oshNNNNmooyy+hm++yydmNNh                           \n" + 
						"                   .s/..:o+.    `/s.            `:dNNNNmy:--odmo   hNNNN+                           \n" + 
						"                   o/     :y:     .s.          .ommNNNd/.-:/+my`  `mNNNN:                           \n" + 
						"                   h`      -h-     -s        `+dmNNNmy.     oh.   -NNNNN.                           \n" + 
						"                   h`       :y      o-    `.+hmmNmmh/`    `/y.    /NNNNN-      ``````               \n" + 
						"                   s:        s      .y/:-/sdmmmmmmo`     `oy.`.:/+syhhhhs+o/-///////++/.`           \n" + 
						"                   -s`       /`      /o.:smmmmmmy-      .so``o:.`        `+y:.       `-+s-          \n" + 
						"           .        /+`      ..      `+:``/mmds-      `/y/:/ss.``````.-:++/`            :d`         \n" + 
						"           -`        ++`      -`.       .+`ss.      `:sds+-.`.//++////:.`               .d          \n" + 
						"           `--`       :o.      `-`       .+y.    `.+o/h/`                              .y:          \n" + 
						"             `-:-``    .o/`     `/.       `+/`.:/+/. :y                             ``/o-           \n" + 
						"                `-----.``:s/` ``.+s/.       yo/-`    .h-                         `.///-             \n" + 
						"                     `.-::+dh+//:` `/+.    `y.        .oo:-``````````````````.-//::`                \n" + 
						"                           `:/-`     .h. `.o/           `-/////+++++++++///::-.`                    \n" + 
						"                              -:/:.``-ds+//.                                                        \n" + 
						"                                 `-:::.`                           ");
				System.out.println(ConsoleColors.RESET + " ");
				System.out.println("Donald Duck");
				System.out.println(ConsoleColors.GREEN + "   --.:                .:++o+`                                        \n" + 
						"                                -. ..       ....`.:+yyyyyyhhs/`                                     \n" + 
						"                                `:  /.     `yyyyyyyyyyyyyy/+dhy`                                    \n" + 
						"                               --`   +      `/oyo/hsyhmd/`  `s``                                    \n" + 
						"                            -::`     /``++:   :+.``.-..s..`  .                                      \n" + 
						"                          :/-.. ....`.: ++o+ .+.  .--.-:`-:`                                        \n" + 
						"                         /::-.```  `  + `/y+/ys  -.```:- `:.                                        \n" + 
						"                         -:......./- `y:  `+//+--..::-.  :.                                         \n" + 
						"                          `       yo.oys`  .o://+-dNy/:::.          ``                              \n" + 
						"                                  hyyyoss` :s+/+++ys+o+/`         .-`:`                             \n" + 
						"                                  +s++syyo`/o:/o+o+:-.`      ....-. ./                              \n" + 
						"                                  `syyyyyyss++os/-`       `.:.`   :.`                               \n" + 
						"                                   `syyhhho:-oyy:`   `.-//..`..`  ./                                \n" + 
						"                                    `yhdhd+shyssysssy/oyy` ``  ` ``-:                               \n" + 
						"                                    `yyhhdhyssyyyyyys:yyy:+s:-.``--::-                              \n" + 
						"                                    `/hyydyhyyyyyyyys:oyyy+.  `.-..:-/                              \n" + 
						"                                     :yyyhyhyyyyhhhhh+//-.    ``-.-:.-                              \n" + 
						"                                     ooyyyyssyyyyyydy```.-::---./   `                               \n" + 
						"                                     :+yyyh/:syyyyyh+      `.  .-                                   \n" + 
						"                                      +yyyys+syyyys:           /-                                   \n" + 
						"                                       :ssyyyysso:`          `:-                                    \n" + 
						"                                         .//:--`            `-`                                     \n" + 
						"                                     ````-///:.``        `.:+:                                      \n" + 
						"                                  .::////s///++++/::----:/+::o-                                     \n" + 
						"                                  /::::::/+///::/+.  `````-+::o                                     \n" + 
						"                                 -/:://///:::///+/`   .///+:/+/--.`                                 \n" + 
						"                                 `.---------...`      ./:::///:::////:-                             \n" + 
						"                                                       .+/::::::::::::/:                            \n" + 
						"                                                         :+/:::::::::+.                             \n" + 
						"                                                          `:/+//+/:::.    ");
				System.out.println(ConsoleColors.RESET + " ");
				System.out.println("Goofy");
				System.out.println(ConsoleColors.GREEN + "                                                                                                    \n" + 
						"                                                                   .--`                             \n" + 
						"                 ://///-                                          +.`.:/-                           \n" + 
						"                :/-----::          `  `.`                         /:   `/-      `.-:::::::::::--    \n" + 
						"                /:----::o.        -` -.                            /:    o.::://:-````        ``+   \n" + 
						"               `//------:oyo----- : -.`...`                         :- `:/-````-::::::-:---------   \n" + 
						"              `+-------/mNMd+---o-..::-`           :syo.            ./       :/.``   ``//``````     \n" + 
						"              -+----:--mMN+-----:yhddmNd+`        `NMMMy            /.       +`.-:::::::+           \n" + 
						"               /////+::ym+------:NMyoym+o+`      ./NMMMs            s  ---.` .o-`     `-/           \n" + 
						"                `..``  `+------smhNo  .:.`:-   `/::NMNs::           s :-      -:-----`-/.           \n" + 
						"                        .::/::sMMNNN:   ``.::`.+.``:/-``/.`         :/-`       ``.-:::.`            \n" + 
						"                             `sMNMMMN+y/``s+o/-/````````-.:`         +/`      `.-/-.                \n" + 
						"                              .ddmNNhsyh/-/:/`..`````.-.-:o          /:` `-:::o.`                   \n" + 
						"                               .ydNh-:-.--`..```````.:-o-:/          -oos+//+o/`                    \n" + 
						"                               -y.-:/-.-::.``````.-:/` .-.`         `s++NMMMm+oo.                   \n" + 
						"                             `+d-   y+:.:mmdhyyys::::               `++odNNNmo+o:                   \n" + 
						"                           .+dh-   :N-`/`oNmmMMMNh:+                 `s+ooooo+os`                   \n" + 
						"                `.....--/ohmd+`   -md  /..s::ohoym:s-.               `o++++++++s                    \n" + 
						"               `odmmNNNNmhs:`   `/mN-  -:`./:-::-+:yoo:               .ysoooooy:                    \n" + 
						"                `.-:::--.     `:hNm:   `+`..:/::://yoso///:-..``      `h++ooo+y                     \n" + 
						"                             `sdh+.``.-/s:.-:-:::/o+oho+++++oo+++//::-:h++++++y                     \n" + 
						"                              ...:/++o+++o++yyooo++++odh+++++++++++++ooy++++++y                     \n" + 
						"                      ``.-::/+++o+++++++++++yNyoossssosNdo+++++++++++++o++++++y                     \n" + 
						"                    -/+ooo+++++++++++++++++++mNo+++++++ydm///+ooo++++++++++++++                     \n" + 
						"                   :o++++++++++++++++o+/so+++hMm++++++++oyy`   `.-::/+ooo++++o.                     \n" + 
						"                   :o+++++++os+o+/:-`  .s++++hMMs+++++++s`m/            `.--.                       \n" + 
						"                   `s+++++++ss-`       so++++dMMd+++++++y`om`                                       \n" + 
						"              `     .s++++++so/.      -Ns+++oNMMN+++++++y`-M/                                       \n" + 
						"            `/--/:.` `o+++++os+o     `dMmo+smMMMN+++++++y`oMd                                       \n" + 
						"            /:` `o./-`soooooo+oo:   `yMMMMMMMMMMNo++++++mNMMM-                                      \n" + 
						"           ::.+. /: /--oo++++++o+.:/oNMMMMMMMMMMN++++++hMMMMMo                                      \n" + 
						"           o  `o  o``/:`sooooydh:ysy+oNMMMMMMMMMN+++++sNMMMMMd                                      \n" + 
						"           o`  /:-/+:--:s`-mMMMh`:yo+++hMMMMMMMMm++++sNMMMMMMM.                                     \n" + 
						"           .+  `:.      -+``-:-` +sy++++odNMMMMMh+++yNMMMMMMMMo                                     \n" + 
						"            -+`          `:::::+syssy++++++ydNMMs++s-/ymMMMMMMm`                                    \n" + 
						"             `/:`     .----.-/yssysssyo+++++++os+o+`   `.:+oyyy:                                    \n" + 
						"               `:::--/::oo+yysyyssssssyyo++++++os.                                                  \n" + 
						"                   `+yssssssssssyysssssssysoo+syy.                                                  \n" + 
						"                   `yssssssssssssyyyssssssssssyys`                                                  \n" + 
						"                   .hsssssssssssssssyyysssssssyy:                                                   \n" + 
						"                   .hssssssssssssssssssyyyyyyyyss-                            `-::-`                \n" + 
						"                   `hsssssssssssssssssssssssssssss-                         `+yyhhhh+               \n" + 
						"                    yssssssssssssssssssssssssssssss.                       -yhhhhdddd+              \n" + 
						"                    :yssssssssssssssssssssssssssssss.                     .hhhhhddmmmm`             \n" + 
						"                    `ysssssssssssssssssssssssssssssss.                   `yhhhhhdmmmmm:             \n" + 
						"                     :ysssssssssssssssssssssssssssssss.                  :hhhhhddmmmmm/             \n" + 
						"                      sssssssssssssyy+ossssssssssssssss-                 shhhhhdmmmmmm-             \n" + 
						"                      .yssssssssssssy.`-+sssssssssssssss:               `hhhhhdmmmmmdd`             \n" + 
						"                       :ysssssssssssy`   ./sssssssssssssy/`             -hhhhhdmmmmmmo              \n" + 
						"                        +yssssssssssy`     ./ssssssssssssso.           `shhhhdmmmmdmd`              \n" + 
						"                        `sssssssssssy.       `/sssssssssssss:`         /dhhhhmdmmdmm:               \n" + 
						"                         .ysssssssssy:         `/sssssssssssy+.       -hhhhhdmmdmmd+                \n" + 
						"                          -ysssssssss+           .+sssssssyssss/`    -hhhhhdmmmdmd+                 \n" + 
						"                           /ssssssssso             .+sssyssssyyyy/` :hhhhhddmmmmd/                  \n" + 
						"                           `ssysyyyysy               -oyssshmNNmyysohhhhhddmmmdy-                   \n" + 
						"                            .sssssssyy`                :sshydNMNdhhhhhhhdmdddh/`                    \n" + 
						"                             `-+smmNNy/-`               `/yssymhhdhhhhhddddm+`                      \n" + 
						"                             `shhdmmmhhhs`                `--+hhdhhhhhdddddd/                       \n" + 
						"     ````..----...``````.-:/oshhhhhhhhhhho:`                 `odhhhhhhdmmmdo`                       \n" + 
						"   ./osyhhhhhhhhhhyyyyhhhhhhhhhhhhhhhhhhhhh+                  `hhhhhdmmmdy:                         \n" + 
						"  +hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhy`                  -ohhdmdds:                           \n" + 
						"  ohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/.                     `:oo/.                             \n" + 
						"   -ohhhhhhhhhhhhhhhhhhhhhhhhhhhso//++/-`                                                           \n" + 
						"      .:+osyhhhyyyyyhhysso+/:-`                                                                     \n" + 
						"                                ");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewPurpleDisney()
			{
				System.out.println("Mickey Mouse");
				System.out.println(ConsoleColors.PURPLE + "                                       ```                                                          \n" + 
						"                                  `-/oyhhhyso/-                                                     \n" + 
						"                               `:shhdhddddddddhs:                                                   \n" + 
						"                              :yhhddddddddddddddh/                                                  \n" + 
						"                             :yhdddddddddddddddddd.                                                 \n" + 
						"                             yhhdddddddddddddddddd-                                                 \n" + 
						"                             hhddddddddddddddddddy`                                                 \n" + 
						"                             shddddddddddddmddddy.                                                  \n" + 
						"                             `sdddddddddmdddddmmdhyyso/:.`                                          \n" + 
						"                    `-/osyyso:-:shddddmmmmdddmmdo-...-/oyho-`                                       \n" + 
						"                  `/yhhhhhhdhdhs-.-+dmmmmmmdmmd-        `:sso-                                      \n" + 
						"                 -shhhhhhhhdddddh:.ymmmmmmmmmds         .yy:`y/                                     \n" + 
						"                .yhhhhhhhdddddddddhmmmmmmmmmmdo         /mmd-mm:                                    \n" + 
						"                ohhhhhddddddddddddmmmmmmmmmmmmh`        /mmmhmmh`     `+yys-                        \n" + 
						"                yhhhhdddddddddddmmmmmho/-.--+yd/        :mmmdhmm-.-.``ymmmmh                        \n" + 
						"                shhhdddddddddddddmmy:`       `:y`       .mmmh-ddo+//osmmmmmo                        \n" + 
						"                /hhdddddddddddddmms`     `..`  ./`       +dh:./.`   +mmmmdo`                        \n" + 
						"                `+hdddddddddddddhm/     :+/.`   `:`       .. `     `dmmms-                          \n" + 
						"                 `:yddddddddddy:.d/     ``:o-`    `                 .:+d`                           \n" + 
						"                   `/oyhhhhyo:`  :y.       .yy/.                    `-h/                            \n" + 
						"                      `....`      :s:`      .dmdy+-.`           `.-/os:                             \n" + 
						"                                   .+o:`  `  yyhmmmdhs+/:-::///+++/-.                               \n" + 
						"                                     ./o+:-+`//`-ohsdmmmoommmdy+:.`                                 \n" + 
						"                                       `-ddmh/+/.`.`+mh+/mmmmmNNmdhs/-.`                            \n" + 
						"                                        +mmmmmhs++++o++hmNNmNNNmNNNNNm++/-`                         \n" + 
						"                                        hmmmmmmNmdhhdmNNmNNNNNNNNNNNmo` .:o.                        \n" + 
						"                                       `mmmmmhhmNmNNNNNNmNNNNNNNNNNd/.oyy+-s.                       \n" + 
						"                                       -mmmmm+`:dmNNNNNNNNNmmNNNNdo. sNNNNo-y                       \n" + 
						"                                       +mmmmm. :h:+syhdddmmddhyo//:-.hNNNNm`y.                      \n" + 
						"                                       smmmmd `d-    ``...-..` -hNNNdhNNNNm`s/                      \n" + 
						"                                       dmmmmd :y               hNNNNNmommd/ y/:.`                   \n" + 
						"                                      `mmmmmmosy              `mNNNNNm`.-. `h`.y`                   \n" + 
						"                                       dmmmmmmmm.              sNNNNNo    `o:.s.                    \n" + 
						"                                       :hmmmmmmms`             `/hdh+`  `:o--o.                     \n" + 
						"                                        `:/+ooosso.               `   `.:/./+`                      \n" + 
						"                           ``                 `+:oy:..`            `.:o/.:+-                        \n" + 
						"                      `.:/++++/-`             `d+--/mdhs/-`.....-:+os+/sd/                          \n" + 
						"                    `:syo:`` `.:o/`            .+oshNNNNmooyy+hm++yydmNNh                           \n" + 
						"                   .s/..:o+.    `/s.            `:dNNNNmy:--odmo   hNNNN+                           \n" + 
						"                   o/     :y:     .s.          .ommNNNd/.-:/+my`  `mNNNN:                           \n" + 
						"                   h`      -h-     -s        `+dmNNNmy.     oh.   -NNNNN.                           \n" + 
						"                   h`       :y      o-    `.+hmmNmmh/`    `/y.    /NNNNN-      ``````               \n" + 
						"                   s:        s      .y/:-/sdmmmmmmo`     `oy.`.:/+syhhhhs+o/-///////++/.`           \n" + 
						"                   -s`       /`      /o.:smmmmmmy-      .so``o:.`        `+y:.       `-+s-          \n" + 
						"           .        /+`      ..      `+:``/mmds-      `/y/:/ss.``````.-:++/`            :d`         \n" + 
						"           -`        ++`      -`.       .+`ss.      `:sds+-.`.//++////:.`               .d          \n" + 
						"           `--`       :o.      `-`       .+y.    `.+o/h/`                              .y:          \n" + 
						"             `-:-``    .o/`     `/.       `+/`.:/+/. :y                             ``/o-           \n" + 
						"                `-----.``:s/` ``.+s/.       yo/-`    .h-                         `.///-             \n" + 
						"                     `.-::+dh+//:` `/+.    `y.        .oo:-``````````````````.-//::`                \n" + 
						"                           `:/-`     .h. `.o/           `-/////+++++++++///::-.`                    \n" + 
						"                              -:/:.``-ds+//.                                                        \n" + 
						"                                 `-:::.`                           ");
				System.out.println(ConsoleColors.RESET + " ");
				System.out.println("Donald Duck");
				System.out.println(ConsoleColors.PURPLE + "   --.:                .:++o+`                                        \n" + 
						"                                -. ..       ....`.:+yyyyyyhhs/`                                     \n" + 
						"                                `:  /.     `yyyyyyyyyyyyyy/+dhy`                                    \n" + 
						"                               --`   +      `/oyo/hsyhmd/`  `s``                                    \n" + 
						"                            -::`     /``++:   :+.``.-..s..`  .                                      \n" + 
						"                          :/-.. ....`.: ++o+ .+.  .--.-:`-:`                                        \n" + 
						"                         /::-.```  `  + `/y+/ys  -.```:- `:.                                        \n" + 
						"                         -:......./- `y:  `+//+--..::-.  :.                                         \n" + 
						"                          `       yo.oys`  .o://+-dNy/:::.          ``                              \n" + 
						"                                  hyyyoss` :s+/+++ys+o+/`         .-`:`                             \n" + 
						"                                  +s++syyo`/o:/o+o+:-.`      ....-. ./                              \n" + 
						"                                  `syyyyyyss++os/-`       `.:.`   :.`                               \n" + 
						"                                   `syyhhho:-oyy:`   `.-//..`..`  ./                                \n" + 
						"                                    `yhdhd+shyssysssy/oyy` ``  ` ``-:                               \n" + 
						"                                    `yyhhdhyssyyyyyys:yyy:+s:-.``--::-                              \n" + 
						"                                    `/hyydyhyyyyyyyys:oyyy+.  `.-..:-/                              \n" + 
						"                                     :yyyhyhyyyyhhhhh+//-.    ``-.-:.-                              \n" + 
						"                                     ooyyyyssyyyyyydy```.-::---./   `                               \n" + 
						"                                     :+yyyh/:syyyyyh+      `.  .-                                   \n" + 
						"                                      +yyyys+syyyys:           /-                                   \n" + 
						"                                       :ssyyyysso:`          `:-                                    \n" + 
						"                                         .//:--`            `-`                                     \n" + 
						"                                     ````-///:.``        `.:+:                                      \n" + 
						"                                  .::////s///++++/::----:/+::o-                                     \n" + 
						"                                  /::::::/+///::/+.  `````-+::o                                     \n" + 
						"                                 -/:://///:::///+/`   .///+:/+/--.`                                 \n" + 
						"                                 `.---------...`      ./:::///:::////:-                             \n" + 
						"                                                       .+/::::::::::::/:                            \n" + 
						"                                                         :+/:::::::::+.                             \n" + 
						"                                                          `:/+//+/:::.    ");
				System.out.println(ConsoleColors.RESET + " ");
				System.out.println("Goofy");
				System.out.println(ConsoleColors.PURPLE + "                                                                                                    \n" + 
						"                                                                   .--`                             \n" + 
						"                 ://///-                                          +.`.:/-                           \n" + 
						"                :/-----::          `  `.`                         /:   `/-      `.-:::::::::::--    \n" + 
						"                /:----::o.        -` -.                            /:    o.::://:-````        ``+   \n" + 
						"               `//------:oyo----- : -.`...`                         :- `:/-````-::::::-:---------   \n" + 
						"              `+-------/mNMd+---o-..::-`           :syo.            ./       :/.``   ``//``````     \n" + 
						"              -+----:--mMN+-----:yhddmNd+`        `NMMMy            /.       +`.-:::::::+           \n" + 
						"               /////+::ym+------:NMyoym+o+`      ./NMMMs            s  ---.` .o-`     `-/           \n" + 
						"                `..``  `+------smhNo  .:.`:-   `/::NMNs::           s :-      -:-----`-/.           \n" + 
						"                        .::/::sMMNNN:   ``.::`.+.``:/-``/.`         :/-`       ``.-:::.`            \n" + 
						"                             `sMNMMMN+y/``s+o/-/````````-.:`         +/`      `.-/-.                \n" + 
						"                              .ddmNNhsyh/-/:/`..`````.-.-:o          /:` `-:::o.`                   \n" + 
						"                               .ydNh-:-.--`..```````.:-o-:/          -oos+//+o/`                    \n" + 
						"                               -y.-:/-.-::.``````.-:/` .-.`         `s++NMMMm+oo.                   \n" + 
						"                             `+d-   y+:.:mmdhyyys::::               `++odNNNmo+o:                   \n" + 
						"                           .+dh-   :N-`/`oNmmMMMNh:+                 `s+ooooo+os`                   \n" + 
						"                `.....--/ohmd+`   -md  /..s::ohoym:s-.               `o++++++++s                    \n" + 
						"               `odmmNNNNmhs:`   `/mN-  -:`./:-::-+:yoo:               .ysoooooy:                    \n" + 
						"                `.-:::--.     `:hNm:   `+`..:/::://yoso///:-..``      `h++ooo+y                     \n" + 
						"                             `sdh+.``.-/s:.-:-:::/o+oho+++++oo+++//::-:h++++++y                     \n" + 
						"                              ...:/++o+++o++yyooo++++odh+++++++++++++ooy++++++y                     \n" + 
						"                      ``.-::/+++o+++++++++++yNyoossssosNdo+++++++++++++o++++++y                     \n" + 
						"                    -/+ooo+++++++++++++++++++mNo+++++++ydm///+ooo++++++++++++++                     \n" + 
						"                   :o++++++++++++++++o+/so+++hMm++++++++oyy`   `.-::/+ooo++++o.                     \n" + 
						"                   :o+++++++os+o+/:-`  .s++++hMMs+++++++s`m/            `.--.                       \n" + 
						"                   `s+++++++ss-`       so++++dMMd+++++++y`om`                                       \n" + 
						"              `     .s++++++so/.      -Ns+++oNMMN+++++++y`-M/                                       \n" + 
						"            `/--/:.` `o+++++os+o     `dMmo+smMMMN+++++++y`oMd                                       \n" + 
						"            /:` `o./-`soooooo+oo:   `yMMMMMMMMMMNo++++++mNMMM-                                      \n" + 
						"           ::.+. /: /--oo++++++o+.:/oNMMMMMMMMMMN++++++hMMMMMo                                      \n" + 
						"           o  `o  o``/:`sooooydh:ysy+oNMMMMMMMMMN+++++sNMMMMMd                                      \n" + 
						"           o`  /:-/+:--:s`-mMMMh`:yo+++hMMMMMMMMm++++sNMMMMMMM.                                     \n" + 
						"           .+  `:.      -+``-:-` +sy++++odNMMMMMh+++yNMMMMMMMMo                                     \n" + 
						"            -+`          `:::::+syssy++++++ydNMMs++s-/ymMMMMMMm`                                    \n" + 
						"             `/:`     .----.-/yssysssyo+++++++os+o+`   `.:+oyyy:                                    \n" + 
						"               `:::--/::oo+yysyyssssssyyo++++++os.                                                  \n" + 
						"                   `+yssssssssssyysssssssysoo+syy.                                                  \n" + 
						"                   `yssssssssssssyyyssssssssssyys`                                                  \n" + 
						"                   .hsssssssssssssssyyysssssssyy:                                                   \n" + 
						"                   .hssssssssssssssssssyyyyyyyyss-                            `-::-`                \n" + 
						"                   `hsssssssssssssssssssssssssssss-                         `+yyhhhh+               \n" + 
						"                    yssssssssssssssssssssssssssssss.                       -yhhhhdddd+              \n" + 
						"                    :yssssssssssssssssssssssssssssss.                     .hhhhhddmmmm`             \n" + 
						"                    `ysssssssssssssssssssssssssssssss.                   `yhhhhhdmmmmm:             \n" + 
						"                     :ysssssssssssssssssssssssssssssss.                  :hhhhhddmmmmm/             \n" + 
						"                      sssssssssssssyy+ossssssssssssssss-                 shhhhhdmmmmmm-             \n" + 
						"                      .yssssssssssssy.`-+sssssssssssssss:               `hhhhhdmmmmmdd`             \n" + 
						"                       :ysssssssssssy`   ./sssssssssssssy/`             -hhhhhdmmmmmmo              \n" + 
						"                        +yssssssssssy`     ./ssssssssssssso.           `shhhhdmmmmdmd`              \n" + 
						"                        `sssssssssssy.       `/sssssssssssss:`         /dhhhhmdmmdmm:               \n" + 
						"                         .ysssssssssy:         `/sssssssssssy+.       -hhhhhdmmdmmd+                \n" + 
						"                          -ysssssssss+           .+sssssssyssss/`    -hhhhhdmmmdmd+                 \n" + 
						"                           /ssssssssso             .+sssyssssyyyy/` :hhhhhddmmmmd/                  \n" + 
						"                           `ssysyyyysy               -oyssshmNNmyysohhhhhddmmmdy-                   \n" + 
						"                            .sssssssyy`                :sshydNMNdhhhhhhhdmdddh/`                    \n" + 
						"                             `-+smmNNy/-`               `/yssymhhdhhhhhddddm+`                      \n" + 
						"                             `shhdmmmhhhs`                `--+hhdhhhhhdddddd/                       \n" + 
						"     ````..----...``````.-:/oshhhhhhhhhhho:`                 `odhhhhhhdmmmdo`                       \n" + 
						"   ./osyhhhhhhhhhhyyyyhhhhhhhhhhhhhhhhhhhhh+                  `hhhhhdmmmdy:                         \n" + 
						"  +hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhy`                  -ohhdmdds:                           \n" + 
						"  ohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/.                     `:oo/.                             \n" + 
						"   -ohhhhhhhhhhhhhhhhhhhhhhhhhhhso//++/-`                                                           \n" + 
						"      .:+osyhhhyyyyyhhysso+/:-`                                                                     \n" + 
						"                                ");
				System.out.println(ConsoleColors.RESET + " ");
			}
		
		public static void viewCyanDisney()
		{
			System.out.println("Mickey Mouse");
			System.out.println(ConsoleColors.CYAN + "                                       ```                                                          \n" + 
					"                                  `-/oyhhhyso/-                                                     \n" + 
					"                               `:shhdhddddddddhs:                                                   \n" + 
					"                              :yhhddddddddddddddh/                                                  \n" + 
					"                             :yhdddddddddddddddddd.                                                 \n" + 
					"                             yhhdddddddddddddddddd-                                                 \n" + 
					"                             hhddddddddddddddddddy`                                                 \n" + 
					"                             shddddddddddddmddddy.                                                  \n" + 
					"                             `sdddddddddmdddddmmdhyyso/:.`                                          \n" + 
					"                    `-/osyyso:-:shddddmmmmdddmmdo-...-/oyho-`                                       \n" + 
					"                  `/yhhhhhhdhdhs-.-+dmmmmmmdmmd-        `:sso-                                      \n" + 
					"                 -shhhhhhhhdddddh:.ymmmmmmmmmds         .yy:`y/                                     \n" + 
					"                .yhhhhhhhdddddddddhmmmmmmmmmmdo         /mmd-mm:                                    \n" + 
					"                ohhhhhddddddddddddmmmmmmmmmmmmh`        /mmmhmmh`     `+yys-                        \n" + 
					"                yhhhhdddddddddddmmmmmho/-.--+yd/        :mmmdhmm-.-.``ymmmmh                        \n" + 
					"                shhhdddddddddddddmmy:`       `:y`       .mmmh-ddo+//osmmmmmo                        \n" + 
					"                /hhdddddddddddddmms`     `..`  ./`       +dh:./.`   +mmmmdo`                        \n" + 
					"                `+hdddddddddddddhm/     :+/.`   `:`       .. `     `dmmms-                          \n" + 
					"                 `:yddddddddddy:.d/     ``:o-`    `                 .:+d`                           \n" + 
					"                   `/oyhhhhyo:`  :y.       .yy/.                    `-h/                            \n" + 
					"                      `....`      :s:`      .dmdy+-.`           `.-/os:                             \n" + 
					"                                   .+o:`  `  yyhmmmdhs+/:-::///+++/-.                               \n" + 
					"                                     ./o+:-+`//`-ohsdmmmoommmdy+:.`                                 \n" + 
					"                                       `-ddmh/+/.`.`+mh+/mmmmmNNmdhs/-.`                            \n" + 
					"                                        +mmmmmhs++++o++hmNNmNNNmNNNNNm++/-`                         \n" + 
					"                                        hmmmmmmNmdhhdmNNmNNNNNNNNNNNmo` .:o.                        \n" + 
					"                                       `mmmmmhhmNmNNNNNNmNNNNNNNNNNd/.oyy+-s.                       \n" + 
					"                                       -mmmmm+`:dmNNNNNNNNNmmNNNNdo. sNNNNo-y                       \n" + 
					"                                       +mmmmm. :h:+syhdddmmddhyo//:-.hNNNNm`y.                      \n" + 
					"                                       smmmmd `d-    ``...-..` -hNNNdhNNNNm`s/                      \n" + 
					"                                       dmmmmd :y               hNNNNNmommd/ y/:.`                   \n" + 
					"                                      `mmmmmmosy              `mNNNNNm`.-. `h`.y`                   \n" + 
					"                                       dmmmmmmmm.              sNNNNNo    `o:.s.                    \n" + 
					"                                       :hmmmmmmms`             `/hdh+`  `:o--o.                     \n" + 
					"                                        `:/+ooosso.               `   `.:/./+`                      \n" + 
					"                           ``                 `+:oy:..`            `.:o/.:+-                        \n" + 
					"                      `.:/++++/-`             `d+--/mdhs/-`.....-:+os+/sd/                          \n" + 
					"                    `:syo:`` `.:o/`            .+oshNNNNmooyy+hm++yydmNNh                           \n" + 
					"                   .s/..:o+.    `/s.            `:dNNNNmy:--odmo   hNNNN+                           \n" + 
					"                   o/     :y:     .s.          .ommNNNd/.-:/+my`  `mNNNN:                           \n" + 
					"                   h`      -h-     -s        `+dmNNNmy.     oh.   -NNNNN.                           \n" + 
					"                   h`       :y      o-    `.+hmmNmmh/`    `/y.    /NNNNN-      ``````               \n" + 
					"                   s:        s      .y/:-/sdmmmmmmo`     `oy.`.:/+syhhhhs+o/-///////++/.`           \n" + 
					"                   -s`       /`      /o.:smmmmmmy-      .so``o:.`        `+y:.       `-+s-          \n" + 
					"           .        /+`      ..      `+:``/mmds-      `/y/:/ss.``````.-:++/`            :d`         \n" + 
					"           -`        ++`      -`.       .+`ss.      `:sds+-.`.//++////:.`               .d          \n" + 
					"           `--`       :o.      `-`       .+y.    `.+o/h/`                              .y:          \n" + 
					"             `-:-``    .o/`     `/.       `+/`.:/+/. :y                             ``/o-           \n" + 
					"                `-----.``:s/` ``.+s/.       yo/-`    .h-                         `.///-             \n" + 
					"                     `.-::+dh+//:` `/+.    `y.        .oo:-``````````````````.-//::`                \n" + 
					"                           `:/-`     .h. `.o/           `-/////+++++++++///::-.`                    \n" + 
					"                              -:/:.``-ds+//.                                                        \n" + 
					"                                 `-:::.`                           ");
			System.out.println(ConsoleColors.RESET + " ");
			System.out.println("Donald Duck");
			System.out.println(ConsoleColors.CYAN + "   --.:                .:++o+`                                        \n" + 
					"                                -. ..       ....`.:+yyyyyyhhs/`                                     \n" + 
					"                                `:  /.     `yyyyyyyyyyyyyy/+dhy`                                    \n" + 
					"                               --`   +      `/oyo/hsyhmd/`  `s``                                    \n" + 
					"                            -::`     /``++:   :+.``.-..s..`  .                                      \n" + 
					"                          :/-.. ....`.: ++o+ .+.  .--.-:`-:`                                        \n" + 
					"                         /::-.```  `  + `/y+/ys  -.```:- `:.                                        \n" + 
					"                         -:......./- `y:  `+//+--..::-.  :.                                         \n" + 
					"                          `       yo.oys`  .o://+-dNy/:::.          ``                              \n" + 
					"                                  hyyyoss` :s+/+++ys+o+/`         .-`:`                             \n" + 
					"                                  +s++syyo`/o:/o+o+:-.`      ....-. ./                              \n" + 
					"                                  `syyyyyyss++os/-`       `.:.`   :.`                               \n" + 
					"                                   `syyhhho:-oyy:`   `.-//..`..`  ./                                \n" + 
					"                                    `yhdhd+shyssysssy/oyy` ``  ` ``-:                               \n" + 
					"                                    `yyhhdhyssyyyyyys:yyy:+s:-.``--::-                              \n" + 
					"                                    `/hyydyhyyyyyyyys:oyyy+.  `.-..:-/                              \n" + 
					"                                     :yyyhyhyyyyhhhhh+//-.    ``-.-:.-                              \n" + 
					"                                     ooyyyyssyyyyyydy```.-::---./   `                               \n" + 
					"                                     :+yyyh/:syyyyyh+      `.  .-                                   \n" + 
					"                                      +yyyys+syyyys:           /-                                   \n" + 
					"                                       :ssyyyysso:`          `:-                                    \n" + 
					"                                         .//:--`            `-`                                     \n" + 
					"                                     ````-///:.``        `.:+:                                      \n" + 
					"                                  .::////s///++++/::----:/+::o-                                     \n" + 
					"                                  /::::::/+///::/+.  `````-+::o                                     \n" + 
					"                                 -/:://///:::///+/`   .///+:/+/--.`                                 \n" + 
					"                                 `.---------...`      ./:::///:::////:-                             \n" + 
					"                                                       .+/::::::::::::/:                            \n" + 
					"                                                         :+/:::::::::+.                             \n" + 
					"                                                          `:/+//+/:::.    ");
			System.out.println(ConsoleColors.RESET + " ");
			System.out.println("Goofy");
			System.out.println(ConsoleColors.CYAN + "                                                                                                    \n" + 
					"                                                                   .--`                             \n" + 
					"                 ://///-                                          +.`.:/-                           \n" + 
					"                :/-----::          `  `.`                         /:   `/-      `.-:::::::::::--    \n" + 
					"                /:----::o.        -` -.                            /:    o.::://:-````        ``+   \n" + 
					"               `//------:oyo----- : -.`...`                         :- `:/-````-::::::-:---------   \n" + 
					"              `+-------/mNMd+---o-..::-`           :syo.            ./       :/.``   ``//``````     \n" + 
					"              -+----:--mMN+-----:yhddmNd+`        `NMMMy            /.       +`.-:::::::+           \n" + 
					"               /////+::ym+------:NMyoym+o+`      ./NMMMs            s  ---.` .o-`     `-/           \n" + 
					"                `..``  `+------smhNo  .:.`:-   `/::NMNs::           s :-      -:-----`-/.           \n" + 
					"                        .::/::sMMNNN:   ``.::`.+.``:/-``/.`         :/-`       ``.-:::.`            \n" + 
					"                             `sMNMMMN+y/``s+o/-/````````-.:`         +/`      `.-/-.                \n" + 
					"                              .ddmNNhsyh/-/:/`..`````.-.-:o          /:` `-:::o.`                   \n" + 
					"                               .ydNh-:-.--`..```````.:-o-:/          -oos+//+o/`                    \n" + 
					"                               -y.-:/-.-::.``````.-:/` .-.`         `s++NMMMm+oo.                   \n" + 
					"                             `+d-   y+:.:mmdhyyys::::               `++odNNNmo+o:                   \n" + 
					"                           .+dh-   :N-`/`oNmmMMMNh:+                 `s+ooooo+os`                   \n" + 
					"                `.....--/ohmd+`   -md  /..s::ohoym:s-.               `o++++++++s                    \n" + 
					"               `odmmNNNNmhs:`   `/mN-  -:`./:-::-+:yoo:               .ysoooooy:                    \n" + 
					"                `.-:::--.     `:hNm:   `+`..:/::://yoso///:-..``      `h++ooo+y                     \n" + 
					"                             `sdh+.``.-/s:.-:-:::/o+oho+++++oo+++//::-:h++++++y                     \n" + 
					"                              ...:/++o+++o++yyooo++++odh+++++++++++++ooy++++++y                     \n" + 
					"                      ``.-::/+++o+++++++++++yNyoossssosNdo+++++++++++++o++++++y                     \n" + 
					"                    -/+ooo+++++++++++++++++++mNo+++++++ydm///+ooo++++++++++++++                     \n" + 
					"                   :o++++++++++++++++o+/so+++hMm++++++++oyy`   `.-::/+ooo++++o.                     \n" + 
					"                   :o+++++++os+o+/:-`  .s++++hMMs+++++++s`m/            `.--.                       \n" + 
					"                   `s+++++++ss-`       so++++dMMd+++++++y`om`                                       \n" + 
					"              `     .s++++++so/.      -Ns+++oNMMN+++++++y`-M/                                       \n" + 
					"            `/--/:.` `o+++++os+o     `dMmo+smMMMN+++++++y`oMd                                       \n" + 
					"            /:` `o./-`soooooo+oo:   `yMMMMMMMMMMNo++++++mNMMM-                                      \n" + 
					"           ::.+. /: /--oo++++++o+.:/oNMMMMMMMMMMN++++++hMMMMMo                                      \n" + 
					"           o  `o  o``/:`sooooydh:ysy+oNMMMMMMMMMN+++++sNMMMMMd                                      \n" + 
					"           o`  /:-/+:--:s`-mMMMh`:yo+++hMMMMMMMMm++++sNMMMMMMM.                                     \n" + 
					"           .+  `:.      -+``-:-` +sy++++odNMMMMMh+++yNMMMMMMMMo                                     \n" + 
					"            -+`          `:::::+syssy++++++ydNMMs++s-/ymMMMMMMm`                                    \n" + 
					"             `/:`     .----.-/yssysssyo+++++++os+o+`   `.:+oyyy:                                    \n" + 
					"               `:::--/::oo+yysyyssssssyyo++++++os.                                                  \n" + 
					"                   `+yssssssssssyysssssssysoo+syy.                                                  \n" + 
					"                   `yssssssssssssyyyssssssssssyys`                                                  \n" + 
					"                   .hsssssssssssssssyyysssssssyy:                                                   \n" + 
					"                   .hssssssssssssssssssyyyyyyyyss-                            `-::-`                \n" + 
					"                   `hsssssssssssssssssssssssssssss-                         `+yyhhhh+               \n" + 
					"                    yssssssssssssssssssssssssssssss.                       -yhhhhdddd+              \n" + 
					"                    :yssssssssssssssssssssssssssssss.                     .hhhhhddmmmm`             \n" + 
					"                    `ysssssssssssssssssssssssssssssss.                   `yhhhhhdmmmmm:             \n" + 
					"                     :ysssssssssssssssssssssssssssssss.                  :hhhhhddmmmmm/             \n" + 
					"                      sssssssssssssyy+ossssssssssssssss-                 shhhhhdmmmmmm-             \n" + 
					"                      .yssssssssssssy.`-+sssssssssssssss:               `hhhhhdmmmmmdd`             \n" + 
					"                       :ysssssssssssy`   ./sssssssssssssy/`             -hhhhhdmmmmmmo              \n" + 
					"                        +yssssssssssy`     ./ssssssssssssso.           `shhhhdmmmmdmd`              \n" + 
					"                        `sssssssssssy.       `/sssssssssssss:`         /dhhhhmdmmdmm:               \n" + 
					"                         .ysssssssssy:         `/sssssssssssy+.       -hhhhhdmmdmmd+                \n" + 
					"                          -ysssssssss+           .+sssssssyssss/`    -hhhhhdmmmdmd+                 \n" + 
					"                           /ssssssssso             .+sssyssssyyyy/` :hhhhhddmmmmd/                  \n" + 
					"                           `ssysyyyysy               -oyssshmNNmyysohhhhhddmmmdy-                   \n" + 
					"                            .sssssssyy`                :sshydNMNdhhhhhhhdmdddh/`                    \n" + 
					"                             `-+smmNNy/-`               `/yssymhhdhhhhhddddm+`                      \n" + 
					"                             `shhdmmmhhhs`                `--+hhdhhhhhdddddd/                       \n" + 
					"     ````..----...``````.-:/oshhhhhhhhhhho:`                 `odhhhhhhdmmmdo`                       \n" + 
					"   ./osyhhhhhhhhhhyyyyhhhhhhhhhhhhhhhhhhhhh+                  `hhhhhdmmmdy:                         \n" + 
					"  +hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhy`                  -ohhdmdds:                           \n" + 
					"  ohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhs/.                     `:oo/.                             \n" + 
					"   -ohhhhhhhhhhhhhhhhhhhhhhhhhhhso//++/-`                                                           \n" + 
					"      .:+osyhhhyyyyyhhysso+/:-`                                                                     \n" + 
					"                                ");
			System.out.println(ConsoleColors.RESET + " ");
		}
		
		public static void goAgain()
			{
				System.out.println("Would you like to view another exhibit?");
				System.out.println(ConsoleColors.YELLOW + "1) YES" + ConsoleColors.RESET);
				System.out.println(ConsoleColors.RED + "2) NO" +  ConsoleColors.RESET);
				choice = userInput.nextInt();
				if(choice == 1)
					{
						chooseExhibitAndColor();
					}
				else
					{
						endTour();
					}
			}
		
		public static void endTour()
			{
				System.out.print("Welcome back! We hope you enjoyed your time at the ");
				System.out.print(ConsoleColors.RED_BOLD + "A" + ConsoleColors.BLUE_BOLD + "S" + ConsoleColors.YELLOW_BOLD + "C" + ConsoleColors.PURPLE_BOLD + "I" + ConsoleColors.GREEN_BOLD + "I");
				System.out.print(" " + ConsoleColors.CYAN_BOLD + "A" + ConsoleColors.RED_BOLD + "R" + ConsoleColors.BLUE_BOLD + "T");
				System.out.println(" " + ConsoleColors.YELLOW_BOLD + "G" + ConsoleColors.PURPLE_BOLD + "A" + ConsoleColors.GREEN_BOLD + "L" + ConsoleColors.CYAN_BOLD + "L" + ConsoleColors.RED_BOLD + "E" + ConsoleColors.BLUE_BOLD + "R" + ConsoleColors.YELLOW_BOLD + "Y" + ConsoleColors.PURPLE_BOLD + "!");
				System.out.println(" ");
				System.out.println(ConsoleColors.RESET + "Note from Creator: Special thanks go to Chris Moser for his patience & computer wizardry.");
			}
		

	}
