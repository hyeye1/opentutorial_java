package org.opentutorials.javatutorials.method;
 
public class ReturnDemo3 {
	
	//만약에 이 세명의 멤버를 알아내고 싶다 한다면,
    public static String getMember1() {
        return "최진혁";
    }
 
    public static String getMember2() {
        return "최유빈";
    }
 
    public static String getMember3() {
        return "한이람";
    }
 
    public static void main(String[] args) {
    	
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }
}


//한번에 부르고싶으면!
/*
package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
 
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };  //배열에 담아준다.
        return members;  // 멤버스라는 리턴값은 배열이다.
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();  //여러개의 값이 담길 수 있다. 
    }
 
}

*/