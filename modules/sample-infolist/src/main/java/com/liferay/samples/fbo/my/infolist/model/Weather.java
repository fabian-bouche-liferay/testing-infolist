package com.liferay.samples.fbo.my.infolist.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.info.item.InfoItemIdentifier;
import com.liferay.portal.kernel.model.ClassedModel;

import java.io.Serializable;
import java.util.Optional;

public class Weather implements ClassedModel {

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

	@Override
	public ExpandoBridge getExpandoBridge() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Class<?> getModelClass() {
		return Weather.class;
	}

	@Override
	public String getModelClassName() {
		return Weather.class.getName();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return location;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
	}
	
}
