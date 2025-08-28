package com.ejemplo.selenium;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccordionFlujo002_Test {

	 @BeforeAll
	    static void setup() {
	        WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }

	    @Test
	    void testAccordionItems() {
	        AccordionPage page = new AccordionPage();

	        page.open()
	            .goToAccordionSection()
	            .expandProductDetails()
	            .expandReviews()
	            .expandEdit();
	        
	        sleep(10000);
	    }
	}
