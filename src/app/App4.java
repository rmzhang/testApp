package app;

import java.io.*;

public class App4 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		int a,b,k;
		String str1,str2;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������һ���� a =");
		str1=buf.readLine();
		a=Integer.parseInt(str1);
		System.out.print("������ڶ����� b=");
		str2=buf.readLine();
		b=Integer.parseInt(str2);
		System.out.print("gcd("+a+","+b+")=");
		do{
			k=a%b;
			a=b;
			b=k;
		}while(k!=0);
		System.out.println(a);
	}
}
