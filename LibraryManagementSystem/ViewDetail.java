package LibraryManagementSystem;

import java.awt.Color;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ViewDetail extends javax.swing.JFrame {

    public ViewDetail() {
        initComponents();
        tableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        redPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new app.bolivia.swing.JCTextField();
        dueDate = new com.toedter.calendar.JDateChooser();
        btn_search = new necesario.RSMaterialButtonCircle();
        issueDate = new com.toedter.calendar.JDateChooser();
        whitePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(102, 102, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 0, 0));
        back.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/btn/backRed1.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        headerPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        lbl_exit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/btn/exitRed1.png"))); // NOI18N
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });
        headerPanel.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, -1, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        headerPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 355, 5));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel6.setText("  Issue Book Details");
        headerPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 330, 100));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 190));

        redPanel.setBackground(new java.awt.Color(255, 51, 51));
        redPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Due Date :");
        redPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Issue Date : ");
        redPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Choose the Date");
        redPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, 80));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 51, 51));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        id.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        redPanel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, 10));

        dueDate.setBackground(new java.awt.Color(255, 51, 51));
        dueDate.setForeground(new java.awt.Color(255, 51, 51));
        dueDate.setToolTipText("Choose Date");
        dueDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dueDateFocusLost(evt);
            }
        });
        redPanel.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 200, 30));

        btn_search.setBackground(new java.awt.Color(102, 102, 255));
        btn_search.setBorder(null);
        btn_search.setText("Search");
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_searchMouseExited(evt);
            }
        });
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        redPanel.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 340, 50));

        issueDate.setBackground(new java.awt.Color(255, 51, 51));
        issueDate.setForeground(new java.awt.Color(255, 51, 51));
        issueDate.setToolTipText("Choose Date");
        issueDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        issueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                issueDateFocusLost(evt);
            }
        });
        redPanel.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 30));

        mainPanel.add(redPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 390, 540));

        whitePanel.setBackground(new java.awt.Color(255, 255, 255));
        whitePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue Id", "Book Name", "Student Name", "Issue Date", "Due Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 51, 204));
        table.setColorFilasForeground2(new java.awt.Color(0, 51, 204));
        table.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setMultipleSeleccion(false);
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);

        whitePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 860, 360));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RETURN RECORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        whitePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 190, 50));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ALL RECORDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        whitePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 190, 50));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PENDING RECORDS ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        whitePanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 240, 50));

        mainPanel.add(whitePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 990, 540));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1380, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setIcon(new ImageIcon(getClass().getResource("/extra/btn/backRed2.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        back.setIcon(new ImageIcon(getClass().getResource("/extra/btn/backRed1.png")));
    }//GEN-LAST:event_backMouseExited

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        // TODO add your handling code here:
        lbl_exit.setIcon(new ImageIcon(getClass().getResource("/extra/btn/exitRed2.png")));
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        // TODO add your handling code here:
        lbl_exit.setIcon(new ImageIcon(getClass().getResource("/extra/btn/exitRed1.png")));
    }//GEN-LAST:event_lbl_exitMouseExited

    private void dueDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dueDateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dueDateFocusLost

    private void issueDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issueDateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_issueDateFocusLost

    private void btn_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseEntered
        // TODO add your handling code here:
        btn_search.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_btn_searchMouseEntered

    private void btn_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseExited
        // TODO add your handling code here:
        btn_search.setBackground(new Color(102, 102, 255));

    }//GEN-LAST:event_btn_searchMouseExited

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        if (validSearch() == true) {
            searchClick();

        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {
            database db = new database();
            String q = "select * from issueBook where status = 'panding'";
            ResultSet res = db.st.executeQuery(q);
            if (res.next() == true) {
                while (res.next()) {
                    String issue_id = res.getString("id");
                    String book_name = res.getString("book_name");
                    String student_name = res.getString("student_name");
                    String issue_date = res.getString("issue_date");
                    String due_date = res.getString("due_date");
                    String status = res.getString("status");

                    Vector v = new Vector();

                    v.add(issue_id);
                    v.add(book_name);
                    v.add(student_name);
                    v.add(issue_date);
                    v.add(due_date);
                    v.add(status);

                    dtm.addRow(v);
                    
                }

            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
                dateFieldNull();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {
            database db = new database();
            String q = "select * from issueBook where status = 'Returned'";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String issue_id = res.getString("id");
                String book_name = res.getString("book_name");
                String student_name = res.getString("student_name");
                String issue_date = res.getString("issue_date");
                String due_date = res.getString("due_date");
                String status = res.getString("status");

                Vector v = new Vector();

                v.add(issue_id);
                v.add(book_name);
                v.add(student_name);
                v.add(issue_date);
                v.add(due_date);
                v.add(status);

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchClick() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        Date uIssueDate = issueDate.getDate();
        long d1 = uIssueDate.getTime();
        java.sql.Date sIssueDate = new java.sql.Date(d1);

        Date uDueDate = dueDate.getDate();
        long d2 = uDueDate.getTime();
        java.sql.Date sDueDate = new java.sql.Date(d1);

        try {
            database db = new database();
            String q = "select * from issueBook where issue_date BETWEEN '" + sIssueDate + "' AND '" + sDueDate + "' ";
            ResultSet res = db.st.executeQuery(q);
            if (res.next() == false) {
                JOptionPane.showMessageDialog(this, "Record Not Found");
                dateFieldNull();
            } else {

                while (res.next()) {
                    String issue_id = res.getString("id");
                    String book_name = res.getString("book_name");
                    String student_name = res.getString("student_name");
                    String issue_date = res.getString("issue_date");
                    String due_date = res.getString("due_date");
                    String status = res.getString("status");

                    Vector v = new Vector();

                    v.add(issue_id);
                    v.add(book_name);
                    v.add(student_name);
                    v.add(issue_date);
                    v.add(due_date);
                    v.add(status);

                    dtm.addRow(v);
                    dateFieldNull();
                    

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean validSearch() {
        if (issueDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Choose Valid Issue Date");
            return false;
        }
        if (dueDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Choose Valid Due Date");
            return false;
        }
        return true;
    }

    private void tableData() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }
        try {
            String q = "select * from issueBook ";
            database db = new database();
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String issue_id = res.getString("id");
                String book_name = res.getString("book_name");
                String student_name = res.getString("student_name");
                String issue_date = res.getString("issue_date");
                String due_date = res.getString("due_date");
                String status = res.getString("status");

                Vector v = new Vector();

                v.add(issue_id);
                v.add(book_name);
                v.add(student_name);
                v.add(issue_date);
                v.add(due_date);
                v.add(status);

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void dateFieldNull() {
        issueDate.setDate(null);
        dueDate.setDate(null);
    }

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
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private necesario.RSMaterialButtonCircle btn_search;
    private com.toedter.calendar.JDateChooser dueDate;
    private javax.swing.JPanel headerPanel;
    private app.bolivia.swing.JCTextField id;
    private com.toedter.calendar.JDateChooser issueDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel redPanel;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}
