import java.util.*;
class nw
{
public  void numword(int n,String str)
{
String s1[]={"","One","Two","Three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
String s2[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","eighty","Ninety"};
if(n>19)
{
System.out.println(s2[n/10]+""+s1[n%10]);
}
else
{
System.out.println(s1[n]);
}
if(n>0)
{
System.out.println(str);
}
}
public static void main(String args[])
{
	int n=0;
	Scanner p=new Scanner(System.in);
	System.out.println("enter number");
	n=p.nextInt();
	if(n<=0)
{
	System.out.println("enter greter than 0");
}
	else
{
 	nw num=new nw();
	num.numword((n/1000)%100,"thousand");
	num.numword((n/100)%10,"hundred");
	num.numword((n%100),"");
}

}
}