package com.example.rpsa.utlities;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class AppInfoYamlReader {

	private static AppInfo appInfo;

	public static synchronized AppInfo getAppInfo()  {
		if (appInfo == null) {
			// appInfo = new ThreadSafeSingleton();

			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

			try {
				appInfo = mapper.readValue(new File(
						"C:\\Training\\TestBed\\STS_Workspace\\SeleniumCucumber\\src\\test\\resources\\TestData\\App1.yaml"),
						AppInfo.class);
				// System.out.println(ReflectionToStringBuilder.toString(appInfo,ToStringStyle.MULTI_LINE_STYLE));
			} catch (JsonParseException e) {
				
				e.printStackTrace();
			} catch (JsonMappingException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			

		}
		return appInfo;
	}

}
