
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class home extends javax.swing.JFrame {
 
 Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public home() {
        super("ماڵەوە");
        initComponents();
         conn = connection.database();
    updateComboBox();
            setExtendedState(JFrame.MAXIMIZED_BOTH);  
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
int koynrxiset = nrxiset * bryset;
                // Add a row to the table for each product
                tableModel.addRow(new Object[]{id, name, bryhatu, price,category,nrxiset, koynrxiset ,bryset });
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
            jComboBox1.addItem(categoryName);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editbtn = new javax.swing.JButton();
        showbtn = new javax.swing.JButton();
        clrbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bryhatu = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        editbtn1 = new javax.swing.JButton();
        clrbtn1 = new javax.swing.JButton();
        addbtn1 = new javax.swing.JButton();
        deletebtn1 = new javax.swing.JButton();
        bryhatubaset = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nrxiset = new javax.swing.JTextField();
        showbtn1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        qardsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        editbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        editbtn.setText("دەسکاریکردنی جۆر");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        showbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        showbtn.setText("بینینی هەموو جۆرەکان");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        clrbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        clrbtn.setText("پاکردنەوەی داتا");
        clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtnActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        addbtn.setText("زیادکردنی جۆر ");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        deletebtn.setText("سڕینەوەی جۆر");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel11.setText("ڕێکخستنی قەردەکان  ");
        jLabel11.setAutoscrolls(true);
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel13.setText("  فرۆشتن         ");
        jLabel13.setAutoscrolls(true);
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel14.setText("  قازانجی هەفتانە      ");
        jLabel14.setAutoscrolls(true);
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel1.setText("ماڕکێتی ئیفراز                   ");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(115, 68, 173));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 80, 57));
        jLabel3.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  بارکۆدی کاڵاکە ");
        jLabel3.setAutoscrolls(true);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 80, 57));
        jLabel4.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  ناوی کاڵاکە ");
        jLabel4.setAutoscrolls(true);
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 80, 57));
        jLabel5.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  بابەتی کاڵاکە ");
        jLabel5.setAutoscrolls(true);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setOpaque(true);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 80, 57));
        jLabel6.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" ژمارەی ناو یەک سێت ");
        jLabel6.setAutoscrolls(true);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel6.setOpaque(true);

        bryhatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bryhatuActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 80, 57));
        jLabel7.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("نرخی یەک دانەی کاڵاکە  ");
        jLabel7.setAutoscrolls(true);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel7.setOpaque(true);

        jTable1.setFont(new java.awt.Font("NRT Bold", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "barcode", "naw", "zhmaray kalaka", "nrxi yak danay kala", "babat", "nrxi yak set", "koy nrxi  setakan", "bry sety hatu"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel8.setText("لیستی بەرهەمەکان     ");
        jLabel8.setAutoscrolls(true);
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel8.setOpaque(true);

        editbtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        editbtn1.setText("دەسکاریکردنی کاڵآ");
        editbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtn1ActionPerformed(evt);
            }
        });

        clrbtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        clrbtn1.setText("پاکردنەوەی داتا");
        clrbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtn1ActionPerformed(evt);
            }
        });

        addbtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        addbtn1.setText("زیادکردنی کاڵآ ");
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });

        deletebtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        deletebtn1.setText("سڕینەوەی کاڵآ");
        deletebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 80, 57));
        jLabel10.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ژمارەی هاتوو بە سێت");
        jLabel10.setAutoscrolls(true);
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel10.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 80, 57));
        jLabel12.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("نرخی یەک سێتی کاڵاکە  ");
        jLabel12.setAutoscrolls(true);
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel12.setOpaque(true);

        showbtn1.setFont(new java.awt.Font("NRT Bold", 0, 18)); // NOI18N
        showbtn1.setText("بینینی هەموو کاڵاکان");
        showbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtn1ActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 80, 57));
        jLabel15.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("فێرکاری سیستەم**");
        jLabel15.setAutoscrolls(true);
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 80, 57));
        jLabel16.setFont(new java.awt.Font("NRT Bold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("گەڕان بە ناو  ");
        jLabel16.setAutoscrolls(true);
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel16.setOpaque(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(457, 457, 457))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(qardsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nrxiset)
                                    .addComponent(bryhatu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bryhatubaset, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clrbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(showbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(qardsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nrxiset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bryhatu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bryhatubaset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
         setVisible(false);
        catagories page = new catagories();
        
page.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed

        if(id.getText().isEmpty() | prname.getText().isEmpty() | price.getText().isEmpty() | bryhatu.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "ڕەنگە بۆشایێک پڕنەکرابێتەوە!");

        }else{
            try {
                String query = "update catagories set naw = '" + prname.getText() + "'" + ", bry_kala = '" + bryhatu.getText()+ "'" + ", nrx = '" + price.getText() + "'" +", jor = '" + jComboBox1.getSelectedItem()+ "'" + "where id = " + id.getText();
                Statement add = conn.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "تەواو کاڵاکە  گۆردرا!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_editbtnActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed

        try{
            pst = conn.prepareStatement("SELECT * FROM product ");
            ResultSet resultSet = pst.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new Object[] {"id","naw","bry_kala" , "nrx" , "jor"});

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String prname = resultSet.getString("naw");
                String brykala = resultSet.getString("bry_kala");
                String nrx = resultSet.getString("nrx");
                String jor = resultSet.getString("jor");
                tableModel.addRow(new Object[] {id,prname,brykala, nrx, jor});
            }

            // Set the new table model to the table
            jTable1.setModel(tableModel);

            resultSet.close();
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_showbtnActionPerformed

    private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtnActionPerformed

    }//GEN-LAST:event_clrbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

        try {
            String categoryId = id.getText();
            pst = conn.prepareStatement("DELETE FROM catagories WHERE id=?");
            pst.setString(1, categoryId);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Category deleted successfully");

            // Update the combo box in the home class after deleting the category

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtn1ActionPerformed

        if(id.getText().isEmpty() | prname.getText().isEmpty() | price.getText().isEmpty() | bryhatu.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "ڕەنگە بۆشایێک پڕنەکرابێتەوە!");

        }else {
    String query = "UPDATE product SET naw = ?, bry_kala =  ?, nrx = ?, jor = ?, nrxi_set = ?, bry_set = ? WHERE id = ?";
    try {
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, prname.getText());

        // Calculate the new value for bry_kala based on bry_set and bry_kala
        int bryhatubasetValue = Integer.parseInt(bryhatubaset.getText());
        int brykalaValue = Integer.parseInt(bryhatu.getText());
        int brykalaUpdatedValue = bryhatubasetValue * brykalaValue;
        pst.setInt(2, brykalaUpdatedValue);

        pst.setString(3, price.getText());
        pst.setString(4, jComboBox1.getSelectedItem().toString());
        pst.setString(5, nrxiset.getText());
        pst.setString(6, bryhatubaset.getText());
        pst.setLong(7, Long.parseLong(id.getText()));
        pst.executeUpdate();
        pst.close();
        getAllData();
    }  catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_editbtn1ActionPerformed

    private void showbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtn1ActionPerformed

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
int koynrxiset = nrxiset * bryset;
                // Add a row to the table for each product
                tableModel.addRow(new Object[]{id, name, bryhatu, price,category,nrxiset, koynrxiset ,bryset });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_showbtn1ActionPerformed

    private void clrbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtn1ActionPerformed
        id.setText("");
       price.setText("");
      bryhatu.setText("");
       prname.setText("");
       bryhatubaset.setText("");
       nrxiset.setText("");
  
    }//GEN-LAST:event_clrbtn1ActionPerformed

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
       if (id.getText().isEmpty() || prname.getText().isEmpty() || bryhatu.getText().isEmpty() || price.getText().isEmpty() ) {
    JOptionPane.showMessageDialog(null, "ڕەنگە بۆشایێک پڕنەکرابێتەوە!");
} else {
    try {
        String productId = id.getText();

        // Check if the ID already exists
        pst = conn.prepareStatement("SELECT id FROM product WHERE id = ?");
        pst.setString(1, productId);
        rs = pst.executeQuery();

        if (rs.next()) {
            // ID already exists, show a message to the user
            JOptionPane.showMessageDialog(null, "ناتوانی دوو ئایدی کاڵا وەک یەک بنووسیت!");
        } else {
            // ID doesn't exist, proceed with the insertion
int zhmarayhatu = Integer.parseInt(bryhatu.getText());
int zhmarayhatubaset = Integer.parseInt(bryhatubaset.getText());
int multipliedValue = zhmarayhatu * zhmarayhatubaset;
            pst = conn.prepareStatement("INSERT INTO product (id, naw, bry_kala, nrx, jor,nrxi_set,bry_set) VALUES (?, ?, ?, ?, ?,?,?)");
            
            pst.setString(1, productId);
            pst.setString(2, prname.getText());
            pst.setInt(3,multipliedValue);
            pst.setString(4, price.getText());
            pst.setString(5, jComboBox1.getSelectedItem().toString());
            pst.setString(6, nrxiset.getText());
            pst.setString(7, bryhatubaset.getText());


            JOptionPane.showMessageDialog(null, " کاڵاکە زیادکرا");

            pst.executeUpdate();

      getAllData();
        }

        rs.close();
        pst.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    getAllData();

}

    }//GEN-LAST:event_addbtn1ActionPerformed

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed

        try {
            String productId = id.getText();
            pst = conn.prepareStatement("DELETE FROM product WHERE id=?");
            pst.setString(1, productId);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "کاڵاکە سڕایەوە!");

            // Update the combo box in the home class after deleting the category
getAllData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_deletebtn1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int myindex = jTable1.getSelectedRow();
    id.setText(model.getValueAt(myindex, 0).toString());
    prname.setText(model.getValueAt(myindex, 1).toString());
    price.setText(model.getValueAt(myindex, 3).toString());
    jComboBox1.setSelectedItem(model.getValueAt(myindex, 4).toString());
    nrxiset.setText(model.getValueAt(myindex, 5).toString());
            bryhatubaset.setText(model.getValueAt(myindex, 7).toString());

    // Get the values at column index 2 and index 7
    int valueAtIndex2 = Integer.parseInt(model.getValueAt(myindex, 2).toString());
    int valueAtIndex7 = Integer.parseInt(model.getValueAt(myindex, 7).toString());
    
    // Perform integer division and set the result in bryhatu text field
    int divisionResult = valueAtIndex2 / valueAtIndex7;
    bryhatu.setText(String.valueOf(divisionResult));

    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
     
qard page = new qard();
        this.setVisible(false);
        page.setVisible(true);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
selling page = new selling();
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked


qazanj  page = new qazanj();
        this.setVisible(false);
        page.setVisible(true);

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
 wrdakari dialog = new wrdakari(this);
    dialog.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void bryhatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bryhatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bryhatuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     try {
    String searchChar = qardsearch.getText().trim();
    
    if (searchChar.isEmpty()) {
        // If the search string is empty, display all rows
        pst = conn.prepareStatement("SELECT * FROM product");
    } else {
        // Otherwise, search for rows where the naw column starts with the entered character
        pst = conn.prepareStatement("SELECT * FROM product WHERE naw LIKE ?");
        pst.setString(1, searchChar + "%");
    }

     rs = pst.executeQuery();

    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.setColumnIdentifiers(new Object[] {"id","naw","bry_kala","nrx", "jot","nrxi set","koy nrxi set","bry sety hatu"});

    while (rs.next()) {
        long id = rs.getLong("id");
                String name = rs.getString("naw");
                String bryhatu = rs.getString("bry_kala");
                int price = rs.getInt("nrx");
                String category = rs.getString("jor");
                  int nrxiset = rs.getInt("nrxi_set");
                                    int bryset = rs.getInt("bry_set");
int koynrxiset = nrxiset * bryset;

                tableModel.addRow(new Object[]{id, name, bryhatu, price,category,nrxiset, koynrxiset ,bryset });
    }

    // Set the new table model to the table
    jTable1.setModel(tableModel);

    rs.close();
    pst.close();

} catch (SQLException ex) {
    Logger.getLogger(qard.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JTextField bryhatu;
    private javax.swing.JTextField bryhatubaset;
    private javax.swing.JButton clrbtn;
    private javax.swing.JButton clrbtn1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton editbtn1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nrxiset;
    private javax.swing.JTextField price;
    private javax.swing.JTextField prname;
    private javax.swing.JTextField qardsearch;
    private javax.swing.JButton showbtn;
    private javax.swing.JButton showbtn1;
    // End of variables declaration//GEN-END:variables
}
