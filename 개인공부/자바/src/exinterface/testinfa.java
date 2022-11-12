package exinterface;

public class testinfa extends test12{

	@Override
	public int times(int num1, int num2){
		return num1*num2;
	}
	//이런거 하나하나가 메서드
	@Override
	public int divides (int num1,int num2){
		if(num2!=0) return intech;
		return num1/num2;
	}
	// 추가 메서드
	public void showInfo(){
		System.out.println("Add method");
	}
}

//abstract 반환타입 메소드이름(); 추상 클래스 선언
abstract class test12 implements testinfe {
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	public static void main(String[] argss){

		int num1=10;
		int num2=2;	

	// 구현된 메서드는 test12 또는 testinfa 메서드이다.
		testinfe calc= new testinfa(); // calc는 interface의 메서드만 쓸 수 있다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divides(num1, num2));
	}
}
