class Solution {
    public int threeSumClosest(int[] nums, int target) {
Arrays.sort(nums);
      int closeSum = nums[0] + nums[1] + nums[2];
      for(int i = 0 ; i<nums.length-2;i++){
        int inttialNum = nums[i];
        int left = i+1;
        int right = nums.length - 1;
        while(left<right){
          int sum = inttialNum + nums[left] + nums[right];
          if(Math.abs(sum- target) < Math.abs(closeSum -target)){
            closeSum = sum;
          }
          if(sum == target){
            break;
          }
          if(sum< target){
            left++;
          }
          else if(sum > target){
            right--;
          }
        }
      }
      return closeSum;
    }
}