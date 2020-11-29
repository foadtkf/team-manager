/*
#####This is the main page of my project#####
Differernt field variable names:
Username: jTextField1
Password: jPasswordField1
Login Button: jbtnlogin
Clear Button: jbtnreset
Exit Button: jbtnexit
MysQl database table names: Schema name is "tasty" for all tables
User info table: login
Not registered yet? Register here: jButton1
*/

package projectwork;
import java.sql.*;


import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class LoginPage extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public LoginPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        llogin = new javax.swing.JPanel();
        jbtnlogin = new javax.swing.JButton();
        lreset = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        lexit = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login page");

        jPanel1.setBackground(new java.awt.Color(82, 68, 77));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 25));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1192, 742));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setBackground(new java.awt.Color(51, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 500, 50));

        jTextField1.setBackground(new java.awt.Color(51, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 500, -1));

        llogin.setBackground(new java.awt.Color(51, 0, 255));
        llogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        llogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jbtnlogin.setBackground(new java.awt.Color(0, 0, 255));
        jbtnlogin.setFont(new java.awt.Font("Arial Black", 1, 38)); // NOI18N
        jbtnlogin.setText("Login");
        jbtnlogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lloginLayout = new javax.swing.GroupLayout(llogin);
        llogin.setLayout(lloginLayout);
        lloginLayout.setHorizontalGroup(
            lloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        lloginLayout.setVerticalGroup(
            lloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(llogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        lreset.setBackground(new java.awt.Color(255, 255, 51));
        lreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jbtnreset.setBackground(new java.awt.Color(255, 255, 0));
        jbtnreset.setFont(new java.awt.Font("Arial Black", 0, 38)); // NOI18N
        jbtnreset.setText("Clear");
        jbtnreset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lresetLayout = new javax.swing.GroupLayout(lreset);
        lreset.setLayout(lresetLayout);
        lresetLayout.setHorizontalGroup(
            lresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lresetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lresetLayout.setVerticalGroup(
            lresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lresetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnreset, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(lreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        lexit.setBackground(new java.awt.Color(255, 0, 0));
        lexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jbtnexit.setBackground(new java.awt.Color(255, 0, 0));
        jbtnexit.setFont(new java.awt.Font("Arial Black", 0, 38)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 0), new java.awt.Color(255, 0, 0), null, null));
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lexitLayout = new javax.swing.GroupLayout(lexit);
        lexit.setLayout(lexitLayout);
        lexitLayout.setHorizontalGroup(
            lexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        lexitLayout.setVerticalGroup(
            lexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(lexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Username");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 5, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 240, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setText("Password");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 5, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, 64));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Not registered yet? Register here.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 670, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/58844202-team-management-concept-team-management-drawn-on-dark-wall-team-management-in-multicolor-team-manage.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 570));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 50)); // NOI18N
        jLabel1.setText("Login Page");
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jTextField1.setText(null);
        jPasswordField1.setText(null);
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnloginActionPerformed
  if(jTextField1.getText().isEmpty()||jPasswordField1.getText().isEmpty())
  {
      JOptionPane.showMessageDialog(null,"Username or password field is empty!","error occured!",JOptionPane.PLAIN_MESSAGE);
  }
  else{
        String sql= "select * from login where username=? and password=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234"); 
            PreparedStatement pstmt= conn.prepareStatement(sql);pstmt.setString(1,jTextField1.getText());
            pstmt.setString(2,new String(jPasswordField1.getPassword()));
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Welcome "+jTextField1.getText(),"Successful Login",JOptionPane.PLAIN_MESSAGE);
                
                new Dashboard().setVisible(true);
                dispose();
            } 
            else{
            JOptionPane.showMessageDialog(null,"Invalid Username or Password","error occured!",JOptionPane.PLAIN_MESSAGE);
            }conn.close();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }    }
    }//GEN-LAST:event_jbtnloginActionPerformed

    private void mouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnter
         if(evt.getSource()==jbtnlogin){
            jbtnlogin.setBackground(new Color(51,0,255));
        }
        else if(evt.getSource()==jbtnreset){
            jbtnreset.setBackground(new Color(255,255,51));
        }
        else if(evt.getSource()==jbtnexit){
            jbtnexit.setBackground(new Color(255,0,0));
        }
    }//GEN-LAST:event_mouseEnter

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
       
         if(evt.getSource()==jbtnlogin){
            jbtnlogin.setBackground(new Color(135,135,135));
        }
        else if(evt.getSource()==jbtnreset){
            jbtnreset.setBackground(new Color(135,135,135));
        }
        else if(evt.getSource()==jbtnexit){
            jbtnexit.setBackground(new Color(135,135,135));
        }
    }//GEN-LAST:event_mouseExit

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Register obj;
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnlogin;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JPanel lexit;
    private javax.swing.JPanel llogin;
    private javax.swing.JPanel lreset;
    // End of variables declaration//GEN-END:variables
private void systemExit(){
    WindowEvent winCloseing= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
}
}
