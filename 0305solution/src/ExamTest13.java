/*[����13]
Ŭ������ : Date
��  �� : year, month, day          (���� ��,��,��)
�޼��� : Date(int,int,int); 
         void printDate();         <--- ��,��,�����


Ŭ������ : Product                 <---- Date�� ��ӹ���
��  �� : item,company,price        (��ǰ��,������,����)
�޼��� : Product(String, String, int,int,int,int)
         void printPro();          <----- ��ǰ��,������,�������

���ϸ�/Ŭ������ : ExamTest13           <--- main()����      

[����]
Test1Ŭ������ main()�Լ����� ProductŬ������ 
��ü ob("�����", "���",1200, 2012, 3, 10)�� �������� 
������ �޼��带 ȣ���Ͽ� �Ʒ��� ���� ����Ͻÿ�
   
[��� ȭ��]
��ǰ�� : �����
������ : ���
��  �� : 1200��
������ : 2012/3/10
*/

class Date {
	int year, month, day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public void printDate() {
		System.out.println("������ : " + year + "/" + month + "/" + day);
	}

}

class Product extends Date {
	String item, company;
	int price;

	public Product(String item, String company, int price, int year, int month, int day) {
		super(year, month, day);
		this.item = item;
		this.company = company;
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	public void printPro() {
		System.out.println("��ǰ�� : " + item + "\n������ : " + company + "\n���� : " + price);
		printDate();
	}
}
public class ExamTest13{
	public static void main(String[] args) {
		Product ob = new Product("�����", "���", 1200, 2012, 3, 10);
		ob.printPro();

	}
}
