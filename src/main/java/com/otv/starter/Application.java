package com.otv.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otv.common.SystemConstants;

/**
 * Application Starter Class
 * 
 * @author  onlinetechvision.com
 * @since   26 May 2012
 * @version 1.0.0
 *
 */
public class Application {
	
	/**
	 * Main method of the Application
	 * 
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(SystemConstants.APPLICATION_CONTEXT_FILE_NAME);		
	}
}
