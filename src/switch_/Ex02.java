package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String msg = null;
		System.out.println("문자열 입력 : ");
		msg = scan.next();
		
		switch(msg) {
		case "안녕": System.out.println("하세요");break;
		case "그래": System.out.println("반갑다");break;
		default : break;
		}
		System.out.println("다음");
		
	}

}
