import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(number1>number2){
			System.out.println(number1+" is bigger");
		}
		else if(number1==number2){
			System.out.println("Equal");
		}
		else  {
			System.out.println(number2+" is bigger");
		}

	}

}
