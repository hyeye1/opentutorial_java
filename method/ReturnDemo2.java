package org.opentutorials.javatutorials.method;
 
public class ReturnDemo2 {
	
    public static String num(int i) {
    	
        if(i==0){             //������ ���� 1�̸� false�� �Ǹ鼭 
            return "zero";
        } else if(i==1){      // else if�� �ش�Ǵ� 
            return "one";      // return "one" ���� �ش�Ǿ �޼ҵ� ������ �������´�
        } else if(i==2){
            return "two";
        }
        return "none";
    }
 
    public static void main(String[] args) {
    	
        System.out.println(num(1)); //num�̶�� �޼ҵ忡 1�̶�� �Է°�
    }
}