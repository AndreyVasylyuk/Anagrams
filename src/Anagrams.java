import java.io.*;
import java.util.Stack;

public class Anagrams {
	public static void main(String[] args) {
		String inputStr = "";

		// get input string
		//System.out.print("Write a text to acronym: ");
		try {
			inputStr = getString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// count white spaces to avoid adding last space below
		int spaces = 0;
		for(int i = 0; i < inputStr.length(); i++) {
		    spaces += (Character.isWhitespace(inputStr.charAt(i))) ? 1 : 0; 
		}

		// split inputStr to inputWords[]
		for(String word : inputStr.split(" ")) {						// for every word in splitted inputStr by " "
			//			System.out.println(word);						// print word before reversing

				// reverse every word and print
				char[] inputChar = word.toCharArray();					// char[] for every word

				Stack<Character> stack = new Stack<Character>();		// stack for letters

				// change letters for '|'
				for(int i = 0; i < word.length(); i++) {
					if(!Character.isLetter(inputChar[i])) continue; 	// if char is not a letter, bypass
					stack.push(inputChar[i]);							// if isLetter, push to stack
					inputChar[i] = '|';									// change this letter for |
				}

				// change '|' to reversed order letters
				for(int i = 0; i < word.length(); i++)
					if(inputChar[i] == '|') inputChar[i] = stack.pop();
				
				// print inputChar[] of every word
				for(char item : inputChar)
					System.out.print(item);
				
				// add space after every word, except the last one
				while(spaces > 0) {
					System.out.print(" ");
					spaces--;
				}
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);		
		BufferedReader br = new BufferedReader(isr);					
		String s = br.readLine();										
		return s;
	}
}
