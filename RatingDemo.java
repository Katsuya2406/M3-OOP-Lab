public class RatingDemo {
    public static void main(String[] args) {
        Customer ana = new Customer("Ana", "Sampaloc, Manila");
        Rider paolo = new Rider("Paolo", 2);
        DeliveryOrder order1 =
                new DeliveryOrder("Chicken Adobo", 49, ana, paolo);
 
        Rating rating = new Rating(ana, order1);
        System.out.println("Stars before rating: " + rating.getStars());
 
        boolean ok = rating.rate(0, "No stars?");
        System.out.println("rate(0): " + ok + " | stars = " + rating.getStars());
        ok = rating.rate(6, "Too good!");
        System.out.println("rate(6): " + ok + " | stars = " + rating.getStars());
        ok = rating.rate(5, "Hot and fast!");
        System.out.println("rate(5): " + ok + " | stars = " + rating.getStars());
        ok = rating.rate(1, "Cold food.");
        System.out.println("rate(1): " + ok + " | stars = " + rating.getStars());
 
        System.out.println("Rating belongs to order1: "
                + (rating.getOrder() == order1));
    }
}
