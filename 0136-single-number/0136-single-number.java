class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
      /*Arrays.sort(nums);
       for(int i=0;i<=n-2;i++){
        if(nums[i]!=nums[i+1]){
            nums[0]=nums[i];
        }
       }
       for(int i=1;i<=n-1;i++){
       if(nums[n-1]!=nums[n-2]){
        nums[0]=nums[n-1];
       }
      }
       return nums[0]<0?nums[0]*-1:nums[0];
    //}*/
   /* int min=Integer.MAX_VALUE;
    int val=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j]){
                c++;
            }
            if(min>c){
                min=c;
                val=nums[i];
            }
            
        }
    }
    return val;
    */
    int res=0;
    for(int arr:nums){
        res^=arr;
    }
    return res;

}
}