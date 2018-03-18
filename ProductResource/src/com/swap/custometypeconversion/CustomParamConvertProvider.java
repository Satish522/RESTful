package com.swap.custometypeconversion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomParamConvertProvider implements ParamConverterProvider{

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> AwbNo, Type rawtype, Annotation[] annotation) {
		
		Class<?> awbno=null;
		if(AwbNo.isAssignableFrom(AwbNo .class))
		{
			ParamConverter<T> paramConverter=(ParamConverter<T>)new AwbParamConverter();
			return paramConverter;
		}
		return null;
			


		
	}

}
