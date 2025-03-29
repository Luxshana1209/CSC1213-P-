import java.util.Scanner;
class Ex01{
public static void main(String args[]){

 Scanner ob = new Scanner(System.in);
System.out.println("Num1: ");
int Num1 = ob.nextInt();

System.out.println("Num2: ");
int Num2 = ob.nextInt();

System.out.println("Num3: ");
int Num3 = ob.nextInt();

if(Num1>Num2 && Num1>Num3 )
{
System.out.println("Maximum is "+Num1);
}
else if(Num1<Num2 && Num3<Num2)
{
System.out.println("Maximum is "+Num2);
}
else
{
System.out.println("Maximum is "+Num3);
}
}
}
 
 