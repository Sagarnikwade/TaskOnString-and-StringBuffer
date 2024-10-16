package _1201;

//Write a Java program to reverse a given string using a StringBuffer.
public class ReverseString {
	
	    public static void main(String[] args) {
	        StringBuffer str = new StringBuffer("Hello World");
	        System.out.println("Original String: " + str);
	        str.reverse();
	        System.out.println("Reversed String: " + str);
	    }
	}

