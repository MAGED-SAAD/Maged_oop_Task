

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class MenuItem {
 String name;
 String type;
 double price;

 public MenuItem(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

 class CoffeeShop {
    String name;
    List<MenuItem> menu;
    List<String> orders;

    public CoffeeShop(String name, List<MenuItem> menu) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    public String addOrder(String itemName) {
        for (MenuItem item : menu) {
            if (item.name.equals(itemName)) {
                orders.add(itemName);
                return "Order added!";
            }
        }
        return "This item is currently unavailable!";
    }

    public String fulfillOrder() {
        if (!orders.isEmpty()) {
            String fulfilledOrder = orders.get(0);
            orders.remove(0);
            return "The "+fulfilledOrder+" is ready!";
        }
        return "All orders have been fulfilled!";
    }

    public List<String> listOrders() {
        return orders;
    }

    public double dueAmount() {
     double total = 0;
        for (String order : orders) {
            for (MenuItem item : menu) {
                if (item.name.equals(order)) {
                    total += item.price;
                    break;
                }
            }
        }
        return total;
    }

    public String cheapestItem() {
     MenuItem cheapest = menu.get(0);
        for (MenuItem item : menu) {
            if (item.price < cheapest.price) {
                cheapest = item;
            }
        }
        return cheapest.name;
    }

    public List<String> drinksOnly() {
     List<String> drinks = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.type.equals("drink")) {
                drinks.add(item.name);
            }
        }
        return drinks;
    }

    public List<String> foodOnly() {
        List<String> food = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.type.equals("food")) {
                food.add(item.name);
            }
        }
        return food;
    }
}






public class Main
{
	
public static void main(String[] args) {
    List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("ornge juice", "drink", 10.5),
            new MenuItem("lemonad", "drink", 10.0),
            new MenuItem("berry juice", "drink", 10.5),
            new MenuItem("pineapple juice", "drink", 10.5),
            new MenuItem("tuna sandwich", "food", 30.0),
            new MenuItem("cheese sandwich", "food", 40.0),
            new MenuItem("egg", "food", 30.5),
            new MenuItem("cinnamon roll", "food", 10.0),
            new MenuItem("iced coffee", "drink", 10.17)
    );

    CoffeeShop Maged_Coffeshop = new CoffeeShop("Tesha's Coffee Shop", menuItems);

    System.out.println(Maged_Coffeshop.addOrder("hot cocoa"));
    System.out.println(Maged_Coffeshop.addOrder("iced tea")); 
    System.out.println(Maged_Coffeshop.addOrder("cinnamon roll")); 
    System.out.println(Maged_Coffeshop.addOrder("iced coffee")); 
    System.out.println(Maged_Coffeshop.listOrders()); 
    System.out.println(Maged_Coffeshop.dueAmount()); 
    System.out.println(Maged_Coffeshop.fulfillOrder()); 
    System.out.println(Maged_Coffeshop.fulfillOrder());
    System.out.println(Maged_Coffeshop.fulfillOrder()); 
    System.out.println(Maged_Coffeshop.listOrders()); 
    System.out.println(Maged_Coffeshop.dueAmount()); 
    System.out.println(Maged_Coffeshop.cheapestItem()); 
    System.out.println(Maged_Coffeshop.drinksOnly()); 
    System.out.println(Maged_Coffeshop.foodOnly()); 
}
}
