public class OrderDemo {
    public static void main(String[] args) {
       Customer ana = new Customer("Ana", "Sampaloc, Manila");
       Rider paolo = new Rider("Paolo", 2);

       DeliveryOrder order1 = new DeliveryOrder("Chicken Adobo", 100, ana, paolo);
       DeliveryOrder order2 = new DeliveryOrder("Halo-Halo", 120, ana, paolo);
       
       order1.printSummary();
       order2.printSummary();
   
       order1.getRider().assignOrder();
       System.out.println("Active orders seen through order2:" + order2.getRider().getActiveOrders());

       order2.getRider().assignOrder();
       System.out.println("Active orders seen through order1:" + order1.getRider().getActiveOrders());

       System.out.println("Same rider object: " + (order1.getRider() == order2.getRider()));

       System.out.println("Can Paolo take another order? " + paolo.canAccept());
    }
}
