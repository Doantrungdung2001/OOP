
public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc[] A = new DigitalVideoDisc[4];
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        // add the dvd to the order

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        // add the dvd to the order

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        // add the dvd to the order

        A[0] = dvd1;
        A[1] = dvd2;
        A[2] = dvd3;
        // anOrder.in();
        anOrder.addDigitalVideoDisc(A);
        System.out.println("The Cost is : " + anOrder.totalCost());
        // System.out.println(A[0].getTitle());

    }

}
