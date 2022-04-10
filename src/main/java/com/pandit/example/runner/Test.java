package com.pandit.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pandit.example.EmailConfig;
import com.pandit.example.MyProfileData;

@Component
public class Test {
	@Autowired
	private MyProfileData pob;
	@Autowired
	private EmailConfig config;
	public void run(String... args) throws Exception{
		System.out.println(pob);
		System.out.println(config);
		System.out.println("Hiii Nikita Rathod");
	}

}
