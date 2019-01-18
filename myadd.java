import java.util.*;
class myadd{
	int x;
	int y;
	myadd(int a,int b)
	{
	x=a;
	y=b;
	}
	myadd(){
       x=0;
       y=0;
	}
	int sum(){
	return x+y;
	}
    }
	class myaddmain{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int m,n,s;
	System.out.println("Enter first number:");
	m=in.nextInt();
	System.out.println("Enter second number:");
	n=in.nextInt();
	myadd x1=new myadd(m,n);
	s=x1.sum();
	System.out.println("sum is:"+s);
	}
	}
