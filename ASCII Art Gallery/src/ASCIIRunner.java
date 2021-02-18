import java.util.Scanner;

public class ASCIIRunner
	{

	//This version is up to date as of Thursday, February 18, 2021!
	
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
