import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] point = new int[n][2];
        for(int i = 0; i < n; i++){
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }
        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(point[i][0] + " " + point[i][1]);
        }
    }
}