package for_;

import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, j; 
		
		System.out.println("행의 값을 입력하시오");
		int a=input.nextInt();
		System.out.println("열의 값을 입력하시오");
		int b=input.nextInt();
		
		if(a<=10 && b<=50 && a!=0 &&b!=0) {
		for(i=1; i<=a; i++) {
			for (j=1; j<=b; j++ ) {
			
				System.out.print(i*j+" ");
			}
			System.out.println();
		} 
		
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	
		
		
	}

}
