package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		String[] members = {"김태희", "전지현", "송혜교"};
		/*for(int i = 0 ; i< members.length; i++) {
			String member = members[i];
			System.out.println(member+"이 상담 받았습니다.");
		//간결하게 사용하기위해서 for each
		*/
		
		for(String e : members) { // 콜론 : -> 뒤에따라오는 데이터에 담겨있는 값들을 하나씩 꺼내서 변수에 담아주기로 약속.
			System.out.println(e+"상담 받았습니다.");
			
		}

			
			
			
		}
	}

 