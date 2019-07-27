import java.util.Arrays;
import java.util.Random;

public class TwoSum {
    // 必须保证所有输入整数各不相同
    // 否则计数会偏少
    public static int count_NlogN(int sum, int[] a) {
        int cnt = 0;
        Arrays.sort(a);
        for (int i=0; i<a.length; i++) {
            if (BinarySearch.rank(sum - a[i], a) > i) cnt++;
        }
        return cnt;
    }
    // 没有各不相同的限制
    // 复杂度为 O(N^2)
    public static int count(int sum, int[] a) {
        int cnt = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] == sum - a[j]) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
//            String s;
//            while ((s = br.readLine()) != null) {}
//        } catch (IOException e) {}
        int[] a = new int[1000];
        Random r = new Random();
        for (int i=0; i<a.length; i++)
            a[i] = r.nextInt(100);
        System.out.println(count(100, a));
    }
}
