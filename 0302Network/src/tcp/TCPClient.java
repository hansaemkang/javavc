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
		
		//�ַܼ� �Է�
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//�ַܼ� ���
		PrintStream ps=new PrintStream(System.out);
		try {
			ps.print("������ ip�� �Է��Ͻÿ�");
			server_ip=br.readLine();
			while(true){
				Socket sock=new Socket(server_ip,PORT);//���� �õ�
				//��Ʈ��ũ ���� ������ ����
				OutputStream os=sock.getOutputStream();
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
				ps.println("\n������ �޼����� �̷��ϼ���: ");
				String str=br.readLine();
				
				bw.write(str,0,str.length());
				bw.close();
				sock.close();
				ps.println(server_ip+"�� �޼��� ����");

			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
