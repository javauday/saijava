package com.uday.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AakulaName {
	
	private String region;
	private String weather;

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "AakulaName [region=" + region + ", weather=" + weather + "]";
	}

}
