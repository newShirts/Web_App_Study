package ex2_valueType;

public class Ex1_valueType {
	public static void main(String[] args) {
		//�ڷ��� : �����͸� ���� ���� ������ ũ��
		
		// ���� : boolean - 1bit  true,false
		// ������ : char	  - 2byte (ex)'A')
		// ������ : byte	  - 1byte -128 ~ 127
		//		  short	  - 2byte -32,768 ~ 32,767
		//		  int	  - 4byte -21,4748,3648 ~ 21,4748,3647
		//		  long	  - 8byte -900�� ~ 900��
		// �Ǽ��� : float	  - 4byte (�Ҽ����� ���� ���ڵ�)
		//		  double  - 8byte
		
		//����
		//�ڷ����� �����͸� ��� ���� ���� ������ ũ����
		//������ �����͸� ������ ��� ���� ���� ����� �����̶�� �����Ͻø� �˴ϴ�.
		
		//1. ����� ����
		//�ڷ��� ������; -> ������ ���� -> �����͸� ������� ���� ����
		//������ = ������; -> ������ ���� -> �ſ��ٰ� ���Ḧ ������ ����
		
		//2. ������ �ʱ�ȭ (reset�� ������ �ƴ� �ʱⰪ�� �����Ѵٴ� �ǹ�)
		//�ڷ��� ������ = ������;
		
		//������ ��� ��Ģ
		//1. ���ڰ� �Ǿտ� ���� �� ����.
		//2. ù���ڴ� �׻� �ҹ��ڿ��� �Ѵ�.
		//3. _�� �����ϰ� Ư����ȣ�� ���Ե� �� ����.
		//4. ����� ����(println, if, switch, while...)
		//5. �ѱ��� ���� ������� �ʱ�
		
		//����
		boolean b = true;
		System.out.println("b�� �� : " + b);
		
		//boolean b1 = 1; ������ ���� �´� �ڷ����� ����ؾ� �մϴ�.
		
		//������
		char c = 'A';//�������� ''�ȿ� ����� �ϸ� �α��� �̻� �� �� ����.
		System.out.println("c�� �� : " + c);
		
		char c1 = 65;//�ƽ�Ű�ڵ�� 65�� �빮�� A�̱� ������ ��� ����
		System.out.println("c1�� �� : " + c1);
		
		//������
		//byte b1 = 128; byte �ڷ����� ǥ�������� ����Ƿ� ������ ����.
		
		byte b1 = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("b1�� �� : " + b1);
		System.out.println("s�� �� : " + s);
		System.out.println("n�� �� : " + n);
		
		//�Ǽ���(�Ҽ����� �ִ� ����)
		float f; //������ ����
		f = 3.14f; //java������ �Ǽ��� �⺻������ double������ �ν��ϱ� ������ float�ڷ����� ����Ѵٴ� ���� �������� �Ѵ�.
		
		double d; //������ ����
		d = 1.23; //������ ����
		
		System.out.println("d�� �� : " + d);
		System.out.println("f�� �� : " + f);
		
		//������ ����ؾ� �ϴ� ����
		//�����͸� ���� �� �������� ������ �� �ִ�.
		int num = 200;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
	}
}
