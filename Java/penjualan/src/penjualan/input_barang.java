/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;
import com.mysql.jdbc.RowData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class input_barang extends javax.swing.JFrame {
 public Statement st;
    public ResultSet rs;
    
    public DefaultTableModel tabmodel;
    Connection cn = config.koneksi.getkoneksi();
    /**
     * Creates new form input_barang
     */
    public input_barang() {
        initComponents();
        judul();
        tampildata();
        ulang();
        auto();
      
    }
public void tampildata(){ 
        try {
            st = cn.createStatement();
            tabmodel.getDataVector().removeAllElements();
            tabmodel.fireTableDataChanged();
            rs = st.executeQuery("select * from tb_barang");
            while (rs.next()){
                Object[] data = {
                    rs.getString("kd_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("harga"),
                    rs.getString("stok"),
                  
                };
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void judul(){
        Object[] judul = {"kd barang","nama barang","harga","stok"};
        tabmodel = new DefaultTableModel(null, judul);
        tbl_barang.setModel(tabmodel);
    }
    public void ulang(){
       
        nama_barang.setText("");
        harga.setText("");
        stok.setText("");
        simpan.setEnabled(true);
        edit.setEnabled(false);
        hapus.setEnabled(false);
    }
  private void auto(){ 
        try{
            Random angka = new Random();
            String angkaa = String.valueOf(angka.nextInt(999));
            String kode = "T"+angkaa;
            kd_barang.setText(kode);
            kd_barang.setEnabled(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        kd_barang = new javax.swing.JTextField();
        nama_barang = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(747, 480));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 80);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 430, 730, 10);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 80, 10, 350);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(720, 80, 10, 350);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Stok");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 300, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 180, 90, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 90, 17);
        getContentPane().add(stok);
        stok.setBounds(150, 290, 150, 40);

        kd_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kd_barangActionPerformed(evt);
            }
        });
        getContentPane().add(kd_barang);
        kd_barang.setBounds(150, 110, 150, 40);
        getContentPane().add(nama_barang);
        nama_barang.setBounds(150, 170, 150, 40);
        getContentPane().add(harga);
        harga.setBounds(150, 230, 150, 40);

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Plus_48px.png"))); // NOI18N
        simpan.setText("SIMPAN");
        simpan.setMaximumSize(new java.awt.Dimension(100, 49));
        simpan.setMinimumSize(new java.awt.Dimension(100, 49));
        simpan.setOpaque(false);
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(170, 360, 130, 50);

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 160, 350, 170);

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Ok_48px.png"))); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(470, 360, 110, 50);

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Trash Can_48px.png"))); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(590, 360, 120, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Search_48px.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 110, 50, 40);

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });
        getContentPane().add(tcari);
        tcari.setBounds(410, 110, 280, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Undo_48px.png"))); // NOI18N
        jButton1.setText("BATAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 360, 120, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Left_50px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 390, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         if("".equals(nama_barang.getText())||"".equals(harga.getText())||"".equals(stok.getText())){
            JOptionPane.showMessageDialog(null, "Lengkapi data!");
        }else{
             try {
            st=cn.createStatement();
            st.executeUpdate("insert into tb_barang set " + "kd_barang = '" + kd_barang.getText() + "', nama_barang='" + nama_barang.getText() + "', harga = '" + harga.getText() + "', stok = '" + stok.getText() + "';");
                 tampildata();
                 ulang();
                 auto();
            
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
       
    }//GEN-LAST:event_simpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if("".equals(kd_barang.getText())||"".equals(nama_barang.getText())||"".equals(harga.getText())||"".equals(stok.getText())){
            JOptionPane.showMessageDialog(null, "Tidak ada data");
        }else{
             try {
                 ulang();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        if("".equals(nama_barang.getText())||"".equals(harga.getText())||"".equals(stok.getText())){
            JOptionPane.showMessageDialog(null, "Isi semua Kolom");
        }else{
            try {
                st=cn.createStatement();
                 st.executeUpdate("update tb_barang set "+"nama_barang='"+nama_barang.getText()+"',"+"harga='"+harga.getText()+"',"+"stok='"+stok.getText()+"' where kd_barang='"+tabmodel.getValueAt(tbl_barang.getSelectedRow(),0)+"';");
                tampildata();
                ulang();
                JOptionPane.showMessageDialog(null, "Berhasil");
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Gagal diupdate! "+e.getMessage());
            }
         }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
         if("".equals(nama_barang.getText())||"".equals(harga.getText())||"".equals(stok.getText())){
            JOptionPane.showMessageDialog(null, "Pilih Terlebih dahulu");
        }else{
            try {
                int jawab;
                if ((jawab=JOptionPane.showConfirmDialog(null,"Hapus ?","konfirmasi",JOptionPane.YES_NO_OPTION))==0) {
                    st.executeUpdate("delete from tb_barang where "+"kd_barang='"+tabmodel.getValueAt(tbl_barang.getSelectedRow(),0)+"'");
                    tampildata();
                    ulang();
                    JOptionPane.showMessageDialog(null, "Berhasil dihapus");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal diHapus! "+e.getMessage());
            }
         }
    }//GEN-LAST:event_hapusActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        // TODO add your handling code here:
        
   kd_barang.setText(tabmodel.getValueAt(tbl_barang.getSelectedRow(), 0) + "");
        nama_barang.setText(tabmodel.getValueAt(tbl_barang.getSelectedRow(), 1) + "");
        harga.setText(tabmodel.getValueAt(tbl_barang.getSelectedRow(), 2)+ "");
        stok.setText(tabmodel.getValueAt(tbl_barang.getSelectedRow(),3) + "");
        simpan.setEnabled(false);
        edit.setEnabled(true);
        hapus.setEnabled(true);
        
        simpan.setEnabled(false);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        // TODO add your handling code here:
         try {
            st = cn.createStatement();
            tabmodel.getDataVector().removeAllElements();
            tabmodel.fireTableDataChanged();
            rs = st.executeQuery("select * from tb_barang where kd_barang like '%" + tcari.getText() + "%' or nama_barang like '%" + tcari.getText() + "%' or harga like '%" + tcari.getText() + "%' or stok like '%" + tcari.getText() + "%' " );
            while (rs.next()){
                Object[] data = {
                    rs.getString("kd_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("harga"),
                    rs.getString("stok")
                };
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tcariKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Menu barang = new Menu();
        barang.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kd_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_barangActionPerformed

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
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kd_barang;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField tcari;
    // End of variables declaration//GEN-END:variables
}
