package ro.digitalstack.serbanscorteanu;

import java.util.HashMap;
import java.util.HashSet;

public class W03_ContainsDuplicate {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};


        System.out.println("O(Log n^2 Way: ");
        System.out.println(containsDuplicateWorstWay(array1));
        System.out.println(containsDuplicateWorstWay(array2));
        System.out.println(containsDuplicateWorstWay(array3));

        System.out.println();

        System.out.println("Hashset Way: ");
        System.out.println(containsDuplicateHashsetWay(array1));
        System.out.println(containsDuplicateHashsetWay(array2));
        System.out.println(containsDuplicateHashsetWay(array3));
    }

    public static boolean containsDuplicateWorstWay(int[] nums) {
        // Complexity O(Log n^2)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateHashsetWay(int[] nums) {
        // Complexity O(Log n)
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
