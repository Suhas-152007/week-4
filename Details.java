import java.util.Scanner;
public class Details {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String Na = sc.nextLine();
		System.out.println("Enter your Designation: ");
		String De = sc.nextLine();
		System.out.println("Enter your Number;- ");
		int Nu = sc.nextInt();
		System.out.println("My name is : " + Na);
		System.out.println("My designation is: " + De);
		System.out.println("My number is :- " + Nu);
	}
}