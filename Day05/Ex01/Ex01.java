import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int[] number = new int[5];
		int sum=0;
		for(int i=0;i<=4;i++){
		
		System.out.println("Enter num:");
		 number[i] =  ob.nextInt();
		sum=sum+number[i];
		}
		System.out.println("Total sum:"+sum);
	}
}

		
		
		
