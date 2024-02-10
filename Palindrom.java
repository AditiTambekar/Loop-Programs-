package loop;
import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		int n,rev=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		int m=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		if(m==rev) {
			System.out.println("This is a palindrom number");
		}else {
			System.out.println("This is not a palindrom number");
		}
		

	}

}
