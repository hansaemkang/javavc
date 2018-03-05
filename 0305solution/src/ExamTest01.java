
/* [문제1]
10보다 작은 자연수 중에서 3또는 5의 배수는 3,5,6,9 이고 이것을 모두 더하면 23이다.
1000보다 작은 자연수 중에서 3또는 5의 배수를 모두 더하면 얼마일까요?

[결과화면]
합 : 233168
*/
public class ExamTest01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int a = 1; a < 1000; a++) {
			if (a % 3 == 0 || a % 5 == 0) {
				sum += a;
			}
		}
		System.out.println("합 : " + sum);
	}
}