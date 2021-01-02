package org.opentutorials.javatutorials.method;
 
public class ReturnDemo2 {
	
    public static String num(int i) {
    	
        if(i==0){             //아이의 값이 1이면 false가 되면서 
            return "zero";
        } else if(i==1){      // else if에 해당되는 
            return "one";      // return "one" 값이 해당되어서 메소드 밖으로 빠져나온다
        } else if(i==2){
            return "two";
        }
        return "none";
    }
 
    public static void main(String[] args) {
    	
        System.out.println(num(1)); //num이라는 메소드에 1이라는 입력값
    }
}