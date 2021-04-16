package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.item.field.reader.InfoItemFieldReader;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import org.osgi.service.component.annotations.Component;

@Component(service = InfoItemFieldReader.class)
public class WeatherLocationInfoItemFieldReader implements InfoItemFieldReader<Weather> {

	@Override
	public InfoField getField() {
		return WeatherInfoItemFields.locationInfoField;
	}

	@Override
	public Object getValue(Weather weather) {
		return weather.getLocation();
	}

}
