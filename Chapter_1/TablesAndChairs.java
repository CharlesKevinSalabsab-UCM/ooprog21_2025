class TablesAndChairs {
    public static void main(String[] args) {
        final int maxRow = 7;
        final int maxColumn = 28;

        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxColumn; j++) {
                if (j == 0 || j == maxColumn - 1) System.out.print("*");
                else if (i == 2 && (j > 8 &&  j < 18)) System.out.print("*");
                else if (i == 3 && ((j > 0 && j < 7) || j == 9 || j == 17 || j > 19)) System.out.print("*");
                else if (i > 3 && (j == 6 || j == 9 || j == 17 || j == 20)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
