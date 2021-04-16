package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
		immediate = true, property = "service.ranking:Integer=100",
		service = InfoItemObjectProvider.class
	)
public class WeatherInfoItemObjectProvider implements InfoItemObjectProvider<Weather> {

	private final static Logger LOG = LoggerFactory.getLogger(WeatherInfoItemObjectProvider.class);

	@Override
	public Weather getInfoItem(long classPK) throws NoSuchInfoItemException {
		
		LOG.debug("Weather: " + classPK);
		
		Weather weather = new Weather();
		weather.setLocation("Paris");
		weather.setTemperature(10);
		return weather;
	}
	
	

}
