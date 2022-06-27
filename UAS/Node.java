package UAS;
//ZAHRA ANNISA WAHONO
//2141720016
public class Node {
    Pajak p;
    Kendaraan k;
    Node next;

    public Node(Pajak pjk, Kendaraan ken, Node berikutnya){
        this.p = pjk;
        this.k = ken;
        this.next = berikutnya;

    }

    public Node(){

    }
    
}
