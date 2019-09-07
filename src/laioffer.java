import java.util.Map;
import java.util.

public class laioffer {
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length;
        if(array == null || array.length == 0){
            return -1;
        }
        while(left < right){
            int mid = left + (right - left)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                left = mid;
            }
            else right = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,6,7,8};
        int m = binarySearch(arr,6);
        System.out.println(m);
    }
    ListNode a = new ListNode(0);
    Map map = new Map;
    HashMap w = new HashMap;


}

