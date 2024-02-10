package loop;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,r,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		int m=n	;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
			
		}
			if(m==sum) {
				System.out.println("This is armstrong number");
			}else {
				System.out.print("This is not an armstrong number");
			}

		
		
	}

}
