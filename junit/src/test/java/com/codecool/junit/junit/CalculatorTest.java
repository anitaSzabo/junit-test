package com.codecool.junit.junit;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
	
	@BeforeEach()
	void setup() {
		Calculator calc = new Calculator();
	}
	
	
	@Test
    public void testIfCalculatorGivesBack2() {
		int number = 2;
		Calculator calc = new Calculator();
		
        assertEquals(number, calc.giveMeANumber());
    }
	
	@Test
    public void testIfCalculatorGivesBack3() {
		int number = 3;
		Calculator calc = new Calculator();
		
        assertEquals(number, calc.giveMeANumber());
    }

}
