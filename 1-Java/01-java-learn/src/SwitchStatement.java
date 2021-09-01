import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an option");
		System.out.println("1 Recharge");
		System.out.println("2 Balance Enquiry");
		System.out.println("3 Change caller tune");
		int opt=scanner.nextInt();
		
		switch(opt ){
		case 1:
			System.out.println("Recharge");
			break;
		case 2:
			System.out.println("Balance Enquiry");
			break;
		case 3:
			System.out.println("Change caller tune");
			break;	
		}
	}
}
