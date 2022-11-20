package ProductList;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<Product>  products;
    private final String name;
    private int sumPrice;

    public Recipe(Set<Product> products, String name) {
        if (name == null || name.isBlank() ||
        products == null || products.size() == 0){
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.products = products;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSumPrice() {
        sumPrice = 0;
        for(Product product : products){
            sumPrice += product.getPrice();
        }
        return sumPrice;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
