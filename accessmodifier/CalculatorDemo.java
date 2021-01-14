package org.opentutorials.javatutorials.accessmodifier;
 
class Calculator{
    private int left, right; //�ڷ�������(int)�� private���� �س��´ٸ�, ������ �ؿ� ���� ������ ������ ������ �߻��ȴ�
     
    public void setOprands(int left, int right){
        this.left = left; //���� ������ ������ �ٸ��� private���� �����Ǿ��ִ�
        this.right = right;
    }
    private int _sum(){ //������ ���������� ������ �ʿ䰡 ���� ���̶�� �Ѵٸ� private���� ���������ڸ� ����
        return this.left+this.right; //����� �����ϸ� ������ ���� sum���� ���´�
    }
    public void sumDecoPlus(){ //����� public/ ������ �ʿ䰡���� ���δ� private
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
        //����ڰ� �ǵ����� �ʴ� ������� �������� �޼ҵ��� ���¸� �ٲٴ� �һ�縦 ���� �� �ִ� 
        //��������忡���� private�� ������ ��뤷�� ������ �޼ҵ��̱⶧���� �Ű澵 �ʿ䰡����, ������ �����Ҽ��ִ� public���� ������ ������ ���ɼ��̳���\
        //�� ���� �޴���� Ŭ������ �����ϴ� ����� ������ ���ִ�
        //
    }
}
/*


�ۺ��� = ������ �����Ҽ��ִ�
�����̺� = ���� Ŭ���������� ������ �� �ִ�. 






















*/
