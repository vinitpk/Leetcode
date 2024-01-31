class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        int ans = 0;

        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        

        for(int i=0; i<nums.length; i++){
            if((set.contains(nums[i] + diff)) && (set.contains(nums[i]+ diff*2))){
                System.out.println(nums[i] + diff +" " + nums[i]+ diff*2);
                ans++;
            }
        }

        return ans;
    }
}