package a08_반복;

public class WhileGuGuDan {
	public static void main(String[] args) {
		int dan=2;
		int number=1;
		System.out.println("구구단 2단");
		
		while(number<10) {
			System.out.println(dan+"X"+number+"="+dan*number);
			number++;
		}
	}

}
