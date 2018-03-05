

import java.util.Scanner;

/* [문제11] 지불된 금액에서 제품 가격 2340원을 뺀 차액을 동전으로 거스름돈을 주려고 한다.
최소 동전의 개수로  거스름돈을 줄 수 있게 구현하시오.
동전은 500, 100, 50, 10 원이 사용된다고 정한다.

[결과 화면]
금액을 지불해 주세요 : 5000
상품의 가격 : 2500
거스름돈 160
100 동전 : 1개
50 동전 : 1개
10 동전 : 1개
 
지불된 금액이 제품 가격 보다 적을 때 -> "제품을 구매할 수 없어요"
지불된 금액과 제품 가격이 동일할 때 -> "거스름돈이 없습니다."
지불된 금액이 제품 가격 보다 많을 때 -> "500원 X개, 100원 X개..."
필요없는 금액의 동전은 출력하지 않는다. 
*/
public class ExamTest11 {
	public static void main(String[] args) {
		int productPrice = 2500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 지불해 주세요 : ");
		int money = sc.nextInt();
		int []kindCoin={500,100,50,10};
		int []countCoin=new int[kindCoin.length];
		int rest=money-productPrice;//잔액계산
		int divide=0;//동전 개수 
		System.out.println("상품의 가격 : "+productPrice);
		if(money>productPrice){
			for (int i = 0; i < kindCoin.length; i++) {
				divide=rest/kindCoin[i];
				if(divide>0)
					countCoin[i]=divide;
				rest=rest%kindCoin[i];
			}
			System.out.println("거스름돈 : "+(money-productPrice));
			for (int i = 0; i < kindCoin.length; i++) {
				if(countCoin[i]!=0){
					System.out.println(kindCoin[i]+"원 동전:"+countCoin[i]+"개");
				}
			}
		}
		else if(money==productPrice)
			System.out.println("거스름 돈이 없습니다.");
		else
			System.out.println("제품을 구매할 수 없습니다.");
		sc.close();
		
		
	}
}
