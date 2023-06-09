/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Manufacture;

/**
 *
 * @author PRAJWAL PRABHU
 */
import connections.DatabaseConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import mainpage1.Mainpage;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Mainpage_manufacture extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage_manufacture
     */
    private DatabaseConnection db;

    public Mainpage_manufacture() {
        initComponents();
//         jPanel2.setVisible(false);
        db = new DatabaseConnection();
         DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.decode("#5F8D4E"));
        tablemanu.setBackground(Color.decode("#A4BE7B"));
        headerRenderer.setPreferredSize(new Dimension(100, 40));
        headerRenderer.setForeground(Color.BLACK);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jScrollPane1.getViewport().setBackground(Color.decode("#68B984"));
        tablemanu.setRowHeight(30);
       tablemanu.setSelectionBackground(Color.decode("#6ECCAF"));
        tablemanu.setDefaultRenderer(Object.class, centerRenderer);
        tablemanu.getTableHeader().setDefaultRenderer(headerRenderer);
        tablemanu.getTableHeader().setFont(new Font("Sanserif", Font.BOLD, 18));
        tablemanu.setVisible(false);
        
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
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        tfmanuid = new javax.swing.JTextField();
        ubuttonmanu = new javax.swing.JButton();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfitemno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfitemname = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        tfitemprice = new javax.swing.JTextField();
        cbuttonmanu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemanu = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(52, 60, 62));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manufacture Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manufacturer_ID  :");

        tfmanuid.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        ubuttonmanu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ubuttonmanu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        ubuttonmanu.setText("UPDATE");
        ubuttonmanu.setToolTipText("It will update in table");
        ubuttonmanu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubuttonmanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubuttonmanuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Number          :");

        tfitemno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item  Name            :");

        tfitemname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Price/KG        :");

        tfitemprice.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        cbuttonmanu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cbuttonmanu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erase.png"))); // NOI18N
        cbuttonmanu.setText("CLEAR");
        cbuttonmanu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbuttonmanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuttonmanuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password               :");

        jPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton1.setText("ADD ITEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tfmanuid)
                            .addComponent(tfitemno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfitemname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfitemprice))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ubuttonmanu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbuttonmanu, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmanuid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfitemno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbuttonmanu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubuttonmanu))
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 590));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablemanu.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tablemanu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacture_ID", "Item Number", "Item Name", "Item  Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablemanu.setFocusable(false);
        tablemanu.setOpaque(false);
        tablemanu.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablemanu);
        tablemanu.getAccessibleContext().setAccessibleName("");
        tablemanu.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 822, 480));

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MANUFACTURER");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 380, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 920, 640));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-thick-long-left-arrow-70.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factory.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
        new Mainpage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
    public void tablefetch() {
    try {
        conn = getNewConnection();
        String query = "SELECT Manu_Id, Item_No, Item_Name, Price FROM Feedman2";
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tablemanu.getModel();
        model.setRowCount(0);
        while(rs.next()){
            String manu_id = rs.getString("Manu_Id");
            String item_no = rs.getString("Item_No");
            String item_name = rs.getString("Item_Name");
            float price = rs.getFloat("Price");
            model.addRow(new Object[] { manu_id, item_no, item_name, price });
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private void cbuttonmanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuttonmanuActionPerformed
        // TODO add your handling code here:
        tfmanuid.setText("");
        tfitemno.setText("");
        tfitemname.setText("");       //To enter values in text fields
        tfitemprice.setText("");
    }//GEN-LAST:event_cbuttonmanuActionPerformed
    Connection conn = null;

    private Connection getNewConnection() {
        conn = db.getConnection();
        return conn;
    }
    
    private void ubuttonmanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubuttonmanuActionPerformed
        // TODO add your handling code here:
        tablemanu.setVisible(true);
        String manuId = tfmanuid.getText();
        String itemName = tfitemname.getText();
        String itemNo = tfitemno.getText();
        String price = tfitemprice.getText();
         String password1 = new String(jPasswordField1.getPassword());

        //to print error message
        if (manuId.isEmpty() || itemNo.isEmpty() || itemName.isEmpty() || price.isEmpty()|| password1.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please Enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                conn = getNewConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Feedman1 WHERE Manu_Id = ? and Password = ?");
                stmt.setString(1, manuId);
                stmt.setString(2, password1);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    PreparedStatement stmt2 = conn.prepareStatement("UPDATE Feedman2 SET  Item_Name = ? , Price = ? WHERE Manu_Id = ? and Item_No =? ");
//                    stmt2.setString(1, itemNo);
                    stmt2.setString(1, itemName);
                    stmt2.setString(2, price);
                    stmt2.setString(3, manuId);
                    stmt2.setString(4, itemNo);
                    stmt2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record updated successfully.");
                    tablefetch();
                } else {
                    JOptionPane.showMessageDialog(null, "Manu Id doesn't exist ,Recheck Manu_Id or Password.");
                }
//                DefaultTableModel model = (DefaultTableModel) tablemanu.getModel();
//                model.addRow(new Object[]{manuId, itemNo, itemName, price});
//
//                tfmanuid.setText("");
                tfitemno.setText("");
                tfitemname.setText("");       //To enter values in text fields
                tfitemprice.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "An error occurred while inserting Manu_Name and Manu_Id.\n" + e.getMessage());

            }
        }
    }//GEN-LAST:event_ubuttonmanuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String manuId = tfmanuid.getText();
            String itemNo = tfitemno.getText();
            String itemName = tfitemname.getText();
            String itemPrice = tfitemprice.getText();
             String password1 = new String(jPasswordField1.getPassword()); 
        
        if (manuId.isEmpty() || itemNo.isEmpty() || itemName.isEmpty() || itemPrice.isEmpty()|| password1.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please Enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
        try {
            Connection conn = getNewConnection();
 
            // check if manuId exists in Feedman1 table
            String checkManuId = "SELECT Manu_Id FROM Feedman1 WHERE Manu_Id = ? and Password= ?";
            PreparedStatement stmt1 = conn.prepareStatement(checkManuId);
            stmt1.setString(1, manuId);
             stmt1.setString(2, password1);
            ResultSet rs1 = stmt1.executeQuery();
            if (!rs1.next()) {
                JOptionPane.showMessageDialog(this, "Manufacturer not  available,Recheck ManuId or Password", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // check if itemNo already exists in Feedman2 table
                String checkItemNo = "SELECT Item_No FROM Feedman2 WHERE Item_No = ?";
                PreparedStatement stmt2 = conn.prepareStatement(checkItemNo);
                stmt2.setString(1, itemNo);
                ResultSet rs2 = stmt2.executeQuery();
                if (rs2.next()) {
                    JOptionPane.showMessageDialog(this, "Item already exists", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // insert data into Feedman2 table
                    String insertData = "INSERT INTO Feedman2(Manu_Id, Item_No, Item_Name, Price) VALUES (?, ?, ?, ?)";
                    PreparedStatement stmt3 = conn.prepareStatement(insertData);
                    stmt3.setString(1, manuId);
                    stmt3.setString(2, itemNo);
                    stmt3.setString(3, itemName);
                    stmt3.setString(4, itemPrice);
                    int rowsInserted = stmt3.executeUpdate();
                      if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Login Successful,Data inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println(manuId);
                    tablefetch();
                }

                 
                    stmt3.close();
                }
                rs2.close();
                stmt2.close();
            }
            rs1.close();
            
            stmt1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                           String manuId = tfmanuid.getText();
        String itemNo = tfitemno.getText();
         String password1 = new String(jPasswordField1.getPassword());
       if(manuId.isEmpty()||itemNo.isEmpty()||password1.isEmpty()){
           JOptionPane.showMessageDialog(null,"fill the details");
       }
       else{
        try {
            // Check if the manuId exists in the Feedman1 table
            Connection conn=db.getConnection();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM Feedman1 WHERE Manu_Id = ? and Password = ?");
            stmt.setString(1, manuId);
            stmt.setString(2, password1);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No Manu_Id available");
                return;
            }

            // Check if the itemNo exists in the Feedman2 table
            stmt = conn.prepareStatement("SELECT * FROM Feedman2 WHERE Manu_Id = ? AND Item_No = ?");
            stmt.setString(1, manuId);
            stmt.setString(2, itemNo);
            rs = stmt.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Item Not available");
                return;
            }

            // Delete the item from the Feedman2 table
            stmt = conn.prepareStatement("DELETE FROM Feedman2 WHERE Manu_Id = ? AND Item_No = ?");
            stmt.setString(1, manuId);
            stmt.setString(2, itemNo);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Item deleted");
            tfmanuid.setText(" ");
            tfitemno.setText(" ");
            tfitemname.setText(" ");
            tfitemprice.setText(" ");
            tablefetch();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
       }
    }

    // Close the database connection
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainpage_manufacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage_manufacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage_manufacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage_manufacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage_manufacture().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbuttonmanu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemanu;
    private javax.swing.JTextField tfitemname;
    private javax.swing.JTextField tfitemno;
    private javax.swing.JTextField tfitemprice;
    private javax.swing.JTextField tfmanuid;
    private javax.swing.JButton ubuttonmanu;
    // End of variables declaration//GEN-END:variables
}
