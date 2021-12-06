package ø¨Ω¿¿Â;

public class AnimalPractice {

	public static void main(String[] args) {
		Animal2 a=new Animal2();
		a.setName("±Ë¡ÿ¿œ");
		a.getName();
		a.run();
		//System.out.println("µøπ∞∆Øº∫ run:"+ a.run());
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
		System.out.println("∂Ÿ±‚");
	}
	void breath() {
		System.out.println("º˚Ω¨±‚");
	}
}
class Dog extends Animal2{
	
	@Override
	void run() {
		System.out.println("∞≥∂Ÿ±‚");
		super.run();
	}
	
	void bark() {
		System.out.println("¬¢±‚");
	}
}
