
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[문제2]성적처리프로그램
        중간고사,기말고사,레포트,출석점수를 Args로 입력받아서 계산하시오
        
조건1) (중간+기말)/2   ---> 60%
          과제                          ---> 20%
          출석                           ---> 20%
     
조건2)90이상 'A'학점     (3)A,B학점  ---->"excellent"
     80이상 'B'학점        C,D학점  ---->"good"
     70이상 'C'학점        F학점    ---->"poor"
     60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
     (if~else if문이용)

$ java ExamTest02  90 89 99 100  

[결과 화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수이하 2째자리까지
학점=A              
평가=excellent
*/
public class ExamTest02 {
	public static void main(String[] args) {
		String j1=args[0];
		String g1=args[1];
		String h1=args[2];
		String c1=args[3];
		int j=Integer.parseInt(j1);
		int g=Integer.parseInt(g1);
		int h=Integer.parseInt(h1);
		int c=Integer.parseInt(c1);
		double score=(double)(j+g+h+c)/4;
		String hakjum=null;
		String pyung = null;
		if(score>=90)
			hakjum="A";
		else if(score>=80)
			hakjum="B";
		else if(score>=70)
			hakjum="C";
		else if(score>=60)
			hakjum="D";
		else
			hakjum="F";
		switch(hakjum){
		case "A":
		case "B":
			pyung="excellent";
			break;
		case "C":
		case "D":
			pyung="good";
			break;
		case "F":
			pyung="poor";
			break;
		default:
			break;
		}
		System.out.println("중간고사 : "+j+"\n기말고사 : "+g+"\n과제점수 : "+h+"\n출석점수 : "+c
				+"\n\n성적="+score+"\n학점="+hakjum+"\n평가="+pyung);
		
	}
}
