import java.util.Scanner;

public class IT24103036Lab3Q1A {
  public static void main(String[] args) {
  // create scanner object to read user input
   Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the price of 1kg of rice:-");
  double priceperkg = scanner.nextDouble();

 System.out.print("Enter the  number of kilograms of rice you want to buy:-");
  double kilograms = scanner.nextDouble();

  double totalAmount = priceperkg * kilograms;
  
  System.out.print("the total amount you have to pay for" + kilograms + "kg of rice is:-" + totalAmount);
  scanner.close();
    }
}