package for_;
import java.util.Scanner;
public class test_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean tf = true;
		int ch, sum=0;
		while(tf) {
			System.out.println("추가할 값을 입력하시오 0을 누르면 종료합니다");
			ch = scan.nextInt();
			if(ch == 0) tf = false;
			else {
				sum += ch;
			}			
		}
		System.out.println(sum);
	}
}


