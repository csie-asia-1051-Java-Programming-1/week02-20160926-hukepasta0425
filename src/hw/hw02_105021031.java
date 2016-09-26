package hw;
import java.util.*;
public class hw02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("男生輸入1,女生輸入2");
		int bg=src.nextInt();
		System.out.println("身高:");
		int a=src.nextInt();
		
		double sum=0;
		if(bg==1)
		{
			sum=(a-80)*0.7;
		}
		else{
			sum=(a-70)*0.6;
		}
		System.out.print("標準體重:");
		System.out.print(sum);
		System.out.print("公斤");
	}

}
