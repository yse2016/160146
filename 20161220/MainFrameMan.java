	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;


	public class MainFrameMan {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}

    //actionListenerの実装
	class FrameMan implements ActionListener{

		JFrame frame;
		JPanel panel;
		JLabel label;
		JButton button;
		// コンストラクタ
		public FrameMan(){
			System.out.println("ALOHA");
            // window設定
			frame = new JFrame("FrameMan");
			frame.setBounds(100, 100, 300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout( new FlowLayout() );
            // パーツ作成
			panel = new JPanel();
			label = new JLabel("HELLO");
			button = new JButton("ClickMe");

			button.addActionListener(this);
			// パーツを載せる
		    panel.add(label);
			panel.add(button);

			frame.add(panel);
            // window表示
			frame.setVisible(true);
		}

		//クリックメソッド
		public void actionPerformed(ActionEvent e){
			label.setText("Aloha");
		}
	}