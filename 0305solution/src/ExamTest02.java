
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[����2]����ó�����α׷�
        �߰����,�⸻���,����Ʈ,�⼮������ Args�� �Է¹޾Ƽ� ����Ͻÿ�
        
����1) (�߰�+�⸻)/2   ---> 60%
          ����                          ---> 20%
          �⼮                           ---> 20%
     
����2)90�̻� 'A'����     (3)A,B����  ---->"excellent"
     80�̻� 'B'����        C,D����  ---->"good"
     70�̻� 'C'����        F����    ---->"poor"
     60�̻� 'D'����        (switch���̿�) 
           ������ 'F'����
     (if~else if���̿�)

$ java ExamTest02  90 89 99 100  

[��� ȭ��]
�߰���� : 90
�⸻��� : 89
�������� : 99
�⼮����: 100

����=93.20      <---�Ҽ����� 2°�ڸ�����
����=A              
��=excellent
*/
public class ExamTest02 {
	public static void main(String[] args) {
		String j1=args[0];
		String g1=args[1];
		String h1=args[2];
		String c1=args[3];
		int j=Integer.parseInt(j1);
		int g=Integer.parseInt(g1);
		int h=Integer.parseInt(h1);
		int c=Integer.parseInt(c1);
		double score=(double)(j+g+h+c)/4;
		String hakjum=null;
		String pyung = null;
		if(score>=90)
			hakjum="A";
		else if(score>=80)
			hakjum="B";
		else if(score>=70)
			hakjum="C";
		else if(score>=60)
			hakjum="D";
		else
			hakjum="F";
		switch(hakjum){
		case "A":
		case "B":
			pyung="excellent";
			break;
		case "C":
		case "D":
			pyung="good";
			break;
		case "F":
			pyung="poor";
			break;
		default:
			break;
		}
		System.out.println("�߰���� : "+j+"\n�⸻��� : "+g+"\n�������� : "+h+"\n�⼮���� : "+c
				+"\n\n����="+score+"\n����="+hakjum+"\n��="+pyung);
		
	}
}
