package spendmoneywithme;
import java.util.Scanner;
public class abuServiceStation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Print header
            System.out.println("Product      Qty      Price       Miles      Total");
            System.out.println("----         ---      -----      -----      -----");

            // Input product details
            System.out.print("What do you want to buy?: ");
            String productName = scanner.nextLine();
            System.out.print("How Many: ");
            int quantity = scanner.nextInt();
            System.out.print("Price per unit: $");
            double pricePerUnit = scanner.nextDouble();
            System.out.print("Enter distance (in miles): ");
            double distance = scanner.nextDouble();

            // Calculate total cost
            double fee;
            if (distance >= 0 && distance <= 5) {
                fee = 2.0;
            } else if (distance <= 15) {
                fee = 5.0;
            } else if (distance <= 25) {
                fee = 10.0;
            } else if (distance <= 50) {
                fee = 15.0;
            } else {
                fee = 20.0;
            }

            double totalCost = quantity * pricePerUnit + fee;

            System.out.println("Product      Qty      Price       Miles      Total");
            System.out.println("----         ---      -----      -----      -----");
            System.out.println(productName + "         " + quantity + "        " + pricePerUnit + "      " + distance + "       " + totalCost);            System.out.println("\nThank you. Come Again!");

            // Close the scanner
            scanner.close();
    }
}
