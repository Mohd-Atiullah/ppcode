package max;

public class SecondArray {
public static void main(String[] args) {
	int[] arr = {5, 10, 2, 8, 7};
    int result = second(arr);
    System.out.println("Second largest element: " + result);
}
public static int second(int arr[]) {
    int largest = arr[0];
    int secondLargest = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}
}
