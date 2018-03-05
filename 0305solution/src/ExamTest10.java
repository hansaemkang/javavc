import java.util.Scanner;

/*[문제10] 가위, 바위, 보 게임
컴퓨터가(com) 난수 1~3중 하나를 발생하고 가위(1), 바위(2), 보(3)로 사용한다
사용자가(user) 1~3중 입력하여 승패를 결정한다

[실행결과]
가위(1), 바위(2), 보(3) 입력 : 2

컴퓨터 : 보         사용자 : 가위     결과 : You Win!!

컴퓨터 : 가위     사용자 : 보         결과 : You Lose!!

컴퓨터 : 바위     사용자 : 바위     결과 : You Draw!!

*/
public class ExamTest10 {
	public static void main(String[] args) {
		int com=(((int)Math.random()*3)+1);
		Scanner sc=new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 입력 :");
		int i=sc.nextInt();
		if(com==1){
			if(i==2)
				System.out.println("컴퓨터 : 가위	사용자 : 바위	결과 : YOU WIN!");
			if(i==3)
				System.out.println("컴퓨터 : 가위	사용자 : 보		결과 : YOU LOSE");
			if(i==1)
				System.out.println("컴퓨터 : 가위	사용자 : 가위	결과 : YOU DRAW");
		}
		if(com==2){
			if(i==3)
				System.out.println("결과 : YOU WIN!");
			if(i==1)
				System.out.println("YOU LOSE");
			if(i==2)
				System.out.println("YOU DRAW");
		}
		if(com==3){
			if(i==2)
				System.out.println("결과 : YOU WIN!");
			if(i==1)
				System.out.println("YOU LOSE");
			if(i==3)
				System.out.println("YOU DRAW");
		}
	}
}
