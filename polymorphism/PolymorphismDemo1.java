/*package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();
        obj.y(); // obj라는 변수는 데이터 타입이 A이기때문에 B를 담았다 하더라도 실행이 되지않는다
        
    }
}
*/
/*
package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B(); //원래는 b지만 a인척한다!
        System.out.println(obj.x()); // b가나옴
    }// 실행한 오브젝트는 b에 소속되어있는 메소드를 호출한다 but a행세를 하기때문에 a에 없는 메소드를 호출한다면 호출되지않는다
}
*/
package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
        
    }
}