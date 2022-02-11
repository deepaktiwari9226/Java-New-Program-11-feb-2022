import java.util.*;
public class Print_Sum_First_Natural_No {
	public static void main(String[] args) {
		int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no");
    int n = sc.nextInt();
    for(int i=0;i<=n;i++) {
    	sum = sum +i;
    }
    System.out.println(sum);
	}
}
