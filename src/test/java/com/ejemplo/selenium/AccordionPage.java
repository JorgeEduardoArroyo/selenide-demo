package com.ejemplo.selenium;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class AccordionPage {

    // Elementos de la página
	
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    private final SelenideElement layoutMenu = $("a[title='Layout']");
    private final SelenideElement accordionMenu = $("a[title='Accordion']");
    private final SelenideElement toggleFirstItemButton = $x("//nb-card-body//button[text()='Toggle First Item']");

    
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    private final SelenideElement productDetailsHeader = $x("//nb-accordion-item-header[normalize-space()='Product Details']");
    private final SelenideElement reviewsHeader = $x("//nb-accordion-item-header[normalize-space()='Reviews']");
    private final SelenideElement editHeader = $x("//nb-accordion-item-header[normalize-space()='Edit']");

    
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    private final SelenideElement productDetailsHeader2 = $x("(//nb-accordion-item-header[contains(., 'Product Details')])[2]");
    private final SelenideElement reviewsHeader2 = $x("(//nb-accordion-item-header[contains(., 'Reviews')])[2]");
    private final SelenideElement editHeader2 = $x("(//nb-accordion-item-header[contains(., 'Edit')])[2]");

    
    
    // Acciones

    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public AccordionPage open() {
    	com.codeborne.selenide.Selenide.open("http://localhost:4200/pages");
        return this;
    }

    public AccordionPage clickLayout() {
        layoutMenu.click();
        return this;
    }

    public AccordionPage clickAccordion() {
        accordionMenu.click();
        return this;
    }

    public AccordionPage toggleFirstAccordionItem() {
        toggleFirstItemButton.click();
        return this;
    }
    
    
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public AccordionPage goToAccordionSection() {
        layoutMenu.click();
        accordionMenu.click();
        return this;
    }

    public AccordionPage expandProductDetails() {
        productDetailsHeader.click();
        return this;
    }

    public AccordionPage expandReviews() {
        reviewsHeader.click();
        return this;
    }

    public AccordionPage expandEdit() {
        editHeader.click();
        return this;
    }
    
    
    
    
    
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    /*
    public AccordionPage goToAccordionSection() {
        layoutMenu.click();
        accordionMenu.click();
        return this;
    }
    */
    
    public AccordionPage expandProductDetailsSection2() {
        productDetailsHeader2.click();
        return this;
    }

    public AccordionPage expandReviewsSection2() {
        reviewsHeader2.click();
        return this;
    }

    public AccordionPage expandEditSection2() {
        editHeader2.click();
        return this;
    }
    
}
