package assignment1;

public class Palindrome {

	public static void main(String[] args) {
       String str = "madam";
       String rev = "";
       for (int i=str.length()-1; i>=0;i--) {
    	   
    	   rev = rev + str.charAt(i);
    	   
       }
       if (str.compareTo(rev)==0)
    	   System.out.println("The given string is palindrome");
       
       else
    	   System.out.println("The given string is not palindrome");
    	   
	}

}
