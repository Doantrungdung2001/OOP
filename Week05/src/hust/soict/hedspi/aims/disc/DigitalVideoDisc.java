package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    public boolean search_title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private int length;
    private float cost;

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public boolean search(String title) {
        return search_title;
    }
}
