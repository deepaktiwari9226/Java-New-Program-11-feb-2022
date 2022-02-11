import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
	int fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any no ");
    int n = sc.nextInt();
    while(n>1) {
    	fact = fact*n;
    	n--;
    }
    System.out.println(fact);
	}
}
