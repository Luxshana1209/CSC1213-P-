import java.util.Scanner;
class Ex{
public static void main(String args[]){

Scanner ob = new Scanner(System.in);
System.out.println("Number: ");
int Number = ob.nextInt();

if(Number>0)
{
System.out.println("It's Positive");
}
else
{
System.out.println("It's Negative");
}
}
}