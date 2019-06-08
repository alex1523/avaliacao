package br.com.etechoracio.avaliacao.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value="dateConverter")
public class DateConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String date = value;
		if(date != null && !date.equals("")) {
			date = value.replaceAll("[^0-9]", "");
		}
		return date;
	}
	
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String date = String.valueOf(value);
		if(date != null && date.length() == 8) {
			date = date.substring(0,2) + "/" +
				   date.substring(2,4) + "/" +
				   date.substring(4,8);
		}
		return date;
	}

}
