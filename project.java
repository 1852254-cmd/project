import java.util.Scanner;
import java.util.ArrayList;

public class project {
    public static void main(String[] args) {
    // Program logic goes here
        Scanner scanninator = new Scanner(System.in);
        while (true) {
            int selection = selectFunction(scanninator);
            if (selection == 1) {addTo100(scanninator);}
            else if (selection == 2) {computeFactorial(scanninator);}
            else if (selection == 3) {removeElement(scanninator);}
        
            // eat the old newline (?)
            scanninator.nextLine();
            System.out.println("done? y/n:");
            String done = scanninator.nextLine();
            if (done.equals("y")) {break;} 
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

    public static void computeFactorial(Scanner scanninator) {
        System.out.println("Input a number");
        int n = scanninator.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + "! = " + total);
    }

    public static void removeElement(Scanner scanninator) {
        // start the list
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Current list:");
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(3);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // remove element
        System.out.println("Input an element to remove");
        int toRemove = scanninator.nextInt();
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) == toRemove) {
                list.remove(i);
            }
            else {
                i += 1;
            }
        
        // show output
        System.out.println("Element removed, new list:");
        for (Integer outputNum : list) {
            System.out.print(outputNum + " ");
        }
        }
    }
}
