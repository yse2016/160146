import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Aidean{
	public static void main(String[]args){
		Aideaman adm = new Aideaman();
	}
}

class Aideaman {
	JFrame frame;
	JButton button;
	JButton button2;
	JPanel panel;



    public Aideaman(){
    	frame= new JFrame("Aloha");
    	frame.setLocation(400,250);
    	frame.setSize(300,300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	button = new JButton("Aloha");
    	button2 = new JButton("アロハ");

    	panel = new JPanel();
    	panel.add(button);
    	panel.add(button2);

    }

}