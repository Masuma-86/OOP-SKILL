package skill_2;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A[] = {'J','A','V','A'};
		String str=new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		str = sc.nextLine();
		System.out.println("1st string: " +A);
		System.out.println("2nd string: " +str);
	    String x = new String(A);
		System.out.println("Final output: " + x);
		sc.close();
	}

}
