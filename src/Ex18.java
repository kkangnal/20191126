//switch문으로 외부제어문자에의해서 진행될 수 있는 문제
import java.io.*;
public class Ex18 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//보면서 알아서 이해하래 외우래 ;;;;;;;;;
		
		
		int su1=0, su2=0, tot=0;
		char yon=0;
		
		System.out.println("첫번째 수=");
		su1=Integer.parseInt(in.readLine());
		System.out.println("연산자 선택하세요 (+,-,*,/,%)=");
		yon=(char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("두번째 수=");
		su2=Integer.parseInt(in.readLine());
		
		switch(yon) {
		case '+':
			tot=su1+su2;
			break;
		case '-':
			tot=su1-su2;
			break;
		case '*':
			tot=su1*su2;
			break;
		case '/':
			tot=su1/su2;
			break;	
		case '%':
			tot=su1%su2;
			break;	
		default:
			System.out.println("잘못된 연산자 입력");
			System.exit(-1);
		}
		System.out.println();
		System.out.println(su1+" "+yon+" "+su2+"="+tot);
		
	}
}
