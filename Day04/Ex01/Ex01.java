import java.util.Scanner;
class Ex01{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);

System.out.println("Number: ");
int Number = ob.nextInt();

int sum=0;
int i=1;
while(Number>=i)
{
sum=sum+i;
i++;
}
System.out.println("Sum: "+sum);
}
}

