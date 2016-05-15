import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in, "UTF-8");
		System.out.println("Enter a, b,c: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double D=(b*b)-(4*a*c);
		if(Math.sqrt(D)<0){
			System.out.println("No solution!");			
		}
		else if(Math.sqrt(D)==0)
		{
			int x= -b/(2*a);
			System.out.println("The equation has only one solution: x1,2= " + x);			
		}
		else
		{
			double x1=((-b+Math.sqrt(D)))/(2*a)	;	
			double x2=((-b-Math.sqrt(D)))/(2*a)	;
			System.out.println("X1= "+x1+"  X2= "+x2);
		}
		sc.close();	
	}

}
