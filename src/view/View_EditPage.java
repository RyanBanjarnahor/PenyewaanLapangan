/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.Controller;
import Model.Booking;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.System.Logger;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class View_EditPage extends javax.swing.JFrame {

    private Controller koneksiData = new Controller();
    private String id_booking = "";
    
     public void setIdBooking(String id) {
        this.id_booking = id;
    }
    
 
    /**
     * Creates new form View_EditPage
     */
    public View_EditPage() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
                koneksiData.loadDataLapangan(CbTipe);

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        // Mematikan resize
        setResizable(false);
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
        LabAlamat = new javax.swing.JLabel();
        startHour = new javax.swing.JTextField();
        LabNama = new javax.swing.JLabel();
        LabTanggal = new javax.swing.JLabel();
        LabTipeStudio = new javax.swing.JLabel();
        LabJamBooking = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        TfTanggal = new javax.swing.JTextField();
        CbTipe = new javax.swing.JComboBox<>();
        LabSubJudul = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        notelepone = new javax.swing.JTextField();
        LabJamBooking1 = new javax.swing.JLabel();
        ButUpdate = new javax.swing.JButton();
        CbCancel = new javax.swing.JButton();
        LabJamBooking2 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        endHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHourActionPerformed(evt);
            }
        });
        getContentPane().add(endHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 180, 190, 30));

        LabAlamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabAlamat.setText("Jam Mulai");
        getContentPane().add(LabAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 157, -1, -1));
        getContentPane().add(startHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 179, 196, -1));

        LabNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabNama.setText("Nama Konsumen  ");
        getContentPane().add(LabNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 107, -1, -1));

        LabTanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTanggal.setText("Tanggal Booking  ");
        getContentPane().add(LabTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 107, -1, -1));

        LabTipeStudio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTipeStudio.setText("Lapangan");
        getContentPane().add(LabTipeStudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 207, -1, -1));

        LabJamBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabJamBooking.setText("Jam Berakhir  ");
        getContentPane().add(LabJamBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 161, 100, -1));
        getContentPane().add(TfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 129, 196, -1));
        getContentPane().add(TfTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 129, 190, 30));

        CbTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapangan 1", "Lapangan 2", "Lapangan 3" }));
        getContentPane().add(CbTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 229, 196, -1));

        LabSubJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabSubJudul.setText("Aplikasi Booking Penyewaan Lapangan");
        getContentPane().add(LabSubJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 541, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        notelepone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteleponeActionPerformed(evt);
            }
        });

        LabJamBooking1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabJamBooking1.setText("No Telepon");

        ButUpdate.setBackground(new java.awt.Color(0, 153, 255));
        ButUpdate.setText("Update Data");
        ButUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButUpdateActionPerformed(evt);
            }
        });

        CbCancel.setBackground(new java.awt.Color(255, 0, 0));
        CbCancel.setText("Cancel");
        CbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCancelActionPerformed(evt);
            }
        });

        LabJamBooking2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabJamBooking2.setText("Status");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Ongoing", "Done" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabJamBooking1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notelepone, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(ButUpdate)
                        .addGap(98, 98, 98)
                        .addComponent(CbCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(LabJamBooking2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(LabJamBooking1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notelepone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabJamBooking2)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButUpdate)
                    .addComponent(CbCancel))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButUpdateActionPerformed
       
        String namakonsumen = TfNama.getText();
        String notelepon = notelepone.getText();
        String tanggal = TfTanggal.getText();
        String startJam = startHour.getText();
        String endJam = endHour.getText();
        String lapangan = CbTipe.getSelectedItem().toString();
        String statusBooking = status.getSelectedItem().toString();
                
                // Retrieve id from lapangan based on the name
        int lapanganId = 1;
        try {
            lapanganId = koneksiData. getLapanganIdByName(lapangan);
        } catch (SQLException ex) {
           
        }
        
        int totalHarga = calculateTotalHarga(startJam, endJam);

        // Create Booking object
        Booking b = new Booking(id_booking, lapanganId, namakonsumen, notelepon, tanggal, startJam, endJam, totalHarga, statusBooking);

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
                if (koneksiData.editDataBooking(b)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Update Data");
                    View_ListBookingPage booking = new View_ListBookingPage();
                    booking.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Update Data");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_ButUpdateActionPerformed

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

    private void endHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endHourActionPerformed

    private void noteleponeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteleponeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteleponeActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

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
            java.util.logging.Logger.getLogger(View_EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_EditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButUpdate;
    private javax.swing.JButton CbCancel;
    public javax.swing.JComboBox<String> CbTipe;
    private javax.swing.JLabel LabAlamat;
    private javax.swing.JLabel LabJamBooking;
    private javax.swing.JLabel LabJamBooking1;
    private javax.swing.JLabel LabJamBooking2;
    private javax.swing.JLabel LabNama;
    private javax.swing.JLabel LabSubJudul;
    private javax.swing.JLabel LabTanggal;
    private javax.swing.JLabel LabTipeStudio;
    public javax.swing.JTextField TfNama;
    public javax.swing.JTextField TfTanggal;
    public javax.swing.JTextField endHour;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField notelepone;
    public javax.swing.JTextField startHour;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables


}