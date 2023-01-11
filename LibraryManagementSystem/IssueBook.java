package LibraryManagementSystem;

import java.sql.*;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {

    database db = new database();

    public IssueBook() {
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
        quantity = new javax.swing.JLabel();
        book_id = new javax.swing.JLabel();
        book_name = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        std_id = new javax.swing.JLabel();
        std_name = new javax.swing.JLabel();
        std_course = new javax.swing.JLabel();
        std_branch = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        stdId = new app.bolivia.swing.JCTextField();
        bookId = new app.bolivia.swing.JCTextField();
        issueBook = new rojeru_san.complementos.RSButtonHover();
        dueDate = new com.toedter.calendar.JDateChooser();
        issueDate = new com.toedter.calendar.JDateChooser();
        lbl_exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redPanel.setBackground(new java.awt.Color(102, 102, 255));
        redPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel6.setText("  Book Details");
        redPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 260, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 180, 310, 5));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity : ");
        redPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Id : ");
        redPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Name : ");
        redPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Author : ");
        redPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, -1));

        quantity.setBackground(new java.awt.Color(255, 255, 255));
        quantity.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 190, -1));

        book_id.setBackground(new java.awt.Color(255, 255, 255));
        book_id.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        book_id.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 293, 190, -1));

        book_name.setBackground(new java.awt.Color(255, 255, 255));
        book_name.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        book_name.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, -1));

        author.setBackground(new java.awt.Color(255, 255, 255));
        author.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        redPanel.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, -1));

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
        redPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        mainPanel.add(redPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 730));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 430, 730));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jLabel7.setText("  Student Details");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 290, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 330, 5));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student Id : ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student Name : ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course : ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Branch : ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 430, 730));

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jLabel24.setText("  Student Details");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 290, 100));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 330, 5));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Student Id : ");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Student Name : ");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Course : ");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Branch : ");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 430, 730));

        std_id.setBackground(new java.awt.Color(255, 255, 255));
        std_id.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        std_id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        std_name.setBackground(new java.awt.Color(255, 255, 255));
        std_name.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        std_name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(std_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 190, -1));

        std_course.setBackground(new java.awt.Color(255, 255, 255));
        std_course.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        std_course.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(std_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 190, -1));

        std_branch.setBackground(new java.awt.Color(255, 255, 255));
        std_branch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        std_branch.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(std_branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 190, -1));

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel5.setText("  Issue Book");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 260, 5));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Book Id : ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("Student Id : ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("Issue Date :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 120, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("Due Date :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 110, -1));

        stdId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        stdId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        stdId.setPlaceholder("Enter Book Id..");
        stdId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stdIdFocusLost(evt);
            }
        });
        jPanel1.add(stdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 280, -1));

        bookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        bookId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        bookId.setPlaceholder("Enter Book Id..");
        bookId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookIdFocusLost(evt);
            }
        });
        jPanel1.add(bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 280, -1));

        issueBook.setBackground(new java.awt.Color(255, 51, 51));
        issueBook.setText("Issue Book");
        issueBook.setColorHover(new java.awt.Color(204, 0, 51));
        issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookActionPerformed(evt);
            }
        });
        jPanel1.add(issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 170, -1));

        dueDate.setBackground(new java.awt.Color(255, 255, 255));
        dueDate.setForeground(new java.awt.Color(255, 51, 51));
        dueDate.setToolTipText("Choose Date");
        dueDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dueDateFocusLost(evt);
            }
        });
        jPanel1.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 280, 30));

        issueDate.setBackground(new java.awt.Color(255, 255, 255));
        issueDate.setForeground(new java.awt.Color(255, 51, 51));
        issueDate.setToolTipText("Choose Date");
        issueDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        issueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                issueDateFocusLost(evt);
            }
        });
        jPanel1.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 432, 280, 30));

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
        jPanel1.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 30));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 570, 730));

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

    private void bookIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookIdFocusLost
        // TODO add your handling code here:
        String bId = bookId.getText();
        if (!(bId.equals("")))
        try {
            String q = "select * from book_detail where id = '" + bId + "' ";
            ResultSet res = db.st.executeQuery(q);
            if (res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String author1 = res.getString("author");
                String quantity1 = res.getString("quantity");

                book_id.setText(id);
                book_name.setText(name);
                author.setText(author1);
                quantity.setText(quantity1);

            } else {
                JOptionPane.showMessageDialog(this, "Enter Valid Book Id");
                bookId.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bookIdFocusLost

    private void stdIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stdIdFocusLost
        // TODO add your handling code here:
        String id = stdId.getText();
        if (!(id.equals("")))
        try {
            String q = "select * from student_detail where id = '" + id + "' ";
            ResultSet res = db.st.executeQuery(q);
            if (res.next()) {
                String sId = res.getString("id");
                String sName = res.getString("name");
                String course = res.getString("course");
                String branch = res.getString("branch");

                std_id.setText(sId);
                std_name.setText(sName);
                std_course.setText(course);
                std_branch.setText(branch);

            } else {
                JOptionPane.showMessageDialog(this, "Enter Valid Student ID");
                stdId.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stdIdFocusLost

    private void dueDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dueDateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dueDateFocusLost

    private void issueDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issueDateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_issueDateFocusLost

    private void issueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookActionPerformed
        if (isValidIssue() == true) {
            if (alreadyIssue() == true) {
                issueBook();
            }
        }
    }//GEN-LAST:event_issueBookActionPerformed

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

    private void issueBook() {
        Date uIssueDate = issueDate.getDate();
        Date uDueDate = dueDate.getDate();

        Long d1 = uIssueDate.getTime();
        Long d2 = uDueDate.getTime();
        java.sql.Date sIssueDate = new java.sql.Date(d1);
        java.sql.Date sDueDate = new java.sql.Date(d2);

        String bId = book_id.getText();
        String bName = book_name.getText();
        String sId = std_id.getText();
        String sName = std_name.getText();

        try {

            String q = "insert into issueBook(book_id, book_name, student_id, student_name, issue_date, due_date,"
                    + "status) values('" + bId + "','" + bName + "', '" + sId + "', '" + sName + "', '" + sIssueDate + "', '" + sDueDate + "', 'panding' )";

            int res = db.st.executeUpdate(q);
            if (res > 0) {
                quantityChange();
                JOptionPane.showMessageDialog(this, "Book Sucessfully Issued");

                // book Field Null
                book_id.setText("");
                book_name.setText("");
                quantity.setText("");
                author.setText("");

                // student Field Null
                std_name.setText("");
                std_id.setText("");
                std_course.setText("");
                std_branch.setText("");

                // form Field Null 
                bookId.setText("");
                stdId.setText("");
                issueDate.setDate(null);
                dueDate.setDate(null);

            } else {
                JOptionPane.showMessageDialog(this, "Book Not Issued");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean isValidIssue() {
        if (bookId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter valid  Book ID");
            return false;
        }
        if (stdId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter valid  Student ID");
            return false;
        }
        Date uIssueDate = issueDate.getDate();

        if (uIssueDate == null) {
            JOptionPane.showMessageDialog(this, "Choose the valid Issue Date ");
            return false;
        }

        Date uDueDate = dueDate.getDate();
        if (uDueDate == null) {
            JOptionPane.showMessageDialog(this, "Choose the valid Due Date ");
            return false;
        }
        return true;
    }

    private boolean alreadyIssue() {
        try {
            String q = "select * from issueBook ";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String student_id = res.getString("student_id");
                String status = res.getString("status");

                String stId = std_id.getText();

                if (student_id.equals(stId)) {
                    if (status.equals("panding")) {
                        JOptionPane.showMessageDialog(this, "Student have already Panding Book");
                        return false;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private void quantityChange() {
        try {
            int book_q = Integer.parseInt(quantity.getText());
            int newQuantity = book_q - 1;
            String book_id1 = bookId.getText();

            String q = "update book_detail set quantity = '" + newQuantity + "' where id = '" + book_id1 + "'";
            int res = db.st.executeUpdate(q);
            if (res == 1) {
                try {
                    String q1 = "select * from book_detail where id = '" + book_id1 + "'";
                    ResultSet rest = db.st.executeQuery(q1);
                    while (rest.next()) {
                        String newSetQuantity = rest.getString("quantity");
                        quantity.setText(newSetQuantity);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                bookId.setText();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel back;
    private app.bolivia.swing.JCTextField bookId;
    private javax.swing.JLabel book_id;
    private javax.swing.JLabel book_name;
    private com.toedter.calendar.JDateChooser dueDate;
    private rojeru_san.complementos.RSButtonHover issueBook;
    private com.toedter.calendar.JDateChooser issueDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel quantity;
    private javax.swing.JPanel redPanel;
    private app.bolivia.swing.JCTextField stdId;
    private javax.swing.JLabel std_branch;
    private javax.swing.JLabel std_course;
    private javax.swing.JLabel std_id;
    private javax.swing.JLabel std_name;
    // End of variables declaration//GEN-END:variables
}
