import java.util.Scanner;
class Ex02{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
char control=' ';
int sum=0;
do{
System.out.println("Enter the number to find the summation: ");
int number=ob.nextInt();
sum=sum+number;
System.out.println("Do you want to continue (Y/N): ");
control=ob.next().charAt(0);
}
while (control=='Y');
{
System.out.println("Summation of the number:"+sum);
}
}
}


