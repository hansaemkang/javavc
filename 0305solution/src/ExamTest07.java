
import java.io.IOException;
import java.util.Scanner;

/*[����7]���̿� ���� ���̰����� ����Ḧ ����ϴ����α׷��� �ۼ��Ͻÿ�.
����]���̴� �Է� �޾� �����Ͻÿ�.
    65�� �̻� : 10000��
    13�� �̻� 65�� �̸� : 20000��
    6�� �̻� 13�� �̸� : 8000��
    5�� ���� : 5000��

[��� ȭ��] 
���̸� �Է��Ͻÿ� : 30
������  20000���Դϴ�
*/
public class ExamTest07 {
	public static void main(String[] args) throws NumberFormatException, IOException {

	Scanner sc=new Scanner(System.in);
	int a=0;
	int won=0;
	System.out.print("���̸� �Է��Ͻÿ� ");
	a=sc.nextInt();
	if(a>=65)
		won=10000;
	else if(a>=13)
		won=20000;
	else if(a>=6)
		won=8000;
	else
		won=5000;
	System.out.println("������ "+won+"���Դϴ�.");
		
	}
}
