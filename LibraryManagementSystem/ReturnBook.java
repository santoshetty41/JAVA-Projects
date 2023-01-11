package LibraryManagementSystem;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {

    database db = new database();


    public ReturnBook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        redPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dueDate = new javax.swing.JLabel();
        issueId = new javax.swing.JLabel();
        bookName = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        issueDate = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_bookId = new app.bolivia.swing.JCTextField();
        txt_studentId = new app.bolivia.swing.JCTextField();
        issueBook = new rojeru_san.complementos.RSButtonHover();
        issueBook2 = new rojeru_san.complementos.RSButtonHover();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redPanel.setBackground(new java.awt.Color(102, 102, 255));
        redPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel6.setText("  Issue Book Details");
        redPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 330, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 355, 5));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Due Date : ");
        redPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Issue Id : ");
        redPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Name : ");
        redPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Name :");
        redPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, -1));

        dueDate.setBackground(new java.awt.Color(255, 255, 255));
        dueDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        dueDate.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 180, 25));

        issueId.setBackground(new java.awt.Color(255, 255, 255));
        issueId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        issueId.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(issueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, 25));

        bookName.setBackground(new java.awt.Color(255, 255, 255));
        bookName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        bookName.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, 25));

        studentName.setBackground(new java.awt.Color(255, 255, 255));
        studentName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        studentName.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 180, 25));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Issue Date :");
        redPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, -1));

        issueDate.setBackground(new java.awt.Color(255, 255, 255));
        issueDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        issueDate.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 180, 25));

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
        redPanel.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 30));

        mainPanel.add(redPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 420, 730));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel5.setText("  Book Return");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 390, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel10.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 350, 5));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/icons/lib.png"))); // NOI18N
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 70, 640, 630));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Book Id : ");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("Student Id : ");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 170, -1));

        txt_bookId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_bookId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_bookId.setPlaceholder("Enter Book Id..");
        jPanel10.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 260, -1));

        txt_studentId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_studentId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_studentId.setPlaceholder("Enter Student Id..");
        jPanel10.add(txt_studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 270, -1));

        issueBook.setBackground(new java.awt.Color(255, 51, 51));
        issueBook.setText("Return Book");
        issueBook.setColorHover(new java.awt.Color(204, 0, 51));
        issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });
        jPanel10.add(issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 170, -1));

        issueBook2.setBackground(new java.awt.Color(102, 102, 255));
        issueBook2.setText("Find");
        issueBook2.setColorHover(new java.awt.Color(0, 0, 204));
        issueBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel10.add(issueBook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 170, -1));

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
        jPanel10.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        mainPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        String bookId = txt_bookId.getText();
        String studentId = txt_studentId.getText();
        if (validReturn() == true) {
            try {
                String q = "update issueBook set status = 'Returned' where book_id = '" + bookId + "' and student_id = '" + studentId + "' ";
                int res = db.st.executeUpdate(q);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "Return Sucessfully");
                    quantityChange();
                    txt_bookId.setText("");
                    txt_studentId.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "Try Again");
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_returnBookActionPerformed

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed

        if (validReturn() == true) {
            String bookId = txt_bookId.getText();
            String studentId = txt_studentId.getText();
            try {
                String q = "select * from issueBook where book_id = '" + bookId + "' and student_id = '" + studentId + "' and status = 'panding'";
                ResultSet res = db.st.executeQuery(q);
                if (res.next()) {
                    String issue_id = res.getString("id");
                    String book_name = res.getString("book_name");
                    String student_name = res.getString("student_name");
                    String issue_date = res.getString("issue_date");
                    String due_date = res.getString("due_date");

                    issueId.setText(issue_id);
                    bookName.setText(book_name);
                    studentName.setText(student_name);
                    issueDate.setText(issue_date);
                    dueDate.setText(due_date);

                } else {
                    JOptionPane.showMessageDialog(this, "No Any Panding Book ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_findActionPerformed

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        // TODO add your handling code here:
        lbl_exit.setIcon(new ImageIcon(getClass().getResource("/extra/btn/exitRed2.png")));
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        // TODO add your handling code here:
        lbl_exit.setIcon(new ImageIcon(getClass().getResource("/extra/btn/exitRed1.png")));
    }//GEN-LAST:event_lbl_exitMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setIcon(new ImageIcon(getClass().getResource("/extra/btn/backRed2.png")));

    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
                back.setIcon(new ImageIcon(getClass().getResource("/extra/btn/backRed1.png")));

    }//GEN-LAST:event_backMouseExited

    private void quantityChange() {
        try {

            String book_id1 = issueId.getText();
            String q = "update book_detail set quantity = 'quantity + 1' where id = '" + book_id1 + "'";
            int res = db.st.executeUpdate(q);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean validReturn() {
        String bookId = txt_bookId.getText();
        String studentId = txt_studentId.getText();
        try {

            String q = "select * from issueBook where book_id = '" + bookId + "' and student_id = '" + studentId + "'";
            ResultSet res = db.st.executeQuery(q);
            if (res.next()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Student Does not Issue Book");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

 
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel dueDate;
    private rojeru_san.complementos.RSButtonHover issueBook;
    private rojeru_san.complementos.RSButtonHover issueBook2;
    private javax.swing.JLabel issueDate;
    private javax.swing.JLabel issueId;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel redPanel;
    private javax.swing.JLabel studentName;
    private app.bolivia.swing.JCTextField txt_bookId;
    private app.bolivia.swing.JCTextField txt_studentId;
    // End of variables declaration//GEN-END:variables
}
