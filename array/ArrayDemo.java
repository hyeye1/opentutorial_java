package org.opentutorials.javatutorials.array;

public class ArrayDemo {
	
	public static void main(String[] arg) {
		//배열 정의하기
		//String[] classGroup = {"김태희", "전지현", "송혜교", "한예슬"};
		//호출하기 
		//System.out.println(classGroup[0]);
		
		String[] classGroup = new String[4]; //새로운 배열은 4개의 원소로 이루어져있다.
		classGroup[0] = "김태희";
		System.out.println(classGroup.length);
		
		classGroup[1] ="전지현";
		System.out.println(classGroup.length);
		
		classGroup[2] = "송혜교";
		System.out.println(classGroup.length);
		
		
		
		
	}
}
