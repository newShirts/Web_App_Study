package ex2_valueType;

public class Ex1_valueType {
	public static void main(String[] args) {
		//자료형 : 데이터를 담을 컵의 재질과 크기
		
		// 논리형 : boolean - 1bit  true,false
		// 문자형 : char	  - 2byte (ex)'A')
		// 정수형 : byte	  - 1byte -128 ~ 127
		//		  short	  - 2byte -32,768 ~ 32,767
		//		  int	  - 4byte -21,4748,3648 ~ 21,4748,3647
		//		  long	  - 8byte -900경 ~ 900경
		// 실수형 : float	  - 4byte (소수점을 갖는 숫자들)
		//		  double  - 8byte
		
		//변수
		//자료형이 데이터를 담기 위한 컵의 재질과 크기라면
		//변수는 데이터를 실제로 담기 위한 컵을 만드는 과정이라고 생각하시면 됩니다.
		
		//1. 선언과 대입
		//자료형 변수명; -> 변수의 선언 -> 데이터를 담기위한 컵을 생성
		//변수명 = 데이터; -> 변수의 대입 -> 컵에다가 음료를 따르는 과정
		
		//2. 변수의 초기화 (reset의 개념이 아닌 초기값을 지정한다는 의미)
		//자료형 변수명 = 데이터;
		
		//변수명 명명 규칙
		//1. 숫자가 맨앞에 들어올 수 없다.
		//2. 첫글자는 항상 소문자여야 한다.
		//3. _를 제외하고 특수기호가 포함될 수 없다.
		//4. 예약어 금지(println, if, switch, while...)
		//5. 한글은 절대 사용하지 않기
		
		//논리형
		boolean b = true;
		System.out.println("b의 값 : " + b);
		
		//boolean b1 = 1; 데이터 별로 맞는 자료형을 사용해야 합니다.
		
		//문자형
		char c = 'A';//문자형은 ''안에 적어야 하며 두글자 이상 올 수 없다.
		System.out.println("c의 값 : " + c);
		
		char c1 = 65;//아스키코드로 65가 대문자 A이기 때문에 출력 가능
		System.out.println("c1의 값 : " + c1);
		
		//정수형
		//byte b1 = 128; byte 자료형의 표현범위를 벗어나므로 오류가 난다.
		
		byte b1 = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("b1의 값 : " + b1);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
		//실수형(소수점이 있는 숫자)
		float f; //변수의 선언
		f = 3.14f; //java에서는 실수는 기본적으로 double형으로 인식하기 때문에 float자료형을 사용한다는 것을 명시해줘야 한다.
		
		double d; //변수의 선언
		d = 1.23; //변수의 대입
		
		System.out.println("d의 값 : " + d);
		System.out.println("f의 값 : " + f);
		
		//변수를 사용해야 하는 이유
		//데이터를 조금 더 동적으로 관리할 수 있다.
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
