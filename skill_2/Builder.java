package skill_2;
import java.util.Scanner;
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        System.out.print("Enter first string: ");
        sb1.append(sc.nextLine());

        System.out.print("Enter second string: ");
        sb2.append(sc.nextLine());

        System.out.println("\nFirst StringBuilder: " + sb1);
        System.out.println("Second StringBuilder: " + sb2);

        sb2.append(sb1);

        // Display both strings after joining
        System.out.println("\nFirst StringBuilder (unchanged): " + sb1);
        System.out.println("Second StringBuilder (after joining): " + sb2);

	}


}
