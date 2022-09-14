import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        TreeSet<Integer> ts = new TreeSet<>(
                new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        while (true) {
            String line = sc.nextLine();
            if (line.equals("quit")) {
                break;
            }
            Integer i = Integer.parseInt(line);
            ts.add(i);
        }
        for (Integer integer : ts) {
            System.out.print(integer + " ");
        }
    }
}
