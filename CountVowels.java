package _1201;

//Create a Java program that counts the number of vowels in a given string using a StringBuffer.

public class CountVowels {
		 public static void main(String[] args) {
		        StringBuffer str = new StringBuffer("Hello World");
		        int count = 1;
		        for (int i = 0; i < str.length(); i++) {
		            char c = str.charAt(i);
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		            		 count++;
		            }
		        }
		        System.out.println("Number of vowels: " + count);
		    }
		}
		
	


