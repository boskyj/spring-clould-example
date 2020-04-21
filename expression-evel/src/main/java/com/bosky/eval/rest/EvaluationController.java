package com.bosky.eval.rest;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosky.model.CompoundModel;

@RestController
@RequestMapping("/calculator")
public class EvaluationController {
	private static Logger logger = LoggerFactory.getLogger(EvaluationController.class);

	@GetMapping("/eval")
	public String eval(String eval) {
		Expression expression = new Expression(eval);
		logger.info(eval);
		return expression.calculate() + "";
	}

	@PostMapping(value = "/compoundInterest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String compoundInterest(@RequestBody CompoundModel data) {
		Function function = new Function("f(p,r,n,t)=p*((1+(r/(n*100)))^(n*t))");
		Argument p = new Argument("p=" + data.getPrincipal());
		Argument r = new Argument("r=" + data.getInterestRate());
		Argument n = new Argument("n=" + data.getPeriods());
		Argument t = new Argument("t=" + data.getTimes());
		Expression expression = new Expression("f(p,r,n,t)", p, r, n, t, function);
		logger.info(expression.getExpressionString());
		return expression.calculate() + "";
	}

}
