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
		
		// Find a given word in the text and ask to replace it.
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
	
	/// Removes whitespace from a text.
	private static String removeSpace(String text) {
		StringBuilder newText = new StringBuilder();
		for(char c : text.toCharArray())
			if (!Character.isWhitespace(c))
				newText.append(c);
		
		return newText.toString();
	}
	
	/// Checks if the given String is a Palindrome.
	private static boolean isPalindrome(String text) {
		char[] c = text.toCharArray();
		String newWord = "";
		
		if(c.length < 3)
			return false;
		
		for(int i = text.length()-1; i >= 0; i--) {
			newWord += c[i];
		}
		
		return text.equals(newWord);
	}
}
