package com.company;

import java.util.Arrays;

public class Main {

    /**
     * language of your choice that you are capable of executing. Please submit the solution to either GitHub in an accessible location and provide a link through email (please send the assignment or any questions you may have to recruiting_people@vailsys.com or by replying to this email chain).
     * The problem we would like you to solve deals with an array of integers. We want to rotate these integers to a specified number of positions to the left.
     * If for example you have an array of integers [1,2,3,4,5,6,7] and we would like to rotate 2 positions to the left, the solution expected would be [3,4,5,6,7,1,2].
     * Note: the solution should be able to handle a position value greater than the number of integers in the array. If, for example, we would like to rotate [1,2,3,4,5,6,7] 8 positions to left, it would produce the result [2,3,4,5,6,7,1]. Negative values for the positions to rotate will throw an error which the code example should handle gracefully.
     * Thank you for your effort on this assignment and interest in Vail Systems! Please return this assignment within 2-3 business days.
     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int position = 8;
        int[] result = new int[numbers.length];
        String str = "";


        if (position > numbers.length - 1) {
            str = Arrays.toString(numbers).replaceAll("[[ ][]],]", "").replaceAll("\\[", "").substring(1) + Arrays.toString(numbers).replaceAll("[[ ][]],]", "").replaceAll("\\[", "").substring(0, 1);
        } else {
            str = Arrays.toString(numbers).replaceAll("[[ ][]],]", "").replaceAll("\\[", "").substring(position) + Arrays.toString(numbers).replaceAll("[[ ][]],]", "").replaceAll("\\[", "").substring(0, position);
        }
        for (int i = 0; i < str.length(); i++) {
            result[i] = Integer.parseInt("" + str.charAt(i));
        }

        System.out.println(Arrays.toString(result));

    }

}

