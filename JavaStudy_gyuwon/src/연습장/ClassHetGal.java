package ������;

public class ClassHetGal {
	public static void main(String[] args) {
		Animal[] animals=new Animal[3];
		
		animals[0]=new Animal();
		
		animals[0].kind="������";
		animals[0].name="����";
		animals[0].age=1;
		System.out.println("animal");
		animals[0].info();
		
		animals[1]=new Animal();
		
		animals[1].kind="������2";
		animals[1].name="����2";
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
		System.out.println("����: "+kind);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
}
