public class Rider {
    private String name;
    private int maxActiveOrders;
    private int activeOrders;

    public Rider(String name, int maxActiveOrders) {
        this.name = name;
        this.maxActiveOrders = maxActiveOrders;
        this.activeOrders = 0;
    }

    public String getName() {
        return name;
    }

    public int getActiveOrders() {
        return activeOrders;
    }

    public boolean canAccept() {
        return activeOrders < maxActiveOrders;
    }

    public boolean assignOrder() {
        if (canAccept()) {
            activeOrders++;
            return true;
        }
        return false;
    }

    public boolean completeOrder() {
        if (activeOrders == 0) {
            return false;
        }
        activeOrders--;
        return true;
    }
}