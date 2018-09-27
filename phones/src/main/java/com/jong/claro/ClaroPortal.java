package com.jong.claro;

import com.jong.entity.ClaroEntity;
import com.jong.entity.Promotion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ClaroPortal {
    public void requestIphoneX() {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lojaonline.claro.com.br/iphone-x-256gb-claro-14421");
        ClaroEntity claroEntity = parse(driver);
        driver.close();
    }
    public void requestGalaxyNote9() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lojaonline.claro.com.br/iphone-x-256gb-claro-14421");
        ClaroEntity claroEntity = parse(driver);
        driver.close();
    }

    public ClaroEntity parse(WebDriver driver) {
        ClaroEntity claroEntity = new ClaroEntity();
        claroEntity.setProduct(driver.findElement(By.className("product-title")).getText());
        driver.findElement(By.cssSelector("#arrow-icon")).click();
        claroEntity.setPrePromo(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(2) > div > div.name.ng-binding")).getText());
        claroEntity.setPrePrice(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.pre-plans > div.plan-cell.ng-scope.no-border > div > div.device-value > div.value.ng-binding")).getText());
        claroEntity.setPrePromoPrice(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.pre-plans > div.plan-cell.ng-scope.no-border > div > div.plan-value > div.value.ng-binding")).getText());
        claroEntity.setPromo2(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(2) > div > div.name.ng-binding")).getText());
        claroEntity.setPrice2(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(2) > div > div.device-value > div.value.ng-binding")).getText());
        claroEntity.setPricePromo2(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(2) > div > div.plan-value > div.value.ng-binding")).getText());
        claroEntity.setPromo3(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(3) > div > div.name.ng-binding")).getText());
        claroEntity.setPrice3(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(3) > div > div.name.ng-binding")).getText());
        claroEntity.setPricePromo3(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(3) > div > div.plan-value > div.value.ng-binding")).getText());
        claroEntity.setPromo5(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(4) > div > div.name.ng-binding")).getText());
        claroEntity.setPrice5(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(4) > div > div.device-value > div.value.ng-binding")).getText());
        claroEntity.setPricePromo5(driver.findElement(By.cssSelector("#modalPlans > div.plans-grid > div.plan-category.controle-plans > div:nth-child(4) > div > div.plan-value > div.value.ng-binding")).getText());
//        claroEntity.setPromo7(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPrice7(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPricePromo7(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPromo10(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPrice10(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPricePromo10(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPromo15(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPrice15(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPricePromo15(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPromo30(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPrice30(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPricePromo30(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPromo60(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPrice60(driver.findElement(By.cssSelector()).getText());
//        claroEntity.setPricePromo60(driver.findElement(By.cssSelector()).getText());
    return claroEntity;
    }

}
