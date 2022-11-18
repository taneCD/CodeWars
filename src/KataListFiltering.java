import java.util.ArrayList;
import java.util.List;
//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/solutions/java
public class KataListFiltering {
    public static void main(String[] args) {

        System.out.println(filterList(List.of(1, 2, "a", "b", 0, 15)));
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> intList = new ArrayList<>();
        for (var el : list) {
            if (el instanceof Integer) {
                intList.add(el);
            }
        }
        return intList;
    }
}