import java.util.*;
public class Check_Vowel_Constants {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Alphabet");
    char c = sc.next().charAt(0);
    switch(c) {
    case 'A':
    	System.out.println("Vowel");
    	break;
    case 'E':
    	System.out.println("Vowel");
        break;
    case 'I':
    	System.out.println("Vowel");
    	break;
    case 'O':
    	System.out.println("Vowel");
    	break;
    case 'U':
    	System.out.println("Vowel");
    	break;
    	default :
    		System.out.println("Constants");
     }
	}
}
