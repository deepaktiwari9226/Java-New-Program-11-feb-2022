import java.util.Scanner;
public class Check_Alphabet_Vowel_Constants {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Alphabet");
    char c = sc.next().charAt(0);
    switch(c) {
    case 'a':
    	System.out.println("Vowel");
    	break;
    case 'e':
    	System.out.println("Vowel");
        break;
    case 'i':
    	System.out.println("Vowel");
    	break;
    case 'o':
    	System.out.println("Vowel");
    	break;
    case 'u':
    	System.out.println("Vowel");
    	break;
    	default :
    		System.out.println("Constants");
     }
	}
}
