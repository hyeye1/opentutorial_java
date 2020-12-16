package org.opentutorials.javatutorials.compare;

public class EqualDemo {
	 
    public static void main(String[] args) {
        System.out.println( 1 == 2 );           //false  == 좌항과 우항이 같으냐 비교하는 연산자
        System.out.println( 1 == 1 );           //true  1과 1이 같으므로 true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        
        System.out.println(1!=2);           //true
        System.out.println(1!=1);           //false
        System.out.println("one"!="two");   //true   
        System.out.println("one"!="one");   //false
   
        System.out.println(10>20);       //false
        System.out.println(10>2);            //true
        System.out.println(10>10);           //false
        
        System.out.println(10 >= 20); // false
        System.out.println(10 >= 2); // true
        System.out.println(10 >= 10); // true
     
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);  // false   == 는 숫자 연산자 
        System.out.println(a.equals(b)); // true 
    }
 
    
}
