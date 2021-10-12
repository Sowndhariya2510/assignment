import java.util.*;
class triarea
{
public static void main(String[] args)
{
int x[]={10,10,80};
int y[]={20,60,20};
int area=Math.abs(x[0]*(y[1]-y[2])+x[1]*(y[2]-y[0])+x[2]*(y[0]-y[1]))/2;
System.out.println(area);
}
}