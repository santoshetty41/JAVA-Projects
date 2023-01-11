package LibraryManagementSystem;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class DefaulterList extends javax.swing.JFrame {

    public DefaulterList() {
        initComponents();
        tableData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        mainPanel.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 70, 40));

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
        mainPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        mainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 360, 5));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Edit_Property_50px.png"))); // NOI18N
        jLabel5.setText("  Defaulter List");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 390, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
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

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 780, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/icons/library-3.png.png"))); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 560, 530));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1380, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tableData() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {
            long long_date = System.currentTimeMillis();
            java.sql.Date currentDate = new java.sql.Date(long_date);
            database db = new database();
            String q = "select * from issueBook where due_date < '" + currentDate + "' and status = 'panding'";
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

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefaulterList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel mainPanel;
    private rojeru_san.complementos.RSTableMetro table;
    // End of variables declaration//GEN-END:variables
}
