package com.antran.mathutil.test.core;

import com.antran.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


public class MathUtilTest {
    // đây là class sẽ sử dụng các hàm/ các thư viện/ framework junit
    // để kiểm thử/ kiểm tra code chính 
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenBadArgumentThrowsException(){
        
        MathUtil.getFactorial(-5);
    }
    
    //cách khác để bắt ngoại lệ dùng lambda
    @Test
    public void testGetFactorialGivenBadArgumentThrowsExceptionWithLambda(){
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> {MathUtil.getFactorial(21);});
    }
}
