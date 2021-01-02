package org.opentutorials.javatutorials.method;
 
public class ReturnDemo {
    public static int one() {
        return 1;
      //  return 2;   => 도달할 수 없는 코드 
      //  return 3;
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }
}