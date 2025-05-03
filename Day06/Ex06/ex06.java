import java.util.Scanner;
class ex06{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		int marks[][]=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}	
System.out.println(" ");
		
for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}	
System.out.println(" ");		
		
for(int i=0;i<2;i++){
			int max=marks[i][0];
			for(int j=0;j<2;j++)
			{
				if(max<marks[i][j])
				{
					max=marks[i][j];
				}
				System.out.print(marks[i][j]+" ");
			}
				System.out.println();
				System.out.println("Maxium is: "+max);
		}
	}
}