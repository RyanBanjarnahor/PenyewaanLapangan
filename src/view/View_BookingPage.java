package view;

import Controller.Controller;
import Model.Booking;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author lenovo
 */
public class View_BookingPage extends javax.swing.JFrame {

    Controller koneksiData = new Controller();

    /**
     * Creates new form View_MenuPage
     */
    public View_BookingPage() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        
        koneksiData.loadDataLapangan(CbTipe);
        

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        // Mematikan resize
        setResizable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endHour = new javax.swing.JTextField();
        CbCancel = new javax.swing.JButton();
        LabJudul = new javax.swing.JLabel();
        LabSubJudul = new javax.swing.JLabel();
        LabNama = new javax.swing.JLabel();
        LabTanggal = new javax.swing.JLabel();
        LabTipe = new javax.swing.JLabel();
        LabBooking = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        ButTambahData = new javax.swing.JButton();
        CbTipe = new javax.swing.JComboBox<>();
        TfTanggal2 = new javax.swing.JTextField();
        LabAlamat = new javax.swing.JLabel();
        startHour = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        notelepone = new javax.swing.JTextField();
        LabBooking2 = new javax.swing.JLabel();
        TfTanggal1 = new javax.swing.JTextField();
        startHour1 = new javax.swing.JTextField();
        LabAlamat1 = new javax.swing.JLabel();
        LabBooking1 = new javax.swing.JLabel();
        LabTanggal1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(541, 451));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(endHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 197, 196, -1));

        CbCancel.setBackground(new java.awt.Color(255, 0, 0));
        CbCancel.setText("Cancel");
        CbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCancelActionPerformed(evt);
            }
        });
        getContentPane().add(CbCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        LabJudul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabJudul.setText("PENYEWAAN LAPANGAN");
        getContentPane().add(LabJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 541, -1));

        LabSubJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabSubJudul.setText("Aplikasi Booking Penyewaan Lapangan");
        getContentPane().add(LabSubJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 541, -1));

        LabNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabNama.setText("Nama Konsumen   ");
        getContentPane().add(LabNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 125, -1, -1));

        LabTanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTanggal.setText("Tanggal Booking  ");
        getContentPane().add(LabTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 125, -1, -1));

        LabTipe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTipe.setText("Lapangan");
        getContentPane().add(LabTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 225, -1, -1));

        LabBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabBooking.setText("Jam Akhir");
        getContentPane().add(LabBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 175, -1, -1));
        getContentPane().add(TfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 147, 196, -1));

        ButTambahData.setBackground(new java.awt.Color(0, 153, 255));
        ButTambahData.setText("Tambah Data");
        ButTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTambahDataActionPerformed(evt);
            }
        });
        getContentPane().add(ButTambahData, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        CbTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapangan 1", "Lapangan 2", "Lapangan 3" }));
        getContentPane().add(CbTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 247, 196, -1));
        getContentPane().add(TfTanggal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 147, 196, -1));

        LabAlamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabAlamat.setText("Jam Awal");
        getContentPane().add(LabAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 175, -1, -1));
        getContentPane().add(startHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 197, 196, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        LabBooking2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabBooking2.setText("No Telepone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabBooking2)
                    .addComponent(notelepone, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(LabBooking2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notelepone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));
        getContentPane().add(TfTanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 147, 196, -1));
        getContentPane().add(startHour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 197, 196, -1));

        LabAlamat1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabAlamat1.setText("Jam Awal");
        getContentPane().add(LabAlamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 175, -1, -1));

        LabBooking1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabBooking1.setText("Jam Akhir");
        getContentPane().add(LabBooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 175, -1, -1));

        LabTanggal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTanggal1.setText("Tanggal Booking  ");
        getContentPane().add(LabTanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 125, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ButTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTambahDataActionPerformed
        String id_booking = "PL" + UUID.randomUUID().toString();
        String namakonsumen = TfNama.getText();
        String notelepon = notelepone.getText();
        String tanggal = TfTanggal2.getText();
        String startJam = startHour.getText() + ":00:00";
        String endJam = endHour.getText() + ":00:00" ;
        String lapangan = CbTipe.getSelectedItem().toString();
                
                // Retrieve id from lapangan based on the name
        int lapanganId = 1;
        try {
            lapanganId = koneksiData. getLapanganIdByName(lapangan);
        } catch (SQLException ex) {
            Logger.getLogger(View_BookingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int totalHarga = calculateTotalHarga(startJam, endJam);

        // Create Booking object
        Booking b = new Booking(id_booking, lapanganId, namakonsumen, notelepon, tanggal, startJam, endJam, totalHarga, "Pending");

        if (namakonsumen.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan Nama Konsumen!");
        } else if (notelepon.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan No Telepon!");
        } else if (tanggal.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Booking!");
        } else if (startHour.equals("") || startHour.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Pilih Jam Start Bookingnya!");
        } else if (endHour.equals("") || endHour.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Pilih Jam End Bookingnya!");
        }  else if (lapangan.equals("") || lapangan.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Pilih Lapangan!");
        } else {
            try {
                if (koneksiData.tambahDataBooking(b)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Tambah Data");
                    View_ListBookingPage booking = new View_ListBookingPage();
                    booking.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Tambah Data");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_ButTambahDataActionPerformed

   private int calculateTotalHarga(String startJam, String endJam) {
    try {
        // Parse start and end time strings to Date objects
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date startTime = format.parse(startJam);
        Date endTime = format.parse(endJam);

        // Calculate time difference in hours
        long timeDifferenceMillis = endTime.getTime() - startTime.getTime();
        double timeDifferenceHours = timeDifferenceMillis / (1000.0 * 60.0 * 60.0);

        // Calculate totalHarga as an integer
        return (int) (timeDifferenceHours * 10000);
    } catch (ParseException e) {
        e.printStackTrace();
        return 0; // Handle parsing error, return default value
    }
}
    
    private void CbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCancelActionPerformed
        this.setVisible(false);
        new View_ListBookingPage().setVisible(true);
    }//GEN-LAST:event_CbCancelActionPerformed

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
            java.util.logging.Logger.getLogger(View_BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_BookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButTambahData;
    private javax.swing.JButton CbCancel;
    public javax.swing.JComboBox<String> CbTipe;
    private javax.swing.JLabel LabAlamat;
    private javax.swing.JLabel LabAlamat1;
    private javax.swing.JLabel LabBooking;
    private javax.swing.JLabel LabBooking1;
    private javax.swing.JLabel LabBooking2;
    private javax.swing.JLabel LabJudul;
    private javax.swing.JLabel LabNama;
    private javax.swing.JLabel LabSubJudul;
    private javax.swing.JLabel LabTanggal;
    private javax.swing.JLabel LabTanggal1;
    private javax.swing.JLabel LabTipe;
    public javax.swing.JTextField TfNama;
    public javax.swing.JTextField TfTanggal1;
    public javax.swing.JTextField TfTanggal2;
    public javax.swing.JTextField endHour;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField notelepone;
    public javax.swing.JTextField startHour;
    public javax.swing.JTextField startHour1;
    // End of variables declaration//GEN-END:variables
}
