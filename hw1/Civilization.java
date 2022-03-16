import java.util.Scanner;
public class Civilization {

    private static boolean playing = true;
    private static Scanner in = new Scanner(System.in);
    private static int numCities = 0;
    private static String[] cities = new String[5];
    private static int attacks = 0;
    private static double gold = 20.5;
    private static double resources = 30.0;
    private static int happiness = 10;
    private static int militaryUnits = 0;
    private static int technologyPoints = 0;

    public static int startingGame() {
        System.out.println("Pick your Civilization:");
        System.out.println("  1.American (George Washington)");
        System.out.println("  2.Zulu (Shaka)");
        System.out.println("  3.English (Queen Elizabeth I)");
        System.out.println("  4.Chinese (Wu Zetian)");
        int civilization = in.nextInt();
        in.nextLine();
        String leader;
        String civilizationName;

        if (civilization == 1) {
            leader = "George Washington";
            civilizationName = "American";
        } else if (civilization == 2) {
            leader = "Shaka";
            civilizationName = "Zulu";
        } else if (civilization == 3) {
            leader = "Queen Elizabeth I";
            civilizationName = "English";
        } else {
            leader = "Wu Zetian";
            civilizationName = "Chinese";
        }
        System.out.println("");

        return civilization;

    }

    public static String cityName() {
        System.out.println("Name your city:");
        String cityName;
        cityName = in.nextLine();
        System.out.println("");
        return cityName;
    }

    public static void printingStat() {
        System.out.println("Number of numCities: " + numCities);
        System.out.print("List of cities:");
        for (int i = 0; i < 5; i++) {
            if (cities[i] != null) {
                System.out.print(" " + cities[i]);
            }
        }
        System.out.println("");
        System.out.println("Number of attacks:: " + attacks);
        System.out.println("Number of gold: " + gold);
        System.out.println("Number of resources: " + resources);
        System.out.println("Number of happiness: " + happiness);
        System.out.println("Number of millitary units: " + militaryUnits);
        System.out.println("Number of technology points: " + technologyPoints);
        System.out.println("");
    }
    public static void updateGame() {
        if (happiness > 20) {
            resources = resources + (5 * numCities);
        }
        resources += 1;
        gold = gold + numCities * 3;
        if ((resources % 2) == 1) {
            happiness -= 3;
        } else {
            happiness += 1;
        }

    }

    public static int optionToPerform() {
        System.out.println("You can perform the following task:");
        System.out.println("  1.Settle a City");
        System.out.println("  2.Demolish a City");
        System.out.println("  3.Build Militia");
        System.out.println("  4.Research Technology");
        System.out.println("  5.Attack Enemy City");
        System.out.println("  6.End Turn");

        int chosenMove = in.nextInt();
        in.nextLine();
        return chosenMove;
    }

    public static void settleACity() {
        if (gold >= 15.5 && numCities < 5) {
            gold -= 15.5;
            String playerCity = cityName();
            for (int i = 0; i < 5; i++) {
                if (cities[i] == null) {
                    cities[i] = playerCity;
                    i = 5;
                }
            }
            numCities++;
            System.out.println("Established a new city sucessfully");
        } else {
            System.out.println("Do not have enough gold to settle a city");
            System.out.println("Your turn is over");
        }
    }

    public static void demolishACity() {
        if (numCities > 1) {
            System.out.println("Pick a city to demolish");
            resources = resources + 1.5;
            for (int i = 0; i < 5; i++) {
                if (cities[i] != null) {
                    System.out.print(cities[i] + " ");
                }
            }
            System.out.println("");
            String demolishedCity = in.nextLine();
            for (int i = 0; i < 5; i++) {
                if (cities[i].equals(demolishedCity)) {
                    cities[i] = null;
                    i = 5;
                }
            }
            numCities--;
            System.out.println("Demolished a city sucessfully");
        } else {
            System.out.println("Must retain at least one city");
            System.out.println("Your turn is over");
        }
    }

    public static void buildMilitia() {

        if (gold >= 5 && resources >= 3) {
            militaryUnits += 1;
            gold -= 5;
            resources = resources - 3;
            System.out.println("Built a millitia sucessfully");
        } else {
            System.out.println("Do not have enough items to build a militia");
            System.out.println("Your turn is over");
        }
    }

    public static void researchTechnology() {
        if (gold >= 50 && resources >= 2) {
            technologyPoints = technologyPoints + 1;
            gold -= 50;
            resources -= 2;
            System.out.println("Reserached technology sucessfully");
        } else {
            System.out.println("Not enough items to research technology");
            System.out.println("Your turn is over");
        }
    }

    public static void attackEmemyCity() {
        if (militaryUnits >= 6) {
            gold = gold + 10;
            happiness = happiness - 3;
            militaryUnits = militaryUnits - 6;
            attacks = attacks + 1;
            System.out.println("Attacked an enemy city sucessfully");
        } else {
            System.out.println("Do not have enough military units");
            System.out.println("Your turn is over");
        }
    }

    public static void endTurn() {
        System.out.println("Turn ended sucessfully");
    }

    public static void main(String[] args) {

        int playerCivilization = startingGame();


        String playerCity = cityName();
        cities[0] = playerCity;
        numCities += 1;
        int chosenMove;
        while (playing) {
            printingStat();

            updateGame();
            System.out.println("");
            chosenMove = optionToPerform();
            if (chosenMove == 1) {
                settleACity();
            } else if (chosenMove == 2) {
                demolishACity();
            } else if (chosenMove == 3) {
                buildMilitia();
            } else if (chosenMove == 4) {
                researchTechnology();
            } else if (chosenMove == 5) {
                attackEmemyCity();
            } else {
                endTurn();
            }
            System.out.println("");
            if (technologyPoints >= 20 || attacks >= 10) {
                System.out.println("You Won!!!");
                playing = false;
            } else {
                System.out.println("Press Enter to start next round");
                String next = in.nextLine();
                System.out.println("Starting next round");
                System.out.println("********************");
            }
        }
    }


}
