import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int multpl=number1*number2;
		if(multpl>=0)
		{
			System.out.println("+");
		}
		else{
			System.out.println("-");
	}

}}
