package com.example.rpsa.utlities;

import java.io.File;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YamlReaderTest {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
        	AppInfo appInfo = mapper.readValue(new File("C:\\Training\\TestBed\\STS_Workspace\\SeleniumCucumber\\src\\test\\resources\\TestData\\App1.yaml"), AppInfo.class);
            System.out.println(ReflectionToStringBuilder.toString(appInfo,ToStringStyle.MULTI_LINE_STYLE));
        } catch (Exception e) {
           
            e.printStackTrace();
        }
	}

}
