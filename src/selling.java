import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class selling extends javax.swing.JFrame {

   
    
   Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public selling() {
                 super("فرۆشتن");

        initComponents();
        
         conn = connection.database();
                      setExtendedState(JFrame.MAXIMIZED_BOTH);  
                      updateComboBox();
                      getAllData();
    }
    
    
    public void getAllData() {
       try {
            String query = "SELECT * FROM product";
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery(query);

            // Clear the existing data in the table
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("naw");
                String bryhatu = rs.getString("bry_kala");
                int price = rs.getInt("nrx");
                String category = rs.getString("jor");
                  int nrxiset = rs.getInt("nrxi_set");
                                    int bryset = rs.getInt("bry_set");
                // Add a row to the table for each product
                tableModel.addRow(new Object[]{id, name, bryhatu, price,category, bryset });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  public void updateComboBox() {
    // Clear the existing items in the combo box
    jComboBox1.removeAllItems();
    
    try {
        // Execute a query to fetch the names from the categories table
        String query = "SELECT naw FROM catagories";
        Statement pst = conn.createStatement();
        ResultSet rs = pst.executeQuery(query);

        // Iterate over the result set and add each name to the combo box
        while (rs.next()) {
            String categoryName = rs.getString("naw");
            jComboBox2.addItem(categoryName);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nawfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qntity = new javax.swing.JTextField();
        clrbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        showbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtxt = new javax.swing.JTextArea();
        idkala = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        draw = new javax.swing.JTextField();
        bdawa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        showbtn1 = new javax.swing.JButton();

        jLabel5.setBackground(new java.awt.Color(255, 80, 57));
        jLabel5.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  جۆری کاڵاکە ");
        jLabel5.setAutoscrolls(true);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setOpaque(true);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(115, 68, 173));

        jPanel3.setBackground(new java.awt.Color(255, 76, 60));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel2.setText("ڕێکخستنی بەرهەمەکان ");
        jLabel2.setAutoscrolls(true);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel2.setOpaque(true);
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel9.setText("ڕێکخستنی جۆرەکان ");
        jLabel9.setAutoscrolls(true);
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel9.setOpaque(true);
        jLabel9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel9AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel10.setText("ڕێکخستنی قەردەکان  ");
        jLabel10.setAutoscrolls(true);
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel10.setOpaque(true);
        jLabel10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel10AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel11.setText("  فرۆشتن         ");
        jLabel11.setAutoscrolls(true);
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel11.setOpaque(true);
        jLabel11.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel11AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel16.setText("  قازانجی هەفتانە      ");
        jLabel16.setAutoscrolls(true);
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(115, 68, 173));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1591, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 80, 57));
        jLabel3.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ناوی کاڵا    ");
        jLabel3.setAutoscrolls(true);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel3.setOpaque(true);

        nawfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nawfieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 80, 57));
        jLabel6.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("بڕی کاڵآکە   ");
        jLabel6.setAutoscrolls(true);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel6.setOpaque(true);

        qntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntityActionPerformed(evt);
            }
        });

        clrbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        clrbtn.setText("پاکردنەوەی داتا");
        clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        deletebtn.setText("سڕینەوەی پسولە");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        addbtn.setText("زیادکردن بۆ پسولە ");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel8.setText("لیستی بەرهەمەکان ");
        jLabel8.setAutoscrolls(true);
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel8.setOpaque(true);

        showbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        showbtn.setText("پرێنت بکە");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 80, 57));
        jLabel7.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  دیاری کردنی کاڵاکە بەپێی ");
        jLabel7.setAutoscrolls(true);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel7.setOpaque(true);

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("NRT Bold", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "naw", "bry_kala", "nrx", "jor", "bry set"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel1.setText("ماڕکێتی ئیفراز                   ");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel1.setOpaque(true);

        billtxt.setEditable(false);
        billtxt.setColumns(20);
        billtxt.setRows(5);
        billtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtxtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(billtxt);

        idkala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idkalaActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 80, 57));
        jLabel12.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("بارکۆد        ");
        jLabel12.setAutoscrolls(true);
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel12.setOpaque(true);

        draw.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        draw.setForeground(new java.awt.Color(0, 0, 0));
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        bdawa.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        bdawa.setForeground(new java.awt.Color(255, 255, 255));
        bdawa.setEnabled(false);
        bdawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdawaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("دراو");

        jLabel14.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("بدەوە");

        jLabel15.setBackground(new java.awt.Color(255, 102, 102));
        jLabel15.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("پارەدان بسرەوە");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showbtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        showbtn1.setText("ڕیفرێشی داتاکان");
        showbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qntity, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(nawfield))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idkala, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bdawa, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))))
                                .addGap(91, 91, 91)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idkala, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nawfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qntity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bdawa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(38, 38, 38)
                        .addComponent(clrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded

    }//GEN-LAST:event_jLabel2AncestorAdded

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        setVisible(false);
        home page = new home();

        page.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel9AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9AncestorAdded

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
catagories page = new catagories();
this.setVisible(false);
page.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel10AncestorAdded

    }//GEN-LAST:event_jLabel10AncestorAdded

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        qard page = new qard();
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void nawfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nawfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nawfieldActionPerformed

    private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtnActionPerformed
        nawfield.setText(null);
        nawfield.setText("");
        qntity.setText(null);
    }//GEN-LAST:event_clrbtnActionPerformed
