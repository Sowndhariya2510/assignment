public class Case
{
public static void main(String[] args)
{
char c;
String str="Mary has a little dog,she calls him Pun";
System.out.println("String in lowercase"+str);
int len=str.length();
StringBuffer strbuffer=new StringBuffer(len);
for(int i=0;i<len;i++)
{
c=str.charAt(i);
if(Character.isTitleCase(c))
{
c=Character.toLowerCase(c);
}
if(Character.isUpperCase(c))
{
c=Character.toLowerCase(c);
}
if(Character.isLowerCase(c))
{
c=Character.toUpperCase(c);
}
strbuffer.append(c);
}
System.out.println("convert case"+strbuffer.toString());
}
}
