package com.liferay.samples.fbo.my.infolist.provider;

import com.liferay.info.form.InfoForm;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.localized.InfoLocalizedValue;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import java.util.Locale;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = InfoItemFormProvider.class)
public class WeatherInfoItemFormProvider implements InfoItemFormProvider<Weather> {

	public InfoForm getInfoForm() {
		Set<Locale> availableLocales = LanguageUtil.getAvailableLocales();

		InfoLocalizedValue.Builder infoLocalizedValueBuilder =
			InfoLocalizedValue.builder();

		for (Locale locale : availableLocales) {
			infoLocalizedValueBuilder.value(
				locale,
				ResourceActionsUtil.getModelResource(
					locale, Weather.class.getName()));
		}

		return InfoForm.builder(
		).infoFieldSetEntry(
				_weatherInfoItemFieldSetProvider.getInfoFieldSet()
		).labelInfoLocalizedValue(
			infoLocalizedValueBuilder.build()
		).name(
			Weather.class.getName()
		).build();
	}
	
	@Reference
	private WeatherInfoItemFieldSetProvider _weatherInfoItemFieldSetProvider;

	
}
