package hust.soict.hedspi.aims.order;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class Order {
	
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();    
    
    public void addMedia(Media object) {
    	itemsOrdered.add(object);
    }
    public void removeMedia(Media object) {
    	itemsOrdered.remove(object);
    }
    
    public float totalCost() {
       float cost = 0;
       int i=0;
       for(i=0;i<itemsOrdered.size();i++) {
    	   cost += itemsOrdered.get(i).getCost();
       }
       return cost;
    }
    
    public void in() {
    	int i=0;
        for(i=0;i<itemsOrdered.size();i++) {
     	   System.out.println(itemsOrdered.get(i).getCost());
        }
    }
}
