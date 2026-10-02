public class Rating {
    private int stars;
    private String comment;
    private Customer customer;
    private DeliveryOrder order;

    public Rating(Customer customer, DeliveryOrder order) {
        this.customer = customer;
        this.order = order;
    }

    public boolean rate(int stars, String comment) {
        if (stars < 1 || stars > 5) {
            return false;
        }

        this.stars = stars;
        this.comment = comment;
        return true;
    }

    public int getStars() {
        return stars;
    }

    public String getComment() {
        return comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DeliveryOrder getOrder() {
        return order;
    }
}