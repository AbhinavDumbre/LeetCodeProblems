class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashMap<Integer,Integer> ans=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        // }
        // for(int i=0;i<n)
        List<Integer> result=new ArrayList<>();
        ;
        Arrays.sort(nums);
        int n=nums.length;
        int j;
        for(int i=0;i<n-1;i++){
                j=i+1;
                if(nums[i]==nums[j]){
                   result.add(nums[i]);
                }
            j++;
            } return result;
        }
       
    }
