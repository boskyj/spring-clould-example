package com.bosky.interest.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosky.model.CompoundModel;
import com.bosky.model.InterestAll;
@RestController
public class InterestCalaculator {
	@Autowired
	private EvalClient evalClient;

	@GetMapping(value = "/interests", produces = MediaType.APPLICATION_JSON_VALUE)
	public InterestAll allInterest(@RequestParam double principle, @RequestParam double interest,
			@RequestParam Integer tenure) {

		InterestAll all = new InterestAll();
		CompoundModel model = new CompoundModel();
		model.setPrincipal(Double.toString(principle));
		model.setInterestRate(Double.toString(interest));
		model.setPeriods("12");
		model.setTimes(Integer.toString(tenure));
		all.setMonthly(evalClient.compoundInterest(model));

		model.setPeriods("4");
		all.setQuarterly(evalClient.compoundInterest(model));

		model.setPeriods("1");
		all.setYearly(evalClient.compoundInterest(model));

		model.setPeriods("365");
		all.setDaily(evalClient.compoundInterest(model));

		return all;
	}

}
