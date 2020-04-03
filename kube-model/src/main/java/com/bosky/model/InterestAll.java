package com.bosky.model;

import java.io.Serializable;

public class InterestAll implements Serializable {
	private String yearly;
	private String monthly;
	private String daily;
	private String quarterly;
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	public String getMonthly() {
		return monthly;
	}
	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}
	public String getDaily() {
		return daily;
	}
	public void setDaily(String daily) {
		this.daily = daily;
	}
	public String getQuarterly() {
		return quarterly;
	}
	public void setQuarterly(String quarterly) {
		this.quarterly = quarterly;
	}

}
