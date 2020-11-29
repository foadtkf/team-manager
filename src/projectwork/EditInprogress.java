/*
  ###This page will open if user presses the "edit" button of the Current works page###
Different field variable names:
Serial: serial
Name: name
Type: type
Starting: starts
Ending: ends
Teammates: teammates
Search: jButton1
Update: jButton2
Delete: jButton3
Home: jButton4
Add to OnHold: jButton5
Add to Completed: jButton6
 */
package projectwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Fuad
 */
public class EditInprogress extends javax.swing.JFrame {

    /**
     * Creates new form EditInprogress
     */
    public EditInprogress() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        serial = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        starts = new javax.swing.JTextField();
        ends = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        teammates = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Teammates");

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Add to On Hold");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        serial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 51));
        jButton6.setText("Add to Completed");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter the serial number to search an work");

        starts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startsActionPerformed(evt);
            }
        });

        ends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endsActionPerformed(evt);
            }
        });

        jLabel1.setText("Serial");

        jLabel2.setText("type");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Starting");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ending");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(439, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serial)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(type)
                                    .addComponent(starts)
                                    .addComponent(ends)
                                    .addComponent(teammates))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(182, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ends, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teammates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       String sql= "select * from onhold where serial=? ";
        
            try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234"); 
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,serial.getText());
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Serial "+"'"+serial.getText()+"'"+" already exist","",JOptionPane.PLAIN_MESSAGE);
            serial.setText(null);
            }
            else{
            sql= "insert into onhold values (?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,serial.getText());
            pstmt.setString(2,new String(name.getText()));
            
            pstmt.setString(3, new String(type.getText()));
            pstmt.setString(4,new String(starts.getText()));
            pstmt.setString(5,new String(ends.getText()));
            pstmt.setString(6,new String(teammates.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Work is added successfully!","Success!",JOptionPane.PLAIN_MESSAGE);  
 sql="delete from inprogress where serial=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(serial.getText()));
            pstmt.executeUpdate();
            }
            conn.close();
            serial.setText(null);
            name.setText(null);
            type.setText(null);
            starts.setText(null);
            ends.setText(null);
            teammates.setText(null);
            }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }                                        

    /*private void indiActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
*/
    private void serialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String sql= "select * from completed where serial=? ";
        
            try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234"); 
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,serial.getText());
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Serial "+"'"+serial.getText()+"'"+" already exist","",JOptionPane.PLAIN_MESSAGE);
            serial.setText(null);
            }
            else{
            sql= "insert into completed values (?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,serial.getText());
            pstmt.setString(2,new String(name.getText()));
            
            pstmt.setString(3, new String(type.getText()));
            pstmt.setString(4,new String(starts.getText()));
            pstmt.setString(5,new String(ends.getText()));
            pstmt.setString(6,new String(teammates.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Work is added successfully!","Success!",JOptionPane.PLAIN_MESSAGE);  
 sql="delete from inprogress where serial=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(serial.getText()));
            pstmt.executeUpdate();
            
            serial.setText(null);
            name.setText(null);
            type.setText(null);
            starts.setText(null);
            ends.setText(null);
            teammates.setText(null);
            }
            conn.close();}
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void startsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startsActionPerformed

    private void endsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234");
            String sql ="select *from inprogress where serial=?";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(serial.getText()));
            
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()){
                name.setText(rs.getString("name"));
                type.setText(rs.getString("type"));
                starts.setText(rs.getString("startsAt"));
                ends.setText(rs.getString("endsAt"));
                teammates.setText(rs.getString("teammates"));
            }
            else{
                JOptionPane.showMessageDialog(null,"No works found!","error occured!",JOptionPane.PLAIN_MESSAGE);
            }
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234");
            String sql= "update inprogress set name=?,type=?,startsAt=?,endsAt=?,teammates=? where serial=?";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,name.getText());
            pstmt.setString(2,type.getText());
            pstmt.setString(3,starts.getText());
            pstmt.setString(4,ends.getText());
            pstmt.setString(5,teammates.getText());
            pstmt.setInt(6,Integer.parseInt(serial.getText()));
            pstmt.executeUpdate();
            serial.setText(null); name.setText(null); type.setText(null); starts.setText(null); ends.setText(null); teammates.setText(null);
            JOptionPane.showMessageDialog(null,"List updated!","Success!",JOptionPane.PLAIN_MESSAGE);
            conn.close();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tasty","root","1234");
            String sql="delete from inprogress where serial=?";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(serial.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted successfully!","Success!",JOptionPane.PLAIN_MESSAGE);
            conn.close();
            
            serial.setText(null);
            name.setText(null);
            type.setText(null);
            starts.setText(null);
            ends.setText(null);
            teammates.setText(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditInprogress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditInprogress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditInprogress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditInprogress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInprogress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ends;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField serial;
    private javax.swing.JTextField starts;
    private javax.swing.JTextField teammates;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
