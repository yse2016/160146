

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alohaman{
	public static void main(String[] args) {
		System.out.println("Successed.");
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}



class AlohaWindowMan{
	// field
	JFrame frame;
	JButton btnOpen;
	MyButton btnSave;
	JPanel panel;				// ボタンとフィールドを載せる
	JTextField fileName;
	JTextArea textArea;
	JScrollPane scrollPane;


	public AlohaWindowMan(){

		frame = new JFrame("AlohaWindow");
		frame.setLocation( 400, 200 );
		frame.setSize( 400, 400 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		btnOpen = new JButton("ファイル名");
		btnOpen.setActionListener(this);
	    btnOpen.setActionCommand("open");
		btnSave = new MyButton("保存");
		btnSave.setActionListener(this);
		btnSave.setActionCommand("save");
		fileName = new JTextField("", 20 );
        panel = new JPanel();
		panel.add( fileName );
		panel.add( btnOpen );
		panel.add( btnSave );
		textArea = new JTextArea(10,30);
        scrollPane = new JScrollPane(textArea);
        Container con = frame.getContentPane();
		con.setLayout( new GridLayout( 2, 1 ) );
		con.add( panel );
		con.add(scrollPane);

		frame.setVisible(true);
	}

public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("Open")){
            textFile.setText("Open");
            FileReader fr;
	        BufferedReader br;

	     try{
	        	fr=new FileReader(textfile);
	        	br=new BufferedReader(textfile);
                String textFile=fileName.setText();
                textArea.setText(data);
        }catch(IOException e){
        	System.out.println("エラー");
        }
		}else if(cmd.equals("Save")){
			textFile.setText("Save");
		}
		String data;

		while((data=br.readLine()) !=null){
			textArea.append(data+'\n');
		}


}
}


