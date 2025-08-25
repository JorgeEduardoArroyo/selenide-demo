package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class WindowFlujo01_Test {

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
		
		$$("button").findBy(Condition.text("Open window form")).click();
		sleep(2000);
		
        $("nb-window").shouldBe(Condition.visible);
        $("#subject").click();
        $("#subject").setValue("Subject");
		sleep(2000);
		
        $("nb-window").shouldBe(Condition.visible);
        $("#text").click();
        $("#text").setValue("Texto");
		sleep(2000);
		
		$$("nb-icon").findBy(Condition.attribute("icon", "close-outline")).parent().click();
		sleep(2000);
		
	}
}