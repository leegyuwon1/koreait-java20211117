package a13_상속;

public class ExtendsTest2 {
	
	public static void main(String[] args) {
		Animal[] animals=new Animal[3];
		
		animals[0]=new Human("김준일");
		animals[1]=new Tiger("호돌이");
		animals[2]=new Eagle("독수리");
		
		
//	1.	for(Animal animal: animals) {
//			if(animal==animals[0]) {		//-> 사람 건너뛰고 출력하기 3가지방법
//				continue;
//			}
		
			
//	2.		if(animal==animals[0]) {
//				continue;
//			}
		
//	3.
			int i=0;
			for(Animal animal: animals) {
				if(i==0) {
					i++;
					continue;
				}
			
			
			System.out.println("이름: "+ animal.get이름());
			System.out.println("종류: "+ animal.get종류());
		
			if(animal instanceof Human) {	//instanceof -> 객체타입확인
				Human h = (Human)animal;	//다운캐스팅
				System.out.println("마음: "+ h.get마음());
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				System.out.println("사냥능력: "+ t.get사냥능력());
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				System.out.println("날개길이: "+ e.get날개길이());
			}
		
		}
		
	}
}
