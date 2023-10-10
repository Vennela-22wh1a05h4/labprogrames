import java.util.*;
class Fact {
public static void main(String args[])
{ int i=1,f=1;
Scanner input=new Scanner (System.in);
System.out.println("enter the number to find factorial");
int num=input.nextInt();
 while(i<=num) {
  f=f*i;
  i++ ;
}
System.out.println("the factorial for above number is " + f);
input.close();
}
}