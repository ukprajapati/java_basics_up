import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of A: ");
		int a=sc.nextInt();
		System.out.print("Enter value of B: ");
		int b=sc.nextInt();
		System.out.println("Addition is "+(a+b));
		System.out.println("Subtration is "+(a-b));
		System.out.println("Multiplication is "+(a*b));
		System.out.println("Division is "+(a/b));
	}
}
