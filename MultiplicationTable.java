package loop;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
		

	}

}
