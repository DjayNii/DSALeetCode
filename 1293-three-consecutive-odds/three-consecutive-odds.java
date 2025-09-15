class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0;i<arr.length - 2;i++){
            int intialNum = arr[i];
            int secondNum = arr[i+1];
            int thirdNum = arr[i+2];

            if(intialNum %2 != 0 && secondNum %2 != 0 && thirdNum %2 != 0){
                return true;
            }
        }
        return false;
    }
}