class Restaurant {
    String name;
    String foodItem;
    int price;

    Restaurant(String name, String foodItem, int price) {
        this.name = name;
        this.foodItem = foodItem;
        this.price = price;
    }

    String getOrderDetails() {
        return name + " - " + foodItem + ": Rs. " + price;
    }
}

class SwiggyApp {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Spicy Hub", "Burger", 120);
        System.out.println(r1.getOrderDetails());
    }
}
