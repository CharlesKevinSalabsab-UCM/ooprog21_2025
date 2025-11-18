class Main {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int output = solve(responseTimes);
        System.out.println(output);
    }
    
    static int solve(int[] responseTimes) {
        int total = 0;
        int count = 0;
        
        for(int i = 1; i < responseTimes.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                total += responseTimes[j];
                int average = total / i;
                if (responseTimes[i] > average) {
                    count++;
                }
            }
        }
        
        return count;
    }
}





