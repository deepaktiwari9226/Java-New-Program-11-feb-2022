import java.util.*;
public class Check_PerfectNo_NotPerfectNo {
	public static void main(String[] args) {
		int sum = 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter no");
   int n = sc.nextInt();
    // method 1 or logic 2
  /* for(int i=1;i<n;i++) {
	   if(n%i==0) {
		   sum = sum+i;
	   }
   }
   if(n==sum) {
	  System.out.println("Perfect no"); 
   }
   else {
	   System.out.println("No Not Perfect");
   }
	} */
   // method 2 or logic 2
	 for(int i=1;i<=n/2;i++) {
		   if(n%2==0) {
			   sum = sum+i;
		   }
	   }
	   if(n==sum) {
		  System.out.println("Perfect no"); 
	   }
	   else {
		   System.out.println("No Not Perfect");
	   }
		}
}

// What is perfect no 
/*  input or divide no sum equal to it is perfect no */
