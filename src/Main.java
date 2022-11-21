import ProductList.ProductList;
import ProductList.Product;
import ProductList.Recipe;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("Банан", 110, 2.2);
        Product potato = new Product("Картофель", 35, 4.3);
        Product onion = new Product("Лук", 20, 5);
        Product mushrooms = new Product("Грибы", 130, 1.7);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(onion);
        productList.addProduct(mushrooms);
        productList.addProduct(potato);
        System.out.println(productList);
        productList.removeProduct("Лук");
        productList.checkProduct("Грибы");
        System.out.println(productList);

        Recipe recipe = new Recipe("Recipe1");
        recipe.addProduct(onion,1);
        recipe.addProduct(potato, 2);
        System.out.println(recipe);
        System.out.println(recipe.getSumPrice());
        System.out.println();
        Task2_2.setOfIntegers();

    }

}