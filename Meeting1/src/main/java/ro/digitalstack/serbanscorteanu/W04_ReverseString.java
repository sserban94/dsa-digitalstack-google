package ro.digitalstack.serbanscorteanu;

import java.util.Arrays;

public class W04_ReverseString {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(reverseStringForLoopWay(hello));

    }

    public static String reverseStringForLoopWay(String text) {
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char aux = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = charArray[i];
            charArray[i] = aux;
        }
        return Arrays.toString(charArray);
    }

//    public static String reverseStringWhileLoopWay(String text) {
//        char[] charArray = text.toCharArray();
//
//        while()
//        return Arrays.toString(charArray);
//    }
}
