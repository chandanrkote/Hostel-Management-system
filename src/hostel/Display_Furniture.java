/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dilip
 */
public class Display_Furniture extends javax.swing.JFrame {

    /**
     * Creates new form Display_Furniture
     */
    public Display_Furniture() {
        initComponents();
        Showdetails();
    }
     public void Showdetails(){
        try
        {
          Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
          PreparedStatement ps=con.prepareStatement("select * from HOSTEL_MGMT.FURNITURE");
          ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                String s2 = rs.getString("Furniture_id");                
                jComboBox1.addItem(s2);
  }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "FURNITURE RECORD", JOptionPane.ERROR_MESSAGE);
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

        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("FURNITURE DISPLAY FORM");
        jPanel11.add(jLabel31);
        jLabel31.setBounds(180, 20, 210, 40);

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new java.awt.BorderLayout());
        jPanel11.add(jPanel12);
        jPanel12.setBounds(90, 10, 400, 60);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("FURNITURE_ID");
        jPanel11.add(jLabel32);
        jLabel32.setBounds(110, 110, 120, 30);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("STUDY_TABLE");
        jPanel11.add(jLabel33);
        jLabel33.setBounds(100, 160, 130, 30);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("STUDY_CHAIR");
        jPanel11.add(jLabel34);
        jLabel34.setBounds(100, 200, 130, 30);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("ROOM_ID");
        jPanel11.add(jLabel35);
        jLabel35.setBounds(90, 240, 160, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ID" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel11.add(jComboBox1);
        jComboBox1.setBounds(330, 110, 150, 30);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextField27)
                    .addComponent(jTextField28))
                .addGap(19, 19, 19))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel13);
        jPanel13.setBounds(60, 90, 440, 190);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton2);
        jButton2.setBounds(30, 300, 110, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3);
        jButton3.setBounds(400, 300, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
           
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Furniture().setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
               if(evt.getSource()==jComboBox1)
    {
	if(jComboBox1.getSelectedIndex()!=0)
        {
            try
            {
                String Furniture_id=jComboBox1.getSelectedItem().toString();
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
                    PreparedStatement ps=con.prepareStatement("select Furniture_id,Study_table,Study_chair,Room_id from HOSTEL_MGMT.FURNITURE where Furniture_id="+Furniture_id);
                    ResultSet rs=ps.executeQuery();
                      
                    if(rs.next())
                    {				
                         jTextField26.setText(rs.getString(2));
                         jTextField27.setText(rs.getString(3));
                         jTextField28.setText(rs.getString(4));
                        
                        
                         
                    }
            } catch(Exception e){
               
            JOptionPane.showMessageDialog(this, e.getMessage(), "VIEW FURNITURE RECORD", JOptionPane.ERROR_MESSAGE);
        } 
        }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Display_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display_Furniture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    // End of variables declaration//GEN-END:variables
}
