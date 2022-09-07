
package driveincinma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class login extends JFrame implements ActionListener{
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mobile;
    private JTextField tmobile;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel res;
    private JLabel pass;
    private JPasswordField tpass;
    
    private String dates[]
        = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998","1999", "2000", "2001", "2002","2003", "2004", "2005", "2006","2007", "2008", "2009", "2010","2011", "2012", "2013", "2014","2015", "2016", "2017", "2018","2019" };
   
      Icon icon = new ImageIcon(getClass().getResource("login.jpg"));
          JLabel Licon = new JLabel(icon);
          
              Connection con = null;
 /************* variable for database *****************/
      public static String u_fullname;
      public static String u_pass;
      public static String u_mobile;
      public static String Datee;
      public static String mon;
      public static String yearr;
    public login() {
        
     setTitle("Registration Form");
     setBounds(300, 90, 900, 600);
     setResizable(true);
     setSize(950, 800);
     setVisible(true);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(150, 30);
        add(title);
        add(Licon,BorderLayout.EAST);
        
        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        add(tname);
 
        pass = new JLabel("Password:");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 20);
        pass.setLocation(100, 150);
        add(pass);
        
        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(200, 150);
        add(tpass);
        
        mobile = new JLabel("Mobile:");
        mobile.setFont(new Font("Arial", Font.PLAIN, 20));
        mobile.setSize(100, 20);
        mobile.setLocation(100, 200);
        add(mobile);
 
        tmobile = new JTextField();
        tmobile.setFont(new Font("Arial", Font.PLAIN, 15));
        tmobile.setSize(190, 20);
        tmobile.setLocation(200, 200);
        add(tmobile);
 
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(220, 250);
        add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(300, 250);
        add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB:");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        add(dob);
 /**********************************/
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 300);
        add(date);
       //    String payment=(String) JCompoBox1.getSelectedItem();
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 300);
        add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(310, 300);
        add(year);
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        add(reset);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(300, 25);
        res.setLocation(150, 350);
        add(res);
 
        
         try{
        String db_url="jdbc:mysql://localhost:3306/myproject?useSSL=false&serverTimezone=UTC";
        String db_username="root";
        String db_password="1234";
        
       con = DriverManager.getConnection(db_url, db_username, db_password);
    }
    catch(SQLException sqlExecption){
        System.out.println(sqlExecption.getMessage());
    }   
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
             u_fullname = tname.getText();
             u_mobile = tmobile.getText();
             u_pass = tpass.getText();
             Datee=(String) date.getSelectedItem();
             mon=(String) month.getSelectedItem();
             yearr=(String) year.getSelectedItem();
            
//            String sql=String.format("INSERT INTO users (fullname, mobile, pass,total,payment)\n"+
//                    "Values('%s','%s','%s','%s','%s');",u_fullname,mobile,pass,"","");
//            try{
//                Statement s=con.createStatement();
//                
//               s.executeUpdate(sql);
//            }
//            catch(SQLException sqlExecption){
//              System.out.println(sqlExecption.getMessage());
//            }

                   if (term.isSelected()) {
                res.setText("Registration Successfully..");
                 dispose();
                 cinema cin = new cinema();
            }
            else {

                res.setText("Please accept the" + " terms & conditions..");
              }
        }
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tmobile.setText(def);
            tpass.setText(def);
            res.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);

        }
        
    }
}