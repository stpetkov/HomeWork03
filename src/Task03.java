import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		if(number1>number2 && number1>number3){
			System.out.println(number1+" is the biggest");
		}
		else if(number2>number1 && number2>number3){
			System.out.println(number2+" is the biggest");
		}
		else if(number3>number1 && number3>number2){
			System.out.println(number3+" is the biggest");
		}
		else {
			System.out.println("They are equal");
		}

	}

}
