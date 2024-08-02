

public class Max_element_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,77,8,9,10};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
