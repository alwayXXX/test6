import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("f");
        list.add("e");
        list.add("c");
        list.add("a");
        list.add("d");
        sort(list);
        System.out.println(list);
    }

    private static void sort(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                char c=list.get(j).charAt(0);
                char c2=list.get(j+1).charAt(0);
                if(c>c2) {
                    char temp=c;
                    list.set(j, c2+"");
                    list.set(j+1, temp+"");
                }
            }
        }
    }
}
