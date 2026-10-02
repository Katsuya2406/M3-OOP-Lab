public class RiderDemo {
    public static void main(String[] args) {
        Rider rider = new Rider("Paolo", 2);
        System.out.println("Rider: " + rider.getName());

        System.out.println("canAccept(): " + rider.canAccept() + " | active = " + rider.getActiveOrders());
        System.out.println("assignOrder(): " + rider.assignOrder() + " | active = " + rider.getActiveOrders());
        System.out.println("assignOrder(): " + rider.assignOrder() + " | active = " + rider.getActiveOrders());
        System.out.println("canAccept(): " + rider.canAccept() + " | active = " + rider.getActiveOrders());
        System.out.println("assignOrder(): " + rider.assignOrder() + " | active = " + rider.getActiveOrders());
        System.out.println("completeOrder(): " + rider.completeOrder() + " | active = " + rider.getActiveOrders());
        System.out.println("completeOrder(): " + rider.completeOrder() + " | active = " + rider.getActiveOrders());
        System.out.println("completeOrder(): " + rider.completeOrder() + " | active = " + rider.getActiveOrders());
    }
}