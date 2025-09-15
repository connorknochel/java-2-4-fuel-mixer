import java.util.Scanner;

public class FuelMixer {

    public static void main(String[] args) {
        // Named constant (hint: final) for the mixture.
        Scanner input = new Scanner(System.in);
        final double LOX_RECIPE = 2.56;
        double fuel;
        double Lox;
        double RP1;
        System.out.println("How many kilograms of fuel are needed for the test?");
        fuel = input.nextDouble();
        
        
        Lox = fuel * LOX_RECIPE;
        RP1 = Lox + fuel;
        
        System.out.println("You need " + Lox + " kilograms of oxidizer for " +fuel+ " kilograms of fuel.");
        System.out.println("The total weight of RP-1 required is "+RP1+" kilograms.");
      

        // Variables for the adjusted mixture.

        // Create a Scanner object for keyboard input.

        // Get the amount of fuel being used.

        // Close the keyboard scanner

        // Calculate how much oxidizer is required for that much fuel.

        // Calculate the total propellant weight

        // Display the outputs.

        // Close the program

    }

}
