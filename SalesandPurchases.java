import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
class Product
{
int pno;
String pname;
int qty;
int price;
Product(int no,String name,int q,int p)
{
pno=no;
pname=name;
qty=q;
price=p;
}
}
class Sales
{
int pno,qty,samount;
Sales(int no,int q,int s)
{
pno=no;
qty=q;
samount=s;
}
}
class Purchase
{
int pno,qty,pamount;
Purchase(int no,int q,int p)
{
pno=no;
qty=q;
pamount=p;
}
}
class ProductCollection
{
public static void main(String [] args)
{
int no,qty,price;
String name;
Stack<Product>  s=new Stack<Product>();
Scanner sc=new Scanner(System.in);
String choice="yes";

while(choice.equals("yes"))
{
System.out.println("Enter Product number");
 no=sc.nextInt();
System.out.println("Enter Product name");
name=sc.next();
System.out.println("Enter product Price");
price=sc.nextInt();
System.out.println("Enter quantity in store");
qty=sc.nextInt();
System.out.println("Do you want to continue [yes/no]?");
choice=sc.next();
Product p1=new Product(no,name,qty,price);
s.push(p1);
}
System.out.println(" product number -- product name -- available quantity -- product price");
for(int i=0;i<s.size();i++)
{
System.out.println(s.get(i).pno+" "+s.get(i).pname+" "+s.get(i).qty+" "+s.get(i).price);
}
int sa=0,pn,q;
LinkedList<Sales> sm=new  LinkedList<Sales>();
System.out.println("Enter Product no");
 pn=sc.nextInt();
System.out.println("Enter customer required quantity");
q=sc.nextInt();
for(int i=0;i<s.size();i++)
{
if(s.get(i).pno==pn)
{ 
s.get(i).qty=s.get(i).qty-q;
sa=q*s.get(i).price;
}
}
Sales s2=new Sales(pn,q,sa);
sm.add(s2);
for(int i=0;i<sm.size();i++)
{
System.out.println(sm.get(i).pno+" "+sm.get(i).qty+" "+sm.get(i).samount);
}
System.out.println(" product number -- product name -- remaminig quantity -- product price");
for(int i=0;i<s.size();i++)
{
System.out.println(s.get(i).pno+" "+s.get(i).pname+" "+s.get(i).qty+" "+s.get(i).price);
}
int pa=0,pno,qt;
LinkedList<Purchase> pm=new  LinkedList<Purchase>();
System.out.println("Enter Product no");
 pno=sc.nextInt();
System.out.println("Enter purchasing quantity");
qt=sc.nextInt();
for(int i=0;i<s.size();i++)
{
if(s.get(i).pno==pno)
{ 
s.get(i).qty=s.get(i).qty+qt;
pa=qt*(s.get(i).price);
}
}
Purchase s3=new Purchase(pno,qt,pa);
pm.add(s3);
System.out.println(" product number -- purchased quantity -- product price");
for(int i=0;i<pm.size();i++)
{
System.out.println(pm.get(i).pno+" "+pm.get(i).qty+" "+pm.get(i).pamount);
}
System.out.println(" product number -- product name -- added quantity -- product price");
for(int i=0;i<s.size();i++)
{
System.out.println(s.get(i).pno+" "+s.get(i).pname+" "+s.get(i).qty+" "+s.get(i).price);
}

}
}
