import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter N factorial : ");
		int n=sc.nextInt();
		System.out.print(" Enter K factorial : ");
		int k=sc.nextInt();
		int n1=1;
		int k1=1;
		int l1=1;
		if(k<1 || k>n )
		{
		System.out.print(" Must be 1<K<N ");
		}
		else
		{
		for(int i=1;i<=n;i++){
			n1=n1*i;
		}
		for(int i=1;i<=k;i++){
			k1=k1*i;
		}
		for(int i=1;i<=n-k;i++){
			l1=l1*i;
		}
		System.out.println("N! =  "+n1+"|| K! = "+k1);
		System.out.print("N!*K!/(N-K)! = "+(n1*k1)/l1);
		}
		
		sc.close();
	}

}