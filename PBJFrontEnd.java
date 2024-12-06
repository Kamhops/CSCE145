//Kameron Hopson
import java.util.Scanner;
public class PBJFrontEnd extends PBJSandwich{

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the PBJ Sandwich Maker!");
        System.out.println();
        boolean restart = true;
        while (restart) {
            PBJSandwich sandwich1 = new PBJSandwich();
            PBJSandwich sandwich2 = new PBJSandwich();

            //Collect sandwich details from user for Sandwich 1
            System.out.println("Enter details for the first sandwich!");
            sandwich1 = createSandwich(scanner);

            //Collect sandwich details from user for Sandwich 2
            System.out.println("Enter details for the second sandwich!");
            sandwich2 = createSandwich(scanner);
            System.out.println();

            //Display Sandwich details
            System.out.println("\nFirst Sandwich Details:");
            sandwich1.displaySandwichInfo();
            System.out.println("\nSecond Sandwich Details:");
            sandwich2.displaySandwichInfo();

            //Compares sandwiches
            if (sandwich1.equals(sandwich2)) {
                System.out.println("\nBoth sandwiches are the same!");
            } else {
                System.out.println("\nThe sandwiches are different.");
            }

            //Asks user if they want to restart or quit
            System.out.print("\nWould you like to create new sandwiches? (yes/no): ");
            String userChoice = scanner.nextLine();
            restart = userChoice.equalsIgnoreCase("yes");
        }
	}


    //Handles user input and create a sandwich
    private static PBJSandwich createSandwich(Scanner scanner) {
        //Details for top slice
        System.out.print("Enter top slice bread brand name: ");
        String topName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter top slice bread type (Honey Wheat, White, Whole Grain, Whole Wheat): ");
        String topType = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter top slice bread calories: ");
        int topCalories = scanner.nextInt();
        scanner.nextLine();
        Bread topSlice = new Bread(topName, topCalories, topType);

        //Details for peanut butter
        System.out.print("Enter peanut butter brand name: ");
        String pbName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter peanut butter calories:");
        int pbCals = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Is the peanut butter crunchy? (True or False): ");
        String pbConsistency = scanner.nextLine();
        scanner.nextLine();
        PeanutButter peanutButter = new PeanutButter(pbName, pbCals, pbConsistency); //, pbConsistency
        
        //details for jelly
        System.out.println("Enter jelly brand name: ");
        String jellyBrand = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter jelly calories: ");
        int jellyCalories = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter jelly flavor (Apple, Blackberry, Grape, Blueberry, or Tomato): ");
        String jellyType = scanner.nextLine();
        scanner.nextLine();
        Jelly jelly = new Jelly(jellyBrand, jellyCalories, jellyType);
        
        //Details for bottom slice
        System.out.print("Enter bottom slice bread brand name: ");
        String bottomName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter bottom slice bread calories: ");
        int bottomCalories = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter bottom slice bread type (Honey Wheat, White, Whole Grain, Whole Wheat): ");
        String bottomType = scanner.nextLine();
        scanner.nextLine();
        Bread bottomSlice = new Bread(bottomName, bottomCalories, bottomType);

        // Create and return the sandwich
        return new PBJSandwich(topSlice, peanutButter, jelly, bottomSlice);
    }
    
}