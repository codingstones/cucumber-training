package com.codingstones.bdd.sample5.bichomania.pages;

import com.codingstones.bdd.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductList extends Page{
    public ProductList(WebDriver webDriver){
        super(webDriver);
        webDriver.get("http://www.bichomania.es/t/categorias/perros");
    }

    public ProductDetail goToAProduct(){
        WebElement productAnchor = BrowserDriver.getCurrentDriver().findElement(By.cssSelector("div.product-item a"));
        productAnchor.click();
        return new ProductDetail(webDriver);
    }
}
