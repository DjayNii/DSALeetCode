class Solution {
    public int findMaxLength(int[] nums) {
         int[] convertedArr = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
          if(nums[i]==0) convertedArr[i] = -1;
          else convertedArr[i] = 1;
        }
        
        int[] preFixArray = new int[nums.length];
        preFixArray[0] = convertedArr [0];
        for(int x = 1 ; x<convertedArr.length;x++){
          preFixArray[x] = preFixArray[x-1] + convertedArr [x];
        }

        HashMap<Integer, Integer> sumIndex = new HashMap<>();

        sumIndex.put(0, -1);
        int maxLength = 0;

        for(int i = 0 ; i<preFixArray.length; i++){
          int sum = preFixArray[i];

          if(sumIndex.containsKey(sum)){
            int prevIndex = sumIndex.get(sum);
            int length = i - prevIndex;
            maxLength = Math.max(maxLength, length);
          }
          else{
            sumIndex.put(sum, i);
          }
        }
        return maxLength;
    
    }
}