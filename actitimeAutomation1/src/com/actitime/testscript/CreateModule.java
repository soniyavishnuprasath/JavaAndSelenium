package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateModule extends BaseClass {
	
	
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	Reporter.log("CreateCustomer",true);
	HomePage hp=new HomePage(driver);
	FileLib fl=new FileLib();
	TaskListPage tp=new TaskListPage(driver);
	hp.setTaskTab();
	tp.getAddNewBtn().click();
	tp.getNewCustBtn().click();
	String custName = fl.GetExcelData("CreateCustomer", 1, 3);
	String custDesp = fl.GetExcelData("CreateCustomer", 1, 4);
	tp.getEnterCustNameTbx().sendKeys(custName);
	tp.getEnterCustDespTbx().sendKeys(custDesp);
	tp.getSelectCustDD().click();
	tp.getBigBangCompLink().click();
	tp.getCreateCustBtn().click();
	//Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(tp.getCreateCustText(), custName));
	String actualtext = tp.getCreateCustText().getText();
	Assert.assertEquals(actualtext, custName);
	
}
@Test
public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("createProject",true);
	HomePage hp=new HomePage(driver);
	FileLib fl=new FileLib();
	TaskListPage tp=new TaskListPage(driver);
	hp.setTaskTab();
	tp.getAddNewBtn().click();
	tp.getNewProjBtn().click();
	String projName = fl.GetExcelData("CreateProject", 1, 3);
	tp.getEnterProjNameTxtFld().sendKeys(projName);
	//tp.getPlzSelectAndAddProjDD().click();
	//tp.getAllProjectsName().click();
	String projDesp=fl.GetExcelData("CreateProject", 1, 4);
	tp.getProjDespTextFld().sendKeys(projDesp);
	tp.getCreateProjBtn().click();
	Thread.sleep(5000);
	String actualProjTitleText = tp.getProjectTitleText().getText();
	System.out.println(actualProjTitleText);
	Assert.assertEquals(actualProjTitleText, projName);
}
@Test
public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException
{
	Reporter.log("createTask",true);
	HomePage hp=new HomePage(driver);
	hp.setTaskTab();
	TaskListPage tp=new TaskListPage(driver);
	tp.getAddNewBtn().click();
	Thread.sleep(2000);
	tp.getNewTaskBtn().click();
	Thread.sleep(2000);
	FileLib fl=new FileLib();
	String taskName = fl.GetExcelData("CreateTask", 1, 3);
	tp.getEnterTaskNameTxtFld().sendKeys(taskName);
	Thread.sleep(2000);
	tp.getCreateTaskBtn().click();
	Thread.sleep(5000);
	String actualTaskTitleText = tp.getTaskTitleText().getText();
	System.out.println(actualTaskTitleText);
	Assert.assertEquals(actualTaskTitleText, taskName);
}
}
