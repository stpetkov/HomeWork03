import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in , "UTF-8");
		System.out.print("Enter number from 1 to 999 : ");
		int number=sc.nextInt();
		int number1=number/100;
		int number2=number/10%10;
		int number3=number%10;
		switch(number1) {
		case 1 : System.out.print("One hundred ");break;
		case 2 : System.out.print("Two hundred ");break;
		case 3 : System.out.print("Three hundred ");break;
		case 4 : System.out.print("Four hundred ");break;
		case 5 : System.out.print("Five hundred ");break;
		case 6 : System.out.print("Six hundred ");break;
		case 7 : System.out.print("Seven hundred ");break;
		case 8 : System.out.print("Eight hundred ");break;
		case 9 : System.out.print("Nine hundred ");break;
		}
		if(number%100>=10 && number%100<=19 && number%100 !=0){
			if(number>19){System.out.print(" And ");}
		switch(number%100) {
		case 10 : System.out.print(" Ten ");break;
		case 11 : System.out.print(" Eleven ");break;
		case 12 : System.out.print(" Twelve ");break;
		case 13 : System.out.print(" Thirteen ");break;
		case 14 : System.out.print(" Forteen ");break;
		case 15 : System.out.print(" Fifteen ");break;
		case 16 : System.out.print(" Sixteen ");break;
		case 17 : System.out.print(" Seventeen ");break;
		case 18 : System.out.print(" Eighteen ");break;
		case 19 : System.out.print(" Nineteen ");break;
		}}
		else{
		switch(number2) {
		case 2 : System.out.print(" Twenty ");break;
		case 3 : System.out.print(" Thirty ");break;
		case 4 : System.out.print(" Forty ");break;
		case 5 : System.out.print(" Fifty ");break;
		case 6 : System.out.print(" Sixty ");break;
		case 7 : System.out.print(" Seventy ");break;
		case 8 : System.out.print(" Eightty ");break;
		case 9 : System.out.print(" Ninety ");break;
		}
		if(number%100<=10 && number>9 && number%10!=0){System.out.print(" and ");}
		switch(number3) {		
		case 1 : System.out.print(" One ");break;
		case 2 : System.out.print(" Two ");break;
		case 3 : System.out.print(" Three ");break;
		case 4 : System.out.print(" Four ");break;
		case 5 : System.out.print(" Five ");break;
		case 6 : System.out.print(" Six ");break;
		case 7 : System.out.print(" Seven ");break;
		case 8 : System.out.print(" Eight ");break;
		case 9 : System.out.print(" Nine ");break;
		}}
		sc.close();
	}

}
