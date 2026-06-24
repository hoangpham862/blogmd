package com.hquiz.easy;

import java.util.ArrayList;

/*
Problem: Cho 1 số nguyên được biểu diễn dưới dạng mảng số nguyên dương. Cộng thêm 1 và kết quả
của phép cộng đó là mảng số nguyên kết quả



==> Solution 1: Duyệt ngược chuỗi trong mảng cộng 1 vào phần tử cuối cùng 
nếu tổng nhỏ hơn 10 thì return luôn.  
Nếu lớn hơn hoặc bằng 10 thì gán số đó bằng 0 và tiếp tục vòng lặp 
trong trường hợp duyệt hết mảng và vẫn còn 




*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int nums[] = new int[digits.length + 1];
        nums[0] = 1;
        return nums;

    }

    //
    public int[] plusOne2(int[] digits) {
        ArrayList<Integer> nums = new ArrayList<>();
        int temp = 1;
        int i = digits.length - 1;
        while (i >= 0) {
            if ((digits[i] + temp) >= 10) {
                nums.add(0, 0);
                temp = 1;
            }

            else {
                nums.add(0, (digits[i] + temp));
                temp = 0;
            }
            if (i == 0 && temp != 0) {
                nums.add(0, temp);
            }
            i -= 1;
        }
        return nums.stream().mapToInt(k -> k).toArray();

    }
}
