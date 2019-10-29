package ua.pp.andreyvasylyuk;

import java.util.StringJoiner;
import java.util.Stack;

public class Anagram {
    public String reverse(String inputLine) {
        String[] words = inputLine.split(" ");

        StringJoiner reversedLine = new StringJoiner(" ");
        for (int i = 0; i < words.length; i++) {
            reversedLine.add(reverseWord(words[i]));
        }
        return reversedLine.toString();
    }

    private String reverseWord(String word) {
        char[] wordChars = word.toCharArray();
        Stack<Character> lettersStack = new Stack<>();

        for (int i = 0; i < wordChars.length; i++) {
            if (Character.isLetter(wordChars[i])) {
                lettersStack.push(wordChars[i]);
            }
        }
        
        StringBuilder bufferedWord = new StringBuilder();
        for (int i = 0; i < wordChars.length; i++) {
            if (Character.isLetter(wordChars[i])) {
                bufferedWord.append(lettersStack.pop());
            } else {
                bufferedWord.append(wordChars[i]);
            }
        }

        return bufferedWord.toString();
    }

}
