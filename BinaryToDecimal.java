//Kameron Hopson
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to your four-digit binary converter!");
        System.out.print("Enter a four-digit binary number:");
        String binary1 = scanner.nextLine();
        System.out.print("Enter another four-digit binary number:");
        String binary2 = scanner.nextLine();
        
        int number1 = binaryToDecimal(binary1);
        int number2 = binaryToDecimal(binary2);
        if (number1 != 86 && number2 != 86) {
        //Wanted to add some form of user error even if it wasn't required
        	int answer = number1 +number2;
        	System.out.println("The first input is " + number1 + " and the second input is " + number2 + "!");
            System.out.println("The value of " + binary1 + " and " + binary2 + " is: " + answer);
        } else {
            System.out.println("Thats not the right input :(");
        }
        
        System.exit(0);
    }
    
    public static int binaryToDecimal(String binary) {
    	//Checks if either value entered by the user is exactly 4 characters long.
    	//If the length isn't exactly 4 then the method returns 66, ending the code.
        if (binary.length() != 4) { 
            return 86;
        }
        
        int number = 0;
        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);
            //Grabs the character
            if (digit != '0' && digit != '1') {
            //Converts characters into actual integers. If it can't read anything other than '1' or '0' then the code gets 86'd.
            	return 86;
            }
            number = (int) (number << 1 | (digit - '0'));
            /* Number holds the current total value in decimal format. 
             * Digit represents the current binary digit as a character.
             * (Digit - '0') converts the character digit into an integer.
             * Utilizes binary shift to multiply by a factor of 2.
             */
        }
        
        return number;
    }
}
