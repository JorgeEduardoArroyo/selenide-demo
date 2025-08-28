package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class AccordionFlujo01_Test {
	
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
    	///////////////////////////////////////////////////////////////////////////////////
        $("a[title='Layout']").click();
    	sleep(2000);

        $("a[title='Accordion']").click();
    	sleep(2000);
    	
    	SelenideElement boton = $x("//nb-card-body//button[text()='Toggle First Item']");
    	boton.click();
    	sleep(2000);
    	
	}

}
