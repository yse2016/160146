import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
	public static void main(String[]args){
		Ideaman im = new Ideaman();
	}
}

class Ideaman {
	JFrame frame;
	JButton wordbtn;
	JButton memobtn;
	JPanel panel;
	JTextField field;
	JTextArea area;
	JTextArea area2;
    JScrollPane scrollPane;


    public Ideaman(){

    	frame= new JFrame("Aloha");
    	frame.setLocation(500,500);
    	frame.setSize(500,500);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	field =new JTextField(20);
    	wordbtn = new JButton("単語を保存");
    	memobtn = new JButton("メモを保存");

    	area =new JTextArea(10,10);
    	area2= new JTextArea(20,20);
    	area.setLineWrap(true);

    	panel = new JPanel();
    	panel.add(wordbtn);
    	panel.add(memobtn);
    	panel.add(field);
    	panel.add(area);
    	panel.add(area2);

        scrollPane = new JScrollPane(area);

        Container con =frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(scrollPane);


  	    frame.setVisible(true);

}
}