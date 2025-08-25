package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo06_Test {

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
		
		SelenideElement emailInput = $$("nb-card")
			    .findBy(Condition.text("Horizontal form"))
			    .$("#inputEmail3");

		emailInput.setValue("jorge.arroyo@correo.com");
		sleep(2000);
		
		SelenideElement passwordInput = $$("nb-card")
			    .findBy(Condition.text("Horizontal form"))
			    .$("#inputPassword3");

		passwordInput.setValue("123");
		sleep(2000);
		
		$$("nb-card")
	    .findBy(Condition.text("Horizontal form"))
	    .$("nb-checkbox .custom-checkbox")
	    .click();
		sleep(2000);
		
		$$("nb-card")
	    .findBy(Condition.text("Horizontal form"))
	    .$("button[type='submit']")
	    .click();
		sleep(2000);
		
	}

}
