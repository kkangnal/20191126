//switch������ �ܺ�����ڿ����ؼ� ����� �� �ִ� ����
import java.io.*;
public class Ex18 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//���鼭 �˾Ƽ� �����Ϸ� �ܿ췡 ;;;;;;;;;
		
		
		int su1=0, su2=0, tot=0;
		char yon=0;
		
		System.out.println("ù��° ��=");
		su1=Integer.parseInt(in.readLine());
		System.out.println("������ �����ϼ��� (+,-,*,/,%)=");
		yon=(char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("�ι�° ��=");
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
			System.out.println("�߸��� ������ �Է�");
			System.exit(-1);
		}
		System.out.println();
		System.out.println(su1+" "+yon+" "+su2+"="+tot);
		
	}
}
