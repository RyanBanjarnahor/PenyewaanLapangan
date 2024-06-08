/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lenovo
 */
public class Booking {
        int id_lapangan, totalHarga;
        String id_booking, namaKonsumen, notelepon, tanggal, start_jam, end_jam, status;

    public Booking(String id_booking, int id_lapangan, String namaKonsumen, String notelepon, String tanggal, String start_jam, String end_jam, int totalHarga, String status) {
        this.id_booking = id_booking;
        this.id_lapangan = id_lapangan;
        this.namaKonsumen = namaKonsumen;
        this.notelepon = notelepon;
        this.tanggal = tanggal;
        this.start_jam = start_jam;
        this.end_jam = end_jam;
        this.totalHarga = totalHarga;
        this.status = status;
    }

    public String getId_booking() {
        return id_booking;
    }

    public int getId_lapangan() {
        return id_lapangan;
    }

    public String getNamaKonsumen() {
        return namaKonsumen;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getStart_jam() {
        return start_jam;
    }

    public String getEnd_jam() {
        return end_jam;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public String getStatus() {
        return status;
    }
        
        
                
                
                        
}
