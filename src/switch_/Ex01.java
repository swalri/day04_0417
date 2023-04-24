package switch_;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
switch(식) {
case 1:종속문장 break;
case 2:종속문장 break;
case 3:종속문장 break;
default:종속문장
}
*/
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = scan.nextInt();
		switch(num) {
		case 1: System.out.println("1입력"); break;
		case 2: System.out.println("2입력"); break;
		default: System.out.println("오류"); break;
		}
		System.out.println("다음");
		
		
		
		
		
		
		
	}

}