int i = 0;
    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

        try {
          billtxt.setText(null);
          z = 0;
          totalPrice = 0;
i = 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_deletebtnActionPerformed
int totalQuantity = 0;
int totalPrice = 0;
    int brykala;
    int    quantity;
private void decreaseQuantityInDatabase(double initialQuantity, int decreaseBy) {
    double updatedQuantity = initialQuantity - decreaseBy;
    
    // Update the quantity value in the database or table using an appropriate update statement or method
    
    // Example SQL statement for updating quantity in a table named "items"
    String updateQuery = "UPDATE product SET bry_kala = " + updatedQuantity + " WHERE id = '" + nawfield.getText() + "'";
    
    // Execute the update query on the database
    // ...
}
int quanitytnysraw;
int Quantitydatabase;
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
    quanitytnysraw = Integer.parseInt(qntity.getText());

if (nawfield.getText().isEmpty() || qntity.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "ڕەنگە بۆشایێک پڕنەکرابێتەوە!");
} else if (quantitysize <= 0) {
    JOptionPane.showMessageDialog(null, "ئەم کاڵایە لە کۆگا نەماوە!");

    try {
        String updateBrySetQuery = "UPDATE product SET bry_set = 0 WHERE id = ?";
        pst = conn.prepareStatement(updateBrySetQuery);
        pst.setString(1, idkala.getText());
        pst.executeUpdate();
        
        
    } catch (SQLException ex) {
        Logger.getLogger(selling.class.getName()).log(Level.SEVERE, null, ex);
    }
} else if (quanitytnysraw > quantitysize) {
    // Display an error message if quantity is not available
    JOptionPane.showMessageDialog(null, "بای ئەوەندە لە کۆگا نەماوە!");
} else {
    i = 1;

    if (i == 1) {
        // Calculate the total price
        tprice = price * Integer.parseInt(qntity.getText());
        Quantitydatabase = Integer.parseInt(qntity.getText());

        // Update the total quantity and price
        totalQuantity += Integer.parseInt(qntity.getText());
        totalPrice += tprice;
        billtxt.setText(billtxt.getText() + "     " + i + "       " + nawikala + "      " + price + "            " + qntity.getText() + "                       " + tprice + "          " + totalPrice + "\n");

        if (quantitysize <= 0) {
            JOptionPane.showMessageDialog(null, "ئەم کاڵایە لە کۆگا نەماوە!");

            try {
                String updateBrySetQuery = "UPDATE product SET bry_set = 0 WHERE id = ?";
                pst = conn.prepareStatement(updateBrySetQuery);
                pst.setString(1, idkala.getText());
                pst.executeUpdate();
                
               
                    pst.executeUpdate(); date = true;
                 date = true;
            } catch (SQLException ex) {
                Logger.getLogger(selling.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (quantitysize - Quantitydatabase < 0) {
            JOptionPane.showMessageDialog(null, "بای ئەوەندە لە کۆگا نەماوە!");
        } else {
            try {
              String insertQuery = "INSERT INTO qazanj (product_id, sale_date, quantity, price) VALUES (?, CURDATE(), ?, ?)";
                    pst = conn.prepareStatement(insertQuery);
                    pst.setString(1, idkala.getText());
                    pst.setInt(2, Quantitydatabase);
                    pst.setInt(3,  price); 
                                    pst.executeUpdate();

                String updateQuery = "UPDATE product SET bry_kala = (bry_kala - " + Quantitydatabase + ") WHERE naw = ?";
                pst = conn.prepareStatement(updateQuery);
                pst.setString(1, nawfield.getText());
                pst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    } else {
        try {
            if (quantitysize <= 0) {
                JOptionPane.showMessageDialog(null, "ئەم کاڵایە لە کۆگا نەماوە!");

                try {
                    String updateBrySetQuery = "UPDATE product SET bry_set = 0 WHERE id = ?";
                    pst = conn.prepareStatement(updateBrySetQuery);
                    pst.setString(1, idkala.getText());
                    pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(selling.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (quantitysize - Quantitydatabase < 0) {
                JOptionPane.showMessageDialog(null, "بای ئەوەندە لە کۆگا نەماوە!");
            } else {
                  String insertQuery = "INSERT INTO qazanj (product_id, sale_date, quantity, price) VALUES (?, CURDATE(), ?, ?)";
                    pst = conn.prepareStatement(insertQuery);
                    pst.setString(1, idkala.getText());
                    pst.setInt(2, Quantitydatabase);
                    pst.setInt(3,  price);
                                                        pst.executeUpdate();

                String updateQuery = "UPDATE product SET bry_kala = (bry_kala - " + Quantitydatabase + ") WHERE naw = ?";
                pst = conn.prepareStatement(updateQuery);
                pst.setString(1, nawfield.getText());
                pst.executeUpdate();
                
                

                // Update tprice with the new value
                tprice = price * Integer.parseInt(qntity.getText());
                // Update the total quantity and price
                totalQuantity += Integer.parseInt(qntity.getText());
                totalPrice += tprice;

                billtxt.setText(billtxt.getText() + "     " + i + "       " + nawikala + "      " + price + "            " + qntity.getText() + "                       " + tprice + "          " + totalPrice + "\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
    }//GEN-LAST:event_addbtnActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed

        try{
           billtxt.print();
                                   Quantitydatabase = Integer.parseInt(qntity.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_showbtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    int price,tprice,quantitysize;
    String nawikala;
                                            
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int myindex = jTable1.getSelectedRow();
        //id.setText(model.getValueAt(myindex, 0).toString());
        nawikala = (model.getValueAt(myindex, 1).toString());
       idkala.setText(model.getValueAt(myindex, 0).toString());
       nawfield.setText(model.getValueAt(myindex, 1).toString());

      //  bryhatu.setText(model.getValueAt(myindex, 2).toString());
       // nrx.setText(model.getValueAt(myindex, 3).toString());
        jComboBox1.setSelectedItem(model.getValueAt(myindex, 4).toString());
        
      //  jorid.setText(model.getValueAt(myindex, 5).toString());
        price = Integer.valueOf(model.getValueAt(myindex, 3).toString());
        quantitysize = Integer.valueOf(model.getValueAt(myindex, 2).toString());
        tprice = price*Integer.valueOf(qntity.getText());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel11AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel11AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11AncestorAdded

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void showbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtn1ActionPerformed
getAllData();
    }//GEN-LAST:event_showbtn1ActionPerformed
boolean date = false;
int z = 0;
int databasebrykala ;
private void processScannedCode() {
    String enteredId = idkala.getText();

    try {
        
        pst = conn.prepareStatement("SELECT * FROM product WHERE id = ?");
        pst.setString(1, enteredId);
        rs = pst.executeQuery();

        if (rs.next()) {
          
            String naw = rs.getString("naw");
            int price = rs.getInt("nrx");
databasebrykala = rs.getInt("bry_kala");
      
            int quantity = 1;
            int tprice = price * quantity;
            totalPrice += tprice;
            z++;
            if (databasebrykala <= 0) {
UIManager.put("OptionPane.background", new Color(255, 255, 255));
UIManager.put("Panel.background", new Color(255, 255, 255));
UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 20));
UIManager.put("Button.background", new Color(0, 176, 80));
UIManager.put("Button.foreground", Color.WHITE);

JPanel panel = new JPanel(new BorderLayout());
panel.setBackground(new Color(255, 255, 255));

ImageIcon icon = new ImageIcon("path/to/icon.png");
JLabel iconLabel = new JLabel(icon);
panel.add(iconLabel, BorderLayout.WEST);

JLabel message = new JLabel("<html><body><p style='width: 250px;'>بەشی پێوەست لە کۆگای نامەوە!</p></body></html>");
message.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
message.setFont(new Font("Arial", Font.BOLD, 16));
panel.add(message, BorderLayout.CENTER);

JOptionPane.showOptionDialog(null, panel, "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);

 String updateBrySetQuery = "UPDATE product SET bry_set = 0 WHERE id = ?";
                pst = conn.prepareStatement(updateBrySetQuery);
                pst.setString(1, enteredId);
                pst.executeUpdate();
            }else{
                
            if (z == 1) {
                       
                String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                idkala.setText("");
                    String shortenedNaw = naw.substring(0, Math.min(naw.length(), 8)); // Get the first five characters of the product name
                        shortenedNaw = String.format("%-8s", shortenedNaw); // Add spaces to make the total length 8
                  billtxt.setText("==================== ifraz market ==================== \n"
                           + currentDate + "\n"+
                    " zhmara  | naw   |    nrx  |  BRY BRDRAW  |  koy para    |  koy gshti    \n " +
                    "        " + z + "    |   " + shortenedNaw + "   |    " + price + "      |      " +
                    quantity + "           |            " + tprice + "     |     " + totalPrice +  "\n ");
                 String updateQuery = "UPDATE product SET bry_kala = (bry_kala - " + quantity + ") WHERE id = ?";
                pst = conn.prepareStatement(updateQuery);
                pst.setString(1, enteredId);
                pst.executeUpdate();
                
                  String insertQuery = "INSERT INTO qazanj (product_id, sale_date, quantity, price) VALUES (?, CURDATE(), ?, ?)";
                    pst = conn.prepareStatement(insertQuery);
                    pst.setString(1, enteredId);
                    pst.setInt(2, quantity);
                    pst.setInt(3, price);
                    pst.executeUpdate(); date = true;
               
            } else {
                                idkala.setText("");
                    String shortenedNaw = naw.substring(0, Math.min(naw.length(), 8)); // Get the first five characters of the product name
    shortenedNaw = String.format("%-8s", shortenedNaw); // Add spaces to make the total length 8
                billtxt.setText(billtxt.getText() + "        " + z + "    |   " + shortenedNaw + "    |   " +
                    price + "      |      " + quantity + "           |            " +
                    tprice + "     |     " + totalPrice +  "\n ");

                // Update the total quantity and price in the database
                String updateQuery = "UPDATE product SET bry_kala = (bry_kala - " + quantity + ") WHERE id = ?";
                pst = conn.prepareStatement(updateQuery);
                pst.setString(1, enteredId);
                pst.executeUpdate();
                
                  String insertQuery = "INSERT INTO qazanj (product_id, sale_date, quantity, price) VALUES (?, CURDATE(), ?, ?)";
                    pst = conn.prepareStatement(insertQuery);
                    pst.setString(1, enteredId);
                    pst.setInt(2, quantity);
                    pst.setInt(3, price);
                    pst.executeUpdate(); date = true;
                 date = true;
            }
        } }else {
        
            JOptionPane.showMessageDialog(null, "ئایدی کاڵا نەدۆزرایەوە!");
        }

        rs.close();
        pst.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
}



    private void idkalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idkalaActionPerformed
   processScannedCode();
    }//GEN-LAST:event_idkalaActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
      }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
// Get the selected category from the combo box
    String selectedCategory = jComboBox2.getSelectedItem().toString();

    try {
        // Prepare the SQL query to fetch the products based on the selected category
        String query = "SELECT * FROM product WHERE jor = ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, selectedCategory);
        rs = pst.executeQuery();

        // Create a new table model to hold the data
      
            // Clear the existing data in the table
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("naw");
                String bryhatu = rs.getString("bry_kala");
                String price = rs.getString("nrx");
                String category = rs.getString("jor");
                // Add a row to the table for each product
                tableModel.addRow(new Object[]{id, name, bryhatu, price, category });
            }
        // Set the table model to the table
        jTable1.setModel(tableModel);

        // Close the result set and prepared statement
        rs.close();
        pst.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void billtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_billtxtMouseClicked

   
    
    int givenMoney = 0;
    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
  String givenMoneyText = draw.getText();
    int givenMoney = Integer.parseInt(givenMoneyText);
    int remainingMoney = givenMoney - totalPrice;
bdawa.setText(Integer.toString(remainingMoney));

if (remainingMoney < 0) {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    panel.setBackground(new Color(255, 240, 240)); // light red background color

    JLabel title = new JLabel("ناتەواوی لە پارەدان!");
    title.setFont(new Font("Arial", Font.BOLD, 20));
    title.setForeground(Color.RED);

    JLabel message1 = new JLabel("بڕی پارەی تەواو نەدراوە!");
    message1.setFont(new Font("Arial", Font.PLAIN, 16));
    message1.setForeground(Color.RED);

    JLabel message2 = new JLabel("هێشتان بڕی: ");
    message2.setFont(new Font("Arial", Font.PLAIN, 14));
    message2.setForeground(Color.BLACK);

    JLabel remaining = new JLabel((-remainingMoney) + " دینار ماوە تا بدرێت");
    remaining.setFont(new Font("Arial", Font.BOLD, 14));
    remaining.setForeground(Color.RED);

    panel.add(title);
    panel.add(Box.createRigidArea(new Dimension(0, 10)));
    panel.add(message1);
    panel.add(Box.createRigidArea(new Dimension(0, 10)));
    panel.add(message2);
    panel.add(remaining);

    JOptionPane.showMessageDialog(null, panel, "ناتەواوی لە پارەدان!", JOptionPane.ERROR_MESSAGE);
} else {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    panel.setBackground(new Color(240, 255, 240)); // light green background color

    JLabel title = new JLabel("پارەدان تەواو!");
    title.setFont(new Font("Arial", Font.BOLD, 20));
    title.setForeground(new Color(0, 128, 0)); // dark green color

    JLabel message1 = new JLabel("بڕی پارەی تەواو دراوە!");
    message1.setFont(new Font("Arial", Font.PLAIN, 16));
    message1.setForeground(new Color(0, 128, 0)); // dark green color

    JLabel message2 = new JLabel("بڕی پێوست بۆ دانەوە: ");
    message2.setFont(new Font("Arial", Font.PLAIN, 14));
    message2.setForeground(Color.BLACK);

    JLabel remaining = new JLabel(remainingMoney + "  دینار");
    remaining.setFont(new Font("Arial", Font.BOLD, 14));
    remaining.setForeground(new Color(0, 128, 0)); // dark green color

    JLabel message3 = new JLabel("هیچ بڕە پارەیەکی دی پێوست ناکە وەرگیڕیتەوە");
    message3.setFont(new Font("Arial", Font.PLAIN, 12));
    message3.setForeground(Color.BLACK);

    panel.add(title);
    panel.add(Box.createRigidArea(new Dimension(0, 10)));
    panel.add(message1);
    panel.add(Box.createRigidArea(new Dimension(0, 10)));
    panel.add(message2);
    panel.add(remaining);
    panel.add(Box.createRigidArea(new Dimension(0, 10)));
    panel.add(message3);

    JOptionPane.showMessageDialog(null, panel, "پارەدان تەواو!", JOptionPane.INFORMATION_MESSAGE);
}
    }//GEN-LAST:event_drawActionPerformed

    private void bdawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdawaActionPerformed

       }//GEN-LAST:event_bdawaActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

draw.setText("");
bdawa.setText("");
    }//GEN-LAST:event_jLabel15MouseClicked

    private void qntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String searchChar = nawfield.getText().trim();

            if (searchChar.isEmpty()) {
                // If the search string is empty, display all rows
                pst = conn.prepareStatement("SELECT * FROM product");
            } else {
                // Otherwise, search for rows where the naw column starts with the entered character
                pst = conn.prepareStatement("SELECT * FROM product WHERE naw LIKE ?");
                pst.setString(1, searchChar + "%");
            }

            ResultSet resultSet = pst.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new Object[] {"id","naw","bry_kala","nrx","jor","id_jor"});

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nawikala = resultSet.getString("naw");
                int brykala = resultSet.getInt("bry_kala");
                int nrx = resultSet.getInt("nrx");
                String jor = resultSet.getString("jor");
                int idjor = resultSet.getInt("id_jor");

                tableModel.addRow(new Object[] {id,nawikala, brykala,nrx,jor,idjor});
            }

            // Set the new table model to the table
            jTable1.setModel(tableModel);

            resultSet.close();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(qard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        qazanj  page = new qazanj();
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField bdawa;
    private javax.swing.JTextArea billtxt;
    private javax.swing.JButton clrbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField draw;
    private javax.swing.JTextField idkala;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nawfield;
    private javax.swing.JTextField qntity;
    private javax.swing.JButton showbtn;
    private javax.swing.JButton showbtn1;
    // End of variables declaration//GEN-END:variables


}
