
import java.io.IOException;
import java.util.Scanner;

/*[문제7]나이에 따라 놀이공원의 입장료를 계산하는프로그램을 작성하시오.
조건]나이는 입력 받아 수행하시오.
    65세 이상 : 10000원
    13세 이상 65세 미만 : 20000원
    6세 이상 13세 미만 : 8000원
    5세 이하 : 5000원

[결과 화면] 
나이를 입력하시오 : 30
입장료는  20000원입니다
*/
public class ExamTest07 {
	public static void main(String[] args) throws NumberFormatException, IOException {

	Scanner sc=new Scanner(System.in);
	int a=0;
	int won=0;
	System.out.print("나이를 입력하시오 ");
	a=sc.nextInt();
	if(a>=65)
		won=10000;
	else if(a>=13)
		won=20000;
	else if(a>=6)
		won=8000;
	else
		won=5000;
	System.out.println("입장료는 "+won+"원입니다.");
		
	}
}
