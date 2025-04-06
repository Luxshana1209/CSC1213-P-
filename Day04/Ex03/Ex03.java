import java.util.Scanner;
class Ex03{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
char control=' ';
int a=0;
int s=0;
do{
System.out.println("Enter the number to find the summation: ");
int number=ob.nextInt();
if (number%2==0)

	a=a+1;
	

else

	s=s+1;
	

System.out.println("Do you want to continue (Y/N): ");
control=ob.next().charAt(0);
}
while (control=='Y'|| control=='y');
{

System.out.println("count of odd number:"+s);
System.out.println("count of even number:"+a);

}

}
}

