package LibraryManagementSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        showPieChart();
        studentDetail();
        bookDetails();
        showDataToCards();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usserName = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_noOfBooks = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_noOfStudents = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl_defaulterList = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_pandingBooks = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new rojeru_san.complementos.RSTableMetro();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelPieChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel2.setText("|");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, -1, 39));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Management System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        usserName.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        usserName.setForeground(new java.awt.Color(255, 255, 255));
        usserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/male_user_50px.png"))); // NOI18N
        usserName.setText(" Welcome, Admin");
        jPanel2.add(usserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, 48));

        lbl_exit.setBackground(new java.awt.Color(204, 0, 0));
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
        jPanel2.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 50));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Features");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel8.setText("  Manage Student");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, 44));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel9.setText(" LMS Dashboard");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 51, 51));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel25.setText(" Home Page");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 290, 44));

        jPanel43.setBackground(new java.awt.Color(51, 51, 51));
        jPanel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel43MouseExited(evt);
            }
        });
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(51, 51, 51));
        jPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel45MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel45MouseExited(evt);
            }
        });
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel26.setText("  Issue Book");
        jPanel45.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel43.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel6.setText("  Logout");
        jPanel43.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jPanel4.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 280, 44));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel28.setText("  Manage Book");
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 44));

        jPanel44.setBackground(new java.awt.Color(51, 51, 51));
        jPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel44MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel44MouseExited(evt);
            }
        });
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel29.setText("  Manage Book");
        jPanel44.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        jPanel4.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 44));

        jPanel46.setBackground(new java.awt.Color(51, 51, 51));
        jPanel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel46MouseExited(evt);
            }
        });
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel30.setText("  Issue Book");
        jPanel46.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel47.setBackground(new java.awt.Color(51, 51, 51));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel47MouseExited(evt);
            }
        });
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel31.setText("  Issue Book");
        jPanel47.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jPanel4.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jPanel48.setBackground(new java.awt.Color(51, 51, 51));
        jPanel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel48MouseExited(evt);
            }
        });
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel49.setBackground(new java.awt.Color(51, 51, 51));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel49MouseExited(evt);
            }
        });
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel32.setText("  Issue Book");
        jPanel49.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        jLabel11.setText("  Return Book");
        jPanel48.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, -1));

        jPanel4.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, 44));

        jPanel50.setBackground(new java.awt.Color(51, 51, 51));
        jPanel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel50MouseExited(evt);
            }
        });
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel51.setBackground(new java.awt.Color(51, 51, 51));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel51MouseExited(evt);
            }
        });
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel33.setText("  Issue Book");
        jPanel51.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel50.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jLabel34.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jLabel34.setText("  View Records");
        jPanel50.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel4.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 280, 44));

        jPanel52.setBackground(new java.awt.Color(51, 51, 51));
        jPanel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel52MouseExited(evt);
            }
        });
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBackground(new java.awt.Color(51, 51, 51));
        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel53MouseExited(evt);
            }
        });
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel35.setText("  Issue Book");
        jPanel53.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jPanel52.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 44));

        jLabel36.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jLabel36.setText("  Defaulter List");
        jPanel52.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel4.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 280, 44));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 290, 680));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));

        lbl_noOfBooks.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 50)); // NOI18N
        lbl_noOfBooks.setForeground(new java.awt.Color(102, 102, 102));
        lbl_noOfBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_noOfBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        lbl_noOfBooks.setText(" 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_noOfBooks)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_noOfBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 140));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Book Details");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, 30));

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));

        lbl_noOfStudents.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 50)); // NOI18N
        lbl_noOfStudents.setForeground(new java.awt.Color(102, 102, 102));
        lbl_noOfStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_noOfStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_People_50px.png"))); // NOI18N
        lbl_noOfStudents.setText(" 0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_noOfStudents)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_noOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 140));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("No. of Students");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 180, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Defaulter List");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 130, 30));

        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));

        lbl_defaulterList.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 50)); // NOI18N
        lbl_defaulterList.setForeground(new java.awt.Color(102, 102, 102));
        lbl_defaulterList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_defaulterList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        lbl_defaulterList.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_defaulterList)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_defaulterList, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, 140));

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));

        lbl_pandingBooks.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 50)); // NOI18N
        lbl_pandingBooks.setForeground(new java.awt.Color(102, 102, 102));
        lbl_pandingBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pandingBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        lbl_pandingBooks.setText(" 0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_pandingBooks)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_pandingBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 230, 140));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Panding Books");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, 30));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Name", "Author", "Quantity"
            }
        ));
        bookTable.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        bookTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        bookTable.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        bookTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookTable.setFuenteFilas(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bookTable.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bookTable.setFuenteHead(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        bookTable.setGridColor(new java.awt.Color(204, 204, 204));
        bookTable.setRowHeight(30);
        jScrollPane1.setViewportView(bookTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 600, 150));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Name", "Course", "Branch"
            }
        ));
        studentTable.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        studentTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        studentTable.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        studentTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentTable.setFuenteFilas(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        studentTable.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        studentTable.setFuenteHead(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        studentTable.setGridColor(new java.awt.Color(204, 204, 204));
        studentTable.setRowHeight(30);
        jScrollPane2.setViewportView(studentTable);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 600, 150));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("No. of Books");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Students Details");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, 30));

        panelPieChart.setLayout(new java.awt.BorderLayout());
        jPanel5.add(panelPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 350, 350));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 1090, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        new ManageStudent().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseEntered
        // TODO add your handling code here:
        jPanel43.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_jPanel43MouseEntered

    private void jPanel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseExited
        // TODO add your handling code here:
        jPanel43.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jPanel43MouseExited

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        new ManageBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:
        jPanel12.setBackground(new Color(10, 10, 10));

    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        // TODO add your handling code here:
        jPanel12.setBackground(new Color(51, 51, 51));


    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel44MouseClicked

    private void jPanel44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel44MouseEntered

    private void jPanel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel44MouseExited

    private void jPanel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel45MouseClicked

    private void jPanel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel45MouseEntered

    private void jPanel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel45MouseExited

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47MouseEntered

    private void jPanel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47MouseExited

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
        // TODO add your handling code here:
        new IssueBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseEntered
        // TODO add your handling code here:
        jPanel46.setBackground(new Color(10, 10, 10));

    }//GEN-LAST:event_jPanel46MouseEntered

    private void jPanel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseExited
        // TODO add your handling code here:
        jPanel46.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_jPanel46MouseExited

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseEntered

    private void jPanel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseExited

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
        // TODO add your handling code here:
        new ReturnBook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseEntered
        // TODO add your handling code here:
        jPanel48.setBackground(new Color(10, 10, 10));

    }//GEN-LAST:event_jPanel48MouseEntered

    private void jPanel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseExited
        // TODO add your handling code here:
        jPanel48.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_jPanel48MouseExited

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseEntered

    private void jPanel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseExited

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
        // TODO add your handling code here:
        new ViewDetail().setVisible(true);
        this.dispose();    }//GEN-LAST:event_jPanel50MouseClicked

    private void jPanel50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseEntered
        // TODO add your handling code here:
        jPanel50.setBackground(new Color(10, 10, 10));

    }//GEN-LAST:event_jPanel50MouseEntered

    private void jPanel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseExited
        // TODO add your handling code here:
        jPanel50.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_jPanel50MouseExited

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseEntered

    private void jPanel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseExited

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseClicked
        // TODO add your handling code here:
        new DefaulterList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel52MouseClicked

    private void jPanel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseEntered
        // TODO add your handling code here:
        jPanel52.setBackground(new Color(10, 10, 10));

    }//GEN-LAST:event_jPanel52MouseEntered

    private void jPanel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseExited
        // TODO add your handling code here:
        jPanel52.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_jPanel52MouseExited

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
//        new Home1().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    public void showPieChart() {

        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();

        try {
            database db = new database();
            String q = "select book_name, count(*) as issueCount from issueBook group by book_id";
            ResultSet res = db.st.executeQuery(q);
            while (res.next()) {
                barDataset.setValue(res.getString("book_name"), Double.valueOf(res.getDouble("issueCount")));  // new Double(res.getDouble(issueCount)
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Books Issue", barDataset, true, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }

    private void studentDetail() {
        DefaultTableModel dtm = (DefaultTableModel) studentTable.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {

            database db = new database();
            String q = "select * from student_detail";
            ResultSet res = db.st.executeQuery(q);

            while (res.next()) {
                String std_id = res.getString("id");
                String std_name = res.getString("name");
                String std_course = res.getString("course");
                String std_branch = res.getString("branch");

                Vector v = new Vector();

                v.add(std_id);
                v.add(std_name);
                v.add(std_course);
                v.add(std_branch);

                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bookDetails() {
        DefaultTableModel dtm = (DefaultTableModel) bookTable.getModel();
        int rc = dtm.getRowCount();
        for (int i = 0; i < rc; i++) {
            dtm.removeRow(0);
        }

        try {

            database db = new database();
            String q = "select * from book_detail";
            ResultSet res = db.st.executeQuery(q);

            while (res.next()) {
                String book_id = res.getString("id");
                String book_name = res.getString("name");
                String book_author = res.getString("author");
                String book_quantity = res.getString("quantity");

                Vector v = new Vector();

                v.add(book_id);
                v.add(book_name);
                v.add(book_author);
                v.add(book_quantity);

                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDataToCards() {
        database db = new database();
        try {//no of books
            ResultSet res1 = db.st.executeQuery("select * from book_detail");
            res1.last();
            lbl_noOfBooks.setText(Integer.toString(res1.getRow()));

            //no of student
            ResultSet res2 = db.st.executeQuery("select * from student_detail");
            res2.last();
            lbl_noOfStudents.setText(Integer.toString(res2.getRow()));

            //PandingBook
            ResultSet res3 = db.st.executeQuery("select * from issueBook where status = 'panding'");
            res3.last();
            lbl_pandingBooks.setText(Integer.toString(res3.getRow()));

            //DefaulterList
            long longDate = System.currentTimeMillis();
            java.sql.Date currentDate = new java.sql.Date(longDate);
            String q = "select * from issueBook where due_date < '" + currentDate + "' and status = 'panding' ";
            ResultSet res4 = db.st.executeQuery(q);
            res4.last();
            lbl_defaulterList.setText(Integer.toString(res4.getRow()));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro bookTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_noOfBooks;
    private javax.swing.JLabel lbl_noOfStudents;
    private javax.swing.JLabel lbl_pandingBooks;
    private javax.swing.JPanel panelPieChart;
    private rojeru_san.complementos.RSTableMetro studentTable;
    private javax.swing.JLabel usserName;
    // End of variables declaration//GEN-END:variables
}
