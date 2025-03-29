import java.util.Scanner;
class ForloopEx02{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);

System.out.println("Enter the Value for Counter 01: ");
int Counter01 = ob.nextInt();

System.out.println("Enter the Value for Counter 02: ");
int Counter02 = ob.nextInt();


for(int i=0;i<=Counter01;i++){
System.out.print("Value For i: "+i);

for(int j=0;j<=Counter02;j++){
System.out.print("Value For j: "+j+" ");
}
System.out.println();
}
}
}
