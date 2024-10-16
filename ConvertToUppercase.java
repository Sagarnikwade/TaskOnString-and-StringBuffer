package _1201;

// Create a Java program to convert a given string to uppercase using a StringBuffer.

public class ConvertToUppercase {
	
	    public static void main(String[] args) {
	        StringBuffer str = new StringBuffer("hello world");
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            str.setCharAt(i, Character.toUpperCase(c));
	        }
	        System.out.println("String in uppercase: " + str);
	    }
	}

