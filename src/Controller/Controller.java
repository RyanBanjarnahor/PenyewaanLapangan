    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Booking;
import Model.Connect;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author lenovo
 */
public class Controller {
    
            
    public boolean tambahDataBooking(Booking data) throws SQLException {
    // membuka koneksi ke database
    Connection con = Connect.dbConnection();

    // membuat query untuk tambah data
    String kueri = "INSERT INTO booking(id_booking, id_lapangan, namakonsumen, notelepon, tanggal, start_jam, end_jam, totalHarga, status) VALUES (?,?,?,?,?,?,?,?,?)";

    // Menyiapkan database / memanipulasi data untuk dikirim ke database untuk dieksekusi
    PreparedStatement ps = con.prepareStatement(kueri);
    ps.setString(1, data.getId_booking());
    ps.setInt(2, data.getId_lapangan());
    ps.setString(3, data.getNamaKonsumen());
    ps.setString(4, data.getNotelepon());
    ps.setString(5, data.getTanggal());
    ps.setString(6, data.getStart_jam());
    ps.setString(7, data.getEnd_jam());
    ps.setInt(8, data.getTotalHarga());
    ps.setString(9, data.getStatus());

    // mengeksekusi query
    int rowAffected = ps.executeUpdate();

    // menutup koneksi
    ps.close();
    con.close();

    // mengembalikan nilai data untuk dirubah ke database MySQL
    return rowAffected == 1;
}
    
   public ArrayList<Booking> tampilDataBooking() throws SQLException {
    ArrayList<Booking> tampilBooking = new ArrayList<>();

    // membuka koneksi ke database
    Connection con = Connect.dbConnection();

    // membuat query untuk lihat data booking
    String kueri = "SELECT * FROM booking";
    PreparedStatement ps = con.prepareStatement(kueri);

    // mengeksekusi query
    ResultSet rs = ps.executeQuery();

    // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel bio
    while (rs.next()) {
        String id = rs.getString("id_booking");
        int idLapangan = rs.getInt("id_lapangan");
        String namakonsumen = rs.getString("namakonsumen");
        String notelepon = rs.getString("notelepon");
        String tanggal = rs.getString("tanggal");
        String start_jam = rs.getString("start_jam");
        String end_jam = rs.getString("end_jam");
        int totalHarga = rs.getInt("totalHarga");
        String status = rs.getString("status");

        Booking listdatabooking = new Booking(id, idLapangan, namakonsumen, notelepon, tanggal, start_jam, end_jam, totalHarga, status);
        tampilBooking.add(listdatabooking);
    }

    // menutup result set, preparedstatement dan koneksi
    rs.close();
    ps.close();
    con.close();

    // mengembalikan nilai
    return tampilBooking;
}

    
      public boolean editDataBooking(Booking data) throws SQLException {
    // membuka koneksi ke database
    Connection con = Connect.dbConnection();

    // membuat query untuk update data booking
    String kueri = "UPDATE booking SET namakonsumen=?, notelepon=?, tanggal=?, start_jam=?, end_jam=?, totalHarga=?, status=? WHERE id_booking=?";

    // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
    PreparedStatement ps = con.prepareStatement(kueri);
    ps.setString(1, data.getNamaKonsumen());
    ps.setString(2, data.getNotelepon());
    ps.setString(3, data.getTanggal());
    ps.setString(4, data.getStart_jam());
    ps.setString(5, data.getEnd_jam());
    ps.setInt(6, data.getTotalHarga());
    ps.setString(7, data.getStatus());
    ps.setString(8, data.getId_booking());

    // mengeksekusi query
    int rowAffected = ps.executeUpdate();

    // menutup koneksi
    ps.close();
    con.close();

    // mengembalikan nilai data untuk dirubah ke database mysql
    return rowAffected == 1;
}

        
   public boolean deleteDataBooking(Booking data) throws SQLException {
    // membuka koneksi ke database
    Connection con = Connect.dbConnection();

    // membuat query untuk delete data
    String kueri = "DELETE FROM booking WHERE id_booking = ?";

    // Menyiapkan database / memanipulasi data untuk dikirim ke database untuk dieksekusi
    PreparedStatement ps = con.prepareStatement(kueri);

    ps.setString(1, data.getId_booking());

    // mengeksekusi query
    int rowAffected = ps.executeUpdate();

    // menutup koneksi
    ps.close();
    con.close();

    // mengembalikan nilai data untuk dirubah ke database MySQL
    return rowAffected == 1;
}

        
    public boolean tambahHistoriBooking(Booking data) throws SQLException {
        int rowAffected;
        // membuat query untuk tambah data histori
        try ( // membuka koneksi ke database
                Connection con = Connect.dbConnection()) {
            // membuat query untuk tambah data histori
            String kueri = "INSERT INTO histori(namakonsumen, notelepon, tanggal, start_jam, end_date, totalHarga, status) VALUES (?,?,?,?,?,?,?)";
            // Menyiapkan database / memanipulasi data untuk dikirim ke database untuk dieksekusi
            PreparedStatement ps = con.prepareStatement(kueri);
            ps.setString(1, data.getNamaKonsumen());
            ps.setString(2, data.getNotelepon());
            ps.setString(3, data.getTanggal());
            ps.setString(4, data.getStart_jam());
            ps.setString(5, data.getEnd_jam());
            ps.setInt(6, data.getTotalHarga());
            ps.setString(7, "Dihapus");
            // mengeksekusi query
            rowAffected = ps.executeUpdate();
            // menutup koneksi
            ps.close();
        }

    // mengembalikan nilai data untuk dirubah ke database MySQL
    return rowAffected == 1;
}
    
