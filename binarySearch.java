
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binarySearch{

    public static void main(String []args){
        int []myArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(myArray,1, 9, 3));
    }
    
    public static int binarySearch(int[]nums, int start, int end, int key){ 
        if (start> end) return -1;
        int mid = (start+ end) /2;
        if (nums[mid] == key) {
            return mid; 
        } else if (nums[mid] < key) {
            return binarySearch(nums, mid + 1, end, key);
        } else {
            return binarySearch(nums, start, mid - 1, key);
        }
    }
}
