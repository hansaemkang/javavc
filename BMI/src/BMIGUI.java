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

//������ ����� ���������.
//�ڹٿ��� label�� ����� ���
//text fields�� �ۻ���, button�� button

class BMIGUI2 extends Frame implements ActionListener {
	private Button b1 = new Button("BMI���");
	private Label la1 = new Label("����� Ű��");
	private Label la2 = new Label("����� �����Դ�");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();

	public BMIGUI2() {

		this.setLayout(null);// �� ������� layout�� ����Ŵ�
		b1.setSize(100, 70);// ��ưũ��
		//���� 
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,150,100));
		b1.setFont(new Font("����",Font.BOLD,20));
		
		b1.setLocation(200, 300);// ��ư ������ġ
		this.add(b1);// Frame�� ��ư �߰�
		b1.addActionListener(this);// b1�� �̺�Ʈ�� ����� �ǵ���

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

		this.setSize(500, 500);// ��ü������ũ��
		this.setVisible(true);

		// â �ݴ� ���
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {

				// ���밴ü�� garbage collector�� ����µ�
				// �̰� �����ڰ� ���� �� �ֵ��� �ϴ� ��

				dispose();
				System.exit(0);// ��������
			}// window-closing-end

		});// windowadaptor�� Listener-end
	}// ������-end

	@Override // �̺�Ʈ ó�� �Լ�
	// b1.addActionListener(this); b1�� �޴� e1
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if (e1.getSource() == b1) { // ��ư�� ����������
			int ki = Integer.parseInt(tf1.getText());
			// atoi() : alphabet to int:"30"->30
			int mom = Integer.parseInt(tf2.getText());

			double mki = ki / 100.0;
			double bmi = mom / Math.pow(mki, 2);
			String result;
			if (bmi >= 30.0)
				result = "��";
			else if (bmi >= 25)
				result = "��ü��";
			else if (bmi >= 18.5)
				result = "����";
			else
				result = "��ü��";

			tf3.setText("����� bmi������"+bmi+"�̸� "+result+"�̱���");
		}
	}
}

public class BMIGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMIGUI2 b = new BMIGUI2();// BMIGUI2Ŭ������ BMIGUI2�����ڸ� ã�ư�
	}

}
