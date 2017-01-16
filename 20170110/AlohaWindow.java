
// AlohaWindow.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow{
	public static void main(String[] args) {
		System.out.println("Successed.");
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}



class AlohaWindowMan{
	// field
	JFrame frame;
	MyButton button;
	JPanel panel;				// ボタンとフィールドを載せる
	JTextField fileNameField;

	// method
	public AlohaWindowMan(){
		// フレームを作る
		frame = new JFrame("AlohaWindow");
		frame.setLocation( 400, 200 );
		frame.setSize( 400, 400 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// ボタンとフィールドをパネルに載せる
		button = new MyButton("Delete");
		fileNameField = new JTextField("Aloha", 20 );

		panel = new JPanel();
		panel.add( fileNameField );
		panel.add( button );

		Container con = frame.getContentPane();
		con.setLayout( new GridLayout( 2, 1 ) );
		con.add( panel );

		// 表示
		frame.setVisible(true);
	}



	class MyButton extends JButton implements ActionListener{
		// コンストラクタ
		public MyButton( String str ){
			super( str );
			addActionListener(this);
		}

		// ↓クリックした時の処理
		public void actionPerformed( ActionEvent ae ){
			fileNameField.setText("");
		}
	}
}
