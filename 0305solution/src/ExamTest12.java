import java.util.Scanner;

/*[문제12]초를 입력하여 분과 초를 출력하시오
0이 입력될때 까지 계속 반복한다
음수가 입력되면 다시 입력을 받는다

[실행결과]
초 입력 : 250
[4]분 [10]초 입니다

초입력 : -84
초입력 : -12
초입력 : 123
[2]분 [3]초 입니다
초입력 : 0
프로그램을 종료합니다
*/
public class ExamTest12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sec=0;
		while(true){
		System.out.print("초 입력 : ");
		sec=sc.nextInt();
		if(sec>0){
		System.out.println("["+sec/60+"]분 "+"["+(sec-(sec/60)*60)+"]초 입니다.");
		}
		if(sec==0){
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		}
	}
}
