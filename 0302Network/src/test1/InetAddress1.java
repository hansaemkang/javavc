package test1;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddress1 {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		// TODO Auto-generated method stub
		InetAddress addr1= InetAddress.getByName("www.naver.com");
		InetAddress addr2= InetAddress.getLocalHost();
		URL url=new URL("http://127.0.0.1:9000/apex");
		System.out.println(url.getProtocol()+" "+url.getPort());
		System.out.println("addr1:"+addr1.getHostAddress());
		System.out.println("addr1:"+addr1.getHostName());
		System.out.println("addr2:"+addr2.getHostAddress());
		System.out.println("addr2:"+addr2.getHostName());
	}

}
