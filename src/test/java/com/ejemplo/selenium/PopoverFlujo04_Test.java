package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;


class PopoverFlujo04_Test {

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
		
		$$("nb-card")
		  .findBy(Condition.text("Component Popovers"))
		  .$$("button")
		  .findBy(Condition.text("With tabs"))
		  .click();
		sleep(2000);
		
		$$("span.tab-text")
		  .findBy(Condition.text("Second Tab"))
		  .click();
		sleep(2000);
		
		$$("nb-card")
		  .findBy(Condition.text("Component Popovers"))
		  .$$("button")
		  .findBy(Condition.text("With form"))
		  .click();
		sleep(2000);	
		
		$("[placeholder='Recipients']").click();
		$("[placeholder='Recipients']").setValue("Valor 1");
		sleep(2000);
		
		$("[placeholder='Subject']").click();
		$("[placeholder='Subject']").setValue("Valor 2");
		sleep(2000);
		
		$("[placeholder='Message']").click();
		$("[placeholder='Message']").setValue("Valor 3");
		sleep(2000);
		
		$$("button").findBy(Condition.text("Send")).click();
		sleep(2000);
		
		$$("nb-card")
		  .findBy(Condition.text("Component Popovers"))
		  .$$("button")
		  .findBy(Condition.text("With card"))
		  .click();
		sleep(2000);

	}
}