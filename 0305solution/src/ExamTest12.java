import java.util.Scanner;

/*[����12]�ʸ� �Է��Ͽ� �а� �ʸ� ����Ͻÿ�
0�� �Էµɶ� ���� ��� �ݺ��Ѵ�
������ �ԷµǸ� �ٽ� �Է��� �޴´�

[������]
�� �Է� : 250
[4]�� [10]�� �Դϴ�

���Է� : -84
���Է� : -12
���Է� : 123
[2]�� [3]�� �Դϴ�
���Է� : 0
���α׷��� �����մϴ�
*/
public class ExamTest12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sec=0;
		while(true){
		System.out.print("�� �Է� : ");
		sec=sc.nextInt();
		if(sec>0){
		System.out.println("["+sec/60+"]�� "+"["+(sec-(sec/60)*60)+"]�� �Դϴ�.");
		}
		if(sec==0){
			System.out.println("���α׷��� �����մϴ�.");
			break;
			}
		}
	}
}
