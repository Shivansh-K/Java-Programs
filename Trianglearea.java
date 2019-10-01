import java.util.Scanner;
class Trianglearea
{
	public static void main(String arg[]){
		Scanner KB=new Scanner(System.in);
		System.out.println("enter the base of the triangle:");
		float b=KB.nextFloat();
		System.out.println("enter the height of the triangle:");
		float h=KB.nextFloat();
		float a=(b*h)*1/2;
		System.out.println("area of the triangle is="+a);
	}
}