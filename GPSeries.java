package loop;
import java.util.*;
public class GPSeries {

	public static void main(String[] args) {
		int a,r,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Geomatric Series");
		System.out.println("Enter a, r and n");
		a=sc.nextInt();
		r=sc.nextInt();
		n=sc.nextInt();
		int term=a;
		for(int i=1;i<n;i++) {
			System.out.print(term+" ");
			term=term*r;
		}

	}

}
