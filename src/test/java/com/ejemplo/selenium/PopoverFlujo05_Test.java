package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;


class PopoverFlujo05_Test {

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
		
		///////////////////////////////////////////////////////////////////////////////////
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(0)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(1)
		  .click();
		sleep(2000);

		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(2)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(3)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(4)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(5)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(6)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(7)
		  .click();
		sleep(2000);
		
		
		///////////////////////////////////////////////////////////////////////////////////
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(8)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(9)
		  .click();
		sleep(2000);

		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(10)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(11)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(12)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(13)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(14)
		  .click();
		sleep(2000);
		
		$$("button")
		  .filterBy(Condition.text("show hint"))
		  .get(15)
		  .click();
		sleep(2000);
	}
}
