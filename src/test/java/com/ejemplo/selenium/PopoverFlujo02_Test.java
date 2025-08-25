package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;


class PopoverFlujo02_Test {

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
		$("a[title='Modal & Overlays']").click();
		sleep(2000);
		
		$("a[title='Popover']").click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("on click")).click();
		sleep(2000);	
		
		$$("button").findBy(Condition.text("on hover")).hover();
		sleep(2000);	
		
		$$("button").findBy(Condition.text("on hint")).click();
		sleep(2000);
		

	}
}