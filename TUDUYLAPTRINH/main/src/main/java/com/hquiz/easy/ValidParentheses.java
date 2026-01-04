package com.hquiz.easy;
import java.util.Map;
import java.util.Stack;
/*
// Bài toán đặt ra cho một chuỗi các ký tự chứa các ký tự "(", ")", "[", "]", "{", "}"
Mục tiêu đặt ra kiểm tra xem chuỗi đầu vào có đúng hay không 
rule: Các ký tự mở phải có một ký tự đóng cùng loại,  các ký tự mở phải được đóng với đúng thứ tự
số lượng ký tự mở phải bằng số lượng ký tự đóng
*/


/*
    solution1: Dùng stack các ký tự để lưu các ký tự. LIFO -> last in first out 
    ý tưởng: chúng ta sẽ xét qua chuỗi nếu là ký tự mở thì thêm vào stack 
    nếu là ký tự đóng thì lấy ký tự mở đầu tiên ra so sánh nếu đúng thì so sánh tiếp nếu sai 
    thì trả về false luôn 
    --> ngoài ra còn một trường hợp nếu là số lẻ thì trả về false luôn vì không đủ số 
    cặp theo quy định
    Độ phức tạp thuật toán: O(n)
    Độ phức tạp không gian: O(n)

*/

public class ValidParentheses {
    public static boolean isValid(String input) {
        // check nếu chiều dài chuỗi số lẻ sai luôn 
        if (input.length() % 2 != 0)
            return false;
        // khai báo stack để lưu các ký tự 
        Stack<Character> stack = new Stack<>();
        // khai báo map để lưu các cặp ký tự đóng mở 
        Map<Character, Character> brackets = Map.of(')', '(', '}', '{', ']', '[');

        for (char c : input.toCharArray()) {
            // nếu là ký tự mở thì thêm vào stack 
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // nếu stack rỗng hoặc ký tự mở không đúng thì trả về false 
                // pop lấy thằng đầu tiên trong stack ra so sánh với ký tự mở khai báo trong map
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
        
    }
    
}
