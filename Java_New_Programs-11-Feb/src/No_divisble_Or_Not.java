import java.util.Scanner;
public class No_divisble_Or_Not 
{
	public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any integer no");
     int n = sc.nextInt();
      if (n%3==0 && n%5==0) {
    	 System.out.println("Sanju weds Geeta");
     }
     else if(n%5==0) {
    	 System.out.println("Geeta");
      }
     else  if(n%3==0) {
    	 System.out.println("Sanju");
     }
     else {
    	 System.out.println("Breakup");
      }
	}
}

