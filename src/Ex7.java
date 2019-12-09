
public class Ex7 {
	public static void main(String[] args) {
		String strVar1 = "강나리";
		String strVar2 = "강나리";
		String strVar3 = new String("강나리");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}
}
