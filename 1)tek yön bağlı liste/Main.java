public class Main {
    public static void main(String[] args) {
        list tyList = new list();
        tyList.basaEkle(10);
        tyList.basaEkle(20);
        tyList.basaEkle(5);
        tyList.basaEkle(30);
        tyList.arayaEkle(2, 3);
        tyList.bastanSil();
        tyList.sondanSil();
        tyList.aradanSil(1);
        tyList.yazdir();

        System.out.println("baştaki düğümün elemanı: " + tyList.head.data);
        System.out.println("sondaki düğümün elemanı: " + tyList.tail.data);

    }
}