

import java.util.Scanner;

/* [����11] ���ҵ� �ݾ׿��� ��ǰ ���� 2340���� �� ������ �������� �Ž������� �ַ��� �Ѵ�.
�ּ� ������ ������  �Ž������� �� �� �ְ� �����Ͻÿ�.
������ 500, 100, 50, 10 ���� ���ȴٰ� ���Ѵ�.

[��� ȭ��]
�ݾ��� ������ �ּ��� : 5000
��ǰ�� ���� : 2500
�Ž����� 160
100 ���� : 1��
50 ���� : 1��
10 ���� : 1��
 
���ҵ� �ݾ��� ��ǰ ���� ���� ���� �� -> "��ǰ�� ������ �� �����"
���ҵ� �ݾװ� ��ǰ ������ ������ �� -> "�Ž������� �����ϴ�."
���ҵ� �ݾ��� ��ǰ ���� ���� ���� �� -> "500�� X��, 100�� X��..."
�ʿ���� �ݾ��� ������ ������� �ʴ´�. 
*/
public class ExamTest11 {
	public static void main(String[] args) {
		int productPrice = 2500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� ������ �ּ��� : ");
		int money = sc.nextInt();
		int []kindCoin={500,100,50,10};
		int []countCoin=new int[kindCoin.length];
		int rest=money-productPrice;//�ܾװ��
		int divide=0;//���� ���� 
		System.out.println("��ǰ�� ���� : "+productPrice);
		if(money>productPrice){
			for (int i = 0; i < kindCoin.length; i++) {
				divide=rest/kindCoin[i];
				if(divide>0)
					countCoin[i]=divide;
				rest=rest%kindCoin[i];
			}
			System.out.println("�Ž����� : "+(money-productPrice));
			for (int i = 0; i < kindCoin.length; i++) {
				if(countCoin[i]!=0){
					System.out.println(kindCoin[i]+"�� ����:"+countCoin[i]+"��");
				}
			}
		}
		else if(money==productPrice)
			System.out.println("�Ž��� ���� �����ϴ�.");
		else
			System.out.println("��ǰ�� ������ �� �����ϴ�.");
		sc.close();
		
		
	}
}
