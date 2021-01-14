package org.opentutorials.javatutorials.abstractclass.example1;
 abstract class A{ //밑에 abstract 메소드를 가지고있기때문에 자동으로 abstract class가된다.
    public abstract int b(); 
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    
    //public abstract int c(){System.out.println("Hello")}
    
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. (b and d)
    public void d(){ //
        System.out.println("world");
    }
}
class B extends A{ // B가 구체적인 내용인 메소드 b 본체를 작성
	//상속을 강제하고있다.
	//구체적인 로직을 담고 있지않고, 실행하기위한 형식만 있다.

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