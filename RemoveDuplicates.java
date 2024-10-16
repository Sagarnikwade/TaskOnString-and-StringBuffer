package _1201;

//Write a Java program to remove duplicate characters from a given string using a StringBuffer.

public class RemoveDuplicates {  //class declaration
	
	    public static void main(String[] args) {  //main method
	        StringBuilder str1 =new StringBuilder("Hello world");  //String initialization
	        StringBuilder result1 = new StringBuilder();  //result initialization
	        for (int i = 0; i < str1.length(); i++) {  //Loop Through Characters
	            char c = str1.charAt(i);
                //This for loop iterates through each character of the original string "String".
	        	//The charAt(i) method retrieves the character at the current index "i"
	            
	            if (!result1.toString().contains(String.valueOf(c))) { //Duplicate Check
	                result1.append(c);  //Appending Unique Characters
	            }
	        }
	        System.out.println("String without duplicates: " + result1);  //output
	    }
	}


