import java.util.*;

class Payroll
{
    public static void main (String args[])
    {
        int totalHours;
        int payRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours did you work this week?");
        totalHours = scanner.nextInt();
        System.out.println("What is your regular pay rate?");
        payRate = scanner.nextInt();


        try {
            Employee employee = new Employee(1410, payRate);
            double regularPay = employee.calculateRegularHours(totalHours);
            double overtimePay = employee.calculateOverHoursTime(totalHours);
            System.out.println("Regular pay is " + regularPay);
            System.out.println("Overtime pay is " + overtimePay);
        }
        catch (Exception e) {
          System.out.println(e);
        }
    }
}
