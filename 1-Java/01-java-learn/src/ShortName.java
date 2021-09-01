import java.util.Scanner;
public class ShortName {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		if(name.length()>=2 && name.length()<=6) {
			System.out.println("short name");
		}
		else {
			System.out.println("Not a shor name");
		}
		
		

	}

}
