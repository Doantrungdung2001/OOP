import java.sql.Array;

public class Order {
    private int qtyOrdered = 0;
    private static int nbOrders = 0;

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
        // System.out.println(dvdList[qtyOrdered].getTitle());
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

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {

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
}
