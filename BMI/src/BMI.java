import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*BMI=������/Ű������
		 30�̻� ��
		 25-30 ��ü��
		 20-25 ����
		 20�̸� ��ü��*/
		System.out.println("�����Ը� �Է��ϼ��� ");
		Scanner sc=new Scanner(System.in);
		String a1=sc.nextLine();
		int mom=Integer.parseInt(a1);

		
		System.out.println("Ű�� �Է��ϼ��� ");
		String a111=sc.nextLine();
		double ki=Double.parseDouble(a111);

		//int mom=Integer.parseInt(a1);
		//System.out.println("Ű�� �Է��ϼ��� ");
	//	Scanner sc1=new Scanner(System.in);
	//	//String a11=sc.nextLine();
		//double ki=Double.parseDouble(a11);
		
		double bmi=mom/(ki/100*ki/100);
		System.out.println(bmi);
		if(bmi>=30.0)
			System.out.println("��\n");
		else if(bmi>=25)
			System.out.println("��ü��\n");
		else if(bmi>=18.5)
			System.out.println("����\n");
		else 
			System.out.println("��ü��\n");
	}

}
