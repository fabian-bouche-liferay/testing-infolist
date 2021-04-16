package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.item.field.reader.InfoItemFieldReader;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = InfoItemFieldReader.class)
public class WeatherTemperatureInfoItemFieldReader implements InfoItemFieldReader<Weather> {

	private final static Logger LOG = LoggerFactory.getLogger(WeatherTemperatureInfoItemFieldReader.class);

	@Override
	public InfoField getField() {
		return WeatherInfoItemFields.temperatureInfoField;
	}

	@Override
	public Object getValue(Weather weather) {
		LOG.debug("temperature: " + weather.getTemperature());
		return weather.getTemperature();
	}

}
