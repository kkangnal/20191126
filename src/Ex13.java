//삼항연산자 외부구성의 실습내용

import java.io.*;

public class Ex13 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.남성 2.여성");
		int x = Integer.parseInt(in.readLine());
		
		String str=x==1?"남성":"여성";
		System.out.println("str="+str);
		
	}
}
