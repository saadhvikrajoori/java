import java.util.Scanner;
class Calculator{
int add(int a,int b){return a+b;}
int add(int a,int b,int c){return a+b+c;}
double add(double a,double b){return a+b;}
String add(String a,String b){return a+b;}
}
public class MethodOverLoadingWithInput{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Calculator calc=new Calculator();
System.out.println("Enter two integers:");
int x=sc.nextInt();int y=sc.nextInt();
System.out.println("Sum of two ints:"+calc.add(x,y));
System.out.println("Enter three integers:");
int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
System.out.println("Sum of three ints:"+calc.add(a,b,c));
System.out.println("Enter two doubles:");
double d1=sc.nextDouble();double d2=sc.nextDouble();
System.out.println("Sum of two doubles:"+calc.add(d1,d2));
sc.nextLine();
System.out.println("Enter first string:");
String s1=sc.nextLine();
System.out.println("Enter second string:");
String s2=sc.nextLine();
System.out.println("Concatenation of strings:"+calc.add(s1,s2));
sc.close();
}
}
