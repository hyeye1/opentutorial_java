package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //->scanner객체가 가지고있는 hasnextint라는 메소드를 호출
        	// hasnext 의 역할 : 메소드를 자바가 실행하면 일단 정지가됨
        	// 와일문안에 자바의 실행이 정지되어있다는것은 반복문이 실행이안되고 대기하고있음
        	//그리고 사람들이 입력한 값이 엔터라면 중지되어있던 자바의 실행을 다시 작동시킴
        	//만약 사람이 입력한 값이 숫자라면 true 정수가아니라 문자라면 false를 리턴함
            System.out.println(sc.nextInt()*1000); 
        } //와일문은 지금 무한히 반복되고있는 상태. 
        sc.close();
    }
 
}