package org.opentutorials.javatutorials.loop;
 

// while문의 형식
//
//	while(조건){
//		반복 실행 영역
//	}



public class WhileDemo {
	/*
    public static void main(String[] args) {
        while (true) { //반복조건: true가 고정이기에 조건이 false라면 동작하지않는다.
            System.out.println("Coding Everybody"); //"coding everybody" 를 반복적으로 출력
        }
 
    }
 */
	/*
	public static void main(String[] args) {
	
		int i = 0;

		while (i<10) {
	
			System.out.println("Coding Everybody" +  i);
			i++;
		}
	}
	*/
	//for(초기화; 종료조건; 반복실행){
	//반복적으로 실행될 구문
	//}
    /*
	public static void main(String[] args) {
    	int max = 10;
        for (int i =  0; i < max; i=i+2) {
            System.out.println("Coding Everybody " + i);
        }
	
	
    }
	
	public static void main (String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if (i==5)
				break;
			System.out.println("Coding Everybody" + i);
			
		}
		
	}  
	

	
	public static void main (String[] args) {
		for (int i = 0; i < 10; i++ ) {
			if (i == 5)
				continue;  // 5때는 break가 되지만 다시 continue. 
			System.out.println("Coding Everybody" + i);
		}
	}
	
		*/
	
	public static void main (String[] args) {
		for (int i = 0; i <10 ; i ++) {
			for (int j = 0 ; j< 10; j ++) {
				System.out.println(i+""+j);
			}
			
		}
		
	}
	
	
	
	
}


