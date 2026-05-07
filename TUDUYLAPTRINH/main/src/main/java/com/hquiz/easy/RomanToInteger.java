package com.hquiz.easy;
/*
Problem: Cho một chuỗi ký tự La Mã có giá trị tương ứng như sau: 
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Xử lý các chuỗi sau thành số nguyên tương ứng.

==> Solution: Duyệt chuỗi một lượt từ đầu đến cuối chuỗi khi duyệt qua một ký tự thì lấy giá trị số nguyên
tương ứng của nó. Cộng tổng vào chuỗi giá trị. Nếu giá trị hiện tại nhỏ hơn giá trị đứng sau nó thì trừ đi 
giá trị hiện tại ví dụ IV -> 4 (vì 1 nhỏ hơn 5) và cộng 5 vào tổng

*/


public class RomanToInteger {
    public int romanToInt(String s) {
        int result =0;
    for(int i = 0; i<s.length();i++){
        int currentVal = getValue(s.charAt(i));
        int nextVal = i+1 < s.length()? getValue(s.charAt(i+1)): 0;
     
            if(currentVal < nextVal){
                result -= currentVal;
            }else{
                result += currentVal;
            }
    }
    return result;
    }

    int getValue(char s){
        switch(s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
    }

    return 0; 
    }
    
}
