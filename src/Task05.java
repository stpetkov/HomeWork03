import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in, "UTF-8");
		System.out.println("Enter three numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();	
		if(a<0 || b<0 || c<0){
			System.out.println("These numbers can not be sides of a triangle");
		}else if(a>b+c || b> a+c || c>a+b){
			System.out.println("These numbers can not be sides of a triangle");		
		}else{
			System.out.println("These numbers can be sides of a triangle");
		}
		sc.close();
	}

}
