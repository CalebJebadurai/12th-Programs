public class Initials_of_names
{
public void initials(String n)
{
int l=n.length();
int d=0;
char c;
for(int i=0;i<l;i++)
{
c=n.charAt(i);
if(c==' ')
{
d++;
if(d==1)
char e=n.charAt(i+1);
if(d==2)
{
char f=n.charAt(i+1);
String b=n.substring(i+1);
}
}
}
char g=n.charAt(o);
System.out.println(g+"."+e+"."+b);
System.out.println(g+"."+e+"."+f);
System.out.println(b+"."+g+"."+e);
}
}