import java.util.Scanner;

/*[����10] ����, ����, �� ����
��ǻ�Ͱ�(com) ���� 1~3�� �ϳ��� �߻��ϰ� ����(1), ����(2), ��(3)�� ����Ѵ�
����ڰ�(user) 1~3�� �Է��Ͽ� ���и� �����Ѵ�

[������]
����(1), ����(2), ��(3) �Է� : 2

��ǻ�� : ��         ����� : ����     ��� : You Win!!

��ǻ�� : ����     ����� : ��         ��� : You Lose!!

��ǻ�� : ����     ����� : ����     ��� : You Draw!!

*/
public class ExamTest10 {
	public static void main(String[] args) {
		int com=(((int)Math.random()*3)+1);
		Scanner sc=new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) �Է� :");
		int i=sc.nextInt();
		if(com==1){
			if(i==2)
				System.out.println("��ǻ�� : ����	����� : ����	��� : YOU WIN!");
			if(i==3)
				System.out.println("��ǻ�� : ����	����� : ��		��� : YOU LOSE");
			if(i==1)
				System.out.println("��ǻ�� : ����	����� : ����	��� : YOU DRAW");
		}
		if(com==2){
			if(i==3)
				System.out.println("��� : YOU WIN!");
			if(i==1)
				System.out.println("YOU LOSE");
			if(i==2)
				System.out.println("YOU DRAW");
		}
		if(com==3){
			if(i==2)
				System.out.println("��� : YOU WIN!");
			if(i==1)
				System.out.println("YOU LOSE");
			if(i==3)
				System.out.println("YOU DRAW");
		}
	}
}
