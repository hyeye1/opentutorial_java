package org.opentutorials.javatutorials.abstractclass.example1;
 abstract class A{ //�ؿ� abstract �޼ҵ带 �������ֱ⶧���� �ڵ����� abstract class���ȴ�.
    public abstract int b(); 
    //��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
    
    //public abstract int c(){System.out.println("Hello")}
    
    //�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�. (b and d)
    public void d(){ //
        System.out.println("world");
    }
}
class B extends A{ // B�� ��ü���� ������ �޼ҵ� b ��ü�� �ۼ�
	//����� �����ϰ��ִ�.
	//��ü���� ������ ��� �����ʰ�, �����ϱ����� ���ĸ� �ִ�.

	public int b() {

		return 1;
	}
	
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
    	B obj = new B();
    }
}