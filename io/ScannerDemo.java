package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //->scanner��ü�� �������ִ� hasnextint��� �޼ҵ带 ȣ��
        	// hasnext �� ���� : �޼ҵ带 �ڹٰ� �����ϸ� �ϴ� ��������
        	// ���Ϲ��ȿ� �ڹ��� ������ �����Ǿ��ִٴ°��� �ݺ����� �����̾ȵǰ� ����ϰ�����
        	//�׸��� ������� �Է��� ���� ���Ͷ�� �����Ǿ��ִ� �ڹ��� ������ �ٽ� �۵���Ŵ
        	//���� ����� �Է��� ���� ���ڶ�� true �������ƴ϶� ���ڶ�� false�� ������
            System.out.println(sc.nextInt()*1000); 
        } //���Ϲ��� ���� ������ �ݺ��ǰ��ִ� ����. 
        sc.close();
    }
 
}