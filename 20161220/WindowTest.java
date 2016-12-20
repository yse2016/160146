import java.awt.FlowLayout;
import javax.swing.*;

public class Main{
	public static void main(String[]args){
	    //データ変数
	    JFrame frame = new JFrame("表示");
	    JLabel label = new JLabel("Hello");
        JButton button = new JButton("ClickMe");
        //追加
        frame.getContentPane().setLayout(new FlowLayout());
	    frame.getContentPane().add(label);
	    frame.getContentPane().add(button);
        //閉じる
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //場所指定
	    frame.setBounds(300,300,300,300);
        //window表示
	    frame.setVisible(true);

	}
}