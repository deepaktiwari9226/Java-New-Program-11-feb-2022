import java.util.*;
public class User_Input_No_Count {
	public static void main(String[] args) {
		int count = 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter user input");
   int n = sc.nextInt();
   while(n!=0) {
	   n = n/10;
	   count++;
   }
   System.out.println("User input integer value are = "+count);
	}

}
