

/*[����3]50���� ������ ���� ������ ���� ����Ͻÿ�
   ����1) 30 - 75 ������ �� �ϰ�
   ����2) 1�ٿ� 6���� ǥ���Ͻÿ�  
   
[��� ȭ��]   
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
��=2420
*/
public class ExamTest03 {
	public static void main(String[] args) {
		/*System.out.println(Math.random()); //0~0.9999
		System.out.println(Math.random()*100);//0~99.9999
		System.out.println(((int)Math.random()*100)+1);//0~99 -> 1~100
*/	
		
		
		for (int i = 1; i <= 50; i++) {
			int a=((int)(Math.random()*46)+30);
			System.out.print(a+" ");
			if(i%6==0)
				System.out.println();
			
		}
		
	}
}
