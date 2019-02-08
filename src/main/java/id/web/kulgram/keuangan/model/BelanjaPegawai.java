package id.web.kulgram.keuangan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BelanjaPegawai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomor;
    private String nama;
    private String niy;
    private String jabatan;
    private String instansi;
    private String sik;
    private String ijazah;
    private String masaKerja;
    private String golongan;
    private int gajiPokok;
    private String fungsional;
    private String struktural;
    private int insentifMengajar;
    private int insentifKaryawan;
    private String walas;
    private String tutorial;
    private String bpjs;
    private int totalGaji;

    public BelanjaPegawai() {}

    public BelanjaPegawai(Long id, String nomor, String nama, String niy, String jabatan, String instansi, String sik, String ijazah, String masaKerja, String golongan, int gajiPokok, String fungsional, String struktural, int insentifMengajar, int insentifKaryawan, String walas, String tutorial, String bpjs, int totalGaji) {
        this.id = id;
        this.nomor = nomor;
        this.nama = nama;
        this.niy = niy;
        this.jabatan = jabatan;
        this.instansi = instansi;
        this.sik = sik;
        this.ijazah = ijazah;
        this.masaKerja = masaKerja;
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
        this.fungsional = fungsional;
        this.struktural = struktural;
        this.insentifMengajar = insentifMengajar;
        this.insentifKaryawan = insentifKaryawan;
        this.walas = walas;
        this.tutorial = tutorial;
        this.bpjs = bpjs;
        this.totalGaji = totalGaji;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNiy() {
        return niy;
    }

    public void setNiy(String niy) {
        this.niy = niy;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public String getSik() {
        return sik;
    }

    public void setSik(String sik) {
        this.sik = sik;
    }

    public String getIjazah() {
        return ijazah;
    }

    public void setIjazah(String ijazah) {
        this.ijazah = ijazah;
    }

    public String getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(String masaKerja) {
        this.masaKerja = masaKerja;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getFungsional() {
        return fungsional;
    }

    public void setFungsional(String fungsional) {
        this.fungsional = fungsional;
    }

    public String getStruktural() {
        return struktural;
    }

    public void setStruktural(String struktural) {
        this.struktural = struktural;
    }

    public int getInsentifMengajar() {
        return insentifMengajar;
    }

    public void setInsentifMengajar(int insentifMengajar) {
        this.insentifMengajar = insentifMengajar;
    }

    public int getInsentifKaryawan() {
        return insentifKaryawan;
    }

    public void setInsentifKaryawan(int insentifKaryawan) {
        this.insentifKaryawan = insentifKaryawan;
    }

    public String getWalas() {
        return walas;
    }

    public void setWalas(String walas) {
        this.walas = walas;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public String getBpjs() {
        return bpjs;
    }

    public void setBpjs(String bpjs) {
        this.bpjs = bpjs;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
}
