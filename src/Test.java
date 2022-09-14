import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        swap(list,0,1);

        System.out.println(list);
    }
    private static <E> void swap(List<E> list,int index1,int index2){
        E e = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,e);
    }

}
