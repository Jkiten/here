package �����;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		String s="ȫ�浿\t ��ö��	�̿��� ��ö��";
		String tokens[]=s.split("\\s+");
		String bunli = "1,2,3,4,5,6,7";
		String[] temp = bunli.split(",");
		System.out.println("temp : "+temp);
		System.out.println("temp : "+temp.length);
		System.out.println("temp : "+s.length());
		
				//foreach
		for (String v : tokens) {
			System.out.println(v);
		}
		System.out.println("I'M Master");
	}
	

}
