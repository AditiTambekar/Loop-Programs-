package loop;
import java.util.*;

public class DisplayDigits {

	public static void main(String[] args) {
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			System.out.print(r);
			
		}

	}

}
