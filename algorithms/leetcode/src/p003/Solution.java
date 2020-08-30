package p003;

class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int tmp= 0;
        int re= 0;
        int i = 0;
        while(i<len){
            if(nums[i] != i){
                if(nums[nums[i]] == nums[i]){
                    re = nums[i];
                    break;
                }
                else{
                    tmp = nums[ nums[i] ];
                    nums[ nums[i] ] = nums[i];
                    nums[i] = tmp;
                }
            }
            else{
                i++;
            }
            for(int num:nums) {
                System.out.print(num);
            }
            System.out.println();
            break;
        }
        return re;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        Solution s = new Solution();
        int re = s.findRepeatNumber(a);
    }
}
