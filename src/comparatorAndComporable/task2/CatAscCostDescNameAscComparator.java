package comparatorAndComporable.task2;

import java.util.Comparator;

public class CatAscCostDescNameAscComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int categoryCompr = p1.getCategory().compareTo(p2.getCategory());
        if (categoryCompr != 0) {
            return categoryCompr;
        }
        int costCompr = -(p2.getCost() - p1.getCost());
        if (costCompr != 0) {
            return costCompr;
        }
        return p1.getName().compareTo(p2.getName());
    }
}
