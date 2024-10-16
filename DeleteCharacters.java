package _1201;

//Write a Java program to delete a range of characters from a given string using a StringBuffer.
public class DeleteCharacters {
	
	    public static void main(String[] args) {
	        StringBuffer str = new StringBuffer("Hello world");
	        int startIndex = 6;
	        int endIndex = 11;
	        str.delete(startIndex, endIndex);
	        System.out.println("String after deletion: " + str);
	    }
	}
