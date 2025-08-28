package com.ejemplo.selenium;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AccordionFlujo001_Test {

	   @BeforeAll
	    static void setup() {
	        WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }

	    @Test
	    void testAccordionToggle() {
	        AccordionPage page = new AccordionPage();

	        page.open()
	            .clickLayout()
	            .clickAccordion()
	            .toggleFirstAccordionItem();

	        sleep(10000);
	    }
	}