package com.epam.TddJunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.TddJunitTesting.RemoveCharA;

class RemoveCharATest {
	/*
	 * 1.if A at first char string>=2: ABX=>BX
	 * 2.if A at second char string>=2:BAX=>BX
	 * 3.if A at both first and second char string>=2:AABDA=>BDA
	 * 4.if A not at first and second char string>=2:BCAAD=>BCAAD
	 * 5.if A at first char String==1:A=>'' or B=>'B'
	 * 6.if string is A=>''
	 * 7.if String is AA=>''
	 */
	
	RemoveCharA charA;
	
	@BeforeEach
	void setUp() {
		charA=new RemoveCharA();
	}
	
	@Test
	void CharAAtFirst() {
		assertEquals("BX",charA.remove("ABX"));
	}
	@Test
	void CharAAtSecond() {
		assertEquals("BX",charA.remove("BAX"));
	}
	@Test
	void CharAAtFirstSecond() {
		assertEquals("X",charA.remove("AAX"));
	}
	@Test
	void CharANotAtFirstSecond() {
		assertEquals("BBAA",charA.remove("BBAA"));
	}
	@Test
	void CharAInOneChar() {
		assertEquals("",charA.remove("A"));
	}
	@Test
	void CharANotInOneChar() {
		assertEquals("B",charA.remove("B"));
	}
	@Test
	void StringEmpty() {
		assertEquals("",charA.remove(""));
	}
	

}