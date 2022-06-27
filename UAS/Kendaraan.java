package UAS;
//ZAHRA ANNISA WAHONO
//2141720016
public class Kendaraan{
    int TNKB, tahun, bulanHbayar, cc;
    String nama, jenis;

    public Kendaraan(int TNKB,String nama, String jenis, int tahun, int bulanHbayar, int cc){
        this.TNKB = TNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.tahun = tahun;
        this.bulanHbayar = bulanHbayar;
        this.cc= cc;
    }

    public Kendaraan(){
        
    }
}