//java�� ����¸�ɹ� �ǽ�����

import java.io.*;
public class Ex17 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int firstsu=0, secondsu=0;
		
		System.out.println("ù��° ��= ");
		firstsu = Integer.parseInt(in.readLine());
		
		System.out.println("�ι�° ��= ");
		secondsu = Integer.parseInt(in.readLine());
		
		if(firstsu>secondsu) {
			System.out.println("ù��° ��("+firstsu+")");
			System.out.println("�� �ι�° ��("+secondsu+")");
			System.out.println("���� ū ���Դϴ�");
			
		}else {
			System.out.println("ù��° ��("+firstsu+")");
			System.out.println("�� �ι�° ��("+secondsu+")");
			System.out.println("���� ���� ���Դϴ�");
		}
	
	}
}
