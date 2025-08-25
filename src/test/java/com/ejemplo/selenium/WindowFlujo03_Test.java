package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;


class WindowFlujo03_Test {

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
		
		$("a[title='Window']").click();
		sleep(2000);	
		
		$$("button").findBy(Condition.text("Open window with backdrop")).click();
		sleep(2000);
		
		$$("nb-icon").findBy(Condition.attribute("icon", "close-outline")).parent().click();
		sleep(2000);
		
		$$("button").findBy(Condition.text("Open window without backdrop")).click();
		sleep(2000);
		
		$$("nb-icon").findBy(Condition.attribute("icon", "close-outline")).parent().click();
		sleep(2000);
		
	}
}
