
import dao.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sydne
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
          showLowStockNotification();
       
    }
    
    public Home(String role) {
    initComponents();
    setLocationRelativeTo(null);
    showLowStockNotification();

    if (role.equals("Sales")) {
        btnUser.setVisible(false);
        
        btnProduct.setVisible(false);
        btnCategory.setVisible(false); // hide for Sales
    } else if (role.equals("Inventory")) {
        jButton2.setVisible(false);
        
        jButton3.setVisible(false);
        jButton6.setVisible(false);
        btnUser.setVisible(false);
        // show only product-related buttons for inventory
        // example: Inventory staff can manage products but not users or sales
    }
}
    private void showLowStockNotification() {
    StringBuilder message = new StringBuilder();
    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = (Statement) con.createStatement();
        ResultSet rs = st.executeQuery("SELECT name, quantity FROM product WHERE quantity < 10");

        while (rs.next()) {
            String name = rs.getString("name");
            int quantity = rs.getInt("quantity");
            message.append(name).append(" (").append(quantity).append(" pcs)").append(" | ");
        }

        if (message.length() > 0) {
            lblNotification.setText("Low Stock: " + message.toString());
        } else {
            lblNotification.setText("All stocks are sufficient.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
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
        jButton2 = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnProduct = new javax.swing.JToggleButton();
        lblNotification = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        btnAbout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
        jButton2.setText("Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

        btnUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 160, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-orders.png"))); // NOI18N
        jButton3.setText("Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-orders.png"))); // NOI18N
        jButton6.setText("View Order");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, -1));

        btnCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 160, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 160, -1));

        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        btnProduct.setText("Inventory");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, -1));

        lblNotification.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(255, 0, 0));
        lblNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 780, 50));

        btnAbout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 160, 30));

        btnAbout1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        btnAbout1.setText("Help");
        btnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_btnProductActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you want to logout application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        new ManageUser().setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new ViewOrders().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbout1ActionPerformed
        // TODO add your handling code here:
        new Help().setVisible(true);
    }//GEN-LAST:event_btnAbout1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAbout1;
    private javax.swing.JButton btnCategory;
    private javax.swing.JToggleButton btnProduct;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNotification;
    // End of variables declaration//GEN-END:variables
}
