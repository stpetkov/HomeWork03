import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		long number1=sc.nextLong();
		long number2=sc.nextLong();
		long divide=number1/number2;
		if(divide>0)
		{
			System.out.println(" + ");
		}
		else{
			System.out.println(" - ");
	}
		sc.close();
}}
