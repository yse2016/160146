import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
				//継承、拡張
public class JPanelTest extends JFrame{
   //コンストラクタ(特別なメソッド)
   public JPanelTest(){
      setSize(200,200);
      setTitle("テスト");
   //パネル追加
      MyJpanel myjp = new MyJpanel
      JLabel lable= new JLable("Hello");
      Container c = getContentPane();
      c.add(myjp);

   }
   //main
   public static void main (String[]args){
   	JFrame w =new JPanelTest();
   	w.show();
   }
   }

class myJpanel extends JPanel {
	public void paintComponent(g);
	  super.paintComponent(g);
	  g.drawString("Aloha",20);
}
