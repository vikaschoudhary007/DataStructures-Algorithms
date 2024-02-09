package Recursion;

// Recursion calling
public class Recursion101 {

    public static void main(String[] args) {

        int i = 1;
        int n = 10;
        helper2(n, n);

    }

    // Simple recursive function to print 1 to n numbers
    public static void helper(int i, int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        helper(i+1, N);
    }


    // Simple recursive function to print 1 to n numbers but using backtracking
    public static void helper2(int i, int N){
        if(i < 1){
            return;
        }
        helper2(i-1, N);
        System.out.println(i);
    }


}
