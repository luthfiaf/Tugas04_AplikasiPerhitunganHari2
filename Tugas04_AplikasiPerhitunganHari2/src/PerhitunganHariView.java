/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PerhitunganHariView extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganHariView
     */
    public PerhitunganHariView() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxBulan = new javax.swing.JComboBox<>();
        jSpinnerTahun = new javax.swing.JSpinner();
        jButtonHitung = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();
        jTextFieldHari = new javax.swing.JTextField();
        jCalendar = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHasil = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MASUKKAN HARI");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKKAN BULAN");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MASUKKAN TAHUN");

        jComboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jComboBoxBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBulanActionPerformed(evt);
            }
        });

        jSpinnerTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerTahunStateChanged(evt);
            }
        });

        jButtonHitung.setText("Hitung");
        jButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        jTextFieldHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHariActionPerformed(evt);
            }
        });

        jTextAreaHasil.setColumns(20);
        jTextAreaHasil.setRows(5);
        jScrollPane1.setViewportView(jTextAreaHasil);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Retroica", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APLIKASI");

        jLabel5.setFont(new java.awt.Font("Retroica", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PERHITUNGAN HARI");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\kalender.png")); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jSpinnerTahun)
                            .addComponent(jComboBoxBulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldHari)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonHitung)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonKeluar)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHitung)
                            .addComponent(jButtonHapus)
                            .addComponent(jButtonKeluar))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBulanActionPerformed

    private void jButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungActionPerformed
        // TODO add your handling code here:
    // Mendapatkan nilai bulan dan tahun yang dipilih
    int hari = Integer.parseInt(jTextFieldHari.getText());  // Input hari dari jTextField
    int bulan = jComboBoxBulan.getSelectedIndex() + 1; // Indeks bulan mulai dari 0, jadi ditambah 1
    int tahun = (Integer) jSpinnerTahun.getValue();
    
    // Menghitung jumlah hari pada bulan tersebut
    int hariPertama = hari;
    int hariTerakhir = 0;

    // Menentukan jumlah hari dalam bulan
    switch (bulan) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            hariTerakhir = 31; // Bulan dengan 31 hari
            break;
        case 4: case 6: case 9: case 11:
            hariTerakhir = 30; // Bulan dengan 30 hari
            break;
        case 2:
            // Mengecek apakah tahun kabisat atau bukan
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                hariTerakhir = 29; // Tahun kabisat
            } else {
                hariTerakhir = 28; // Tahun biasa
            }
            break;
    }
    
    // Menampilkan hasil hari pertama, hari terakhir, dan tahun kabisat
    String hasil = "Hari pertama: " + hariPertama + "\n";
    hasil += "Hari terakhir: " + hariTerakhir + "\n";
    
    // Mengecek apakah tahun kabisat
    if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
        hasil += "Tahun kabisat\n";
    } else {
        hasil += "Bukan tahun kabisat\n";
    }

    // Jika kedua tanggal input diberikan, hitung selisih hari
    if (jCalendar.getDate() != null) {
        java.util.Date tanggalPertama = new java.util.GregorianCalendar(tahun, bulan - 1, hari).getTime();
        java.util.Date tanggalKedua = jCalendar.getDate();
        
        // Menghitung selisih hari
        long selisih = Math.abs(tanggalKedua.getTime() - tanggalPertama.getTime()) / (1000 * 60 * 60 * 24);
        
        // Menambahkan selisih hari ke hasil
        hasil += "Selisih hari: " + selisih + " hari\n";
        
        // Menentukan hari pertama dan hari terakhir
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("EEEE"); // Format untuk mendapatkan hari
        String hariPertamaText = sdf.format(tanggalPertama);
        String hariTerakhirText = sdf.format(tanggalKedua);
        
        hasil += "Hari pertama: " + hariPertamaText + "\n";
        hasil += "Hari terakhir: " + hariTerakhirText + "\n";
    }
    
    /// Menampilkan hasil pada JTextArea
    jTextAreaHasil.setText(hasil);          
    }//GEN-LAST:event_jButtonHitungActionPerformed

    private void jSpinnerTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerTahunStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerTahunStateChanged

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        // Mengosongkan JTextField hari
    jTextFieldHari.setText("");
    
    // Mengembalikan ComboBox bulan ke nilai default (Januari)
    jComboBoxBulan.setSelectedIndex(0);
    
    // Mengembalikan Spinner tahun ke nilai default (misalnya tahun 2024)
    jSpinnerTahun.setValue(0);
    
    // Mengembalikan JCalendar ke tanggal default (hari ini)
    jCalendar.setDate(new java.util.Date());  // Set tanggal ke hari ini
    
    // Mengosongkan hasil di JTextArea
    jTextAreaHasil.setText("");
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        // TODO add your handling code here:
        
        // Menampilkan konfirmasi keluar
    int confirm = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "Apakah Anda yakin ingin keluar?", 
            "Konfirmasi Keluar", 
            javax.swing.JOptionPane.YES_NO_OPTION
    );
    
    // Jika memilih Yes, keluar aplikasi
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void jTextFieldHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHariActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHariView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonKeluar;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox<String> jComboBoxBulan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerTahun;
    private javax.swing.JTextArea jTextAreaHasil;
    private javax.swing.JTextField jTextFieldHari;
    // End of variables declaration//GEN-END:variables
}
