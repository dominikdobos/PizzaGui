package csomag;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pizzeria extends javax.swing.JFrame {

    public Pizzeria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cmb_meret = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbPar = new javax.swing.JRadioButton();
        rbNincs = new javax.swing.JRadioButton();
        rbTejf = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cb_cheddar = new javax.swing.JCheckBox();
        cb_kukorica = new javax.swing.JCheckBox();
        cb_sonka = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_fizetendo = new javax.swing.JTextField();
        btnHozzaadas = new javax.swing.JButton();
        btnTorles = new javax.swing.JButton();
        cmb_darab = new javax.swing.JComboBox<>();
        btnRendeles = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kosar = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lbKep = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMegj = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jRadioButton2.setText("jRadioButton2");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzéria");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Méret"));

        cmb_meret.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "24", "32", "45" }));
        cmb_meret.setSelectedIndex(0);
        cmb_meret.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_meretItemStateChanged(evt);
            }
        });

        jLabel1.setText("cm");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("100Ft.-/cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_meret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_meret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Szószok/Alapok"));

        buttonGroup1.add(rbPar);
        rbPar.setText("Paradicsomos");
        rbPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNincs);
        rbNincs.setText("Szósz nélkül");
        rbNincs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNincsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTejf);
        rbTejf.setText("Tejszínes");
        rbTejf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTejfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPar)
                    .addComponent(rbTejf)
                    .addComponent(rbNincs))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbPar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTejf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNincs)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Darab :");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Feltétek"));

        cb_cheddar.setText("Cheddar");
        cb_cheddar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cheddarItemStateChanged(evt);
            }
        });

        cb_kukorica.setText("Kukorica");
        cb_kukorica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_kukoricaItemStateChanged(evt);
            }
        });

        cb_sonka.setText("Sonka");
        cb_sonka.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_sonkaItemStateChanged(evt);
            }
        });

        jLabel6.setText("Ára :");

        jLabel8.setText("Ára :");

        jLabel9.setText("Ára :");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("200");
        jTextField2.setEnabled(false);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("75");
        jTextField5.setEnabled(false);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("100");
        jTextField6.setEnabled(false);

        jLabel10.setText("Ft.-");

        jLabel12.setText("Ft.-");

        jLabel13.setText("Ft.-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_sonka)
                    .addComponent(cb_kukorica)
                    .addComponent(cb_cheddar))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField2, jTextField5, jTextField6});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_sonka)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_kukorica)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_cheddar)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Fizetendő");

        tf_fizetendo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf_fizetendo.setForeground(new java.awt.Color(0, 0, 153));
        tf_fizetendo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_fizetendo.setText("0");
        tf_fizetendo.setEnabled(false);

        btnHozzaadas.setBackground(new java.awt.Color(0, 153, 153));
        btnHozzaadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHozzaadas.setText("Hozzáadás");
        btnHozzaadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHozzaadasActionPerformed(evt);
            }
        });

        btnTorles.setBackground(new java.awt.Color(255, 102, 102));
        btnTorles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTorles.setText("Törlés");
        btnTorles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorlesActionPerformed(evt);
            }
        });

        cmb_darab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmb_darab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_darabItemStateChanged(evt);
            }
        });

        btnRendeles.setBackground(new java.awt.Color(0, 153, 255));
        btnRendeles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRendeles.setText("Rendelés");
        btnRendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelesActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Kosár"));

        kosar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alapok", "Méret", "Feltétek", "Darab", "Ár (Ft)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kosar.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(kosar);
        if (kosar.getColumnModel().getColumnCount() > 0) {
            kosar.getColumnModel().getColumn(0).setResizable(false);
            kosar.getColumnModel().getColumn(1).setResizable(false);
            kosar.getColumnModel().getColumn(2).setMinWidth(150);
            kosar.getColumnModel().getColumn(3).setMinWidth(100);
            kosar.getColumnModel().getColumn(4).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Illusztráció"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKep, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKep, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Megjegyzés"));

        taMegj.setColumns(20);
        taMegj.setRows(5);
        jScrollPane1.setViewportView(taMegj);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Dominik Pizzéria");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ft");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_fizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnHozzaadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTorles, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_darab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(23, 23, 23)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHozzaadas, btnRendeles, btnTorles});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tf_fizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTorles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_darab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel2});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHozzaadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHozzaadasActionPerformed
        // HOZZÁADÁS GOMB
        boolean nincsKivalasztvaSzoszEsMeret = rbPar.isSelected() == false && rbTejf.isSelected() == false && rbNincs.isSelected() == false && cmb_meret.getSelectedIndex() == 0;
        boolean nincsKivalasztvaSzosz = rbPar.isSelected() == false && rbTejf.isSelected() == false && rbNincs.isSelected() == false;
        boolean nincsKivalasztvaMeret = cmb_meret.getSelectedIndex() == 0;

        if (nincsKivalasztvaSzoszEsMeret) {
            JOptionPane.showMessageDialog(rootPane, "Válaszd ki az alapot és a méretet!", "HIBA! - Alap/Szósz - Méret", 0);
        } else if (nincsKivalasztvaSzosz) {
            JOptionPane.showMessageDialog(rootPane, "Válaszd ki az alapot!", "HIBA! - Alap/Szósz", 0);
        } else if (nincsKivalasztvaMeret) {
            JOptionPane.showMessageDialog(rootPane, "Válaszd ki a méretet!", "HIBA! - Méret", 0);
        } else {
            DefaultTableModel tablazat = (DefaultTableModel) kosar.getModel();
            int tipus = 0;
            int alap = 0;
            if (rbPar.isSelected()) {
                alap = 1; // par
            }
            if (rbTejf.isSelected()) {
                alap = 2; // tejfölös
            }
            if (rbNincs.isSelected()) {
                alap = 3; // nincs alap
            }

            if (cb_sonka.isSelected()) {
                tipus = 1; // sonka
            }
            if (cb_cheddar.isSelected()) {
                tipus = 7; // cheddar
            }
            if (cb_kukorica.isSelected()) {
                tipus = 4; // kuk
            }
            if (cb_sonka.isSelected() && cb_cheddar.isSelected()) {
                tipus = 2; // sonka cheddar
            }
            if (cb_sonka.isSelected() && cb_kukorica.isSelected()) {
                tipus = 5; // kuk -  sonk
            }
            if (cb_kukorica.isSelected() && cb_cheddar.isSelected()) {
                tipus = 6; // kuk - cheddar
            }
            if (cb_sonka.isSelected() && cb_kukorica.isSelected() && cb_cheddar.isSelected()) {
                tipus = 3; // sonka cheddar kukorica
            }

            String szosz = "";
            String feltet = "";

            if (alap == 1) {
                szosz = "Paradicsomos";
            }
            if (alap == 2) {
                szosz = "Tejfölös";
            }
            if (alap == 3) {
                szosz = "Szósz nélküli";
            }

            if (tipus == 1) {
                feltet = "Sonka";
            }
            if (tipus == 2) {
                feltet = "Sonka, Cheddar";
            }
            if (tipus == 3) {
                feltet = "Sonka, Cheddar, Kukorica";
            }
            if (tipus == 4) {
                feltet = "Kukorica";
            }
            if (tipus == 5) {
                feltet = "Kukorica, Sonka";
            }
            if (tipus == 6) {
                feltet = "Kukorica, Cheddar";
            }
            if (tipus == 7) {
                feltet = "Cheddar";
            }

            int ar = Integer.parseInt(tf_fizetendo.getText());

            tablazat.addRow(new Object[]{szosz, cmb_meret.getSelectedItem(), feltet, cmb_darab.getSelectedItem(), ar});

            cmb_meret.setSelectedIndex(0);
            cmb_darab.setSelectedIndex(0);
            buttonGroup1.clearSelection();
            cb_cheddar.setSelected(false);
            cb_kukorica.setSelected(false);
            cb_sonka.setSelected(false);
            tf_fizetendo.setText("0");
            ImageIcon icon = new ImageIcon();
            lbKep.setIcon(icon);
        }
    }//GEN-LAST:event_btnHozzaadasActionPerformed

    private void btnTorlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorlesActionPerformed
        // TÖRLÉS GOMB

        cmb_meret.setSelectedIndex(0);
        cmb_darab.setSelectedIndex(0);
        tf_fizetendo.setText("0");
        cb_cheddar.setSelected(false);
        cb_kukorica.setSelected(false);
        cb_sonka.setSelected(false);
        buttonGroup1.clearSelection();

        // Kép törlése
        ImageIcon icon = new ImageIcon();
        lbKep.setIcon(icon);

        // Táblázat törlés
        DefaultTableModel tablazat = (DefaultTableModel) kosar.getModel();
        while (tablazat.getRowCount() > 0) {
            tablazat.removeRow(0);
        }
    }//GEN-LAST:event_btnTorlesActionPerformed

    private void btnRendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelesActionPerformed
        // RENDELÉS GOMB
        DefaultTableModel tablazat = (DefaultTableModel) kosar.getModel();
        int ar = 0;

        int sorszam = tablazat.getRowCount();
        int i = 0;
        while (i < sorszam) {
            ar += (int) tablazat.getValueAt(i, 4);
            i++;
        }
        String uzenet = "";
        if (taMegj.getText().isEmpty()) {
            uzenet = "     Köszönjük a rendelést!\n\nFizetendő: " + ar;
        } else {
            uzenet = "     Köszönjük a rendelést!\n\nFizetendő: " + ar + "\n\nMegjegyzés:\n" + taMegj.getText();
        }

        if (tablazat.getRowCount() > 0) {
            JOptionPane.showMessageDialog(rootPane, uzenet, "SIKERES RENDELÉS!", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Üres a kosár!", "HIBA! - Rendelés", 0);
        }

    }//GEN-LAST:event_btnRendelesActionPerformed

    private void cmb_meretItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_meretItemStateChanged
        fizetendo();
    }//GEN-LAST:event_cmb_meretItemStateChanged

    private void cb_sonkaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_sonkaItemStateChanged
        fizetendo();
        kep();
    }//GEN-LAST:event_cb_sonkaItemStateChanged

    private void cb_kukoricaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_kukoricaItemStateChanged
        fizetendo();
        kep();
    }//GEN-LAST:event_cb_kukoricaItemStateChanged

    private void cb_cheddarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cheddarItemStateChanged
        fizetendo();
        kep();
    }//GEN-LAST:event_cb_cheddarItemStateChanged

    private void cmb_darabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_darabItemStateChanged
        fizetendo();
        kep();
    }//GEN-LAST:event_cmb_darabItemStateChanged

    private void rbTejfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTejfActionPerformed
        kep();
    }//GEN-LAST:event_rbTejfActionPerformed

    private void rbParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParActionPerformed
        kep();
    }//GEN-LAST:event_rbParActionPerformed

    private void rbNincsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNincsActionPerformed
        kep();
    }//GEN-LAST:event_rbNincsActionPerformed

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
            java.util.logging.Logger.getLogger(Pizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHozzaadas;
    private javax.swing.JButton btnRendeles;
    private javax.swing.JButton btnTorles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_cheddar;
    private javax.swing.JCheckBox cb_kukorica;
    private javax.swing.JCheckBox cb_sonka;
    private javax.swing.JComboBox<String> cmb_darab;
    private javax.swing.JComboBox<String> cmb_meret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable kosar;
    private javax.swing.JLabel lbKep;
    private javax.swing.JRadioButton rbNincs;
    private javax.swing.JRadioButton rbPar;
    private javax.swing.JRadioButton rbTejf;
    private javax.swing.JTextArea taMegj;
    private javax.swing.JTextField tf_fizetendo;
    // End of variables declaration//GEN-END:variables

    private void fizetendo() {
        int fizetendo = 0;

        if (cmb_meret.getSelectedIndex() == 1) {
            fizetendo = fizetendo + 2400;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        } else if (cmb_meret.getSelectedIndex() == 2) {
            fizetendo = fizetendo + 3200;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        } else if (cmb_meret.getSelectedIndex() == 3) {
            fizetendo = fizetendo + 4500;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        }

        if (cmb_darab.getSelectedIndex() == 0) {
            fizetendo = fizetendo;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        } else if (cmb_darab.getSelectedIndex() == 1) {
            fizetendo += fizetendo * 2;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        } else {
            fizetendo += fizetendo * 3;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        }

        if (cb_sonka.isSelected()) {
            fizetendo = fizetendo + 200;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        }
        if (cb_kukorica.isSelected()) {
            fizetendo = fizetendo + 75;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        }
        if (cb_cheddar.isSelected()) {
            fizetendo = fizetendo + 100;
            tf_fizetendo.setText(Integer.toString(fizetendo));
        }
    }

    private void kep() {
        if (rbPar.isSelected()) {
            ImageIcon icon = new ImageIcon("par.png");
            lbKep.setIcon(icon);
            if (cb_kukorica.isSelected()) {
                icon = new ImageIcon("par-kuk.png");
                lbKep.setIcon(icon);
            }
            if (cb_sonka.isSelected()) {
                icon = new ImageIcon("par-son.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected()) {
                icon = new ImageIcon("par-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_sonka.isSelected()) {
                icon = new ImageIcon("par-son-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_kukorica.isSelected()) {
                icon = new ImageIcon("par-kuk-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_kukorica.isSelected() && cb_sonka.isSelected()) {
                icon = new ImageIcon("par-son-kuk.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_sonka.isSelected() && cb_kukorica.isSelected()) {
                icon = new ImageIcon("par-kuk-saj-son.png");
                lbKep.setIcon(icon);
            }
        }

        if (rbNincs.isSelected()) {
            ImageIcon icon = new ImageIcon("nincs.png");
            lbKep.setIcon(icon);
            if (cb_cheddar.isSelected()) {
                icon = new ImageIcon("nincs-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_kukorica.isSelected()) {
                icon = new ImageIcon("nincs-kuk.png");
                lbKep.setIcon(icon);
            }
            if (cb_sonka.isSelected()) {
                icon = new ImageIcon("nincs-son.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_sonka.isSelected()) {
                icon = new ImageIcon("nincs-son-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_kukorica.isSelected()) {
                icon = new ImageIcon("nincs-kuk-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_kukorica.isSelected() && cb_sonka.isSelected()) {
                icon = new ImageIcon("nincs-son-kuk.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_sonka.isSelected() && cb_kukorica.isSelected()) {
                icon = new ImageIcon("nincs-kuk-saj-son.png");
                lbKep.setIcon(icon);
            }
        }

        if (rbTejf.isSelected()) {
            ImageIcon icon = new ImageIcon("tejf.png");
            lbKep.setIcon(icon);
            if (cb_cheddar.isSelected()) {
                 icon = new ImageIcon("tejf-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_kukorica.isSelected()) {
                 icon = new ImageIcon("tejf-kuk.png");
                lbKep.setIcon(icon);
            }
            if (cb_sonka.isSelected()) {
                 icon = new ImageIcon("tejf-son.png");
                lbKep.setIcon(icon);
            }

            if (cb_cheddar.isSelected() && cb_sonka.isSelected()) {
                 icon = new ImageIcon("tejf-son-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_cheddar.isSelected() && cb_kukorica.isSelected()) {
                 icon = new ImageIcon("tejfol-kuk-saj.png");
                lbKep.setIcon(icon);
            }
            if (cb_kukorica.isSelected() && cb_sonka.isSelected()) {
                 icon = new ImageIcon("tejf-son-kuk.png");
                lbKep.setIcon(icon);
            }

            if (cb_cheddar.isSelected() && cb_sonka.isSelected() && cb_kukorica.isSelected()) {
                 icon = new ImageIcon("tejfol-kuk-saj-son.png");
                lbKep.setIcon(icon);
            }
        }

    }
}
