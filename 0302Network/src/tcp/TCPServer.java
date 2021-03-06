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
			System.out.println("접속 대기중.....");
			
			while(true)
			{
				Socket sock=ss.accept();  //요청수락
				
				//네트워크를 통해 들어온 데이타를 읽어들임
				InputStream is=sock.getInputStream();
				BufferedReader br=new BufferedReader(
						            new InputStreamReader(is));
				//콘솔로 출력
				PrintStream ps=new PrintStream(System.out);
				
				//상대방 IP출력
				ps.print(sock.getInetAddress().getHostAddress());
				ps.println("에서 수신된 메세지:" + br.readLine() +"\n");
				
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
/* 콘솔에서 패키지 컴파일하는 방법
 * 내PC-> 고급시스템설정 -> 환경변수 -> 시스템변수 
 * -> path에 추가 -> C:\Program Files\Java\jdk1.8.0_151\bin;
 * 
 * C:\...........\step14_network\src> javac -d  ../bin tcp/TCPServer.java
 * C:\...........\step14_network\src> javac -d  ../bin tcp/TCPClient.java
 * 
 * C:\...........\step14_network\bin>java tcp/TCPServer
 * C:\...........\step14_network\bin>java tcp/TCPClient
 */









