import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
    public static void main(String[] args){
        IdeaMan im = new IdeaMan();
    }
}

class IdeaMan implements ActionListener{

    JFrame frame;
    JButton btnOpen;
    JButton btnSave;
    JPanel panel;
    JPanel panel2;
    JTextField field;
    JTextArea area;
    JScrollPane scrollPane;
    String filedata;
    String textdata;
    int max = 128;
    String[] datas = new String[max];
    int co = 0;
    int num = 0;

    public IdeaMan(){

        frame = new JFrame("Idean");
        frame.setLocation(500,250);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOpen = new JButton("単語召喚");
        btnSave = new JButton("メモ保存");

        field = new JTextField(20);
        area = new JTextArea(10,30);
        area.setLineWrap(true);

        panel = new JPanel();

        panel.add(btnOpen);
        panel.add(btnSave);

        scrollPane = new JScrollPane(area);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(scrollPane);

        frame.setVisible(true);

        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");

        btnSave.addActionListener(this);
        btnSave.setActionCommand("save");
        try{
                File inFile         = new File("data.txt");
                FileReader fr       = new FileReader(inFile);
                BufferedReader br   = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null){
                    datas[co] = line;
                    co++;
                }

                br.close();
            } catch(IOException e){
                    System.out.println("エラー");
            }
        }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if(cmd.equals("open")){
            num = (int)(Math.random()*co);
            area.setText(datas[num]);

            area.append("\n");
            num = (int)(Math.random()*co);
            area.append(datas[num]);
            
        }else if(cmd.equals("save")){
            textdata = area.getText();
            try{
                File outFile            = new File("result.txt");
                FileWriter fw           = new FileWriter(outFile,true);
                BufferedWriter bw       = new BufferedWriter(fw);
                PrintWriter pw          = new PrintWriter(bw);

                pw.println(textdata);

                pw.close();

            }catch(IOException e){
                System.out.println("エラー");
            }
        }
    }
}