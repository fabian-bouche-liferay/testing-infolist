package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.localized.InfoLocalizedValue;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = WeatherInfoItemFieldSetProvider.class)
public class WeatherInfoItemFieldSetProvider {

	public InfoFieldSet getInfoFieldSet() {
		return InfoFieldSet.builder()
				.infoFieldSetEntry(WeatherInfoItemFields.locationInfoField)
				.infoFieldSetEntry(WeatherInfoItemFields.temperatureInfoField)
				.labelInfoLocalizedValue(InfoLocalizedValue.localize(getClass(), "weather"))
				.name("weather")
				.build();
	}

}

