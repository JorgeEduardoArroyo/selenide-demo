package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class StepperFlujo01_Test {
	
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
        $("a[title='Layout']").click();
    	sleep(2000);

        $("a[title='Stepper']").click();
    	sleep(2000);
    	
    	$(".step-content button[nbsteppernext]:not([disabled])")
        .shouldHave(Condition.text("next"))
        .click();
    	sleep(2000);
    	
    	$(".step-content button[nbsteppernext]:not([disabled])")
        .shouldHave(Condition.text("next"))
        .click();
    	sleep(2000);
    	
    	$(".step-content button[nbsteppernext]:not([disabled])")
        .shouldHave(Condition.text("next"))
        .click();
    	sleep(2000);
    	
    	$(".step-content button[nbstepperprevious]:not([disabled])")
        .shouldHave(Condition.text("prev"))
        .click();
    	sleep(2000);
    	
    	$(".step-content button[nbstepperprevious]:not([disabled])")
        .shouldHave(Condition.text("prev"))
        .click();
    	sleep(2000);
    	
    	$(".step-content button[nbstepperprevious]:not([disabled])")
        .shouldHave(Condition.text("prev"))
        .click();
    	sleep(2000);
	}

}
