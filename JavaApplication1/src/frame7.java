 

import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class frame7 extends javax.swing.JFrame {static int io=0;
static String g;



/**
     * Creates new form frame7
     */
    public frame7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        c = new javax.swing.JComboBox<>();
        b = new javax.swing.JComboBox<>();
        a = new javax.swing.JComboBox<>();
        t = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ER = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("name of product");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "samsung", "apple", "other" }));
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        jLabel2.setText("Brand name");

        ER.setText("contatiy");
        ER.setEnabled(false);

        t2.setEnabled(false);

        jLabel4.setText("price");

        jLabel5.setText("ammount");

        jButton1.setText("total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("display phones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("display phone price");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(ER)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t2)
                                    .addComponent(t3)
                                    .addComponent(t1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1)
                        .addGap(241, 241, 241)
                        .addComponent(jButton2)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ER)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int r1=Integer.parseInt(t2.getText());
    String r2=null;
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String contatiy,sql;
sql="select*from mobile where mobile_name='"+g+"'";
Statement st=con.createStatement(); 
        ResultSet rs=st.executeQuery(sql);
          while(rs.next()) r2 =rs.getString("contatiy");
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
} 

int r4=Integer.parseInt(r2);
    int r3;
    r3 = (r4-r1);
    try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String contatiy,sql;
sql="update mobile set contatiy="+r3+" where mobile_name='"+g+"'";
Statement st=con.createStatement(); 
        st.executeUpdate(sql);
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
} 
        int hu=Integer.parseInt(t1.getText());
int gy=Integer.parseInt(t2.getText());
int kh=hu*gy;
t3.setText(""+kh);
JOptionPane.showMessageDialog(null,"your final total bill is"+kh);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ER.setEnabled(true);
t2.setEnabled(true);
t2.setText("");
        try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String sql,name;



 int r=t.getSelectedIndex();
    switch (r) {
        case 0:
            {
                a.setEnabled(true);
                sql="select * from mobile where brand_name='samsung'";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                a.removeAllItems();
                while(rs.next()){name=rs.getString("mobile_name");
                a.addItem(name);}
                break;
            }
        case 1:
            {
                b.setEnabled(true);
                sql="select * from mobile where brand_name='apple'";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                b.removeAllItems();
                while(rs.next()){name=rs.getString("mobile_name");
                b.addItem(name);}
                break;
            }
        case 2: 
            {
                c.setEnabled(true);
                sql="select * from mobile where brand_name <>'samsung'&& brand_name<>'apple'";
                Statement st=con.createStatement();
                c.removeAllItems();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){name=rs.getString("mobile_name");
                c.addItem(name);}
                break;
            }
        default:
            break;
    }


}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed





 int r=t.getSelectedIndex();
    switch (r) {
        case 0:
            {
               try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String sql,name = null;
g =(String)a.getSelectedItem();
 sql="select * from mobile where mobile_name='"+g+"'";
        Statement st=con.createStatement(); 
        ResultSet rs=st.executeQuery(sql);
      while(rs.next())  name =rs.getString("mobile_price");
        int opk=Integer.parseInt(name);
        io=io+opk;
t1.setText(""+io);}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
                break;
            }
        case 1:
            { try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String sql,name;
g =(String)b.getSelectedItem();
 sql="select * from mobile where mobile_name='"+g+"'";
        Statement st=con.createStatement(); 
        ResultSet rs=st.executeQuery(sql);
        name =rs.getString("mobile_price");
        while(rs.next())  name =rs.getString("mobile_price");
        int opk=Integer.parseInt(name);
        io=io+opk;
t1.setText(""+io);}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
               
                break;
            }
        case 2: 
            {
                 try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nj","root","naman");
String sql,name;
g =(String)c.getSelectedItem();
 sql="select * from mobile where mobile_name='"+g+"'";
        Statement st=con.createStatement(); 
        ResultSet rs=st.executeQuery(sql);
        name =rs.getString("mobile_price");
        while(rs.next())  name =rs.getString("mobile_price");
        int opk=Integer.parseInt(name);
        io=io+opk;
t1.setText(""+io);}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
            }
        default:
            break;
    }


 
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

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
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frame7().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ER;
    private javax.swing.JComboBox<String> a;
    private javax.swing.JComboBox<String> b;
    private javax.swing.JComboBox<String> c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
