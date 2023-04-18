package for_;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 디버깅 : 모든 소프트웨어에서 소스 코드의 오류 또는 버그를 찾아서 수정하는 과정 
		 디버깅 브레이크 포인터 :특정한 지시를 수행하기 바로 직전, 프로그램을 중단시키도록 간섭을 일으키는 것
		 - F11 : 디버깅 시작
		 - F5: 한줄 씩 실행(메소드 안으로 들어감)
		 - F6: 한줄 씩 실행
		 - F8 : RUN 다음 break point 지점으로 이동
		 - ctrl + F2 : 디버깅 종료
		 */
		
		System.out.println("main start");
		int sum=0;
		for (int i=0; i<10; i++) {
			sum+=i;
			System.out.println(i+"종속문장");
		
		}	
		System.out.println("sum"+sum);
		System.out.println("main end");
		
		for (int i=0; i<100000; i++) {
			sum+=i;
			System.out.println(i+"종속문장");
		
		}	
		System.out.println("sum"+sum);
		System.out.println("main end");
		
		
		
		
		
		
		
		
		

	}// method end

}// class end
