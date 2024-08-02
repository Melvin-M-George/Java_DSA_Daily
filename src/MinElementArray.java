public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {10,2,50,40,30,5};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
