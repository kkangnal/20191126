
public class Ex7 {
	public static void main(String[] args) {
		String strVar1 = "������";
		String strVar2 = "������";
		String strVar3 = new String("������");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}
}
