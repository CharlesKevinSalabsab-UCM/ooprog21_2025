public class Employee {
    private int employeeNumber;
    private int payRate;

    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final int MAX_RATE = 60;
    private final double OVERTIME_RATE = 1.5;
    private final int REGULAR_HOURS = 40;

    public Employee(int employeeNumber, int payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            throw new IllegalArgumentException("Error: Exceed the employee number");
        if (payRate > MAX_RATE)
            throw new IllegalArgumentException("Error: The maximum rate has been exceeded");
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularHours(int hours) {
        int totalRegularHours = hours;
        if (hours > REGULAR_HOURS)
            totalRegularHours = hours - (hours - REGULAR_HOURS);

        double totalPay = totalRegularHours * payRate;
        String format = String.format("%.2f", totalPay);
        return Double.parseDouble(format);
    }

    public double calculateOverHoursTime(int hours) {
        if (hours <= 40) return 0.0;

        int totalRegularHours = 0;
        if(hours > REGULAR_HOURS)
            totalRegularHours = hours - REGULAR_HOURS;
        double totalPay = totalRegularHours * payRate;
        String format = String.format("%.2f", totalPay);
        return Double.parseDouble(format);
    }
}
