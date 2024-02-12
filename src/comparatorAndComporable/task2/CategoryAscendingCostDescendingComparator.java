package comparatorAndComporable.task2;

import java.util.Comparator;

public class CategoryAscendingCostDescendingComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int categoryCompr = p1.getCategory().compareTo(p2.getCategory());
        if (categoryCompr != 0) {
            return categoryCompr;
        }
        return -(p1.getCost() - p2.getCost());
    }
}