    public ArrayList<Booking> tampilHistoriBooking() throws SQLException {
    ArrayList<Booking> tampilBooking = new ArrayList<>();

        // membuat query untuk menampilkan data histori
        try ( // membuka koneksi ke database
                Connection con = Connect.dbConnection()) {
            // membuat query untuk menampilkan data histori
            String kueri = "SELECT * FROM booking";
            PreparedStatement ps = con.prepareStatement(kueri);
            
            // mengeksekusi query
            ResultSet rs = ps.executeQuery();
            
            // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel bio
            while (rs.next()) {
               String id = rs.getString("id_booking");
        int idLapangan = rs.getInt("id_lapangan");
        String namakonsumen = rs.getString("namakonsumen");
        String notelepon = rs.getString("notelepon");
        String tanggal = rs.getString("tanggal");
        String start_jam = rs.getString("start_jam");
        String end_jam = rs.getString("end_jam");
        int totalHarga = rs.getInt("totalHarga");
        String status = rs.getString("status");
                
                Booking listdatabooking = new Booking(id, idLapangan, namakonsumen, notelepon, tanggal, start_jam, end_jam, totalHarga, status);
                tampilBooking.add(listdatabooking);
            }
            
            // menutup result set, preparedstatement dan koneksi
            rs.close();
            ps.close();
        }

    // mengembalikan nilai
    return tampilBooking;
}

    
    
     public void loadDataLapangan(JComboBox<String> comboBox) {
        try {
            Connection con = Connect.dbConnection();
            String sql = "SELECT nama FROM lapangan";
            try (PreparedStatement preparedStatement = con.prepareStatement(sql);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                Vector<String> lapanganNames = new Vector<>();

                while (resultSet.next()) {
                    String name = resultSet.getString("nama");
                    lapanganNames.add(name);
                }

                comboBox.setModel(new DefaultComboBoxModel<>(lapanganNames));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public int getLapanganIdByName(String lapanganNama) throws SQLException {
        int lapanganId = -1; // Default value if not found

        try (Connection connection = Connect.dbConnection()) {
            String sql = "SELECT id_lapangan FROM lapangan WHERE nama = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, lapanganNama);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        lapanganId = resultSet.getInt("id_lapangan");
                    }
                }
            }
        }

        return lapanganId;
    }
     
     public String getLapanganNameById(int lapanganId) throws SQLException {
    String lapanganName = null; // Default value if not found

    try (Connection connection = Connect.dbConnection()) {
        String sql = "SELECT nama FROM lapangan WHERE id_lapangan = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, lapanganId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    lapanganName = resultSet.getString("nama");
                }
            }
        }
    }

    return lapanganName;
}

}
