import java.util.Scanner;
class Ex03{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter the num: ");
			num[i]=ob.nextInt();
		}
		int Max=num[0];
		int Min=num[0];
		for(int i=0;i<5;i++){
		if(Max<num[i]){
			Max=num[i];
		}
		}
			System.out.println("Maximum: "+Max);
			for(int i=0;i<5;i++){
		if(Min>num[i]){
			Min=num[i];
		}
			}
			System.out.println("Minimum: "+Min);
		}
}

		
			
			