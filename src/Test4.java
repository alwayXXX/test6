import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("eee");
        arrayList.add("fff");
        arrayList.add("ggg");

        SortAndNotRepeat(arrayList);
        for (String s:arrayList) {
            System.out.println(s);
        }
    }

    private static void SortAndNotRepeat(ArrayList<String> arrayList) {
        TreeSet<String> treeSet = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int num = s1.compareTo(s2);
                        return num == 0?1:num;

                    }
                }
        );
        treeSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(treeSet);
    }
}
