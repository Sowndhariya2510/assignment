import java.util.*;
class fib
{
  public static void main(String[] args) 
{
       int c=1,i,n;
 Scanner s=new Scanner(System.in);
       n=s.nextInt();
	int a=0,b=1;
	while(c<=n)
       {
         System.out.println(c+""); 
        a=b;
	b=c;
	c=a+b;
}	
}
}
