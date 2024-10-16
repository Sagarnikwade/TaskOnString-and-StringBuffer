package _1201;

//Write a Java program to concatenate two strings using a StringBuffer.

public class ConcatenateStrings {  //Class Declaration
	
	    public static void main(String[] args) {  //Main Method
	    	
	        StringBuffer str1 = new StringBuffer("Hello");
	        StringBuffer str2 = new StringBuffer(" World");  //String Initialization
	        
	        str1.append(str2);  //String Concatenation
	        
	        System.out.println("Concatenated string: " + str1);  //output
	    }
	}

