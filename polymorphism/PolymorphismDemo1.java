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
        obj.y(); // obj��� ������ ������ Ÿ���� A�̱⶧���� B�� ��Ҵ� �ϴ��� ������ �����ʴ´�
        
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
        A obj = new B(); //������ b���� a��ô�Ѵ�!
        System.out.println(obj.x()); // b������
    }// ������ ������Ʈ�� b�� �ҼӵǾ��ִ� �޼ҵ带 ȣ���Ѵ� but a�༼�� �ϱ⶧���� a�� ���� �޼ҵ带 ȣ���Ѵٸ� ȣ������ʴ´�
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