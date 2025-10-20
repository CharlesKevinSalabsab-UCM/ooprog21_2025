import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double interestRate = 0.03; 
        System.out.print("Enter the initial bank account balance: ");
        double balance = scanner.nextDouble();

        int year = 1;
        int choice;
        
        System.out.println("Do you want to see the balance after year 1? 1 for yes 0 for no or any number");
        choice = scanner.nextInt();
        if(choice == 1) {
            balance += balance * interestRate;
            System.out.println("After year " + year + " with " + interestRate + " Interest Rate Balance: " + balance);
        }
        else {
            System.exit(0);
        }
       while(true) {
           year++;
        System.out.println("Do you want to see another year? 1 for yes, 0 for no or any number");
        
        choice = scanner.nextInt();
        
        if (choice == 1) {
            balance += balance * interestRate;
            System.out.println("After year " + year + " with " + interestRate + " Interest Rate Balance: " + balance);
            continue;
        }
        break;
       }
        scanner.close();
    }
}
