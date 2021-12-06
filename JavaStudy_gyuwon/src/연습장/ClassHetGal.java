package 연습장;

public class ClassHetGal {
	public static void main(String[] args) {
		Animal[] animals=new Animal[3];
		
		animals[0]=new Animal();
		
		animals[0].kind="강아지";
		animals[0].name="초코";
		animals[0].age=1;
		System.out.println("animal");
		animals[0].info();
		
		animals[1]=new Animal();
		
		animals[1].kind="강아지2";
		animals[1].name="초코2";
		animals[1].age=2;
		System.out.println("animal");
		animals[1].info();
	}

}
class Animal{
	String kind;
	String name;
	int age;
	
	void info() {
		System.out.println("종류: "+kind);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
