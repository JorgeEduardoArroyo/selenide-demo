package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class AccordionFlujo03_Test {
	
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
    	
    	$x("(//nb-accordion-item-header[contains(., 'Product Details')])[2]").click();
    	sleep(2000);

    	$x("(//nb-accordion-item-header[contains(., 'Reviews')])[2]").click();
    	sleep(2000);
    	
    	$x("(//nb-accordion-item-header[contains(., 'Edit')])[2]").click();
    	sleep(2000);

	}

}
