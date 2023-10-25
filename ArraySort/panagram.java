package ArraySort;

import java.util.Scanner;

public class panagram {

	// we have to make one method to check it is panagram or not

	public static boolean isPanagram(String sentence) {
		sentence.toLowerCase();

		// make an empty array
		int[] results = new int[26];

		// Iterate sentence at every char value
		for (int i = 0; i < sentence.length(); i++) {
			char check = sentence.charAt(i);

			if (check >= 97 && check <= 122) {
				results[i] = 1;
			}
		}

		// if all the letter are present in sentence then it will return true
		for (int i = 0; i < results.length; i++) {
			if (results[i] != 1) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String sentence = sc.nextLine();
		if (isPanagram(sentence)) {
			System.out.println("this is panagram");
		} else {
			System.out.println("this is not panagram");
		}
	}
}
