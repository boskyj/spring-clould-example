package com.bosky.eval.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import com.bosky.model.CompoundModel;

class EvaluationControllerTest {

	@Test
	void testEval() {
		EvaluationController controller = new EvaluationController();
		String actual = controller.eval("2*5*(3+7)");
		assertEquals("100.0", actual);
	}

	@Test
	void testCompoundInterest() {
		EvaluationController controller = new EvaluationController();
		CompoundModel model = new CompoundModel();
		model.setPrincipal("5000");
		model.setInterestRate("5");
		model.setPeriods("12");
		model.setTimes("1");
		String actual = controller.compoundInterest(model);
		assertEquals("5255.81", new BigDecimal(actual).setScale(2, RoundingMode.HALF_UP).toString());
	}

}
