package ProductList;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final HashMap<Product, Integer> products = new HashMap<>();
    private final String name;
    private int sumPrice;

    public Recipe(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
    }

    public void addProduct(Product product, int quantity){
        if (quantity <= 0){
            quantity = 1;
        }
        if (this.products.containsKey(product)){
            this.products.put(product, this.products.get(product) + quantity);
        }else {
            this.products.put(product, quantity);
        }
    }

    public String getName() {
        return name;
    }

    public int getSumPrice() {
        sumPrice = 0;
        for (Map.Entry<Product, Integer>product : this.products.entrySet()){
            sumPrice += product.getKey().getPrice() * product.getValue();
        }
        return sumPrice;
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

    @Override
    public String toString() {
        return "Рецепт: " + products;
    }
}
