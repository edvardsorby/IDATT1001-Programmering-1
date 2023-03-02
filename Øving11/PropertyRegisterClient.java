package Øvinger.Øving11;

import java.util.Scanner;

public class PropertyRegisterClient {
    // Constants representing the different menu choices
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int EXIT = 9;

    PropertyRegister propertyRegister = new PropertyRegister();

    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value
     */
    private int showMenu() {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("9. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }
    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start() {
        boolean finished = false;
        // The while-loop will run as long as the user has not selected to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();

            Scanner input = new Scanner(System.in);

            switch (menuChoice)
            {
                case ADD_PROPERTY:
                    System.out.println("Please fill in the information about the new property.");

                    System.out.println("Municipality number:\n");
                    String stringInput = input.nextLine();
                    int municipalityNr = Integer.parseInt(stringInput);

                    System.out.println("Municipality name:\n");
                    stringInput = input.nextLine();
                    String municipalityName = stringInput;

                    System.out.println("Lot number:\n");
                    stringInput = input.nextLine();
                    int lotNr = Integer.parseInt(stringInput);

                    System.out.println("Section number:\n");
                    stringInput = input.nextLine();
                    int sectionNr = Integer.parseInt(stringInput);

                    System.out.println("Name of property (leave blank if none):\n");
                    stringInput = input.nextLine();
                    String name = stringInput;

                    System.out.println("Property area (m^2):\n");
                    stringInput = input.nextLine();
                    double area = Double.parseDouble(stringInput);
                    System.out.println(area);

                    System.out.println("Name of owner:\n");
                    stringInput = input.nextLine();
                    String nameOfOwner = stringInput;

                    propertyRegister.addProperty(municipalityNr, municipalityName, lotNr, sectionNr, name, area, nameOfOwner);
                    break;
                case LIST_ALL_PROPERTIES:
                    System.out.println(propertyRegister);
                    break;
                case FIND_PROPERTY:
                    System.out.println("Please fill in the information to search for a property.");

                    System.out.println("Municipality number:\n");
                    String stringInput2 = input.nextLine();
                    int municipalityNr2 = Integer.parseInt(stringInput2);

                    System.out.println("Lot number:\n");
                    stringInput2 = input.nextLine();
                    int lotNr2 = Integer.parseInt(stringInput2);

                    System.out.println("Section number:\n");
                    stringInput2 = input.nextLine();
                    int sectionNr2 = Integer.parseInt(stringInput2);

                    System.out.println(propertyRegister.findProperty(municipalityNr2, lotNr2, sectionNr2));
                    break;
                case CALCULATE_AVERAGE_AREA:
                    System.out.println("The average property area is " + propertyRegister.getAvgArea() + " m^2");
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
    // Dette er en helt grei måte å gjøre det på:
    // Selv om jeg heller ville laget hele klientprogrammet i én main, er det best å bruke klasser, som her.
    public static void main(String[] args) {
        // Oppretter en ny meny:
        PropertyRegisterClient menu = new PropertyRegisterClient();

        // Legger inn testdata:
        // Her sa Hermann at han heller ville laget en metode som fyller registeret:
        // Eks: menu.fillRegister()
        menu.propertyRegister.addProperty(1445, "Gloppen", 77,631,"",1017.6, "Jens Olsen");
        menu.propertyRegister.addProperty(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        menu.propertyRegister.addProperty(1445, "Gloppen", 75,19, "Fugletun", 650.6, "Evilyn Jensen");
        menu.propertyRegister.addProperty(1445, "Gloppen", 74,188, "", 1457.2, "Karl Ove Bråten");
        menu.propertyRegister.addProperty(1445, "Gloppen", 69,47, "Høiberg", 1339.4, "Elsa Indregård");

        // Starter programmet:
        menu.start();
    }
}