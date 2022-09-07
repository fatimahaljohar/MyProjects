
package driveincinma;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

public class cinema extends JFrame implements ItemListener{
     Connection con = null;
     
    JTabbedPane pane = new JTabbedPane();
    JPanel panel = new JPanel();
     /********** Wed work -> ==Parking PAGE == ******************/
    JPanel panelParking = new JPanel();
     
    JPanel firstPanel = new JPanel();
    JLabel fPanel = new JLabel("Premium :");
     JLabel f2Panel = new JLabel("Price :60 SAR");
 
    JPanel secondPanel = new JPanel();
    JLabel sPanel = new JLabel("Standard :");
    JLabel s2Panel = new JLabel("Price :30 SAR");
     
    JCheckBox p1 =new JCheckBox("p1 ");
    JCheckBox p2=new JCheckBox("p2 ");
    JCheckBox p3=new JCheckBox("p3 ");
    JCheckBox p4=new JCheckBox("p4 ");
    JCheckBox p5 =new JCheckBox("p5 ");
    JCheckBox p6 =new JCheckBox("p6 ");
    JCheckBox p7 =new JCheckBox("p7 ");
    JCheckBox p8 =new JCheckBox("p8 ");
    JCheckBox p9 =new JCheckBox("p9 ");
    JCheckBox p10 =new JCheckBox("p10");
    JCheckBox p11 =new JCheckBox("p11");
    JCheckBox p12 =new JCheckBox("p12");
    
    Icon iconParking = new ImageIcon(getClass().getResource("Parking.png"));
    JLabel lblIconParking = new JLabel(iconParking);
   
    /********** Sarah work -> ==Movies PAGE == ******************/
    JPanel panelMovies = new JPanel();
    JPanel vertica11 = new JPanel();
    JPanel horizontal1 = new JPanel();
    JPanel vertica12 = new JPanel();
     login log=new login();
   

    //Creat radio button to display movies


    JRadioButton movieBtn1 = new JRadioButton("Luca - PG - Fantasy/Comedy");
    JRadioButton movieBtn2 = new JRadioButton("Crulla - PG13 - Comedy/Crime");
    JRadioButton movieBtn3 = new JRadioButton("Encanto - PG - Comedy/Animation");
    JRadioButton movieBtn4 = new JRadioButton("Werewolves Within - R18 - Horror");
    JRadioButton movieBtn5 = new JRadioButton("Joker - R - Crime/Drama");
    JRadioButton movieBtn6 = new JRadioButton("To Olivia - PG12 - Drama");
    JRadioButton movieBtn7 = new JRadioButton("King Richard - PG12 - Sport/Drama");
    JRadioButton movieBtn8 = new JRadioButton("House Of Gucci - R18 - Drama/Crime");


    ButtonGroup btn = new ButtonGroup();
  
    //Movies Poster
    Icon iconMovie1 = new ImageIcon(getClass().getResource("Luca.png"));
    JLabel lblIcon1 = new JLabel(iconMovie1);
    Icon iconMovie2 = new ImageIcon(getClass().getResource("Crulla.png"));
    JLabel lblIcon2 = new JLabel(iconMovie2);
    Icon iconMovie3 = new ImageIcon(getClass().getResource("Encanto.png"));
    JLabel lblIcon3 = new JLabel(iconMovie3);
    Icon iconMovie4 = new ImageIcon(getClass().getResource("wherewolves.png"));
    JLabel lblIcon4 = new JLabel(iconMovie4);
    Icon iconMovie5 = new ImageIcon(getClass().getResource("Joker.png"));
    JLabel lblIcon5 = new JLabel(iconMovie5);
    Icon iconMovie6 = new ImageIcon(getClass().getResource("To Olivia.png"));
    JLabel lblIcon6 = new JLabel(iconMovie6);
    Icon iconMovie7 = new ImageIcon(getClass().getResource("King Richard.png"));
    JLabel lblIcon7 = new JLabel(iconMovie7);
    Icon iconMovie8 = new ImageIcon(getClass().getResource("House Of Gucci.png"));
    JLabel lblIcon8 = new JLabel(iconMovie8);

    
    
