package skill_1;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		long b;
		float c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 'a' value: ");
		a = sc.nextInt();
		System.out.println("Original value : " +a);
		b = a;
		System.out.println("Long value : "+b);
		c=a;
		System.out.println("Float value : "+c);
	}

}
