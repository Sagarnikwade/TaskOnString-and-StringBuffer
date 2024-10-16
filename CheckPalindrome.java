package _1201;

//Create a Java program that checks if a given string is a palindrome using a StringBuffer.

public class CheckPalindrome { //declearation
	
	    public static void main(String[] args) {  //main method
	        StringBuffer str = new StringBuffer("madam");  //string initialization
	        StringBuffer reverse = new StringBuffer(str).reverse();  //reverse the Striong
	        if (str.toString().equals(reverse.toString())) {  //palindrome check
	            System.out.println("The string is a palindrome."); //output statement
	        } else {
	            System.out.println("The string is not a palindrome.");  //output Statements
	        }
	    }
	}


