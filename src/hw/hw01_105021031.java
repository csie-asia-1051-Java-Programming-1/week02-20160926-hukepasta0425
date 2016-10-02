package hw;
import java.util.*;
public class hw01_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.print("錢： ");
		int n=src.nextInt();
		System.out.print("蘋果： ");
		int a=src.nextInt();
		System.out.print("柳丁： ");
		int b=src.nextInt();
		System.out.print("桃子： ");
		int c=src.nextInt();
		
		int x=a*15+b*20+c*30;
		int p=0;
		int p1=0;
		int q=0;
		int q1=0;
		
		if(n>=x)
		{
			 p=x/50;
			p1=x%50;
			q=p1/5;
			 q1=q%5;
		}
		else
		{
			System.out.print("0");
		}
		
		System.out.println(p+"個50元");
		System.out.println(q+"個5元");
		System.out.println(q1+"個1元");
		
	}

}
