package com.ejemplo.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class StepperFlujo02_Test {
	
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
    	///////////////////////////////////////////////////////////////////////////////////
        $("a[title='Layout']").click();
    	sleep(2000);

        $("a[title='Stepper']").click();
    	sleep(2000);
    	
    	$$("form.step-container")
    	  .findBy(Condition.visible)                          
    	  .$("input[formcontrolname='firstCtrl']")            
    	  .setValue("Lalo");                        		  
    	sleep(2000);
    	  
    	$x("(//div[contains(@class, 'steppers-container')]//nb-stepper[contains(@class, 'horizontal')]//button[contains(text(),'next')])[1]").click();
    	sleep(2000);
    	 
	    $$("form.step-container")
	  	  .findBy(Condition.visible)                          
	  	  .$("input[formcontrolname='secondCtrl']")            
	  	  .setValue("El Padrino");                        		  
	  	sleep(2000);
	  	  
	  	$x("(//div[contains(@class, 'steppers-container')]//nb-stepper[contains(@class, 'horizontal')]//button[contains(text(),'next')])[1]").click();
	  	sleep(2000);
	  	  
	    $$("form.step-container")
	  	  .findBy(Condition.visible)                          
	  	  .$("input[formcontrolname='thirdCtrl']")            
	  	  .setValue("Finalizado");                        		  
	  	sleep(2000);
	  	  
	  	$x("(//div[contains(@class, 'steppers-container')]//nb-stepper[contains(@class, 'horizontal')]//button[normalize-space(text())='Confirm'])[1]").click();
	  	sleep(2000);
	  	 
	}
}
