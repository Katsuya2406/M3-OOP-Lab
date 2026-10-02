public class DeliveryOrder {
   private String item;
   private int fee;
   private Customer customer;
   private Rider rider;

   public DeliveryOrder(String item, int fee, Customer customer, Rider rider) {
       this.item = item;
       this.fee = fee;
       this.customer = customer;
       this.rider = rider;
   }

   public Rider getRider() {
       return rider;
   }

   public void printSummary(){
    System.out.println(item + " for " + customer.getName() + ", delivered by " + rider.getName() + " (fee: " + fee + " pesos)");
   }


    

}