     /********** Fatimah work -> ==SNAK PAGE == ******************/
    JCheckBox nachos=new JCheckBox(" Nachos(20 RS)");
    JCheckBox pizza=new JCheckBox(" Pizza(48 RS)");
    JCheckBox popcorn=new JCheckBox(" Popcorn(13 RS)");
    JCheckBox drink=new JCheckBox(" Soft-Drink(8 RS)");
    
    JCheckBox cinema=new JCheckBox(" Full Meal(45 RS)");
    JCheckBox burger=new JCheckBox(" Cheese-burger(23 RS)");
    JCheckBox chocolate=new JCheckBox(" Chocolate(10 RS)");
    JCheckBox hotdog=new JCheckBox(" Hotdog(18 RS)");
   
    JPanel snakPanel = new JPanel();
    JPanel Fvertica1 = new JPanel();
    JPanel Svertica1 = new JPanel();
    JPanel Fhorizontal = new JPanel();
    JPanel Shorizontal = new JPanel();
    JLabel Flabel=new JLabel();
    JLabel Slabel=new JLabel();
    JTextArea tout = new JTextArea();
    
    Icon icon1=new ImageIcon(getClass().getResource("cinema.png"));
    JLabel Licon1 = new JLabel(icon1);
    Icon icon2=new ImageIcon(getClass().getResource("cheese-burger.png"));
    JLabel Licon2 = new JLabel(icon2);
    Icon icon3=new ImageIcon(getClass().getResource("chocolate-bar.png"));
    JLabel Licon3 = new JLabel(icon3);
    Icon icon4=new ImageIcon(getClass().getResource("hotdog.png"));
    JLabel Licon4 = new JLabel(icon4);
    Icon icon5=new ImageIcon(getClass().getResource("nachos (1).png"));
    JLabel Licon5= new JLabel(icon5);
    Icon icon6=new ImageIcon(getClass().getResource("pizza.png"));
    JLabel Licon6= new JLabel(icon6);
    Icon icon7=new ImageIcon(getClass().getResource("popcorn.png"));
    JLabel Licon7= new JLabel(icon7);
    Icon icon8=new ImageIcon(getClass().getResource("soft-drink.png"));
    JLabel Licon8= new JLabel(icon8);
    /**********************************************************************/
     
