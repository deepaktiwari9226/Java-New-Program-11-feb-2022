import java.util.Scanner;
public class Print_All_Odd {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter no");
   int n = sc.nextInt();
   // method 1 This used for running 10 times
  /* for(int i=1;i<=n;i++) {
	   if(i%2!=0) {
		   System.out.println(i);
	   }
   }  */
    // mehtod 2 This used for running 5 times
   for(int i=1;i<=n;i=i+2) {
	   System.out.println(i);
   }
	}
}
