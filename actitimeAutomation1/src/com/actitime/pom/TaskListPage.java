package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	public WebElement newCustBtn;
	
	@FindBy(xpath="//div[@class='customerNameDiv']/input[@placeholder='Enter Customer Name']")
	public WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	public WebElement enterCustDespTbx;
	
	@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	public WebElement selectCustDD;
	
	@FindBy(xpath="//div[.='Big Bang Company' and @class='itemRow cpItemRow ' ]")
	public WebElement bigBangCompLink;
	
	@FindBy(xpath="//div[.='Create Customer']")
	public WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	public WebElement createCustText;
	
	@FindBy(xpath="//div[.='+ New Project']")
	public WebElement newProjBtn;
	
	@FindBy(xpath="//div[@class='sectionDetails']/input[@placeholder='Enter Project Name']")
	public WebElement enterProjNameTxtFld;
	
	@FindBy(xpath="//div[@class='selectedItem']/div[.='-- Please Select Customer to Add Project for  --']")
	public WebElement plzSelectAndAddProjDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and .='Varnikha_001']")
	public WebElement allProjectsName;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	public WebElement projDespTextFld;
	
	@FindBy(xpath="//div[.='Create Project']")
	public WebElement createProjBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	public WebElement projectTitleText;
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	public WebElement newTaskBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	public WebElement enterTaskNameTxtFld;
	
	@FindBy(xpath="//div[.='Create Tasks']")
	public WebElement createTaskBtn;
	
	@FindBy(xpath="//div[@class='subtitle']/following-sibling::div[@class='title']")
	public WebElement taskTitleText;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustBtn() {
		return newCustBtn;
	}

	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	public WebElement getEnterCustDespTbx() {
		return enterCustDespTbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getBigBangCompLink() {
		return bigBangCompLink;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getCreateCustText() {
		return createCustText;
	}

	public WebElement getNewProjBtn() {
		return newProjBtn;
	}

	public WebElement getEnterProjNameTxtFld() {
		return enterProjNameTxtFld;
	}

	public WebElement getPlzSelectAndAddProjDD() {
		return plzSelectAndAddProjDD;
	}

	public WebElement getAllProjectsName() {
		return allProjectsName;
	}
	
	public WebElement getProjDespTextFld() {
		return projDespTextFld;
	}

	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}

	public WebElement getProjectTitleText() {
		return projectTitleText;
	}

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getEnterTaskNameTxtFld() {
		return enterTaskNameTxtFld;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

	public WebElement getTaskTitleText() {
		return taskTitleText;
	}
		
}
