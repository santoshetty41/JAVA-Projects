package LibraryManagementSystem;

import java.awt.Color;
import java.sql.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageBook extends javax.swing.JFrame {

    database db = new database();

    public ManageBook() {
        initComponents();
        insertTableEntry();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        book_name = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        book_author = new app.bolivia.swing.JCTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        book_quantity = new app.bolivia.swing.JCTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        id = new app.bolivia.swing.JCTextField();
        id1 = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter Book ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 50));

        book_name.setBackground(new java.awt.Color(102, 102, 255));
        book_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        book_name.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        book_name.setPlaceholder("Enter Book Name ");
        jPanel1.add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 290, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Enter Book Name :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        book_author.setBackground(new java.awt.Color(102, 102, 255));
        book_author.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        book_author.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        book_author.setPlaceholder("Enter Book Author Name");
        jPanel1.add(book_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 290, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Author Name :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        book_quantity.setBackground(new java.awt.Color(102, 102, 255));
        book_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        book_quantity.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        book_quantity.setPlaceholder("Enter Quantity of Book");
        jPanel1.add(book_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 290, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Quantity");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 90, -1));

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
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 150, 40));

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
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 120, 40));

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
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 150, 40));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(102, 102, 255));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        id.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, 10));

        id1.setBackground(new java.awt.Color(102, 102, 255));
        id1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        id1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        id1.setPlaceholder("Enter Book id");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 290, 30));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Book Details");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 170, 70));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Name", "Author", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 600, 240));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel5.setText(" Manage Books");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 230, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 300, 4));

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
        int r = table.getSelectedRow();
        if (r >= 0) {
            try {
                int row = table.getSelectedRow();
                String id = (String) table.getValueAt(row, 0);

                String q = "delete from book_detail where id = '" + id + "' ";
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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // Table
        selectTableRow();

    }//GEN-LAST:event_tableMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // Update
        try {
            String bid = id1.getText();
            String bname = book_name.getText();
            String bauthor = book_author.getText();
            String bquantity = book_quantity.getText();

            String q = "update book_detail set name = '" + bname + "', author = '" + bauthor + "', quantity = '" + bquantity + "' where id = '" + bid + "'";

            int res = db.st.executeUpdate(q);
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Updated Sucessfully");
                insertTableEntry();
            } else {
                JOptionPane.showMessageDialog(null, "can't Updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateMouseClicked

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

    private void insertData() {
        if (validData() == true) {
            try {
                String id2 = id1.getText();
                String name = book_name.getText();
                String author = book_author.getText();
                String quantity = book_quantity.getText();

                String q = "insert into book_detail(id, name, author, quantity) values('" + id2 + "','" + name + "','" + author + "','" + quantity + "' ) ";

                int res = db.st.executeUpdate(q);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "Insert Data Sucessfully");
                    insertTableEntry();

                } else {
                    JOptionPane.showMessageDialog(this, "Data Can't Inserted");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Book ID Already Exits");
            }
        }
    }

    private boolean validData() {
        String book_id = id1.getText();
        String name = book_name.getText();
        String author = book_author.getText();
        String quantity = book_quantity.getText();

        if (book_id.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Book Id");
            return false;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Book Name");
            return false;
        }
        if (author.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Book Author Name");
            return false;
        }
        if (quantity.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity of Books");
            return false;
        }
        return true;
    }

    private void insertTableEntry() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {
            String q = "select * from book_detail";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String book_id = res.getString("id");
                String name = res.getString("name");
                String author = res.getString("author");
                String quantity = res.getString("quantity");

                Vector v = new Vector();
                v.add(book_id);
                v.add(name);
                v.add(author);
                v.add(quantity);

                dtm.addRow(v);

                //clear all text field
                id1.setText("");
                book_name.setText("");
                book_author.setText("");
                book_quantity.setText("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void selectTableRow() {

        int ri = table.getSelectedRow();
        String str = (String) table.getValueAt(ri, 0);

        try {
            String q = "select * from book_detail where id = '" + str + "' ";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                String book_id = res.getString("id");
                String name = res.getString("name");
                String author = res.getString("author");
                String quantity = res.getString("quantity");

                id1.setText(book_id);
                book_name.setText(name);
                book_author.setText(author);
                book_quantity.setText(quantity);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private app.bolivia.swing.JCTextField book_author;
    private app.bolivia.swing.JCTextField book_name;
    private app.bolivia.swing.JCTextField book_quantity;
    private javax.swing.JLabel delete;
    private app.bolivia.swing.JCTextField id;
    private app.bolivia.swing.JCTextField id1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exit;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
