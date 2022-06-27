package UAS;

//ZAHRA ANNISA WAHONO
//2141720016
public class SingleLinkedList {
    Node head;
    Node tail;
    int kode = 000;

    public boolean isEmpty() {
        return head == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Transaksi Pajak\t");
            while (tmp != null){
                System.out.println("Kode \t TNKB \t Nama \t Jenis \t Tahun \t CC \t Nominal \t Denda");
                System.out.println(tmp.p.kode + "\t" + tmp.k.TNKB + "\t"+ tmp.k.nama + "\t"+ tmp.k.jenis + "\t" +tmp.k.tahun+ "\t"+tmp.k.cc+ "\t" + tmp.p.nominal + "\t" +tmp.p.denda);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Lingked list kosong");
        }
    }
    
    
    
    public void addPajak(int TNKB, int bulanBayar){
        if(!isEmpty()){
            Node tmp = head;
            do{
                if(tmp.k.TNKB == TNKB){
                    
                    tmp.p.bulanBayar = bulanBayar;

                    if (tmp.k.jenis == "Roda 2"){
                        if(tmp.k.cc < 100){
                            tmp.p.nominal = 100000;
                        }else if(tmp.k.cc < 250 && tmp.k.cc > 100 || tmp.k.cc == 100 || tmp.k.cc == 250 ){
                            tmp.p.nominal = 250000;
                        }else if(tmp.k.cc <250){
                            tmp.p.nominal = 500000;
                        }
                    } else if (tmp.k.jenis == "Roda 4"){
                            if(tmp.k.cc < 1000){
                                tmp.p.nominal = 750000;
            
                            }else if(tmp.k.cc < 2500 && tmp.k.cc > 1000 || tmp.k.cc == 1000 || tmp.k.cc == 2500 ){
                                tmp.p.nominal = 1000000;
                            }else if(tmp.k.cc>2500){
                                tmp.p.nominal = 1500000;
                            }
                    }
            
                    if(bulanBayar > tmp.k.bulanHbayar){
                        if(bulanBayar - tmp.k.bulanHbayar < 3 || bulanBayar - tmp.k.bulanHbayar == 3){
                            tmp.p.denda = 50000;
                        }else if (bulanBayar - tmp.k.bulanHbayar > 3){
                            tmp.p.denda = bulanBayar - tmp.k.bulanHbayar *50000;
                        }
                    }
                    System.out.println("Kode \t TNKB \t Nama \t Jenis \t Tahun \t CC \t Nominal \t Denda");
                    System.out.println(tmp.p.kode + "\t" + tmp.k.TNKB + "\t"+ tmp.k.nama + "\t"+ tmp.k.jenis + "\t" +tmp.k.tahun+ "\t"+tmp.k.cc+ "\t" + tmp.p.nominal + "\t" +tmp.p.denda);
                    kode++;
                    break;
                }
                tmp = tmp.next;
            }while(tmp != null);
            
        } else {
            System.out.println("Belum ada data kendaraan. Isikan data kendaraan terlebih dahulu!");
        }
    }
    public void addKendaran(int TNKB,String nama, String jenis, int tahun, int bulanHbayar, int cc, Node berikutnya){
        
        Node ndInput = new Node(new Pajak(), new Kendaraan(TNKB, nama, jenis, tahun, bulanHbayar, cc), berikutnya);
        if(isEmpty()){
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
}
