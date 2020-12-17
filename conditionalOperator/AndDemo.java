package org.opentutorials.javatutorials.conditionalOperator;

public class AndDemo {
	 /*
    public static void main(String[] args) {
        if (true && true) {
            System.out.println(1);  //-> 이것만 출력됨
        }
 
        if (true && false) {
            System.out.println(2);  //출력되지않음.
        }
 
        if (false && true) {
            System.out.println(3);
        }
 
        if (false && false) {
            System.out.println(4);
        }
        
        */
	
	   
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
    
	// ||오아
	
 
    }
 
}
}