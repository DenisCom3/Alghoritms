package Learning;

public class MS {
    public static int sum(int[] arr){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) x += arr[i];
        }
        return x;
    }

    public static void main(String[] args) {
        MS ms = new MS();
        System.out.println(ms.sum(new int[]{1,2,3,-4,5}));
        System.out.println(ms.sum(new int[]{5,-4,2,6}));
    }
}
