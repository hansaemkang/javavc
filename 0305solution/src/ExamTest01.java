
/* [����1]
10���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� 3,5,6,9 �̰� �̰��� ��� ���ϸ� 23�̴�.
1000���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?

[���ȭ��]
�� : 233168
*/
public class ExamTest01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int a = 1; a < 1000; a++) {
			if (a % 3 == 0 || a % 5 == 0) {
				sum += a;
			}
		}
		System.out.println("�� : " + sum);
	}
}