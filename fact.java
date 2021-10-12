import java.util.*;
class Factorial
{
static int factorial(int n)
{
if(n==0)
return 1;
else
return(n*factorial(n-1));
}
public void numword(int fact,String str)
{

String s1[]={"","One","Two","Three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
String s2[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","eighty","Ninety"};
if(fact>19)
{
System.out.println(s2[fact/10]+""+s1[fact%10]);
}
else
{
System.out.println(s1[fact]);
}
if(fact>0)
{
System.out.println(str);
}
}
public static void main(String[] args)
{
	int i,fact=1;
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	fact=factorial(num);
System.out.println(fact);
if(fact<=0)

{
	System.out.println("enter greater than 0");
	}
	else
{
	Factorial f=new Factorial();
	f.numword((fact/1000)%100,"thousand");
	f.numword((fact/100)%10,"hundred");
	f.numword((fact%100),"");
}
}
}

