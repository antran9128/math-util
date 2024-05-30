package com.antran.mathutil.core;

public class MathUtil {
    // class này cung cấp co ai đó nhieuf hàm xử lý toán học
    // hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    // chọn thiết kế là hàm static
    
    // hàm tính giai thừâ!!! n! = 1.2.3.4.5...n
    // 0! = 1! = 1
    // 20! 18 con số, vừa đủ kiểu long của Java
    // bài này quy ước tính n! trong khoảng 0-20
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("invalid argument. N must be between 0 to 20");
        }
        
        if(n == 0 || n == 1)
            return 1;
        
        long product = 1;
        for(int i = 2; i <= n; i++){
            product *= i;
        }
        
        return product;
    }
}
