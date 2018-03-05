package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient {

	final static int PORT=7000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String server_ip;
		
		//콘솔로 입력
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//콘솔로 출력
		PrintStream ps=new PrintStream(System.out);
		try {
			ps.print("접속할 ip를 입력하시오");
			server_ip=br.readLine();
			while(true){
				Socket sock=new Socket(server_ip,PORT);//접속 시도
				//네트워크 통해 데이터 전송
				OutputStream os=sock.getOutputStream();
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
				ps.println("\n전송할 메세지를 이력하세요: ");
				String str=br.readLine();
				
				bw.write(str,0,str.length());
				bw.close();
				sock.close();
				ps.println(server_ip+"에 메세지 전송");

			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
