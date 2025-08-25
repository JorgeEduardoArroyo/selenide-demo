package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo02_Test {

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
		
		//////////////////////////////////////////////////////////////////////////////////////  	
		 
		///////////////////////////////////////////////////////////////////////////////////
		$("a[title='Forms']").click();
		sleep(2000);
		
		$("a[title='Form Layouts']").click();
		sleep(2000);
		
		$("#inputEmail1").setValue("usuario@correo.com");
		sleep(2000);
		
		$("#inputPassword2").setValue("123");
		sleep(2000);
		
		$$("span.text").findBy(Condition.text("Option 1")).click();		
		sleep(2000);
		
		$$("span.text").findBy(Condition.text("Option 2")).click();		
		sleep(2000);
		
		$$("button").findBy(Condition.text("Sign in")).click();
		sleep(2000);
	}

}

