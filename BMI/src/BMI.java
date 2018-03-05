import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*BMI=몸무게/키의제곱
		 30이상 비만
		 25-30 과체중
		 20-25 보통
		 20미만 저체중*/
		System.out.println("몸무게를 입력하세요 ");
		Scanner sc=new Scanner(System.in);
		String a1=sc.nextLine();
		int mom=Integer.parseInt(a1);

		
		System.out.println("키를 입력하세요 ");
		String a111=sc.nextLine();
		double ki=Double.parseDouble(a111);

		//int mom=Integer.parseInt(a1);
		//System.out.println("키를 입력하세요 ");
	//	Scanner sc1=new Scanner(System.in);
	//	//String a11=sc.nextLine();
		//double ki=Double.parseDouble(a11);
		
		double bmi=mom/(ki/100*ki/100);
		System.out.println(bmi);
		if(bmi>=30.0)
			System.out.println("비만\n");
		else if(bmi>=25)
			System.out.println("과체중\n");
		else if(bmi>=18.5)
			System.out.println("보통\n");
		else 
			System.out.println("저체중\n");
	}

}
