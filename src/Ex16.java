// ���������� & && | || ������ �ǽ�

public class Ex16 {
	public static boolean aaa() {
		System.out.println("AAA");
		return true;
		
	}
	public static boolean bbb() {
		System.out.println("BBB");
		return false;
	}
	public static void main(String[] args) {
	 boolean b=aaa() || bbb();
	 System.out.println("boolean b= "+b);
	 

	}

}
