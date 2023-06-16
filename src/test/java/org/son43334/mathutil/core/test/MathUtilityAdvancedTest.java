/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.son43334.mathutil.core.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.son43334.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {6,720}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
     public void testFactotialGivenRightArgumentReturnWell(int n, long expected) {
        
        assertEquals(expected, MathUtility.getFactorial(n));
        
    }
}
