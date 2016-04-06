package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestFeetToYard {

	
	FeetChecker pc = new FeetChecker();
	Double ps = pc.CPer(3.0);
	Double defVol= 0.67;
	DecimalFormat f = new DecimalFormat("##.00");
	String tper = f.format(ps);
	Double cps = Double.parseDouble(tper);

	
	@Test
	public void testweight() {
		System.out.println("@Output(): " + defVol + " = " + cps);
		assertEquals(defVol,cps);
	}


	
}
