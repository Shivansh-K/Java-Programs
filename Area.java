import java.util.Scanner;
class Area
{
	public static void main(String arg[]){
		Scanner KB=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int l=KB.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int b=KB.nextInt();
		int a=l*b;
		System.out.println("The area of the rectangle is="+a);
	}
}
