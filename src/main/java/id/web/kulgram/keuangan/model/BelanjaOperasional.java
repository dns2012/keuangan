package id.web.kulgram.keuangan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BelanjaOperasional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int no;
    private String namaKegiatan;
    private int kuantitas;
    private String frekuensi;
    private int jumlah;
    private int hargaSatuan;
    private int jumlahTotal;
    private String sebaranBulan;

    public BelanjaOperasional() {}

    public BelanjaOperasional(Long id, int no, String namaKegiatan, int kuantitas, String frekuensi, int jumlah, int hargaSatuan, int jumlahTotal, String sebaranBulan) {
        this.id = id;
        this.no = no;
        this.namaKegiatan = namaKegiatan;
        this.kuantitas = kuantitas;
        this.frekuensi = frekuensi;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.jumlahTotal = jumlahTotal;
        this.sebaranBulan = sebaranBulan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getFrekuensi() {
        return frekuensi;
    }

    public void setFrekuensi(String frekuensi) {
        this.frekuensi = frekuensi;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getJumlahTotal() {
        return jumlahTotal;
    }

    public void setJumlahTotal(int jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }

    public String getSebaranBulan() {
        return sebaranBulan;
    }

    public void setSebaranBulan(String sebaranBulan) {
        this.sebaranBulan = sebaranBulan;
    }
}
