package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		//�÷���(collection) : java.util��Ű���� �ִ� �������̽�
		//�迭�� ������ �����Ͽ� index������ �������� ���� �ټ��� ��ü��
		//�ٷ�� ���� ����ϴ� ���α׷��� ���
		
		//Set,Map,List -> �÷��� �������̽�
		
		//Set�������̽��� �����ϰ� �ִ� Ŭ����
		//HashSet,TreeSet
		
		//Set���� �������� �߻�޼��尡 �������̵�(������)�� �� �Ǿ��ִ�.
		HashSet<String> hs1 = new HashSet<String>();
		
		//set�� �����͸� �߰��ϴ¹�
		System.out.println(hs1.add("a"));
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
		//HashSet�� ����ִ� ����� ������ ���� �޼���
		System.out.println("hs1�� ����� ���� : " +hs1.size());
		
		
		//HashSet�� �ߺ��� �����͸� �߰��� �� ����.
		System.out.println(hs1.add("a"));
		hs1.add("b");
		
		System.out.println("hs1�� ����� ���� : " +hs1.size());
		
		//HashSet�� ����Ǿ��ִ� �����͸� �����ϴ¹�
		hs1.remove("a");
		
		//HashSet�� ���
		System.out.println(hs1);
		
		//HashSet�� ����Ǿ��ִ� ��� �����͸� �����ϴ¹�
		hs1.removeAll(hs1); //����� �������� ��ȯ���ش�.
		hs1.clear();//�����ϰ� ��ȯ�ϴ°��� ����.
		System.out.println(hs1);
		
		
		System.out.println("--------------------");
		
		
		//HashSet ��ü hs2�� ����� 1 ~45������ ���� 6���� ��ҷ� �־ ����ϱ�
		
		
		HashSet<Integer> hs2 = new HashSet<>();
		
		boolean isCheck = true;
		final int FINISH = 6;
				
		while(isCheck) {
			int rnd = new Random().nextInt(45)+1;
			hs2.add(rnd);
			rnd++;
			if(hs2.size()== FINISH) {
				isCheck = false;
			}
			
		}System.out.println(hs2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
