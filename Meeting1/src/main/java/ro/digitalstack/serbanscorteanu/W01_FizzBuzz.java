package ro.digitalstack.serbanscorteanu;

public class W01_FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(100);
    }

    public static void printFizzBuzz(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
