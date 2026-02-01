public class Search {


    public static int linear_search(int[] arr, int item){
        for(int i=0; i < arr.length; i++){
            if(arr[i] == item){
                return arr[i];
            }
        } return -1;
    }

    public static int binary_search(int[] arr, int item){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) /2;
            int guess = arr[mid];

            if(guess == item){
                return mid;
            }else if(guess > item){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return -1;
    }



    public static int findSmallest(int[] arr, int startIndex){
        int smallest = arr[startIndex];
        int smallest_index = startIndex;

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                smallest_index = arr[i];
            }

        }return smallest_index;
    }


    public static int[] selectionSort(int[] arr){

        for(int i=0; i < arr.length; i++){
            int smallestIdx = findSmallest(arr, i);

            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx]= temp;

        }return arr;
    }


    public static int recursiveCount(int[] arr, int index){

        if(index == arr.length){
            return 0;
        }
        return 1 + recursiveCount(arr, index + 1);

    }


    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low - 1;

        for(int j= low; j <= high -1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}