	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;


	public class MainFrameMan2 {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}

    //actionListenerの実装
	class FrameMan implements ActionListener{

		JFrame frame;
		JPanel panel1;
		JPanel panel2;
		JLabel label;
		JButton button;
		JTextField textfield;

		// コンストラクタ
		public FrameMan(){
			System.out.println("ALOHA");
            // window設定
			frame = new JFrame("FrameMan");
			frame.setBounds(100, 100, 300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout( new BorderLayout() );
            // パーツ作成
			panel1 = new JPanel();
			panel2 = new JPanel();
			label = new JLabel("↑入力してください");
			button = new JButton("ClickMe");
            textfield = new JTextField(10javac );

			button.addActionListener(this);
			// パーツを載せる
		    panel1.add(textfield);
		    panel1.add(button);
            panel2.add(label);
			frame.add(panel1,BorderLayout.NORTH);
			frame.add(panel2,BorderLayout.CENTER);
            // window表示
			frame.setVisible(true);
		}

		//クリックメソッド
		public void actionPerformed(ActionEvent e){
			String data = textfield.getText();
			label.setText(data);
		}
	}