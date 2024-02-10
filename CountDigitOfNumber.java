package loop;
import java.util.*;

public class CountDigitOfNumber {

	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			count++;
					}
		System.out.print(count);


	}

}
