package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo05_Test {

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
		$("a[title='Forms']").click();
		sleep(2000);
		
		$("a[title='Form Layouts']").click();
		sleep(2000);	
		
		SelenideElement firstNameInput = $$("nb-card")
			    .findBy(Condition.text("Block form"))
			    .$("#inputFirstName");

		firstNameInput.setValue("lalo");
		sleep(2000);
		
		SelenideElement lastNameInput = $$("nb-card")
			    .findBy(Condition.text("Block form"))
			    .$("#inputLastName");


	    lastNameInput.setValue("arroyo");
	    sleep(2000);
	    
	    SelenideElement emailInput = $$("nb-card")
	    	    .findBy(Condition.text("Block form"))
	    	    .$("#inputEmail");

    	emailInput.setValue("lalo@correo.com");
    	sleep(2000);
	    	
    	SelenideElement websiteInput = $$("nb-card")
    		    .findBy(Condition.text("Block form"))
    		    .$("#inputWebsite");

		websiteInput.setValue("https://sitioJEAV.com");
		sleep(2000);
		
		$$("nb-card")
	    .findBy(Condition.text("Block form"))
	    .$("button[type='submit']")
	    .click();
		sleep(2000);
		
	}

}

