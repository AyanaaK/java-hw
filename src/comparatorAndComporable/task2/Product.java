package comparatorAndComporable.task2;

public class Product {
    private String category;
    private String name;
    private int cost;

    public Product(String category, String name, int cost) {
        this.category = category;
        this.name = name;
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
