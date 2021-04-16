package com.liferay.samples.fbo.my.infolist.renderer;

import com.liferay.info.item.renderer.InfoItemRenderer;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.samples.fbo.my.infolist.model.Weather;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(service = InfoItemRenderer.class)
public class WeatherRenderer implements InfoItemRenderer<Weather> {

	@Override
	public void render(Weather weather, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

		   StringBundler sb = new StringBundler(4);

		   sb.append("<ul>");
		   sb.append("<li>Location: " + weather.getLocation());
		   sb.append("<li>Temperature: " + weather.getTemperature());
		   sb.append("</ul>");

		   try {
		      PrintWriter printWriter = httpServletResponse.getWriter();

		      printWriter.write(sb.toString());
		   }
		   catch (IOException ioe) {
		      throw new RuntimeException(ioe);
		   }
		
	}

}
