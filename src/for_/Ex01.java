package for_;
import java.util.Iterator;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
for(초기값;조건식;증감식){
	종속문장
}
반복문을 사용할 경우
 - 어떠한 식이 동일하게 동작해야 하는 경우
 - 어떠한 값이 규칙적으로 변하는 경우
*/
//		int i=1,sum=0;
//		for(;i<=10;i++)	sum +=i;		
//		System.out.println(i);
//		System.out.println(sum);
		
		int num;
		System.out.println("반복횟수 입력");
		num = scan.nextInt();
		for (int i=0;i<num;i++) {
			System.out.println("i : "+i);
		}
	}
}


