class subarraysum {
    public static int subarraySum(int[] nums, int k) {
        int sum=0,count=0;
        int i=0,j=0;
        while(i<nums.length){
            for(j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum == k){
                    count++;
                }
            }
            sum=0;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,-1,0};
        int k=0;
        System.out.println(subarraySum(nums,k));
    }
}
