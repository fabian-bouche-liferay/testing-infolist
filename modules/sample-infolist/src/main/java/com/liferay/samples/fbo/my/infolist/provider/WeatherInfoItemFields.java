package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.type.NumberInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.localized.InfoLocalizedValue;

public interface WeatherInfoItemFields {

	public static final InfoField<NumberInfoFieldType > temperatureInfoField =
			InfoField.builder(
			).infoFieldType(
					NumberInfoFieldType.INSTANCE
			).name(
				"temperature"
			).labelInfoLocalizedValue(
				InfoLocalizedValue.localize(
					WeatherInfoItemFields.class, "temperature")
			).build();

	
	public static final InfoField<TextInfoFieldType> locationInfoField =
			InfoField.builder(
			).infoFieldType(
				TextInfoFieldType.INSTANCE
			).name(
				"location"
			).labelInfoLocalizedValue(
				InfoLocalizedValue.localize(
					WeatherInfoItemFields.class, "location")
			).build();
	
}
