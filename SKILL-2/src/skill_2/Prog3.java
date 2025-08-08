package skill_2;
import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        
        sb.append(" Java");
        sb.insert(0, "Hello ");
        sb.replace(6, 11, "World");
        sb.delete(6, 11);
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        
        sc.close();
	}

}
