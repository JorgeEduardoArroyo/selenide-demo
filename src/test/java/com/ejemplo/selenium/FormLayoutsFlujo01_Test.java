package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo01_Test {

   @BeforeAll
    static void setup() {
	    WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = false;
    }

	@Test
	void test() {

		open("http://localhost:4200/pages");
		sleep(2000);
				 
		///////////////////////////////////////////////////////////////////////////////////
		$("a[title='Forms']").click();
		sleep(2000);
		
		$("a[title='Form Layouts']").click();
		sleep(2000);	
		
		$("input[placeholder='Jane Doe']").setValue("Jane Doe");
		sleep(2000);
		
		$("input[placeholder='Email']").setValue("jane_doe@correo.com");
		sleep(2000);
		
		$$("span.text").findBy(Condition.text("Remember me")).click();
		sleep(2000);
		
		$("button[type='submit']").click();
		sleep(2000);
	}

}
