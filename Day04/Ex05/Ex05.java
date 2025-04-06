import java.util.Scanner;
class Ex05{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the Element"+(i+1)+":");
			numbers[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Element of the array: " );
		for(int number:numbers){
			System.out.println(number+"\t");
		}
	}
}

		
		