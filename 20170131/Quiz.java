import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout.*;

public class Quiz{
	public static void main(String[]args){
		QuizMan qm =new QuizMan();
	}
}
class QuizMan implements ActionListener{
JFrame frame;
JButton btn1;
JButton btn2;
JButton btn3;
JButton btn4;
JPanel panel;
JTextField text1;
JLabel label1;
JLabel label2;
JLabel label3;

	public QuizMan(){
	frame =new JFrame("クイズ");
	frame.setSize(1000,1000);

	btn1=new JButton("ア. CRTディスプレイ");
	btn2=new JButton("イ. 液晶ディスプレイ");
	btn3=new JButton("ウ. プラズマディスプレイ");
	btn4=new JButton("エ. 有機ELディスプレイ");



	panel=new JPanel();

    label1 =new JLabel("");
	label2 =new JLabel("");
	label3 =new JLabel("問題です。自発光型で、発行ダイオードの一種に分類される表示装置はどれか。");
	panel.add(label3);
	panel.add(btn1);
	panel.add(btn2);
	panel.add(btn3);
	panel.add(btn4);
	
	Container con = frame.getContentPane();
    con.setLayout(new GridLayout(2,1));
    con.add(panel);
    con.add(label1);
    con.add(label2);

    btn1.addActionListener(this);
    btn1.setActionCommand("ア. CRTディスプレイ");
    
    btn2.addActionListener(this);
    btn2.setActionCommand("イ. 液晶ディスプレイ");
    
    btn3.addActionListener(this);
    btn3.setActionCommand("ウ. プラズマディスプレイ");
    
    btn4.addActionListener(this);
    btn4.setActionCommand("エ. 有機ELディスプレイ");

	frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		String cmd=ae.getActionCommand();

		if(cmd.equals("ア. CRTディスプレイ")){
			label2.setText("不正解です。答えはエでした。");
		}else if(cmd.equals("イ. 液晶ディスプレイ")){
			label2.setText("不正解です。答えはエでした。");
		}else if(cmd.equals("ウ. プラズマディスプレイ")){
			label2.setText("不正解です。答えはエでした。");
		}else if(cmd.equals("エ. 有機ELディスプレイ")){
			label1.setText("正解です");
     }

		}
	}