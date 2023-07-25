package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
public WebElement logout;

@FindBy(xpath="//div[.='Tasks']")
public WebElement tasktab;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setLogout() throws InterruptedException
{
	Thread.sleep(5000);
	logout.click();
}

public void setTaskTab()
{
	tasktab.click();
}

}
