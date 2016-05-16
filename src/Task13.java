import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in, "UTF-8");
		System.out.print("How many numbers would u like to enter : ");
		int n=sc.nextInt();
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			System.out.print("number("+i+") : ");
			int now=sc.nextInt();
			if(now>largest){
				largest=now;
			}
			if(now<smallest){
				smallest=now;
			}
		}
		System.out.println("The largest number is : "+largest);
		System.out.println("The smallest number is : "+smallest);
	}

}
