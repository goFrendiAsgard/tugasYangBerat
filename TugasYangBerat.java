class Orang {
    public String name;
    public Orang next;
}

public class TugasYangBerat {
    static Orang terdepan;
    public static void main(String[] args) {
        addFirst("Bima");
        addFirst("Bimo");
        removeFirst();
        addFirst("Ana");
        removeLast();
        addLast("Chika");
        show(); // Ana Chika
    }

    public static void show() {
        Orang orang = terdepan;
        while(orang != null) {
            System.out.print(orang.name + " ");
            orang = orang.next;
        }
        System.out.println();
    }

    public static void addFirst(String nama) {
        Orang orangBaru = new Orang();
        orangBaru.name = nama;
        orangBaru.next = terdepan;
        terdepan = orangBaru;
    }

    public static void removeFirst() {
        if (terdepan != null) {
            terdepan = terdepan.next;
        }
    }

    public static void addLast(String nama) {
        Orang orangBaru = new Orang();
        orangBaru.name = nama;
        if (terdepan == null) {
            terdepan = orangBaru;
        } else {
            Orang orang = terdepan;
            while (orang.next != null) {
                orang = orang.next;
            }
            orang.next = orangBaru;
        }
    }

    public static void removeLast() {
        if (terdepan != null) {
            if (terdepan.next == null) {
                terdepan = null;
            } else {
                Orang orang = terdepan;
                while (orang.next.next != null) {
                    orang = orang.next;
                }
                orang.next = null;
            }
        }
    }

}