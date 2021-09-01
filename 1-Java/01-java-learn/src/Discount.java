import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Bill amount");
		float Bill=scanner.nextFloat();
		System.out.print("Enter DiscountPercentage :");
		float DiscountPercent=scanner.nextFloat();
		float Percentage=(Bill*DiscountPercent)/100;
		System.out.println("Discount is"+Percentage);

	}

}
