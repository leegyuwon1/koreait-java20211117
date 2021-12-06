package a13_상속;
//값 넣는 방법 두가지 배워보기.   1.생성자 호출, 2.게터세터
class Human extends Animal{
	private String 마음;
	
	public Human(String 이름) {
		super("사람",이름); //기본생성자
	}
	
	public String get마음() {
		return 마음;
	}

	public void set마음(String 마음) {
		this.마음 = 마음;
	}

	public void 마음상태() {
		System.out.println("현재 "+마음+"상태입니다.");
	}
}
	
class Tiger extends Animal{
	private String 사냥능력;
	
	public Tiger(String 이름) {
		super("호랑이", 이름);
//		set종류("호랑이");
//		set이름(이름);
	}
	
	public String get사냥능력() {
		return 사냥능력;
	}

	public void set사냥능력(String 사냥능력) {
		this.사냥능력 = 사냥능력;
	}

	public void 사냥능력치() {
		System.out.println(get이름()+" 호랑이의 사냥능력치는 "+사냥능력+"입니다.");
	}
}

class Eagle extends Animal{
	private int 날개길이;
	
	public Eagle(String 이름) {
		super("독수리", 이름);
//		set종류("독수리");
//		set이름("비둘이");
	}
	
	public int get날개길이() {
		return 날개길이;
	}

	public void set날개길이(int 날개길이) {
		this.날개길이 = 날개길이;
	}

	public void 독수리날개갈이() {
		System.out.println("날개 길이는 "+날개길이+"cm입니다.");
	}
}

public class ExtendsTest {
	
	public static void main(String[] args) {
		Human h=new Human("이규원");
		h.set마음("기쁜");
		Animal h2=new Human("이규투");	
		//h2.set마음("우울한");			
	//	Human h3 = (Human)h2;		//다운캐스팅 다시 사람으로 돌리기.
		Tiger t=new Tiger("호돌이");
		t.set사냥능력("상");
		Eagle e=new Eagle("비둘이");
		e.set날개길이(250);
		
//		Animal a = new Animal();  안된다
//		Human h4 = (Human)a;
		
		if(h2 instanceof Human) {
			System.out.println("사람이었습니다.");
		}else if(h2 instanceof Tiger) {
			System.out.println("호랑이었습니다.");
		}else if(h2 instanceof Eagle) {
			System.out.println("독수리였습니다.");	
		}else if(h2 instanceof Animal) {
			System.out.println("동물입니다.");
		}
		else {
			System.out.println("어떤 클래스인지 모르겠습니다.");
		}
		
//		
//		h.set이름("이규원");
//		h.set종류("사람");
//		h2.set이름("이규투");
//		h2.set종류("사람");
//		
//		t.set이름("야옹이");
//		t.set종류("호랑이");
//		
//		e.set이름("비둘이");
//		e.set종류("독수리");
		
		h.move();
		t.move();
		e.move();
		h.마음상태();
		//h2.마음상태();
		//h3.사냥능력치();
		//h4.마음상태();
		t.사냥능력치();
		e.독수리날개갈이();
	}

}
