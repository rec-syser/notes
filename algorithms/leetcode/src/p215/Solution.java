package p215;

import java.util.ArrayDeque;
import java.util.Stack;

// 联系快排的两种形式 和 堆排
//创建这个文件的目的 是验证 ArrayDeque的push 和 pop 操作
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // quickSort(nums, 0, nums.length-1);
        unRecQuickSort(nums);
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        return nums[ nums.length - k ];
    }
    public void quickSort(int[] nums, int s, int e  ){
        if(s>e) return;
        int i = s-1;
        int j = s;
        while(j <= e){
            if(nums[j]<=nums[e]){
                int tmp = nums[j];
                nums[j] = nums[i+1];
                nums[i+1] = tmp;
                i++;
            }
            j++;
        }
        quickSort(nums, s, i-1);
        quickSort(nums, i+1, e);
    }
    public static void unRecQuickSort(int[] nums){
//        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        stack.push(nums.length-1);
        while(!stack.isEmpty()){
            int e = stack.pop(), s = stack.pop();
            if(s >= e) continue;
            int i = s - 1, j = s;
            while(j <= e){
                if(nums[j] <= nums[e]){
                    i++;
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
                j++;
            }
            stack.push(s); stack.push(i-1);
            stack.push(i+1); stack.push(e);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        unRecQuickSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
