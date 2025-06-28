class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer , Integer> numbers = new HashMap<>();
        int result = 0 ;
        for(int i = 0 ;  i < nums.length ; i++){
            if(numbers.containsKey(nums[i])){
                int count = numbers.get(nums[i]);
                numbers.put(nums[i],count+1);
            }else{
                numbers.put(nums[i],1);
            }
        }
        for(int k = 0;k<nums.length;k++){
            if(numbers.get(nums[k]) == 1){
               result = nums[k];
            }
        }
        return result;
    }
}