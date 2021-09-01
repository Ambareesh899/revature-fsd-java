import java.util.Scanner;
public class WebUrlChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Web address");
		String url=scanner.nextLine();
		
		if(url.startsWith("https://") || url.startsWith("http://")) {
			System.out.println("This is a valied url");	
		}
		else {
			System.out.println("This is not a valied link");
		}
		

	}

}
