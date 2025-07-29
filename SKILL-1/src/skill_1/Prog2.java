package skill_1;
import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 'a' value : ");
		a = sc.nextDouble();
		System.out.println("Original value : " +a);
		b = (int)a;
		System.out.println("Int value : " +b);
	}
}
