package org.example.lab3;

import java.util.Scanner;

public class WordConnector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();

        String[] wordsArr = words.split("\\|");
        boolean[] isAdded = new boolean[wordsArr.length];

        StringBuilder output = new StringBuilder();
        output.append(" ").append(wordsArr[0]);
        isAdded[0] = true;

        char[] charArr = wordsArr[0].toLowerCase().toCharArray();
        char lastChar = charArr[charArr.length-1];


        // hello|david|orange|eye|Edward

        connect(wordsArr, lastChar, output, isAdded);

        System.out.println("Output : "+ output);

    }

    public static void connect(String[] wordsArr, char lastChar, StringBuilder output, boolean[] isAdded){

        for(String word : wordsArr){
            for(int i = 1; i< wordsArr.length; i++){

                if(lastChar == wordsArr[i].toLowerCase().toCharArray()[0] && !isAdded[i]){
                    output.append(" ").append(wordsArr[i]);
                    isAdded[i] = true;


                    connect(wordsArr, wordsArr[i].charAt(wordsArr[i].length() - 1), output, isAdded);
                }
            }
        }

    }
}
