package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class AccordionFlujo02_Test {

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
		
    	$x("//nb-accordion-item-header[normalize-space()='Product Details']").click();
    	sleep(2000);
    	
    	$x("//nb-accordion-item-header[normalize-space()='Reviews']").click();
    	sleep(2000);
    	
    	$x("//nb-accordion-item-header[normalize-space()='Edit']").click();
    	sleep(2000);
    	

	}

}
