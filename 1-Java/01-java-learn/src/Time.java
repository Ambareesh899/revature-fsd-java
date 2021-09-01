import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Time ");
		String Time=scan.next();
		for(int i=0;i<Time.length();i++) {
			char a=Time.charAt(i);
			if(a==':'){
				System.out.println(Time.charAt[i+1]);
				break;
			}
		}

	}

}
