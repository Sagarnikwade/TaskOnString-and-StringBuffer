package _1201;

// Write a Java program to replace all occurrences of a character in a given string using a StringBuffer.

public class ReplaceCharacters {
	
	    public static void main(String[] args) {
	        StringBuffer str = new StringBuffer("Hello World");
	        char oldChar = 'o';
	        char newChar = '*';
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == oldChar) {
	                str.setCharAt(i, newChar);
	            }
	        }
	        System.out.println("String after replacement: " + str);
	    }
	}

