package com.codecool.junit.junit;

import static org.junit.jupiter.api.Assertions.*;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
//    extends TestCase
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
	
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
}
