import java.util.Scanner;
public  class IT24103036Lab3Q1B {
 public static void main (String [] args ) {
 double pricePerkg,quantity,discount,totalAmount,amountTopay ;
 Scanner input = new Scanner(System.in);
  System.out.println ("Enter the  price of 1kg of rice:");
  pricePerkg=input.nextDouble();
  System.out.println("Enter the number of kilograms you want to buy:");
  quantity=input.nextDouble();
  totalAmount=pricePerkg*quantity;
  discount=totalAmount*0.1;
  amountTopay=totalAmount-discount;
  System.out.println("The total amount with 10% discount is:" +amountTopay);
 }
}