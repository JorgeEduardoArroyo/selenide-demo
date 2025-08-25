package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo03_Test {

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
	
		$("#exampleInputEmail1").setValue("lalo.arroyo@correo.com");
		sleep(2000);

		$("#exampleInputPassword1").setValue("123");
		sleep(2000);

		$$("nb-card").findBy(Condition.text("Basic form"))
	    .$("nb-checkbox .custom-checkbox")
	    .click();
		sleep(2000);
		
		$$("nb-card").findBy(Condition.text("Basic form"))
	    .$("button[type='submit']")
	    .click();
		sleep(2000);
		
	}

}
