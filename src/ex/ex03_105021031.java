package ex;

/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */
import java.util.*;

public class ex03_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("從");
		int a = src.nextInt();
		int b = src.nextInt();
		System.out.println("到");
		int c = src.nextInt();
		int d = src.nextInt();

		int r = (c * 60 + d) - (a * 60 + b);
		r = r - r % 30;
		// System.out.print(r);
		int sum = 0;

		sum = sum + 120+160;
			r=r-240;
		int x=r/30;
		sum=sum+x*60;
		System.out.print(sum);

	}

}
