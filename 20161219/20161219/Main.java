import java.awt.FlowLayout;
import javax.swing.*;

public class Main{
   public static void main(String[]args){
   	//	変数、データ
	   JFrame frame = new JFrame("はじめてのGUI");
	   JLabel label = new JLabel("Hello,world");
	   JLabel label2 = new JLabel("Aloha");
	   JButton button = new JButton("1");
	   JButton button2 = new JButton("2");
	   JButton button3 = new JButton("3");
    // GUIを作る・配置する

	   frame.getContentPane().setLayout(new FlowLayout());
	   frame.getContentPane().add(label);
	   frame.getContentPane().add(label2);
	   frame.getContentPane().add(button);
	   frame.getContentPane().add(button2);
	   frame.getContentPane().add(button3);
    // close設定
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // サイズ設定
       frame.setSize(200,200);
    //windowを見せる
       frame.setVisible(true);


   }
}
