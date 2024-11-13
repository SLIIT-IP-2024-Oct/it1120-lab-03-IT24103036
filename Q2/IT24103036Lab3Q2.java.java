import java.util.Scanner;
public class IT24103036Lab3Q2 {
  public static void main (String [] args) {
   double monthlysalary,othours,othoursrate,otamount,totalsalary;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the monthly salary");
   monthlysalary=input.nextDouble();
    System.out.println("Enter the number of OT hours");
    othours=input.nextDouble();
    System.out.println("Enter the hourly rate");
    othoursrate=input.nextDouble();
    otamount=othours*othoursrate;
    totalsalary=monthlysalary+otamount;
    System.out.println("The total salary including OT is: " + totalsalary);
  }
}