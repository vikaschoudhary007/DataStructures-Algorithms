package Recursion;

import java.util.Arrays;

public class Factorial {

    public static void main(String[] args) {

//        int n = 5;
//        System.out.println("factorial : " + factorial(n));

        int[] arr = new int[]{1,2,3,4,2};

//        reverseArr(arr);
//
//        System.out.println(Arrays.toString(arr));

//        reverseArr2(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        String str = "madam";
//        System.out.println(isPalindrome(str, 0, str.length()-1));

        System.out.println(fibonacci(5));
    }

    public static int factorial(int n){

        if(n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }

    // using two pointers
    public static void reverseArr(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    // using recursion
    public static void reverseArr2(int[] arr, int start, int end){

        if(start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr2(arr, start+1, end-1);

    }

    // palindrome or not

    public static boolean isPalindrome(String str, int start, int end){

        if(start >= end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return isPalindrome(str, start+1, end-1);
    }

    // Fibonacci - nth fibonacci number
    public static int fibonacci(int n){

        if(n <= 1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
