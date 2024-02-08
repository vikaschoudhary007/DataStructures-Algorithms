import java.util.Objects;
import java.util.Scanner;

public class WordConnector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words : ");
        String words = sc.nextLine();

        String[] wordArr = words.split("\\|");

        boolean[] isAdded = new boolean[wordArr.length];

        isAdded[0] = true;

        String result = helper(wordArr[0], wordArr, isAdded);

        System.out.println("output : " + result);

    }

    public static String helper(String firstWord, String[] wordArr, boolean[] isAdded){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i< wordArr.length; i++){
            if(firstWord.toLowerCase().charAt(firstWord.length()-1) == wordArr[i].toLowerCase().charAt(0) && !isAdded[i]){

                isAdded[i] = true;
                String temp = helper(wordArr[i], wordArr, isAdded);

                if(temp.equals("-1")){
                    isAdded[i] = false;
                }
                else{
                    return stringBuilder.append(firstWord).append(" ").append(temp).toString();
                }

            }
        }

        if(checkIfAllUsed(isAdded)){
            return stringBuilder.append(firstWord).toString();
        }else{
            return "-1";
        }

    }

    public static boolean checkIfAllUsed(boolean[] isAdded){

        for(boolean x : isAdded) {
            if (!x) {
                return false;
            }
        }
        return true;
    }
}
