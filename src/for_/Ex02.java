package for_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int even_Sum=0,odd_Sum=0;
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				even_Sum +=i;
			}else {
				odd_Sum +=i;
			}
		}
		System.out.println("1~10짝수 합 : "+even_Sum);
		System.out.println("1~10홀수 합 : "+odd_Sum);
	}

}


