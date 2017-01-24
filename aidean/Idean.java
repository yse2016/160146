import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
    public static void main(String[] args) {
        IdeanMan idm = new IdeanMan();
    }
}



class IdeanMan implements ActionListener{
    JFrame frame;
    JTextField idea_Name1;
    JTextField idea_Name2;
    JTextField file_Name;
    JTextArea area;
    JPanel field_Panel;
    JButton btn_Idea;
    JButton btn_Save;
    JLabel label_Plus;

 public IdeanMan(){

        frame = new JFrame("Idean");
        frame.setLocation( 600, 250 );
        frame.setSize( 512, 275 );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        idea_Name1 = new JTextField("ワード",20);
        idea_Name2 = new JTextField("ワード",20);

        area = new JTextArea( 10, 30 );


        file_Name = new JTextField("ファイル名を入力.txt",15);

        field_Panel = new JPanel();

        btn_Idea = new JButton("単語2個表示");
        btn_Idea.addActionListener(this);
        btn_Idea.setActionCommand("idea");

        btn_Save = new JButton("保存");
        btn_Save.addActionListener(this);
        btn_Save.setActionCommand("save");

        label_Plus = new JLabel("+");


        field_Panel.add( idea_Name1 );
        field_Panel.add( label_Plus );
        field_Panel.add( idea_Name2 );
        field_Panel.add( btn_Idea );
        field_Panel.add( area );
        field_Panel.add( file_Name );
        field_Panel.add( btn_Save );

        Container con = frame.getContentPane();
        con.setLayout( new GridLayout( 1, 1 ) );
        con.add( field_Panel );

           frame.setVisible(true);
    }

        public void actionPerformed( ActionEvent ae ){
        String[] idea1 = {"アップルティ","レモンティ"};
        String[] idea2 = {"タブレット","ウォークマン"};

        String cmd = ae.getActionCommand();

        if( cmd.equals("Idea") ){

        } else if( cmd.equals("save") ){

                String text_File_Name = file_Name.getText();

                FileWriter fw = null;
                PrintWriter pw = null;

                try{
                    fw = new FileWriter( text_File_Name );
                    pw = new PrintWriter( fw );

                    String data1 = idea_Name1.getText();
                    String data2 = idea_Name2.getText();
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


