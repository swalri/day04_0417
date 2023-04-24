package if_;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
정수를 입력받아 아래와 같이 출력
3의 배수이며 4의 배수
3의 배수
4의 배수
3,4의 배수 아님
0은 잘못 입력
*/
		int num;
		System.out.println("수 입력");
		num = scan.nextInt();
		if(num==0) 					  System.out.println("오류"); //0일경우
		else if(num%3==0 && num%4==0) System.out.println("3과 4의 배수");//3과4d의 배수일경우
		else if(num%3==0) 			  System.out.println("3의 배수"); //3의 배수일경우
		else if(num%4==0) 			  System.out.println("4의 배수"); //4의 배수일경우
		else 						  System.out.println("3과 4의 배수 아님"); //둘다 아닐경우
		
		
	}

}
