package org.opentutorials.javatutorials.method;
 
public class ReturnDemo3 {
	
	//���࿡ �� ������ ����� �˾Ƴ��� �ʹ� �Ѵٸ�,
    public static String getMember1() {
        return "������";
    }
 
    public static String getMember2() {
        return "������";
    }
 
    public static String getMember3() {
        return "���̶�";
    }
 
    public static void main(String[] args) {
    	
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }
}


//�ѹ��� �θ��������!
/*
package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
 
    public static String[] getMembers() {
        String[] members = { "������", "������", "���̶�" };  //�迭�� ����ش�.
        return members;  // �������� ���ϰ��� �迭�̴�.
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();  //�������� ���� ��� �� �ִ�. 
    }
 
}

*/