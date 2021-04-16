package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.item.InfoItemClassDetails;
import com.liferay.info.item.InfoItemDetails;
import com.liferay.info.item.InfoItemReference;
import com.liferay.info.item.provider.InfoItemDetailsProvider;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, property = Constants.SERVICE_RANKING + ":Integer=10",
		service = InfoItemDetailsProvider.class
	)
public class WeatherInfoItemDetailsProvider implements InfoItemDetailsProvider<Weather> {

	@Override
	public InfoItemClassDetails getInfoItemClassDetails() {
		return new InfoItemClassDetails(Weather.class.getName());
	}

	@Override
	public InfoItemDetails getInfoItemDetails(Weather weather) {
		return new InfoItemDetails(
			getInfoItemClassDetails(),
			new InfoItemReference(
				Weather.class.getName(), weather.getEntryId()));
	}

}
