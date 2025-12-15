import java.util.ArrayList;

class minAndmax {
    public static ArrayList<Integer> findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        ArrayList<Integer> res = findMinMax(arr);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}
