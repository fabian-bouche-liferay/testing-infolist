package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.field.InfoFieldValue;
import com.liferay.info.item.InfoItemFieldValues;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
		immediate = true, property = Constants.SERVICE_RANKING + ":Integer=10",
		service = InfoItemFieldValuesProvider.class
	)
public class WeatherInfoItemFieldValuesProvider implements InfoItemFieldValuesProvider<Weather> {

	private final static Logger LOG = LoggerFactory.getLogger(WeatherInfoItemFieldValuesProvider.class);
	
	@Override
	public InfoItemFieldValues getInfoItemFieldValues(Weather weather) {
		
		LOG.debug("Weather: " + weather.getLocation());
		
		return InfoItemFieldValues.builder()
			.infoFieldValues(_getWeatherInfoFieldValues(weather))
			.build();
	}

	private List<InfoFieldValue<Object>> _getWeatherInfoFieldValues(Weather weather) {

		List<InfoFieldValue<Object>> weatherFieldValues = new ArrayList<>();
		
		weatherFieldValues.add(
				new InfoFieldValue<>(
					WeatherInfoItemFields.locationInfoField,
					weather.getLocation()));

		weatherFieldValues.add(
				new InfoFieldValue<>(
					WeatherInfoItemFields.temperatureInfoField,
					weather.getTemperature()));

		return weatherFieldValues;
	}

}
