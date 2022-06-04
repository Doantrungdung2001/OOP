package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int chose_menu;
		boolean a = true;
		ArrayList<Order> List_Order = new ArrayList<Order>();
		Order anOrder = new Order();
		int index=0,find_index_delete=0;
		String new_name;
		
        Media dvd1 = new Media();
        dvd1.setTitle("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);

        Media dvd2 = new Media();
        dvd2.setTitle("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);

        Media dvd3 = new Media();
        dvd3.setTitle("Alladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        
        anOrder.addMedia(dvd1);
        List_Order.add(anOrder);
        anOrder.addMedia(dvd2);
        List_Order.add(anOrder);
        anOrder.addMedia(dvd3);
        List_Order.add(anOrder);
        
		while(a ==true) {
			showMenu();
			chose_menu=input.nextInt();
			switch(chose_menu) {
			case 1:
				while(List_Order.size() != index)
				{
					index++;
				}
				break;
			case 2:
				System.out.println("Name :");
				new_name = input.nextLine();
				Media new_media = new Media();
				System.out.println("The Title :");
				new_media.setTitle(input.nextLine());
				System.out.println("The Category :");
				new_media.setCategory(input.nextLine());
				System.out.println("The Cost :");
				new_media.setCost(input.nextFloat());
				anOrder.addMedia(new_media);
				List_Order.add(anOrder);
				break;
			case 3:
				System.out.print("Nhap vi tri can xoa :");
				find_index_delete = input.nextInt();
				if(List_Order.size() < find_index_delete)
				{
					System.out.println("Vi tri nay khong ton tai");
				}
				for(int i=0;i<List_Order.size();i++) {
					List_Order.remove(find_index_delete);
				}
				break;
			case 4:
				for(int i=0;i<List_Order.size();i++) {
					System.out.println(List_Order.get(i));
				}
				break;
			case 0:
				System.out.println("Goodbye");
				a= false;
				break;
			}
		}
    }
	public static void showMenu() {
		System.out.println("Order Management Application");
		System.out.println("-----------------------------");
		System.out.println("1.Create new Order");
		System.out.println("2.Add item to the order");
		System.out.println("3.Delete item by id");
		System.out.println("4.Display the items list of order");
		System.out.println("0.Exit");
		System.out.println("-----------------------------");
		System.out.print("Please choose a hummer : ");
	}

}
