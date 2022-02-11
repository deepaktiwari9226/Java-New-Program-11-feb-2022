import java.util.*;
public class Check_No_Prime_Not {
	public static void main(String[] args) {
		int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no");
    int n = sc.nextInt();
   // logic 1
  /*  for(int i=2;i<=n-1;i++) {
    	if(n%2==0) {
    		temp = temp+1;
    	}
    }
    if(temp==0) {
    	System.out.println(" No not prime");
    }
    else {
    	System.out.println("No prime");
    }   */
    // logic 2
    for(int i=2;i<=n/2;i++) {
    	if(n%2==0) {
    		System.out.println(n+" is No not Prime");
      return ;
    	}
    }
    System.out.println(n+" is No Prime ");
	}
}
