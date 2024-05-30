package com.antran.mathutil.test.core;

import com.antran.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// câu lệnh này của Junit báo hiệu rằng sẽ cần loop qua tập data 
// để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTest {
    // ta sẽ trả về mảng 2 chiều gồm nhiều cặp expected/input
    @Parameterized.Parameters // Junit sẽ ngầm chạy loop qua từng dòng
                              // của mảng để lấy ra đc cặp input/expected
    public static Object[][] initData(){
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 720}
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n; // biến map với value của cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; 
    
    @Test 
    public void testGetFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
