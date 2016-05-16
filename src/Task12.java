import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in, "UTF-8");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			// Napravih go da ne se deli na 3 ILI 7,tyi kato ednovremenno nqma mnogo rezultati
			if(i%3==0 || i%7==0){}
			else {System.out.print(i+" ");}
		}
	}

}
