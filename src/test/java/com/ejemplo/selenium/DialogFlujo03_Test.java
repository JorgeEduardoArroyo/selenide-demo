package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class DialogFlujo03_Test {

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
		
		$("a[title='Dialog']").click();
		sleep(2000);	
		
		$$("button").findBy(Condition.text("Open Dialog with esc close")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Dismiss Dialog")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Open Dialog without esc close")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Close Dialog")).click();
		sleep(2000);
    	
	}
}