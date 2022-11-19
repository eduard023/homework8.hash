import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
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

        Recipe recipe = new Recipe(Set.of(onion,potato), "Recipe1");
        System.out.println(recipe.getProducts());
        System.out.println(recipe.getSumPrice());
        System.out.println();
        setOfIntegers();

    }



    //Task 2.2
    private static void setOfIntegers(){
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(1000));
        }
//        System.out.println(numbers);

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if (number % 2 != 0){
                numberIterator.remove();
            }
        }
        System.out.println(numbers);


    }

}