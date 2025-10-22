import java.util.*;

 // Compiler version JDK 11.0.2

 public class BankBalance2
 {
   public static void main(String args[])
   { 
     Scanner scanner = new Scanner(System.in);
     final double intRate = 0.03;
  
     
    System.out.println("Enter a balance");
    int balance = scanner.nextInt();
    int choice;
    int year = 1;
    do {
      balance += balance * intRate;
      
      System.out.println("After year " + year + " the balance is " + balance);
      
      System.out.println("Do you want to see the balance at another year?");
      System.out.println("Enter 1 for yes");
      
      choice = scanner.nextInt();
     
     year++;
    } while (choice == 1);
   }
 }
