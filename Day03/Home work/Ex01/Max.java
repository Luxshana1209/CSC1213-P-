import java.util.Scanner;
class Max{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Num1: ");
		int Num1=ob.nextInt();
		System.out.println("Num2: ");
		int Num2=ob.nextInt();
		
		if(Num1>Num2)
		{
			System.out.println("maximum is "+Num1);
		}
		else
		{
			System.out.println("maximum is "+Num2);
		}
	}
}
		