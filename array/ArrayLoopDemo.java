package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		String[] members = {"������", "������", "������"};
		/*for(int i = 0 ; i< members.length; i++) {
			String member = members[i];
			System.out.println(member+"�� ��� �޾ҽ��ϴ�.");
		//�����ϰ� ����ϱ����ؼ� for each
		*/
		
		for(String e : members) { // �ݷ� : -> �ڿ�������� �����Ϳ� ����ִ� ������ �ϳ��� ������ ������ ����ֱ�� ���.
			System.out.println(e+"��� �޾ҽ��ϴ�.");
			
		}

			
			
			
		}
	}

 