public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,3,6,1,-5,-3,9};
        insertion(arr);
        for (int a: arr
             ) {
            System.out.println(a);
        }
    }
    public static void insertion(int[] arr){
        int j;
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
