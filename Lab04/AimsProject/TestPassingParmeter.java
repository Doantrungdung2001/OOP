
public class TestPassingParmeter {
    public static void main(String[] args) {
        // Todo Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title : " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title :" + cinderellaDVD.getTitle());

        // changTitle(jungleDVD, cinderellaDVD.getTitle());
        // System.out.println("jungle dvd title : " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(o1.getTitle());
        o1.setTitle(o2.getTitle());
        o2.setTitle(tmp.getTitle());

        o1.setCategory(o2.getCategory());
        o2.setCategory(o1.getCategory());

        o1.setCost(o2.getCost());
        o2.setCost(o1.getCost());

        o1.setDirector(o2.getDirector());
        o2.setDirector(o1.getDirector());

        o1.setLength(o2.getLength());
        o2.setLength(o1.getLength());
    }

    public static void changTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
