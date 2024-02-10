package loop;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numner");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		System.out.println(rev);
		

	}

}
