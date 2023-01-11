package LibraryManagementSystem;

import java.sql.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageStudent extends javax.swing.JFrame {

    database db = new database();

    public ManageStudent() {
        initComponents();
        insertTableEntry();

        comboBoxData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stdName = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        stdId = new app.bolivia.swing.JCTextField();
        stdCourse = new javax.swing.JComboBox<>();
        stdBranch = new javax.swing.JComboBox<>();
        id = new app.bolivia.swing.JCTextField();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stdTable = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter Student ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 50));

        stdName.setBackground(new java.awt.Color(102, 102, 255));
        stdName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        stdName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        stdName.setPlaceholder("Enter Student Name ");
        jPanel1.add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 290, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Enter Student Name :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Course");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Branch");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 90, -1));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/update1.png"))); // NOI18N
        update.setText("\n");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 150, 40));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/add1.png"))); // NOI18N
        add.setText("\n");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 120, 40));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/delete1.png"))); // NOI18N
        delete.setText("\n");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 150, 40));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Student Details");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));

        stdId.setBackground(new java.awt.Color(102, 102, 255));
        stdId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        stdId.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        stdId.setPlaceholder("Enter Student id");
        jPanel1.add(stdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 290, 30));

        stdCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stdCourseMouseEntered(evt);
            }
        });
        jPanel1.add(stdCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 290, -1));

        jPanel1.add(stdBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 300, -1));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(102, 102, 255));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        id.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 10));

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 730));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Id", "Name", "Course", "Branch"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stdTable.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        stdTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        stdTable.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        stdTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stdTable.setFuenteFilas(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        stdTable.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        stdTable.setFuenteHead(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        stdTable.setGridColor(new java.awt.Color(204, 204, 204));
        stdTable.setRowHeight(30);
        stdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stdTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 600, 240));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Student_Male_100px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 100, 90));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 340, 4));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Manage Students");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 100));

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
        jPanel2.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 870, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
        update.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/update.png")));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
        update.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/update1.png")));
    }//GEN-LAST:event_updateMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
        add.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/add.png")));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
        add.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/add1.png")));
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        // TODO add your handling code here:
        delete.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/delete.png")));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
        delete.setIcon(new ImageIcon(getClass().getResource("/extra/AddNewBookIcons/delete1.png")));
    }//GEN-LAST:event_deleteMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // add
        insertData();
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // delete
        int r = stdTable.getSelectedRow();
        if (r >= 0) {
            try {
                int row = stdTable.getSelectedRow();
                String id2 = (String) stdTable.getValueAt(row, 0);

                String q = "delete from student_detail where id = '" + id2 + "' ";
                int res = db.st.executeUpdate(q);
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Deleted Sucessfully");
                    insertTableEntry();
                } else {
                    JOptionPane.showMessageDialog(null, "Can't Deleted");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Selete Data to Delete");

        }


    }//GEN-LAST:event_deleteMouseClicked

    private void stdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdTableMouseClicked
        // Table
        selectTableRow();

    }//GEN-LAST:event_stdTableMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // Update
        try {

            String id2 = stdId.getText();
            String name = stdName.getText();
            String course = stdCourse.getSelectedItem().toString();
            String branch = stdBranch.getSelectedItem().toString();

            String q = "update book_detail set name = '" + name + "', author = '" + course + "', quantity = '" + branch + "' where id = '" + id2 + "'";

            int res = db.st.executeUpdate(q);
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Updated Sucessfully");
                insertTableEntry();
            } else {
                JOptionPane.showMessageDialog(null, "Please Fill Above Information");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateMouseClicked

    private void stdCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdCourseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_stdCourseMouseEntered

    private void stdCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdCourseMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_stdCourseMouseClicked

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

    private void insertData() {
        if (validData() == true) {
            try {
                String id2 = stdId.getText();
                String name = stdName.getText();
                String course = stdCourse.getSelectedItem().toString();
                String branch = stdBranch.getSelectedItem().toString();

                String q = "insert into student_detail(id, name, course, branch) values('" + id2 + "','" + name + "','" + course + "','" + branch + "' ) ";

                int res = db.st.executeUpdate(q);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "Student Data Inserted Sucessfully");
                    insertTableEntry();

                } else {
                    JOptionPane.showMessageDialog(this, "Student Data Can't Inserted");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Student ID Already Exits");
            }
        }
    }

    private boolean validData() {
        String id1 = stdId.getText();
        String name = stdName.getText();
        String course = stdCourse.getSelectedItem().toString();
        String branch = stdBranch.getSelectedItem().toString();

        if (id1.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Id");
            return false;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Name");
            return false;
        }
        if (course.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Course Name");
            return false;
        }
        if (branch.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Branch");
            return false;
        }
        return true;
    }

    private void insertTableEntry() {
        DefaultTableModel dtm = (DefaultTableModel) stdTable.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {
            String q = "select * from student_detail";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String course = res.getString("course");
                String branch = res.getString("branch");

                Vector v = new Vector();
                v.add(id);
                v.add(name);
                v.add(course);
                v.add(branch);

                dtm.addRow(v);

                //clear all text field
                stdId.setText("");
                stdName.setText("");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void selectTableRow() {

        int ri = stdTable.getSelectedRow();
        String str = (String) stdTable.getValueAt(ri, 0);

        try {
            String q = "select * from student_detail where id = '" + str + "' ";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String id2 = res.getString("id");
                String name = res.getString("name");

                stdId.setText(id2);
                stdName.setText(name);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void comboBoxData() {

        try {

            String q1 = "select * from course ";
            ResultSet res1 = db.st.executeQuery(q1);
            while (res1.next()) {
                String c = res1.getString("course_name");

                stdCourse.addItem(c);

            }
            String q2 = "select * from branch ";
            ResultSet res2 = db.st.executeQuery(q2);
            while (res2.next()) {
                String b = res2.getString("branch_name");

                stdBranch.addItem(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudent().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel delete;
    private app.bolivia.swing.JCTextField id;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JComboBox<String> stdBranch;
    private javax.swing.JComboBox<String> stdCourse;
    private app.bolivia.swing.JCTextField stdId;
    private app.bolivia.swing.JCTextField stdName;
    private rojeru_san.complementos.RSTableMetro stdTable;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
