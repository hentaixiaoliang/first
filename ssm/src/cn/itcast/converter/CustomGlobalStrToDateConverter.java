package cn.itcast.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CustomGlobalStrToDateConverter  implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		
			try {
				System.out.println();
				Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(source);
				return date;
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return null;
	
	}

}
