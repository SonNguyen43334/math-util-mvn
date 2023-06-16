/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.son43334.mathutil.core;

/**
 *
 * @author Le Cong Son
 */
//class này viết clone giống class java.util.Math
//chứa các hàm static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 4.1415;
    
    //hàm getF() là hàm tính n! = 1.2.3..n
    //thiết kế hàm như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm, Nếu đưa -5! -> CHỬI; ném ra Exception
    //vì giai thừa tăng rất nhanh, 21! long ko chứa nổi (long 18 số 0)
    //20! vừa đủ cho long
    //21! 22! 23! > 20! -> CHỬI, ném ra Exception 
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, please");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;//biến lưu dồn các tích
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}

