import java.util.Scanner;
class Ex{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Num1: ");
		int Num1=ob.nextInt();
		
		
		if(Num1%5==0 && Num1%11==0)
		{
			System.out.println("divide 5 and 11");
		}
		else
		{
			System.out.println("Not divide 5 and 11");
		}
	}
}
		