package insertionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static <T extends Comparable<T>> List<T> sort(List<T> elemnets) {
        List<T> copyElemnets = new ArrayList<>(elemnets);
        for (int i = 1; i <copyElemnets.size(); i++) {
            T valueCopyElemnetsOfI = copyElemnets.get(i);
            int j = i - 1;
            while (j >= 0 && valueCopyElemnetsOfI.compareTo(copyElemnets.get(j)) < 0) {
                SwapElement.swap(copyElemnets,j,j+1);
                j--;
            }
        }
        return copyElemnets;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,30,34,65,12);
        System.out.println(sort(numbers));
        List<String> strings = Arrays.asList("d","z","r","q","t");
        System.out.println(sort(strings));
    }
}
