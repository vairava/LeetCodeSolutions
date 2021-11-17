public class PivotIndexEqulibirium {

    public static void main(String[] args) {

        int[] nums = {1,3,7,6,6,5};

        int totalSum = 0;
        for(int num : nums){
            totalSum+= num;
        }

        int index = getPivotIndex(nums, totalSum);
        System.out.println(index);
    }

    private static int getPivotIndex(int[] nums, int totalSum) {
        int leftSum = 0;


        for(int i=0;i<nums.length;i++){
            if(i != 0) {
                leftSum += nums[i - 1];
            }

            if(totalSum - leftSum - nums[i] == leftSum){
                return i;
            }

        }
        return -1;
    }
}
