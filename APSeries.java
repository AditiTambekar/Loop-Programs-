package loop;
import java.util.*;
public class APSeries {

	public static void main(String[] args) {
		int a,d,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmatic Programming Series");
		System.out.println("Enter A, D and N");
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
		int term=a;
		for(int i=1;i<=n;i++) {
			System.out.print(term+",");
			term=term+d;
		}

	}

}
