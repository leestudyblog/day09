package while_;

public class Ex01 {

	public static void main(String[] args) {
		/*while(조건문){
		 
		  	종속문장
		  	
		  }다음문장
		  
		  */
		int i=1, sum=0;
		while(i <=10) {
			sum +=i;
			i++;
		}
		System.out.println("while : "+sum);
		
		sum=0;
		for (i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.println("for : "+sum);
		
		
		

	}//method end

}
