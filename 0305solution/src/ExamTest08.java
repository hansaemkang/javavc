
import java.io.IOException;
import java.util.Scanner;

/*[����8]3�ڸ� ������ �Է¹޾Ƽ� ���� �ڸ����� ���� ���Ͻÿ�.

[��� ȭ��]
3�ڸ� ������ �Է��ϼ��� :457
3�ڸ��� ���� 16 �Դϴ�.
*/
public class ExamTest08 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc=new Scanner(System.in);
		System.out.print("3�ڸ� ������ �Է��ϼ���:");
		int n=sc.nextInt();

		int to=n/100+n%100/10+n%100%10;
		System.out.println("3�ڸ� ���� "+to+"�Դϴ�.");
		
	}
}
