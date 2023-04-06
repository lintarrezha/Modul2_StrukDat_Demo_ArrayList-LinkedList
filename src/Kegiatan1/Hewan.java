package Kegiatan1;

import java.util.ArrayList;
import java.util.Collections; //mengumpulkan kelas objek

public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> listHewan = new ArrayList<>(); //libray
//1
        System.out.println();
        listHewan.add("Angsa");
        listHewan.add("Bebek");
        listHewan.add("Cicak");
        listHewan.add("Domba");
        listHewan.add("Elang");
        listHewan.add("Gajah");
        System.out.println(listHewan);

//2
        listHewan.add("Badak"); // Menambakhan badak and bebek
        listHewan.add("Bebek");
        System.out.println();
        System.out.println(listHewan);
        int totalBebek = Collections.frequency(listHewan, "Bebek"); //menghitung berapa banyak bebek
        System.out.println("Total Bebek : " + totalBebek);
        System.out.print("Index of Bebek: "); // index of bebek
        System.out.print("| ");
        for (int i = 0; i < listHewan.size(); i++) {
            if (listHewan.get(i) == "Bebek") {
                System.out.print(i);
            }
            System.out.print(" | ");
        }

//3
        System.out.println("\n");
        listHewan.remove(1); // hapus bebek pertama pada index ke 1
        System.out.println(listHewan);

//4
        System.out.println("Index 0: " + listHewan.get(0)); // menampilkan element index 0 & 2
        System.out.println("Index 2: " + listHewan.get(2));
        listHewan.remove(0); // hapus index 0
        System.out.println(listHewan);
        System.out.println();

//5
        listHewan.set(0, "Ular"); // cicak diganti oleh ular
        System.out.println(listHewan);
        listHewan.add(2, "Itik");
        System.out.println(listHewan);
        System.out.println();

//6
        listHewan.remove("Itik");    // index 2
        listHewan.remove("Elang");   // index 3
        listHewan.remove("Gajah");   // index 4
        System.out.println(listHewan);

//7
        System.out.println("Element Pertama  : " + listHewan.get(0));
        System.out.println("Element Terakhir : " + listHewan.get(listHewan.size() - 1));

//8
        System.out.println("Size of List \t: " + listHewan.size());

//9
        System.out.println("Index of Badak \t: " + listHewan.indexOf("Badak"));
    }
}
