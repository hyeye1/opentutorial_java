package org.opentutorials.javatutorials.loop;
 

// while���� ����
//
//	while(����){
//		�ݺ� ���� ����
//	}



public class WhileDemo {
	/*
    public static void main(String[] args) {
        while (true) { //�ݺ�����: true�� �����̱⿡ ������ false��� ���������ʴ´�.
            System.out.println("Coding Everybody"); //"coding everybody" �� �ݺ������� ���
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
	//for(�ʱ�ȭ; ��������; �ݺ�����){
	//�ݺ������� ����� ����
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
				continue;  // 5���� break�� ������ �ٽ� continue. 
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


