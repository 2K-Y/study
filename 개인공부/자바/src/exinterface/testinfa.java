package exinterface;

public class testinfa extends test12{

	@Override
	public int times(int num1, int num2){
		return num1*num2;
	}
	//�̷��� �ϳ��ϳ��� �޼���
	@Override
	public int divides (int num1,int num2){
		if(num2!=0) return intech;
		return num1/num2;
	}
	// �߰� �޼���
	public void showInfo(){
		System.out.println("Add method");
	}
}

//abstract ��ȯŸ�� �޼ҵ��̸�(); �߻� Ŭ���� ����
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

	// ������ �޼���� test12 �Ǵ� testinfa �޼����̴�.
		testinfe calc= new testinfa(); // calc�� interface�� �޼��常 �� �� �ִ�.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divides(num1, num2));
	}
}
