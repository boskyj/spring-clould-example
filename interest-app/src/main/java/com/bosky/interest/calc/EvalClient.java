package com.bosky.interest.calc;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bosky.model.CompoundModel;

@FeignClient(name="EXPRESSION-EVEL/calculator")
//@RibbonClient(name="EXPRESSION-EVEL")
public interface EvalClient {
	@GetMapping("/calculator/eval")
	public String eval(String eval);

	@PostMapping("/compoundInterest")
	public String compoundInterest(CompoundModel data);

}
