package com.place.yao.code.Medium;

/**
 * @Description 找到重复的数字
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_287_FindDuplicateNumber {
//    public int findDuplicate(int[] nums) {
//        Map<Integer, Boolean> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                return nums[i];
//            }
//
//            map.put(nums[i], true);
//        }
//
//        return -1;
//    }

    // 快慢指针 a+b+c= 2(a+b)
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        M_287_FindDuplicateNumber m = new M_287_FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(m.findDuplicate(nums));
    }
}
