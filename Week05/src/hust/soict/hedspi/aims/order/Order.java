package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Order {
    private int qtyOrdered = 0;
    private String title;
    public boolean search_title;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public static final int MAX_NUMBERS_ORDERS = 10;
    public static final int MAX_LIMITED_ORDERS = 5;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int dem = 0;
        while (qtyOrdered < MAX_NUMBERS_ORDERS && dem + 1 < dvdList.length) {
            DigitalVideoDisc disc = new DigitalVideoDisc(dvdList[dem].getTitle());
            disc.setCost(dvdList[dem].getCost());
            disc.setCategory(dvdList[dem].getCategory());
            disc.setDirector(dvdList[dem].getDirector());
            disc.setLength(dvdList[dem].getLength());
            itemsOrdered[qtyOrdered] = disc;
            dem++;
            qtyOrdered++;
        }
        if (qtyOrdered + dem > MAX_NUMBERS_ORDERS) {
            System.out.println("Khong the them vao don hang !!!");
        }

    }

    public float totalCost() {
        float cost = 0;
        for (int a = 0; a < qtyOrdered; a++) {
            cost += itemsOrdered[a].getCost();
        }
        return cost;
    }

    public void remoteDigitalVideoDisc() {
        for (int a = 0; a < qtyOrdered; a++) {
            itemsOrdered[a] = null;
        }
    }

    public boolean search(String title) {
        int xacnhan = 0;
        for (int a = 0; a < qtyOrdered; a++) {
            String temp = new String(itemsOrdered[a].getTitle());
            temp = temp.toLowerCase();
            title = title.toLowerCase();
            if (temp.contains(title)) {
                System.out.println(itemsOrdered[a].getTitle());
                xacnhan = 1;
            }
        }
        if (xacnhan == 0) {
            System.out.println("Khong tim thay title !!!");
        }
        return this.search_title;
    }

    public DigitalVideoDisc getALuckyItem() {
        int x = (int) (Math.random() * qtyOrdered + 0);
        System.out.println("Nguoi may man la : ");
        System.out.print(itemsOrdered[x].getTitle());
        return null;
    }
}
