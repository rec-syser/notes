package p004;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(null == matrix || 0 == matrix.length){
            return false;
        }
        // int n = matrix.length, m = matrix[0].length; 这行代码花费的时间较长
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Solution s = new Solution();
        boolean res = s.findNumberIn2DArray(a, 20);
    }
}


