package ro.digitalstack.serbanscorteanu;

public class W02_PrintingPatterns {
    public static void main(String[] args) {
        printTrianglePattern(5);
        printPascalTriangleMathWay(5);
    }

    public int[] returnPopulatedArray(int noElements) {
        int[] array = new int[noElements];
        for (int row = 0; row < noElements; row++) {
            array[row] = row + 1;
        }
        return array;
    }

    public static void printTrianglePattern(int n) {
        int count = 0;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangleMathWay(int n) {
        for (int row = 1; row <= n; row++) {
            int currentValue = 1;
            for (int column = 1; column <= row; column++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (row - column) / column;
            }
            System.out.println();
        }
    }

//    public static void printPascalTriangle(int n) {
//        for (int row = 1; row <= n; row++) {
//            int currentValue = 1;
//            for (int column = 1; column <= row; column++) {
//                System.out.print(currentValue + " ");
//
//            }
//            System.out.println();
//        }
//    }
}
