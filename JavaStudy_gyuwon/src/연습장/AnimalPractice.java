package ������;

public class AnimalPractice {

	public static void main(String[] args) {
		Animal2 a=new Animal2();
		a.setName("������");
		a.getName();
		a.run();
		//System.out.println("����Ư�� run:"+ a.run());
		Dog b=new Dog();
		b.run();
		System.out.println();
		b.bark();
	}

}
class Animal2{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void run() {
		System.out.println("�ٱ�");
	}
	void breath() {
		System.out.println("������");
	}
}
class Dog extends Animal2{
	
	@Override
	void run() {
		System.out.println("���ٱ�");
		super.run();
	}
	
	void bark() {
		System.out.println("¢��");
	}
}
