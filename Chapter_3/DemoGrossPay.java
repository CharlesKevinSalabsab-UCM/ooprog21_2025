class DemoGrossPlay {
    
    public static void main(String[] args) {
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }
    
    static void calculateGross(double hours) {
         final double HOURLY_RATE = 22.75;
         double result = hours * HOURLY_RATE;
         System.out.println(hours + " hours at " + HOURLY_RATE + " per hour is $" +  result);
    }
}
