/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.Controller;
import Model.Booking;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class View_ListBookingPage extends javax.swing.JFrame {
    
    private final DefaultTableModel model = new DefaultTableModel();
    private Controller koneksiData = new Controller();

    /**
     * Creates new form View_BookingPage
     */
    public View_ListBookingPage() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        // Memtikan resize
        setResizable(false);

        // tabel
        model.addColumn("ID");
        model.addColumn("Lapangan");
        model.addColumn("Nama Konsumen");
        model.addColumn("No telepone");
        model.addColumn("Tanggal");
        model.addColumn("Jam Mulai");
        model.addColumn("Jam Berakhir");
                model.addColumn("Total Harga");
                model.addColumn("Status");

        TabelBooking.setModel(model);

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabList = new javax.swing.JLabel();
        TabelListBooking = new javax.swing.JScrollPane();
        TabelBooking = new javax.swing.JTable();
        ButTambah = new javax.swing.JButton();
        ButEdit = new javax.swing.JButton();
        ButHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(541, 451));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabList.setText("LIST BOOKING");
        getContentPane().add(LabList, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 98, 293, -1));

        TabelBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Konsumen", "No Telepon", "Tanggal", "Jam Booking", "Lapangan"
            }
        ));
        TabelBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBookingMouseClicked(evt);
            }
        });
        TabelListBooking.setViewportView(TabelBooking);

        getContentPane().add(TabelListBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 470, 230));

        ButTambah.setBackground(new java.awt.Color(0, 153, 255));
        ButTambah.setText("Tambah Data");
        ButTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTambahActionPerformed(evt);
            }
        });
        getContentPane().add(ButTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 389, -1, -1));

        ButEdit.setBackground(new java.awt.Color(255, 153, 51));
        ButEdit.setText("Edit Data");
        ButEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEditActionPerformed(evt);
            }
        });
        getContentPane().add(ButEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 389, -1, -1));

        ButHapus.setBackground(new java.awt.Color(255, 0, 0));
        ButHapus.setText("Hapus Data");
        ButHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButHapusActionPerformed(evt);
            }
        });
        getContentPane().add(ButHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 389, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENYEWAAN LAPANGAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, 529, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Booking Penyewaan Lapangan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 529, -1));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Histori");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 102, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTambahActionPerformed
        new View_BookingPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButTambahActionPerformed

    private void ButEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEditActionPerformed
    
        int selectedRow = -1;
        try {
            selectedRow = TabelBooking.getSelectedRow();
            // Rest of your code...
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception or leave it empty if you just want to ignore it
            JOptionPane.showMessageDialog(null, "Tidak ada booking yang terpilih. Mohon pilih booking yang akan dihapus.");
            return;
        }

        String id_booking = model.getValueAt(selectedRow, 0).toString();
        String lapanganName = model.getValueAt(selectedRow, 1).toString();
        String namakonsumen = model.getValueAt(selectedRow, 2).toString();
        String notelepon = model.getValueAt(selectedRow, 3).toString();
        String tanggal = model.getValueAt(selectedRow, 4).toString();
        String startJam = model.getValueAt(selectedRow, 5).toString();
        String endJam = model.getValueAt(selectedRow, 6).toString();
        int totalHarga = Integer.parseInt(model.getValueAt(selectedRow, 7).toString());
        String status = model.getValueAt(selectedRow, 8).toString();

        int id_lapangan = 1;
        try {
            // Fetch the corresponding id from the lapangan table based on lapanganName
            id_lapangan = koneksiData.getLapanganIdByName(lapanganName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak ada booking yang tersedia. Mohon pilih booking yang akan dihapus.");
            Logger.getLogger(View_ListBookingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    View_EditPage x = new View_EditPage();
    x.TfNama.setText(namakonsumen);
    x.startHour.setText(notelepon);
    x.TfTanggal.setText(tanggal);
    x.startHour.setText(startJam);
    x.endHour.setText(endJam);
    x.notelepone.setText(notelepon);
    x.status.setSelectedItem(status);
    x.CbTipe.setSelectedItem(lapanganName); // Set the name instead of id_lapangan
    x.setIdBooking(id_booking);
    x.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_ButEditActionPerformed

    
    
    private void ButHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButHapusActionPerformed

         int selectedRow = TabelBooking.getSelectedRow();
         System.out.print(selectedRow);
         System.out.print("----------------------------------------");
         
         if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tidak ada booking yang terpilih. Mohon pilih booking yang akan diedit.");
                return;
        }
         
        String id_booking = model.getValueAt(selectedRow, 0).toString();
        String lapanganName = model.getValueAt(selectedRow, 1).toString();
        String namakonsumen = model.getValueAt(selectedRow, 2).toString();
        String notelepon = model.getValueAt(selectedRow, 3).toString();
        String tanggal = model.getValueAt(selectedRow, 4).toString();
        String startJam = model.getValueAt(selectedRow, 5).toString();
        String endJam = model.getValueAt(selectedRow, 6).toString();
        int totalHarga = Integer.parseInt(model.getValueAt(selectedRow, 7).toString());
        String status = model.getValueAt(selectedRow, 8).toString();

        int id_lapangan = 1;
        try {
            // Fetch the corresponding id from the lapangan table based on lapanganName
            id_lapangan = koneksiData.getLapanganIdByName(lapanganName);
        } catch (SQLException ex) {
            Logger.getLogger(View_ListBookingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Booking b = new Booking(id_booking, id_lapangan, namakonsumen, notelepon, tanggal, startJam, endJam, totalHarga, status);
        
        try {
                if (koneksiData.deleteDataBooking(b)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Hapus Data");
                    View_ListBookingPage booking = new View_ListBookingPage();
                    booking.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Hapus Data");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
    }//GEN-LAST:event_ButHapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new View_HistoryBooking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBookingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelBookingMouseClicked

    private void populateTable() {
        model.setRowCount(0);
    try {
        ArrayList<Booking> lihat = koneksiData.tampilHistoriBooking();
        for (Booking b : lihat) {
            Object[] isiData = {b.getId_booking(), koneksiData.getLapanganNameById(b.getId_lapangan()) ,b.getNamaKonsumen(), b.getNotelepon(), b.getTanggal(), b.getStart_jam(), b.getEnd_jam(), b.getTotalHarga(), b.getStatus()};
            model.addRow(isiData);
        }
    } catch (SQLException ex) {
        System.out.println("Eksepsi: " + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
    }
    }
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
            java.util.logging.Logger.getLogger(View_ListBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ListBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ListBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ListBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_ListBookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEdit;
    private javax.swing.JButton ButHapus;
    private javax.swing.JButton ButTambah;
    private javax.swing.JLabel LabList;
    private javax.swing.JTable TabelBooking;
    private javax.swing.JScrollPane TabelListBooking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
