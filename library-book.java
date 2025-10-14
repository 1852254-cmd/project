import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Days Overdue?");
        int days = scan.nextInt();
        System.out.println("Books?");
        int books = scan.nextInt();
        float price = (books*days*0.5f);
        if (price > 20.0f) { price = (price * 0.9f); }
        System.out.println(price);
    }
}

