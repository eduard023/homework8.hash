import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args){
        List<Pair> pairs = new ArrayList<>();
        for (int first = 2; first < 10 ; first++) {
            for (int second = first; second < 10 ; second++) {
                pairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(pairs);
        List<Pair> chosenPairs = pairs.subList(0, 15);
        System.out.println(chosenPairs);
    }
}




         class Pair{

            private int first;
            private int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return first == pair.first && second == pair.second;
            }

            @Override
            public int hashCode() {
                return Objects.hash(first, second);
            }

            @Override
            public String toString() {
                return first + "*" + second + "= ?";
            }
}
