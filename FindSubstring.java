package _1201;

//Create a Java program that finds the first occurrence of a substring in a given string using a StringBuffer.

public class FindSubstring {  //Class Declaration
	
	    public static void main(String[] args) {  //Main Method
	    	
	        StringBuffer str = new StringBuffer("Hello World");  //String Initialization
	        StringBuffer substr = new StringBuffer("World");  
	        
	        int index = str.indexOf(substr.toString());  //Find Substring Index
	        
	        if (index != -1) {
	            System.out.println("Substring found at index " + index);
	        } else {
	            System.out.println("Substring not found");
	        }
	    }
	}

