import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Time ");
		String time=scan.next();
		System.out.println(time.substring(3,5));

	}

}
