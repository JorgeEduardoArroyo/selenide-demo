package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class DialogFlujo01_Test {

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
		
		$$("button").findBy(Condition.text("Open Dialog with component")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Dismiss Dialog")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Open Dialog with template")).click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Close Dialog")).click();
		sleep(2000);
		
	}
}