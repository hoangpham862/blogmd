package com.hquiz.easy;

import java.util.HashMap;

// Bài toán cộng 2 
/* 
Cho một mảng số nguyên và một số nguyên kết quả. Mục tiêu trả về 
2 số trong mảng có tổng bằng với kết quả. và trả về một kết quả duy nhất.

*** yêu cầu ***
Độ phức tạp thuật toán là O(n2)


*/
/*
==> Solution 1: dùng vòng lặp lồng nhau để lặp và tính tổng : dùng 2 vòng lặp for lặp qua từng phần tử để sum nếu thỏa mãn thì return kết 
quả.

==> Solution 2: Dùng một map để lưu các phần tử và kiểm tra nếu phần tử cần tìm đã tồn tại trong map thì 
return kết quả.



*/
public class TwoSum {
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapResult = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if (mapResult.containsKey(complete)) {
                return new int[] { mapResult.get(complete), i };
            }
            mapResult.put(nums[i], i);
        }
        return new int[] {0, 0};
        
    }
}
    
