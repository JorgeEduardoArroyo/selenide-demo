package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

public class AccordionFlujo003_Test {


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
            .expandProductDetailsSection2()
            .expandReviewsSection2()
            .expandEditSection2();
	        
	        sleep(10000);
	    }
	}