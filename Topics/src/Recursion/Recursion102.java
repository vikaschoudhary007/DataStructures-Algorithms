package Recursion;

// Parameterized and functional recursion
public class Recursion102 {

    public static void main(String[] args) {

        // sum of first n numbers

        int n = 10;
        int sum = 0;

//        helper(n, sum);

        System.out.println("Sum : "+ helper2(n));

    }

    // Parameterized
    public static void helper(int i, int sum){

        if(i < 1){
            System.out.println("Sum : "+sum);
            return;
        }
        helper(i-1, sum+i);
    }

    // functional  - f(n) -> sum of first n numbers
    // f(3) -> 3 + f(2)
    public static int helper2(int i){

        if(i == 0){
            return 0;
        }
        return i + helper2(i-1);
    }
}
