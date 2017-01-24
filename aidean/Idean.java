import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
    public static void main(String[] args) {
        IdeanMan im = new IdeanMan();
    }
}

class IdeanMan implements ActionListener{
    JFrame frame;
    JTextField idea1;
    JTextField idea2;
    JTextField ideaName;
    JTextArea area;
    JPanel panel;
    JButton ideaButton;
    JButton ideaSave;
    JLabel label;

 public IdeanMan(){

        frame = new JFrame("Idean");
        frame.setLocation( 600, 250 );
        frame.setSize( 512, 275 );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        idea1 = new JTextField("ワード",20);
        idea2 = new JTextField("ワード",20);

        area = new JTextArea( 10, 30 );

        fileName = new JTextField("ファイル名を入力.txt",15);
        panel = new JPanel();

        ideaButton = new JButton("単語2個表示");
        ideaButton.addActionListener(this);
        ideaButton.setActionCommand("idea");

        ideaSave = new JButton("保存");
        ideaSave.addActionListener(this);
        ideaSave.setActionCommand("save");

        label = new JLabel("+");

        panel.add( idea1 );
        panel.add( label );
        panel.add( idea2 );
        panel.add( ideaButton );
        panel.add( area );
        panel.add( fileName );
        panel.add( saveButton );

        Container con = frame.getContentPane();
        con.setLayout( new GridLayout( 1, 1 ) );
        con.add( panel );

        frame.setVisible(true);
    }

        public void actionPerformed( ActionEvent ae ){
        String[] idea1 = {"アップルティ","レモンティ"};
        String[] idea2 = {"タブレット","ウォークマン"};

        String cmd = ae.getActionCommand();

        if(cmd.equals("Idea") ){

        } else if(cmd.equals("Save") ){

                String text_File_Name = fileName.getText();

                FileWriter fw = null;
                PrintWriter pw = null;
                try{
                    fw = new FileWriter( text_File_Name );
                    pw = new PrintWriter( fw );

                    String data1 = idea1.getText();
                    String data2 = idea2.getText();
                    String data3 = area.getText();

        pw.println( data1 +" + "+ data2 );
        pw.println("↓");
        pw.println( data3 );
        } catch( IOException e ){
            System.out.println("エラー");
        } finally {
        try{
        fw.close();
        pw.close();
        } catch( IOException e ){
            System.out.println("エラー");
        }
        }

    }
    }
}


