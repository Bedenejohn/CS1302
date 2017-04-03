package prob2;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		String sentence;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.printf("%40s" , "Input a String:");
			sentence = scan.nextLine();
			if(sentence==null || sentence.isEmpty()){
				System.out.printf("%40s" , "Have a good day!");
				break;
			}
			System.out.printf("%40s%5s" , "reverseWords():",reverseWords(sentence)+"\n");
		}

	}
	public static StringBuilder reverseWords(String word){
		StringBuilder result = new StringBuilder();
		int counter = word.length();
		for(int i = word.length()-1; i >= 0; i--){
			if(i==0)
				result.append(word.substring(i,counter) + " ");
			if(Character.isSpaceChar(word.charAt(i))){
				result.append(word.substring(i+1,counter) + " ");
				counter = i;
			}
		}
		return result;
	}

}
