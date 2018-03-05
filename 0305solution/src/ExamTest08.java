
import java.io.IOException;
import java.util.Scanner;

/*[문제8]3자리 정수를 입력받아서 각각 자리수의 합을 구하시오.

[결과 화면]
3자리 정수를 입력하세요 :457
3자리의 합은 16 입니다.
*/
public class ExamTest08 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc=new Scanner(System.in);
		System.out.print("3자리 정수를 입력하세요:");
		int n=sc.nextInt();

		int to=n/100+n%100/10+n%100%10;
		System.out.println("3자리 합은 "+to+"입니다.");
		
	}
}
