package _1201;

//Create a Java program to insert a string at a specific position in a given string using a StringBuffer.

public class InsertString {
	
	    public static void main(String[] args) {
	        StringBuffer str = new StringBuffer("Hello World");
	        StringBuffer insert = new StringBuffer("Beautiful ");
	        int index = 6;
	        str.insert(index, insert);
	        System.out.println("String after insertion: " + str);
	    }
	}

