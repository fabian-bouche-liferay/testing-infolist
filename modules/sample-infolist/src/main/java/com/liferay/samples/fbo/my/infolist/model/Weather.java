package com.liferay.samples.fbo.my.infolist.model;

import com.liferay.info.item.InfoItemIdentifier;

import java.util.Optional;

public class Weather {

	private String location;
	private int temperature;
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public InfoItemIdentifier getEntryId() {
		return new InfoItemIdentifier() {
			
			@Override
			public void setVersion(String version) {
				
			}
			
			@Override
			public Optional<String> getVersionOptional() {
				return Optional.empty();
			}
		};
	}
	
}
