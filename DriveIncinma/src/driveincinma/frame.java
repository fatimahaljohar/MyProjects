package driveincinma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

   public class frame extends JFrame implements ActionListener{
       
   static JLabel lbl = new JLabel("Login Form");
   static JButton btn = new JButton("register");
   static JButton btn2 = new JButton("cancel");

   
  public static void main(String[] args) {
       
     frame frm = new frame();
     frm.setSize(400, 100);
     frm.setVisible(true);
     frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frm.setTitle("Home");
     frm.setLayout(new FlowLayout());
     
     frm.add(lbl);
     frm.add(btn);
     frm.add(btn2);
    
     btn.addActionListener(frm);
     btn2.addActionListener(frm);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
         
    if(e.getSource()==btn){

        login regFrm = new login();}
    
    if(e.getSource()==btn2){
    
    }
}
   }