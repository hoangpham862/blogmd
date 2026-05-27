package com.hquiz.easy;

public class RemoveElement {
     public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
                
                nums[i]= nums[j];
                i++; 
            }
        }
        return i; // trả ra i là vì đã gán giá trị cho mảng kết quả rồi mới tăng i lên tức là i luôn đi trước 1 đơn vị rồi 
    }  
    
}
