import java.util.Scanner;

import UAS.SingleLinkedList;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        System.out.println("ZAHRA ANNISA WAHONO");
        System.out.println("2141720016");
        System.out.println();

        SingleLinkedList ll = new SingleLinkedList();

        ll.addKendaran(234567, "Vario", "Roda 2", 2013, 5, 250, null);

        ll.addKendaran(567890, "Avanza", "Roda 3", 2010, 5, 1000, null);

        ll.addPajak(567890, 4);

        ll.addPajak(234567, 7);

        System.out.println();
    }
}
