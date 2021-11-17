package a04_형변환;

public class ConversionString {
	/**
	 * String(문자열)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		char name1 = '이';
		char name2 = '규';
		char name3 = '원';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		String name = "이규원";
		
		System.out.println(""+name1+name2+name3+"입니다.");
		// ""없으면 결과가 숫자로 나옴  문자->정수  (업캐스팅) 
		System.out.println(name+"입니다");
		System.out.println(10+"10"); //숫자+문자 ->문자
		
	}

}
