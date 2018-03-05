

/* [문제5] 65430원을 만들기 위한 화폐의 갯수를 구하시오.
연산자만을 이용해서 아래와 같이 출력하시오

[결과 화면]
money = 65430원
만원 = 6
천원 = 5
백원 = 4
십원 = 3
*/
public class ExamTest05 {
	public static void main(String[] args) {
		int money=65430;
		System.out.println("money = "+money+"\n만원 = "+money/10000
				+"\n천원 = "+(money-60000)/1000+"\n백원 = "+(money-65000)/100+"\n십원 = "+(money-65400)/10);
	}
}
