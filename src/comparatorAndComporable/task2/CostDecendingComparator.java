package comparatorAndComporable.task2;

import java.util.Comparator;

public class CostDecendingComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return -(p1.getCost() - p2.getCost());
    }
}
