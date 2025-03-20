import java.util.Scanner;
class Ex{
	public static void main(String args[]){
		Scanner ob = new Scanner (System.in) ;
		System.out.println("Enter integer number: ");
		int num1=ob.nextInt();
		if(num1%2==0)
		{
			System.out.println("The number is even number");
		}
		else
		{
			System.out.println("The number is odd number");
		}
	}
}
		
		
		