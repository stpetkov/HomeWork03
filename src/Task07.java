import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		System.out.print("Enter card : ");
		String card=sc.nextLine();
		switch(card){
		case "1" :
		case "2" :
		case "3" :
		case "4" :
		case "5" :
		case "6" :
		case "7" :
		case "8" :
		case "9" :
		case "10":
		case "J" :
		case "Q" :
		case "K" :
		case "A" :
			System.out.println("The entered card is valid");break;
		default : 
			System.out.println("The entered card is INvalid");break;
		}
		sc.close();
	}}


