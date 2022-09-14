import java.util.HashSet;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet =new HashSet<Integer>();
        while (hashSet.size()<10){
            hashSet.add(random.nextInt(20)+1);
        }
        System.out.println(hashSet);
    }
}
