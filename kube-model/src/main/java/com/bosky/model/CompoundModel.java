package com.bosky.model;

import java.io.Serializable;

public class CompoundModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8908882546263421076L;
	private String principal;
	private String interestRate;
	private String times;
	private String periods;
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getPeriods() {
		return periods;
	}
	public void setPeriods(String periods) {
		this.periods = periods;
	}

}