    public cinema(){
    super("Drive In Cinema");
    setLayout(null);
    pane.setBounds( 17 , 20 , 700 , 700);
    setSize(750, 800);
     setVisible(true);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
   
   /********** Sarah work -> == Movies PAGE == ****************/

   //background 
   panelMovies.setBackground(new Color(134, 185, 206));
   vertica11.setBackground(new Color(134, 185, 206));
   vertica12.setBackground(new Color(134, 185, 206));
   horizontal1.setBackground(new Color(134, 185, 206));
   
   vertica11.setLayout(new BoxLayout(vertica11 , BoxLayout.Y_AXIS)); 
   vertica12.setLayout(new BoxLayout(vertica12 , BoxLayout.Y_AXIS));
   horizontal1.setLayout(new BoxLayout(horizontal1 , BoxLayout.X_AXIS)); 

   
    horizontal1.setBorder(javax.swing.BorderFactory.
      createTitledBorder(null, "Choose Movie", javax.swing.border.
      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.WHITE));
    horizontal1.add(vertica11); 
    horizontal1.add(vertica12);

   

   
   //add button
   btn.add(movieBtn1);
   btn.add(movieBtn2);
   btn.add(movieBtn3);
   btn.add(movieBtn4);
   btn.add(movieBtn5);
   btn.add(movieBtn6);
   btn.add(movieBtn7);
   btn.add(movieBtn8);
   
   panelMovies.add(movieBtn1);
   panelMovies.add(movieBtn2);
   panelMovies.add(movieBtn3);
   panelMovies.add(movieBtn4);
   panelMovies.add(movieBtn5);
   panelMovies.add(movieBtn6);
   panelMovies.add(movieBtn7);
   panelMovies.add(movieBtn8);

  
   
   //add movies poster
   
   vertica11.add(lblIcon1);
   vertica11.add(movieBtn1); 
   vertica11.add(lblIcon2);
   vertica11.add(movieBtn2); 
   vertica11.add(lblIcon3);
   vertica11.add(movieBtn3); 
   vertica11.add(lblIcon4); 
   vertica11.add(movieBtn4);
   
  
  vertica12.add(lblIcon5); 
  vertica12.add(movieBtn5);
  vertica12.add(lblIcon6); 
  vertica12.add(movieBtn6);
  vertica12.add(lblIcon7); 
  vertica12.add(movieBtn7);
  vertica12.add(lblIcon8); 
  vertica12.add(movieBtn8);
  


  panelMovies.add(horizontal1);
  
  
  pane.add("MOVIES" , panelMovies);
   
   add(pane);

    /********** Wed work -> ==Parking PAGE == ******************/
   panelParking.setLayout(new GridLayout(1 , 3 , 5 , 5));
   
      panelParking.setBorder(javax.swing.BorderFactory.
      createTitledBorder(null, "Choose Parking Spot ", javax.swing.border.
      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.WHITE));
   
   panelParking.setBackground(new Color(134, 185, 206));
   firstPanel.setBackground(new Color(134, 185, 206));
   secondPanel.setBackground(new Color(134, 185, 206));
 
   
   fPanel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); 
   fPanel.setForeground(new Color(18,27,121));
   sPanel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); 
   sPanel.setForeground(new Color(18,27,121));
   
   f2Panel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); 
   f2Panel.setForeground(new Color(18,27,121));
   s2Panel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); 
   s2Panel.setForeground(new Color(18,27,121));
   
    p1.addItemListener(this);
    p2.addItemListener(this);
    p3.addItemListener(this);
    p4.addItemListener(this);
    p5.addItemListener(this);
    p6.addItemListener(this);
    
    p7.addItemListener(this);
    p8.addItemListener(this);
    p9.addItemListener(this);
    p10.addItemListener(this);
    p11.addItemListener(this);
    p12.addItemListener(this);
    
   firstPanel.add(fPanel);
   firstPanel.add(f2Panel);
   firstPanel.setLayout(new BoxLayout(firstPanel , BoxLayout.Y_AXIS));
   firstPanel.add(p1);
   firstPanel.add(p2);
   firstPanel.add(p3);
   firstPanel.add(p4);
   firstPanel.add(p5);
   firstPanel.add(p6);
   
   secondPanel.add(sPanel);
   secondPanel.add(s2Panel);
   secondPanel.setLayout(new BoxLayout(secondPanel , BoxLayout.Y_AXIS));
   secondPanel.add(p7);
   secondPanel.add(p8);
   secondPanel.add(p9);
   secondPanel.add(p10);
   secondPanel.add(p11);
   secondPanel.add(p12);
    
    

  
   panelParking.add(lblIconParking);
   
   pane.add("PARKING" , panelParking);
   panelParking.add(firstPanel);
   panelParking.add(secondPanel);
  
   add(pane);
   
   /*fatimah work -> ==SNAK PAGE == */
   
   snakPanel.setBackground(new Color(134, 185, 206));
   Fvertica1.setBackground(new Color(134, 185, 206));
   Svertica1.setBackground(new Color(134, 185, 206));
   Fhorizontal.setBackground(new Color(134, 185, 206));
   
   Svertica1.setLayout(new BoxLayout(Svertica1 , BoxLayout.Y_AXIS));
   Fvertica1.setLayout(new BoxLayout(Fvertica1 , BoxLayout.Y_AXIS));
   Fhorizontal.setLayout(new BoxLayout(Fhorizontal , BoxLayout.X_AXIS));
   
   Fhorizontal.setBorder(javax.swing.BorderFactory.
      createTitledBorder(null, "Choose your snacks", javax.swing.border.
      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.WHITE));
   Fhorizontal.add(Svertica1);
   Fhorizontal.add(Fvertica1);
   
   Svertica1.add(Licon5); /*--->*/Svertica1.add(nachos);
  Svertica1.add(Licon6); /*--->*/Svertica1.add(pizza);
  Svertica1.add(Licon7); /*--->*/Svertica1.add(popcorn);
  Svertica1.add(Licon8); /*--->*/Svertica1.add(drink);
  
   Fvertica1.add(Licon1); /*--->*/Fvertica1.add(cinema); 
   Fvertica1.add(Licon2); /*--->*/Fvertica1.add(burger); 
   Fvertica1.add(Licon3); /*--->*/Fvertica1.add(chocolate); 
   Fvertica1.add(Licon4); /*--->*/Fvertica1.add(hotdog); 
  
   nachos.addItemListener(this);
   pizza.addItemListener(this);
   popcorn.addItemListener(this);
   drink.addItemListener(this);
   cinema.addItemListener(this);
   burger.addItemListener(this);
   chocolate.addItemListener(this);
   hotdog.addItemListener(this);
   
   
   snakPanel.add(Fhorizontal);
    pane.add("SNACKS" , snakPanel);
   add(pane);
   
   //hawazen
   //master Jpanel
   JPanel payment = new JPanel();
   pane.add("Payment" , payment);
   payment.setLayout(new GridLayout(1 , 2 ));
   payment.setBackground(new Color(134, 185, 206));
   payment.setBorder(javax.swing.BorderFactory.
      createTitledBorder(null, "pay your bill", javax.swing.border.
      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.WHITE));
   //sides JPanel
   JPanel left=new JPanel();
   JPanel right=new JPanel();
   left.setLayout(new FlowLayout());
   right.setLayout(new  GridLayout(2, 1));
   left.setBackground(new Color(134, 185, 206));
   right.setBackground(new Color(134, 185, 206));
   left.setForeground(Color.WHITE);
   right.setForeground(Color.WHITE);
   Icon paymentcover=new ImageIcon(getClass().getResource("paymentcover.jpg"));
   JLabel paymentcoverr=new JLabel(paymentcover);
   payment.add(left);
   payment.add(right);
   left.add(paymentcoverr);
   //right Jbanel
    JPanel topright=new JPanel();
    JPanel bottomright=new JPanel();
    topright.setBackground(new Color(134, 185, 206));
    bottomright.setLayout(new GridLayout(2, 1) );
    topright.setLayout(new FlowLayout() );
    bottomright.setBackground(new Color(174,208,222));
    bottomright.setBorder(javax.swing.BorderFactory.
      createTitledBorder(null, "Choose a payment method", javax.swing.border.
      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
      TitledBorder.DEFAULT_POSITION, null, new Color(17,119,169)));
    right.add(topright);
    right.add(bottomright);
    //bottom jpanels
   JPanel bottom1=new JPanel();
   JPanel bottom2=new JPanel();
   bottom1.setLayout(new FlowLayout());
   bottom2.setLayout(new GridLayout(1, 1));
    bottomright.add(bottom1);
    bottomright.add(bottom2);
    //bottom1
    bottom1.setBackground(new Color(174,208,222));
    bottom2.setBackground(new Color(18,27,121));
   Icon vesa=new ImageIcon(getClass().getResource("visa-color.png"));
   JLabel vesaphoto=new JLabel(vesa);
   Icon paybal=new ImageIcon(getClass().getResource("paypal-color.png"));
   JLabel paypal=new JLabel(paybal);
   Icon apple=new ImageIcon(getClass().getResource("applepay-color.png"));
   JLabel applepay=new JLabel(apple);
   Icon masterc=new ImageIcon(getClass().getResource("mastercard-color.png"));
   JLabel mastercard=new JLabel(masterc);
        String[] paymentmethods={ "                                          Vesa                                   ", "                                          PayPal                                   ", "                                          ApplePay                                   ", "                                          MasterCard                                   " };
    JComboBox JCompoBox1;
    JCompoBox1 = new JComboBox(paymentmethods);
    JTextField cardno=new JTextField("card number",14);
    JTextField cvc=new JTextField("cvc",6);
    JTextField exp=new JTextField("mm/dd",7);
   bottom1.add(vesaphoto);
   bottom1.add(paypal);
   bottom1.add(applepay);
   bottom1.add(mastercard);
   bottom1.add(JCompoBox1);
   bottom1.add(cardno);
   bottom1.add(cvc);
   bottom1.add(exp);
    //top right
   JLabel totall=new JLabel("Finalize Your Payment ");
   totall.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
   totall.setForeground(new Color(18,27,121));
   JButton jb=new JButton("veiw final price");
   jb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
   jb.setForeground(new Color(18,27,121));
   jb.setBackground(new Color(174,208,222));
   
   try{
        String db_url="jdbc:mysql://localhost:3306/myproject?useSSL=false&serverTimezone=UTC";
        String db_username="root";
        String db_password="1234";
        
       con = DriverManager.getConnection(db_url, db_username, db_password);
    }
    catch(SQLException sqlExecption){
        System.out.println(sqlExecption.getMessage());
    }   
    
    
   jb.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            String f=tout.getText();
            
            JLabel fin=new JLabel(f);
            fin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
            fin.setForeground(new Color(18,27,121));
           
            topright.add(fin);
          
        }
   } );
   topright.add(totall);
   topright.add(jb);
   
  

   //bottom2
   JButton button=new JButton("Complete Payment");
   button.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
   button.setForeground(new Color(174,208,222));
   button.setBackground(new Color(18,27,121));
  Border line = new LineBorder(Color.yellow);
  Border margin = new EmptyBorder(5, 15, 5, 15);
  Border compound = new CompoundBorder(line, margin);
  button.setBorder(compound);
 button.addActionListener(new ActionListener() {
    
        @Override
        public void actionPerformed(ActionEvent ae) {
                        

            
            String total=tout.getText();
            if(button==ae.getSource())
         {
            String parking="";
            String paymentinfo="";
            String moviee="";
            if(p1.isSelected ()){
                parking+="P1";
            }
            if(p2.isSelected ()){
                parking+="P2";
            }
             if(p3.isSelected ()){
                parking+="P3";
            }
              if(p4.isSelected ()){
                parking+="P4";
            }
               if(p5.isSelected ()){
                parking+="P5";
            }
             if(p6.isSelected ()){
                parking+="P6";
            }
              if(p7.isSelected ()){
                parking+="P7";
            }
              if(p8.isSelected ()){
                parking+="P8";
            }
                if(p9.isSelected ()){
                parking+="P9";
            }
                 if(p10.isSelected ()){
                parking+="P10";
            }
                   if(p11.isSelected ()){
                parking+="P11";
            }
             if(p12.isSelected ()){
                parking+="P12";
            } 
            
            if(movieBtn1.isSelected ()){
                moviee+="Luca - PG - Fantasy/Comedy";
            } 
            if(movieBtn2.isSelected ()){
                moviee+="Crulla - PG13 - Comedy/Crime";
            }
            if(movieBtn3.isSelected ()){
                moviee+="Encanto - PG - Comedy/Animation";
            }
            if(movieBtn4.isSelected ()){
                moviee+="Werewolves Within - R18 - Horror";
            }
            if(movieBtn5.isSelected ()){
                moviee+="Joker - R - Crime/Drama";
            }
            if(movieBtn6.isSelected ()){
                moviee+="To Olivia - PG12 - Drama";
            }
            if(movieBtn7.isSelected ()){
                moviee+="King Richard - PG12 - Sport/Drama";
            }
            if(movieBtn8.isSelected ()){
                moviee+="House Of Gucci - R18 - Drama/Crime";
            }
            String cardinfo=cardno.getText();
            String cvcinfo=cvc.getText();
            String expinfo=exp.getText();
            paymentinfo=cardinfo+" "+cvcinfo+" "+expinfo;
            
            String a=" successfully using";
            /*payment*/
            String payment=(String) JCompoBox1.getSelectedItem();
           JOptionPane.showMessageDialog(pane, "your payed "+total+" "+parking +"  "+moviee+payment+paymentinfo,"success !!" , JOptionPane.PLAIN_MESSAGE);
           
            String sql=String.format("INSERT INTO myprojevt.users (u_fullname, u_mobile, u_pass,Datee,mon,yearr,parking,moviee,total, payment,paymentinfo)\n"+
                    "Values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s');",log.u_fullname, log.u_mobile, log.u_pass,log.Datee,log.mon,log.yearr,"k","k","k","k","k");
            try{
                Statement s=con.createStatement();
                
               s.executeUpdate(sql);
            }
            catch(SQLException sqlExecption){
              System.out.println(sqlExecption.getMessage());
            }
            
         }
           
            
        }
    
});
   bottom2.add(button);
  //end hawazen
    
           
            
        }
    



    @Override
    public void itemStateChanged(ItemEvent ie) {
        int sum = 0;
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 26));
        tout.setForeground(Color.WHITE);
        tout.setBackground(new Color(134, 185, 206));
        tout.setSize(100, 299);
        tout.setLocation(600, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        //add(tout);
        
        
        int pnachos=20;
        int ppizza= 48;
        int pchocolate = 10;
        int photdog = 18;
        int pburger = 23;
        int fullmeal = 45;
        int ppopcorn =13;
        int pdrinks = 8;
        //wed
        int pp1 = 60;
        int pp2 = 60;
        int pp3 = 60;
        int pp4 = 60;
        int pp5 = 60;
        int pp6 = 60;
        int pp7 = 30;
        int pp8 = 30;
        int pp9 = 30;
        int pp10 = 30;
        int pp11 = 30;
        int pp12 = 30;
         
        if(p1.isSelected()){
            sum = sum + pp1 ;
        String da1 = "total: " + sum;
        tout.setText(da1);
        }
        if(p2.isSelected()){
            sum = sum + pp2 ;
        String da2 = "total: " + sum;
        tout.setText(da2);
        }
        if(p3.isSelected()){
            sum = sum + pp3 ;
        String da3 = "total: " + sum;
        tout.setText(da3);
        }
        if(p4.isSelected()){
            sum = sum + pp4 ;
        String da4 = "total: " + sum;
        tout.setText(da4);
        }
        if(p5.isSelected()){
            sum = sum + pp5 ;
        String da5 = "total: " + sum;
        tout.setText(da5);
        }
        if(p6.isSelected()){
            sum = sum + pp6 ;
        String da6 = "total: " + sum;
        tout.setText(da6);
        }
        
        if(p7.isSelected()){
            sum = sum + pp7 ;
        String da7 = "total: " + sum;
        tout.setText(da7);
        }
        if(p8.isSelected()){
            sum = sum + pp8 ;
        String da8 = "total: " + sum;
        tout.setText(da8);
        }
        if(p9.isSelected()){
            sum = sum + pp9 ;
        String da9 = "total: " + sum;
        tout.setText(da9);
        }
        if(p10.isSelected()){
            sum = sum + pp10 ;
        String da10 = "total: " + sum;
        tout.setText(da10);
        }
        if(p11.isSelected()){
            sum = sum + pp11 ;
        String da11 = "total: " + sum;
        tout.setText(da11);
        }
        if(p12.isSelected()){
            sum = sum + pp12 ;
        String da12 = "total: " + sum;
        tout.setText(da12);
        }
        //end of wed
        
        
        if(nachos.isSelected()){
            sum = sum + pnachos ;
        String data = "total: " + sum;
        tout.setText(data);
        }
        if(pizza.isSelected()){
            sum = sum + ppizza;
        String data2 = "total: " + sum ;
        tout.setText(data2);
       
         tout.setText("0");
                
        }
        if(chocolate.isSelected()){
            sum = sum + pchocolate;
        String data3 = "total: " + sum;
        tout.setText(data3);
        }
        if(hotdog.isSelected()){
            sum = sum + photdog;
        String data4 = "total: " + sum;
        tout.setText(data4);
        } 
        if(popcorn.isSelected()){
            sum = sum + ppopcorn;
        String data5 = "total: " + sum+"\n";
        tout.setText(data5);
        }
        if(drink.isSelected()){
            sum = sum + pdrinks;
        String data6 = "total: " + sum+"\n";
        tout.setText(data6);
        }
        if(burger.isSelected()){
            sum = sum + pburger;
        String data7 = "total: " + sum+"\n";
        tout.setText(data7);
        }
       
        if(cinema.isSelected()){
            sum = sum + fullmeal;
        String data8 = "total: " + sum+"\n";
        tout.setText(data8);
        }
         tout.setText("total: "+sum);
        
    }
    }

 

