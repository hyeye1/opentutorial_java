package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
          
        System.out.println(a/b);  //(a:10 b:3) 10(정수)/3(정수)= 3.333(실수) 정수의 틀안에서 계산, 소숫점탈락  
        System.out.println(c/d);
        System.out.println(a/d);
          
    }
}
