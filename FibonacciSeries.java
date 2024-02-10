package loop;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.println("Enter Number");
		n=sc.nextInt();
		System.out.print(a+","+b+",");
		for (int i=1;i<=n-2;i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
		

	}

}
