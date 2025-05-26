package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 20, 12, 20, 8};
        System.out.println("Second largest is " + secondLargest(arr));
    }

    public static int secondLargest(int[] array) {
        int secondLargest = -1;
        int largest = 0;
        for(int i=1; i<array.length; i++){
            if (array[i] > array[largest]) {
                secondLargest = largest;
                largest = i;
            } else if(array[i]!= array[largest] && array[i]>array[secondLargest]){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
