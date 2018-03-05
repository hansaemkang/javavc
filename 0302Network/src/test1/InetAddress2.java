package test1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddress2 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String host=null;
		System.out.print("웹사이트 주소:");
		host=sc.nextLine();
		InetAddress[] addr=InetAddress.getAllByName(host);
		System.out.println(host+"는 "+addr.length+"개의 ip가 있음");
		for (int i = 0; i < addr.length; i++) {
			System.out.println((i+1)+"번 ip는 "+addr[i].getHostAddress());
		}sc.close();
	}

}
