import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task2_2 {
    //Task 2.2
    public static void setOfIntegers(){
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
