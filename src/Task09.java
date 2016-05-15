import java.util.Scanner;

public class Task09 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in, "UTF-8");
			System.out.println("Enter 5 numbers to compare: ");
			
			double largest=0;
			double number;
			
			for(int i=1; i<=5; i++){
				System.out.print("number ("+i+"): ");
				number=sc.nextDouble();
				if(number>largest){
					largest=number;
				}
			}
			System.out.println("The largest number is: "+ largest);
			sc.close();
		}	
	}


