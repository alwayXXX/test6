import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        System.out.println(frequency(list, "a"));
        System.out.println(frequency(list, "b"));
        System.out.println(frequency(list, "c"));
        System.out.println(frequency(list, "d"));
        System.out.println(frequency(list, "xxx"));
    }

    private static int frequency(List<String> list, String a) {
        int m=0;
        for(int i=0;i<list.size();i++) {
            if(a.equals(list.get(i))) {
                m++;
            }
        }
        return m;
    }
}
