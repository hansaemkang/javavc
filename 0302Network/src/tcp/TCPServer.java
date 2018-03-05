package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	final static int PORT=7000;
	
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(PORT);
			System.out.println("���� �����.....");
			
			while(true)
			{
				Socket sock=ss.accept();  //��û����
				
				//��Ʈ��ũ�� ���� ���� ����Ÿ�� �о����
				InputStream is=sock.getInputStream();
				BufferedReader br=new BufferedReader(
						            new InputStreamReader(is));
				//�ַܼ� ���
				PrintStream ps=new PrintStream(System.out);
				
				//���� IP���
				ps.print(sock.getInetAddress().getHostAddress());
				ps.println("���� ���ŵ� �޼���:" + br.readLine() +"\n");
				
//				ps.close();
//				br.close();
//				sock.close();
//				ss.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
/* �ֿܼ��� ��Ű�� �������ϴ� ���
 * ��PC-> ��޽ý��ۼ��� -> ȯ�溯�� -> �ý��ۺ��� 
 * -> path�� �߰� -> C:\Program Files\Java\jdk1.8.0_151\bin;
 * 
 * C:\...........\step14_network\src> javac -d  ../bin tcp/TCPServer.java
 * C:\...........\step14_network\src> javac -d  ../bin tcp/TCPClient.java
 * 
 * C:\...........\step14_network\bin>java tcp/TCPServer
 * C:\...........\step14_network\bin>java tcp/TCPClient
 */









