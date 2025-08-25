package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class FormLayoutsFlujo04_Test {

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
		
	    SelenideElement inputRecipients = $$("nb-card")
		    .findBy(Condition.text("Form without labels"))
		    .$("input[placeholder='Recipients']");

	    inputRecipients.setValue("ejemplo@correo.com");
	    sleep(2000);
	    
	    SelenideElement inputSubject = $$("nb-card")
	    	    .findBy(Condition.text("Form without labels"))
	    	    .$("input[placeholder='Subject']");

	    inputSubject.setValue("Asunto");
	    sleep(2000);
	    
	    SelenideElement textareaMessage = $$("nb-card")
	    	    .findBy(Condition.text("Form without labels"))
	    	    .$("textarea[placeholder='Message']");

	    textareaMessage.setValue("Mensaje");
    	sleep(2000);
    	
    	$$("nb-card")
        .findBy(Condition.text("Form without labels"))
        .$("button[type='submit']")
        .click();
    	sleep(4000);
    	
	}
}
