//���׿����� �ܺα����� �ǽ�����

import java.io.*;

public class Ex13 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.���� 2.����");
		int x = Integer.parseInt(in.readLine());
		
		String str=x==1?"����":"����";
		System.out.println("str="+str);
		
	}
}
