import java.util.Scanner;

public class project {
    public static void main(String[] args) {
    // Program logic goes here
        Scanner scanninator = new Scanner(System.in);
        while (true) {
            int selection = selectFunction(scanninator);
            if (selection == 1) {addTo100(scanninator);}
            else if (selection == 2) {addTo100(scanninator);}
            else if (selection == 3) {addTo100(scanninator);}
        
            System.out.println("done? y/n:");
            if (scanninator.nextLine() == "y") {break;} 
        }
    }

    public static int selectFunction(Scanner scanninator) {
        System.out.println("1: Add to 100");
        System.out.println("2: Compute Factorial");
        System.out.println("3: Remove List Value");
        System.out.println("Select a function to run:");
        int selection = scanninator.nextInt();
        return selection;
    }

    public static void addTo100(Scanner scanninator) {
        int count = 0; 
        while (count < 100) {
            System.out.println("Total: " + count + ", add another number");
            count += scanninator.nextInt();
        }
        System.out.println("Success! Total: " + count);
    }

    public static void computeFactorial(Scanner scanninator, int n) {
        int total = 0;
        for (n > 0; n--) {

        }

        System.out.println("Success! Total: " + count);
    }
}
