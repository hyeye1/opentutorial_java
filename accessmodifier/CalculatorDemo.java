package org.opentutorials.javatutorials.accessmodifier;
 
class Calculator{
    private int left, right; //자료형변수(int)를 private으로 해놓는다면, 누군가 밑에 값을 음수로 놓으면 에러가 발생된다
     
    public void setOprands(int left, int right){
        this.left = left; //전역 변수가 예전과 다르게 private으로 지정되어있다
        this.right = right;
    }
    private int _sum(){ //고객에게 직접적으로 제공될 필요가 없는 것이라고 한다면 private으로 접근제어자를 지정
        return this.left+this.right; //언더바 썸을하면 리턴한 값이 sum으로 들어온다
    }
    public void sumDecoPlus(){ //장식은 public/ 보여질 필요가없는 내부는 private
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
        //사용자가 의도하지 않는 방법으로 내부적인 메소드의 상태를 바꾸는 불상사를 막을 수 있다 
        //사용자입장에서는 private은 본인이 사용ㅇ할 수없는 메소드이기때문에 신경쓸 필요가없고, 본인이 접근할수있는 public에만 온전히 집중할 가능성이높다\
        //더 적은 메뉴얼로 클래스를 제어하는 방법을 제공할 수있다
        //
    }
}
/*


퍼블릭은 = 언제나 접근할수있다
프라이빗 = 같은 클래스에서만 접근할 수 있다. 






















*/
