package org.opentutorials.javatutorials.condition;

public class ConditionDemo {

    public static void main(String[] args) {
    	   if(true){
               System.out.println("result : true");
           }
        
           if(false){
               System.out.println("result : true");
           }
       
    	
    	
        if (true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4); 
        }
        System.out.println(5);
        
        if(false){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);
        
        System.out.println("---------------else----------------");
        
        
            if (true) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        

                       
            if(false){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        
            System.out.println("--------------else if--------------");
            
            if (false) {
                System.out.println(1);
            } else if (true) {
                System.out.println(2);
            } else if (true) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
            
            if(false) {
            	System.out.println(1);
            } else if (false) {
            	System.out.println(2);
            } else if (true) {
            	System.out.println(3);
            } else {
            	System.out.println(4);
            }
            
            if(false) {
            	System.out.println(1);
            } else if (false) {
            	System.out.println(2);
            } else if (false) {
            	System.out.println(3);
            } else if (true) {
            	System.out.println(4);
            }
           
     
        
        
    }
	
	
}
