// Write a Java program to sort an array of integers in ascending order using the Selection Sort algorithm. 
//After each pass, print the array to show how the smallest element is selected and swapped.

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 3, 1};

        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
       
            int minIndex = i;

         
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

           
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;                                              
            System.out.println("After pass " + (i + 1) + ":");
            printArray(arr);
        }
    }
   
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//output
//Original array:
//6 5 2 3 1
//After pass 1:
//1 5 2 3 6
//After pass 2:
//1 2 5 3 6
//After pass 3:
//1 2 3 5 6
//After pass 4:
//1 2 3 5 6
//Sorted array:
//1 2 3 5 6
