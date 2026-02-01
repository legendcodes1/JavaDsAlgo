
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] items = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {10, 7, 8, 9, 1, 5};
        // Pointers sol = new Pointers();
        // int k = sol.removeDuplicates(nums);

        // System.out.println("Unique count = " + k);
        // System.out.print("Array after removing duplicates: ");
        // for (int x = 0; x < k; x++) {
        //     System.out.print(nums[x] + " ");
        // }


        Search search = new Search();
        // System.out.println(search.linear_search(items, 5));
        // System.out.println(search.binary_search(items, 7));

        int n = arr.length;
        search.quickSort(arr, 0, n -1);
        for(int val :  arr){
            System.out.println(val + " ");
        }
    }
}