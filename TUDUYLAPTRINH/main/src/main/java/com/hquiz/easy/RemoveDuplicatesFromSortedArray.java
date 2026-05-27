package com.hquiz.easy;
/*
Problem: Cho một mảng số nguyên đã sắp xếp tăng dần, loại bỏ các phần tử trùng lặp trên chính mảng đó và trả về số phần tử 
của phần không bị trùng trên mảng đó.

==> Thực hiện trên chính mảng đó và trả về số phần tử không trùng lặp.

ví dụ: mảng [1,1,2] thì trả về 2 và mảng sẽ còn [1,2,_] 

===> Solution: Chúng ta sẽ thực hiện duyệt và ghi đè: Đầu tiên sẽ có 1 con trỏ i tại phần tử đầu tiên của mảng
một vòng lặp for duyệt từng phần tử của mảng, nếu phần tử tại vị trí j khác phần tử tại vị trí i thì thực hiện tăng i lên 1 
và ghi đè giá trị tại vị trí i với giá trị tại vị trí j.
*/

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j =1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
