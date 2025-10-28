package strings;

import java.util.Scanner;

public class BaseEx5String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "It's a beautiful day outside";
		System.out.println(text);
		String input = scan.next();
		
		String[] splitText = text.split(" ");
		text = "";
		
		for(int i = 0; i < splitText.length; i++) {
			if(input.equals(splitText[i])) {
				System.out.println("Found it !");
				input = scan.next();
				splitText[i] = input;
			}
			
			text += splitText[i] + " ";
		}

		System.out.println(text.trim());

		text = "elu par cette crapule";
		System.out.println(text);
		if(isPalindrome(removeSpace(text)))
			System.out.println("Palindrome");
		
		scan.close();
	}
	
	private static String removeSpace(String text) {
		StringBuilder newText = new StringBuilder();
		for(char c : text.toCharArray())
			if (!Character.isWhitespace(c))
				newText.append(c);
		
		return newText.toString();
	}
	
	private static boolean isPalindrome(String word) {
		char[] c = word.toCharArray();
		String newWord = "";
		
		if(c.length < 3)
			return false;
		
		for(int i = word.length()-1; i >= 0; i--) {
			newWord += c[i];
		}
		
		return word.equals(newWord);
	}
}
