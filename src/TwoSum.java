import java.util.*;
import java.util.stream.Collectors;


/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int n = 9;

        int[] values = getTwoSumValueIndexes(nums, n);

        List<Integer> output = Arrays.stream(values).boxed().collect(Collectors.toList());
        Collections.sort(output);
        System.out.println(output);

    }

    private static int[] getTwoSumValueIndexes(int[] nums, int n) {
        Map<Integer,Integer> indexes = new HashMap<>(2);

        for(int i=0;i<nums.length;i++){
            int delta = n-nums[i];
            if(indexes.containsKey(delta)){
                return new int[]{ i,indexes.get(delta)};
            }
            indexes.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
