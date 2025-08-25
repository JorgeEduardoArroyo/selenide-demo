package com.ejemplo.selenium;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.extension.ExtendWith;
import com.codeborne.selenide.junit5.SoftAssertsExtension;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

@ExtendWith(SoftAssertsExtension.class)
public class GoogleSearchTest {
	
	   @BeforeAll
	    static void setup() {
		    WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }
	   	
	   	/*
	    @Test
	    public void testGoogleSearch() {
	        open("https://www.google.com");
	         $("input[name='q']").setValue("Selenide").pressEnter();
	         sleep(10000);
	        // $$("h3").findBy(text("Selenide")).shouldBe(visible);
	    }
	    */
	   
	   /*
	     
			> $ → Selecciona un solo elemento
			* Selecciona el primer elemento que coincida con el selector CSS.
			* Devuelve un objeto de tipo SelenideElement.
			* Puedes usarlo para hacer clic, escribir texto, verificar visibilidad, etc.
			 
			$("ul li").click(); 								// Selecciona el primer <li> dentro de un <ul>
			
			> $$ → Selecciona una lista de elementos
			* Selecciona todos los elementos que coincidan con el selector.
			* Devuelve un objeto de tipo ElementsCollection (una lista de SelenideElement).
			* Puedes recorrer, filtrar, verificar tamaños, buscar por texto, etc.
			
			ElementsCollection items = $$("ul li");				// Selecciona todos los <li> dentro de un <ul>
			items.findBy(Condition.text("Contacto")).click();	// Hace clic en el primer elemento que contenga el texto "Contacto"
			$$("div.item").shouldHave(size(3)); // Verifica que haya 3 elementos
			$$("li").findBy(text("Inicio")).click(); // Encuentra el que tenga ese texto

			> Verificar selector
			document.querySelector("a[title='Layout']")
	    
	    	// Comparación con .parent()
	    	.parent()		// Va un solo nivel arriba en el DOM
			.closest("a")	// Sube por los ancestros hasta encontrar un <a>
			
			
			// ejemplo validar q este expandido
	    	$("a[title='Layout']").shouldBe(Condition.visible).click(); //Selenide que espere (hasta 4 segundos por defecto) a que el elemento sea visible antes de hacer clic
	    	
	    	SelenideElement opcionMenuLayout = $("a[title='Layout']");
	    	SelenideElement expandIcon = opcionMenuLayout.$(".expand-state");
	    	String classValue = expandIcon.getAttribute("class");
	    	if (classValue != null && classValue.contains("expanded")) {
	    	    opcionMenuLayout.click(); // Solo hace clic si está expandido
	    	}
	    	 
	    	
	    	
	    */
	   
	    @Test
	    public void selenideTest() {
	   	
	    	open("http://localhost:4200/pages");
	  
	    	
	    	////////////////////////////////////////////////////////////////////
	    	// Menu Layout
	        //$("a[title='Layout']").click();
	    	
	    	//path absoluto
	    	$x("/html/body/ngx-app/ngx-pages/ngx-one-column-layout/nb-layout/div/div/div/nb-sidebar/div/div/nb-menu/ul/li[2]/a").click();
	    	//path relativo
	    	//$x("//a[text()='Layout']").click();
	    	sleep(2000);	

	        $("a[title='Stepper']").click();
	    	sleep(2000);
	    	
	        $("a[title='Accordion']").click();
	    	sleep(2000);
	    	   
	    	$$("span.menu-title")
	    		.findBy(Condition.text("Layout"))
	    		.closest("a")
	    		.click();
	    	sleep(2000);
	    	
	    	////////////////////////////////////////////////////////////////////
	    	// Menu Forms
	    	$("a[title='Forms']").click();
	    	sleep(2000);
	    	
	        $("a[title='Form Layouts']").click();
	    	sleep(2000);
	    	
	        $("a[title='Datepicker']").click();
	    	sleep(2000);
	    	
	    	$$("span.menu-title")
    		.findBy(Condition.text("Forms"))
    		.closest("a")
    		.click();
	    	sleep(2000);
	    	
	    	////////////////////////////////////////////////////////////////////
	    	// Menu Modal & Overlays
	    	$("a[title='Modal & Overlays']").click();
	    	sleep(2000);
	    	
	        $("a[title='Dialog']").click();
	    	sleep(2000);
	    	
	        $("a[title='Window']").click();
	    	sleep(2000);
	    	
	        $("a[title='Popover']").click();
	    	sleep(2000);
	    	
	        $("a[title='Toastr']").click();
	    	sleep(2000);
	    	
	        $("a[title='Tooltip']").click();
	    	sleep(2000);
	    	
	    	$$("span.menu-title")
    		.findBy(Condition.text("Modal & Overlays"))
    		.closest("a")
    		.click();
	    	sleep(2000);

	    	////////////////////////////////////////////////////////////////////
	    	// Menu Extra Components
	    	$("a[title='Extra Components']").click();
	    	sleep(2000);
	    	
	        $("a[title='Calendar']").click();
	    	sleep(2000);
	    	
	    	$$("span.menu-title")
    		.findBy(Condition.text("Extra Components"))
    		.closest("a")
    		.click();
	    	sleep(2000);
	   
	    	////////////////////////////////////////////////////////////////////
	    	// Menu Tables & Data
	    	$("a[title='Tables & Data']").click();
	    	sleep(2000);
	    	
	        $("a[title='Smart Table']").click();
	    	sleep(2000);
	    	
	        $("a[title='Tree Grid']").click();
	    	sleep(2000);
	    	
	    	$$("span.menu-title")
    		.findBy(Condition.text("Tables & Data"))
    		.closest("a")
    		.click();
	    	sleep(2000);

	    	////////////////////////////////////////////////////////////////////
	    	// Menu Auth
	    	$("a[title='Auth']").click();
	    	sleep(2000);
	    	
	        $("a[title='Register']").click();
	    	sleep(2000);
	    	
	        $("a[title='Request Password']").click();
	    	sleep(2000);
	    	
	        $("a[title='Reset Password']").click();
	    	sleep(2000);
	    	
	    	$$("span.menu-title")
    		.findBy(Condition.text("Auth"))
    		.closest("a")
    		.click();
	    	sleep(2000);
	    }

}
