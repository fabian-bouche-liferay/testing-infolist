package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.list.provider.InfoListProvider;
import com.liferay.info.list.provider.InfoListProviderContext;
import com.liferay.info.pagination.Pagination;
import com.liferay.info.sort.Sort;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(service = InfoListProvider.class)
public class WeatherInfoListProvider implements InfoListProvider<Weather> {

	private List<Weather> _weatherList;
	
	@Activate
	public void activate() {
		this._weatherList = new ArrayList<Weather>();
		
		Weather weatherParis = new Weather();
		weatherParis.setLocation("Paris");
		weatherParis.setTemperature(20);
		
		this._weatherList.add(weatherParis);
		
		Weather weatherLondon = new Weather();
		weatherLondon.setLocation("London");
		weatherLondon.setTemperature(15);
		
		this._weatherList.add(weatherLondon);

		Weather weatherBerlin= new Weather();
		weatherBerlin.setLocation("Berlin");
		weatherBerlin.setTemperature(15);
		
		this._weatherList.add(weatherBerlin);

	}
	
	@Override
	public List<Weather> getInfoList(InfoListProviderContext infoListProviderContext) {
		return this._weatherList;
	}

	@Override
	public List<Weather> getInfoList(InfoListProviderContext infoListProviderContext, Pagination pagination,
			Sort sort) {
		return this._weatherList;
	}

	@Override
	public int getInfoListCount(InfoListProviderContext infoListProviderContext) {
		return this._weatherList.size();
	}

	@Override
	public String getLabel(Locale locale) {
		return "Weather";
	}

}
