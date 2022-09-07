/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projactcs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static projactcs.MyFrame.gcd;

/**
 *
 * @author user
 */
public class MyFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame2
     */
    public MyFrame2() {
        initComponents();
        jPanel2.setBackground(new Color(0,180,217,80));
    }
     public static int gcd(int a , int m){
        if(m==0){
            return a;
        }
        else{
            return gcd(m  , a % m);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 180, 217));
        jPanel2.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(89, 92, 260, 30);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton1.setText("decrypt");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 210, 100, 30);

        jTextField3.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jTextField3.setEnabled(false);
        jTextField3.setFocusable(false);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(100, 270, 250, 30);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("To encrypt Click here");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 310, 240, 38);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Decryption");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 200, 42);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("a = ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 150, 30, 16);

        jTextField4.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(280, 140, 70, 40);

        jTextField5.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(130, 140, 70, 40);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("b = ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 150, 27, 20);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plaintext");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 240, 90, 29);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ciphertext");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(90, 60, 90, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 60, 450, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projactcs/new2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MyFrame frm = new MyFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(858,523);
        frm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        String text1 = jTextField5.getText();
        int num = Integer.parseInt(text1);
        int rasult = gcd(num,26);
        if(rasult !=1){
            JOptionPane.showMessageDialog(null,"GCD(a,m) must be equal 1 and m = 26","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int counter =0;
            if(num <= 1){
                counter++;
            }
            else{
                for(int i=2;i<=num/2;i++){
                    if((num%i) ==0){
                        counter++;
                        break;
                    }
                }
                }
            if(counter !=0){
                JOptionPane.showMessageDialog(null,"(A) shuld be a prim number","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
       String text1 = jTextField5.getText();
        int num = Integer.parseInt(text1);
        int rasult = gcd(num,26);
        if(rasult !=1){
            JOptionPane.showMessageDialog(null,"GCD(a,m) must be equal 1 and m = 26","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int counter =0;
            if(num <= 1){
                counter++;
            }
            else{
                for(int i=2;i<=num/2;i++){
                    if((num%i) ==0){
                        counter++;
                        break;
                }
            }
            }
            if(counter !=0){
                JOptionPane.showMessageDialog(null,"(A) shuld be a prim number","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
      char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = jTextField1.getText();
        int a = Integer.parseInt(jTextField5.getText());
        int b = Integer.parseInt(jTextField4.getText());
        String tsxt1 = text.toUpperCase();
        char[] text2 = tsxt1.toCharArray();
        String plaintext ="";
        int result =0;
        int a_inv=0;
        for (int i = 0; i < 26; i++)
        {
            result = (a * i) % 26;
 
            // Check if (a*i)%26 == 1,
            // then i will be the multiplicative inverse of a
            if (result == 1)
            {
                a_inv = i;
                break;
            }
        }
        for(int i =0 ; i < text2.length;i++){
            if(text2[i] != ' '){
                plaintext = plaintext + (char) ((a_inv * (text2[i] + 'A' - b) % 26) + 'A');
            }
            else{
                continue;
            }
        }
        jTextField3.setText(plaintext);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
