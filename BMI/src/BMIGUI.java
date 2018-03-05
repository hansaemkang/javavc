import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//윈도우 모양이 만들어진다.
//자바에서 label은 출력을 담당
//text fields는 글상자, button은 button

class BMIGUI2 extends Frame implements ActionListener {
	private Button b1 = new Button("BMI계산");
	private Label la1 = new Label("당신의 키는");
	private Label la2 = new Label("당신의 몸무게는");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();

	public BMIGUI2() {

		this.setLayout(null);// 내 마음대로 layout을 만들거다
		b1.setSize(100, 70);// 버튼크기
		//색상 
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,150,100));
		b1.setFont(new Font("돋움",Font.BOLD,20));
		
		b1.setLocation(200, 300);// 버튼 내부위치
		this.add(b1);// Frame에 버튼 추가
		b1.addActionListener(this);// b1이 이벤트의 대상이 되도록

		la1.setSize(90, 30);
		la1.setLocation(20, 70);
		this.add(la1);

		tf1.setSize(70, 30);
		tf1.setLocation(120, 70);
		this.add(tf1);

		la2.setSize(90, 30);
		la2.setLocation(20, 100);
		this.add(la2);

		tf2.setSize(70, 30);
		tf2.setLocation(120, 100);
		this.add(tf2);

		tf3.setSize(400, 50);
		tf3.setLocation(20, 400);
		this.add(tf3);

		this.setSize(500, 500);// 전체프레임크기
		this.setVisible(true);

		// 창 닫는 명령
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {

				// 보통객체는 garbage collector가 지우는데
				// 이건 개발자가 지울 수 있도록 하는 것

				dispose();
				System.exit(0);// 강제종료
			}// window-closing-end

		});// windowadaptor및 Listener-end
	}// 생성자-end

	@Override // 이벤트 처리 함수
	// b1.addActionListener(this); b1을 받는 e1
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if (e1.getSource() == b1) { // 버튼이 눌러졌으면
			int ki = Integer.parseInt(tf1.getText());
			// atoi() : alphabet to int:"30"->30
			int mom = Integer.parseInt(tf2.getText());

			double mki = ki / 100.0;
			double bmi = mom / Math.pow(mki, 2);
			String result;
			if (bmi >= 30.0)
				result = "비만";
			else if (bmi >= 25)
				result = "과체중";
			else if (bmi >= 18.5)
				result = "보통";
			else
				result = "저체중";

			tf3.setText("당신의 bmi지수는"+bmi+"이며 "+result+"이군요");
		}
	}
}

public class BMIGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMIGUI2 b = new BMIGUI2();// BMIGUI2클래스의 BMIGUI2생성자를 찾아가
	}

}
