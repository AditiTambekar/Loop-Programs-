package loop;
import java.util.*;

public class SumOfNNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
			
			System.out.println(i+" "+sum);
		}
		

	}

}
