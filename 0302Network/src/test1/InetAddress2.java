package test1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddress2 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String host=null;
		System.out.print("������Ʈ �ּ�:");
		host=sc.nextLine();
		InetAddress[] addr=InetAddress.getAllByName(host);
		System.out.println(host+"�� "+addr.length+"���� ip�� ����");
		for (int i = 0; i < addr.length; i++) {
			System.out.println((i+1)+"�� ip�� "+addr[i].getHostAddress());
		}sc.close();
	}

}
