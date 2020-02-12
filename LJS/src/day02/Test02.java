package day02;
/*
 * 오늘 날짜를 출력하는데
 * 날짜에 해당하는 데이터는 정수형 변수에 담아서 출력해 보세요
 * 
 *변수 만드는 형식
 *
 *	 데이터 타입	변수이름  = 데이터 ;
 *
 *	예] 
 *		1. 문자
 *			char ch = 'A';
 *		2. 논리값
 *			boolean bool = true;
 *		3. 정수
 *			int no = 7;		
 *		4. 실수
 *			double val = 3.14;
 *		5. 문자열	: 문자열은 기본형 타입은 아니지만
 *					빈번히 사용되는 데이터 이기 때문에
 *					자바에서 편의를 제공해주고 있다.
 *
 *			a.
 *				String str1 = "abcd";
 *			b.
 *				String str2 = new String("abcd");
 *			
 *		변수 작성 형식
 *
 *			[접근 지정자] [속성] 데이터 타입 변수이름 = 데이터;
 *			
 *			
 *
 * 
 * */
public class Test02 {
	
	static String msg = "내일은 ";
	static int month = 2;
	static int day = 12;
	static String str = " 입니다.";
	
	int num1 = 100;
	int num2 = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("결과 : " + msg+month+"월 "+day+"일"+str);
	}
	/*
	 * class2 와 단어와 Teacher를 결합해서 변수의 이름을 만들경우
	 * 
	 * 	1. camel 표기법
	 * 		String class2Teacher = "전은석";
	 * 2. snake 표기법 
	 
	 */

}