package org.example.lab2;

import java.util.Scanner;

public class StringMatcher {

    public static int counter = 0;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String script = sc.nextLine();

        int numWords = sc.nextInt();
        sc.nextLine();

        String[] words = new String[numWords];

        for(int i=0; i< numWords; i++){
            words[i] = sc.nextLine();
        }

        String[] dialogues = new String[10000];
        int index  = 0;
        int temp = 0;

        for(int i = 0; i< script.length(); i++){

            if(script.charAt(i) == ';' ||
                    script.charAt(i) == '.' ||
                    script.charAt(i) == ',' ||
                    script.charAt(i) == ':' ||
                    script.charAt(i) == '!'
            ){
                dialogues[index++] = createDialogue(script, temp, i).trim();
                temp = i+1;
            }
        }

        System.out.println("*********************");

        String[] newDialogues = new String[index];

        for(int i =0 ;i< newDialogues.length; i++){
            newDialogues[i] = dialogues[i];
        }

        for(String dialogue : newDialogues){
            System.out.println(dialogue);
        }


        for(int i = 0; i< newDialogues.length; i++){
            newDialogues[i] = replaceWords(newDialogues[i], words);
        }

        System.out.println("*********************");


        for(String dialogue : newDialogues){
            System.out.println(dialogue);
        }

        System.out.println("Counter : "+counter);


    }

    private static String replaceWords(String newDialogue, String[] words) {

        for(String word : words){

            int index  = newDialogue.indexOf(word);

            String changedDialogue = "";

            while(index != -1){
                String firstLetter = String.valueOf(word.charAt(0));
                String astrik = "*".repeat(word.length() - 1);

                newDialogue = newDialogue.substring(0, index) + firstLetter + astrik
                        + newDialogue.substring(index+word.length());

                counter ++;

                index  = newDialogue.indexOf(word, index+1);

            }
        }

        return newDialogue;
    }

    public static String createDialogue(String script, int startIndex, int endIndex){

        StringBuilder newDialogue = new StringBuilder();

        for(int i = startIndex; i < endIndex; i++){
            newDialogue.append(script.charAt(i));
        }

        return newDialogue.toString();
    }


}
