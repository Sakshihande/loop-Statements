package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class RemoveDublicationArrayExample {

    public static void main(String[] args) 
    {
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
         
        System.out.println(numbersList);
 
        List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
         
        System.out.println(listWithoutDuplicates);
    }
}
